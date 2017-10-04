package com.plug.eulerattendance.entidades;

import io.realm.RealmObject;
import io.realm.annotations.PrimaryKey;

/**
 * Created by OSKAR on 11/08/2017.
 * Oskar Steven Conislla Contreras
 * oskarconislla20@gmail.com
 * 947446763
 */

public class ProfesoresEntidad extends RealmObject{
    @PrimaryKey
    private long id;
    private String Nombre;
    private String Dia;
    private String FechaExacta;
    private String Hora;

    public String getDia() {
        return Dia;
    }

    public void setDia(String dia) {
        Dia = dia;
    }

    public String getFechaExacta() {
        return FechaExacta;
    }

    public void setFechaExacta(String fechaExacta) {
        FechaExacta = fechaExacta;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String nombre) {
        Nombre = nombre;
    }

    public String getHora() {
        return Hora;
    }

    public void setHora(String hora) {
        Hora = hora;
    }
}
