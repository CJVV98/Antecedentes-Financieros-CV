/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.udec.ejerciciolista;

import java.io.Serializable;
import java.util.Date;

/**
 *
 * @author Corin V
 */
public class Antecedentes implements Serializable{
    private Date fecha;
    private String descripcion;
    private TipoAntecendente tipo;

    public Antecedentes(Date fecha, String descripcion, TipoAntecendente tipo) {
        this.fecha = fecha;
        this.descripcion = descripcion;
        this.tipo = tipo;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public TipoAntecendente getTipo() {
        return tipo;
    }

    public void setTipo(TipoAntecendente tipo) {
        this.tipo = tipo;
    }
    
}
