package com.plug.eulerattendance;

import android.app.Application;

import io.realm.Realm;
import io.realm.RealmConfiguration;

/**
 * Created by OSKAR on 11/08/2017.
 * Oskar Steven Conislla Contreras
 * oskarconislla20@gmail.com
 * 947446763
 */

public class Configuracion extends Application {
    @Override
    public void onCreate() {
        super.onCreate();
        //Inicializamos la base de datos
        Realm.init(getApplicationContext());
        //Creamos la nueva configuracion de la base de datos
        RealmConfiguration realmConfiguration=
                new RealmConfiguration.Builder()
                        .name("clase3.realm")//Aqui cualquier nombre
                        .schemaVersion(1)
                        .build();
        //Cambiamos la configuracion por la que hemos creado
        Realm.setDefaultConfiguration(realmConfiguration);
    }
}