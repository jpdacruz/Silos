package com.jpdacruz.silos.Clases;

public class Fiscalizacion {

    private String operador;
    private String cuit;
    private String asignacion;
    private String tipoAsginacion;

    public Fiscalizacion(String operador, String cuit, String asignacion, String tipoAsginacion) {
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
