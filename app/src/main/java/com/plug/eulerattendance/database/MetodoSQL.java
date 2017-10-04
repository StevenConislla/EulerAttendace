package com.plug.eulerattendance.database;

import com.plug.eulerattendance.entidades.ProfesoresEntidad;

import io.realm.Realm;
import io.realm.RealmModel;
import io.realm.RealmResults;

/**
 * Created by OSKAR on 11/08/2017.
 * Oskar Steven Conislla Contreras
 * oskarconislla20@gmail.com
 * 947446763
 */

public class MetodoSQL {

    public void agregar(Object object){
        Realm realm=Realm.getDefaultInstance();
        realm.beginTransaction();
        realm.copyToRealmOrUpdate((RealmModel) object);
        realm.commitTransaction();
    }
    public void eliminarProfesor(long idProfesor){
        Realm realm=Realm.getDefaultInstance();
        //Si lo que hace dentro del try se cae la app, se va al catch
        try{
            realm.beginTransaction();
            //Obtenemos el registro de cliente por id
            ProfesoresEntidad profesoresEntidad=
                    realm.where(ProfesoresEntidad.class)
                            .equalTo("id",idProfesor)
                            .findFirst();

            //Verificamos si el registro es diferente de vacio
            if(profesoresEntidad!=null){
                //Eliminamos el registro
                profesoresEntidad.deleteFromRealm();
            }
            realm.commitTransaction();}

        catch (Exception e){
            realm.cancelTransaction();
        }
    }
    public long obtenerIdProfesor(){
        Realm realm=Realm.getDefaultInstance();
        return realm.where(ProfesoresEntidad.class).count()+1;
    }

    public RealmResults<ProfesoresEntidad> obtenerProfesores() {
        Realm realm=Realm.getDefaultInstance();
        return realm.where(ProfesoresEntidad.class).findAll();
    }


}
