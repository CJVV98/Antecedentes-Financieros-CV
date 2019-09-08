/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.udec.ejerciciolista;

import java.io.Serializable;

/**
 *
 * @author Corin V
 */
public  class TipoAntecendente implements Serializable{
    private int id;
    private String descripcion;
    private String carcateristicas;
    private String estado;

    public TipoAntecendente(int id,String descripcion, String carcateristicas, String estado) {
        this.descripcion = descripcion;
        this.carcateristicas = carcateristicas;
        this.estado = estado;
        this.id=id;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getCarcateristicas() {
        return carcateristicas;
    }

    public void setCarcateristicas(String carcateristicas) {
        this.carcateristicas = carcateristicas;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }
    
}
