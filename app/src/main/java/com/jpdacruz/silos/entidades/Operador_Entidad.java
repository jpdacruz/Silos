package com.jpdacruz.silos.entidades;

import androidx.room.Entity;
//SE CREA LA ENTIDAD-CLASE CON LOS DATOS REFERENTES AL OBJETO

@Entity
        (tableName = "operadores")

public class Operador_Entidad {

    public String operador;
    public String cuit;
    public String asignacion;
    public String tipoAsginacion;

    public Operador_Entidad(String operador, String cuit, String asignacion, String tipoAsginacion) {
        this.operador = operador;
        this.cuit = cuit;
        this.asignacion = asignacion;
        this.tipoAsginacion = tipoAsginacion;
    }

    public String getOperador() {
        return operador;
    }

    public void setOperador(String operador) {
        this.operador = operador;
    }

    public String getCuit() {
        return cuit;
    }

    public void setCuit(String cuit) {
        this.cuit = cuit;
    }

    public String getAsignacion() {
        return asignacion;
    }

    public void setAsignacion(String asignacion) {
        this.asignacion = asignacion;
    }

    public String getTipoAsginacion() {
        return tipoAsginacion;
    }

    public void setTipoAsginacion(String tipoAsginacion) {
        this.tipoAsginacion = tipoAsginacion;
    }
}
