/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.udec.ejerciciolista;

import java.io.Serializable;

/**
 *
 * @author Corin Viracacha
 * Clase que almacena el tipo de antecedente
 */
public  class TipoAntecendente implements Serializable{
    private String descripcion;
    private String caracteristicas;
    private String estado;
    /**
     * Constructor de la clase del tipo de antecedente
     * @param descripcion se hace una descripcion del tipo de antecedentes
     * @param caracteristicas se indican las caracteristicas del tipo de antecedentes 
     * @param estado indica si es negativo o positivo
     */
    public TipoAntecendente(String descripcion, String caracteristicas, String estado) {
        this.descripcion = descripcion;
        this.caracteristicas = caracteristicas;
        this.estado = estado;
    }

    /**
     * Obtiene la descripcion del antecedente
     * @return descripcion
     */
    public String getDescripcion() {
        return descripcion;
    }
    /**
     * Asigna una descripcion del antecedente
     * @param descripcion del antecedente
     */
    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }
    /**
     * Obtiene las caracteristicas del antecedente
     * @return caracteristicas
     */
    public String getCaracteristicas() {
        return caracteristicas;
    }
    /**
     * Asigna las caracteristicas del antecedente
     * @param caracteristicas del antecedente
     */
    public void setCaracteristicas(String caracteristicas) {
        this.caracteristicas = caracteristicas;
    }
    /**
     * Obtiene el valor del estado del antecedente
     * @return estado
     */
    public String getEstado() {
        return estado;
    }
    /**
     * Asigna el estado del antecedente
     * @param estado 
     */
    public void setEstado(String estado) {
        this.estado = estado;
    }
    
}
