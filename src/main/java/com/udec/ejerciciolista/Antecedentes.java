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
 * @author Corin Viracacha
 * Esta clase se encarga de almacenar la informacion referente a antecedentes
 */
public class Antecedentes implements Serializable{
    /**
     * En fecha se almacena la fecha del reporte
     * En descripcion una breve informacion sobre el reporte
     * ripo, es un objeto que almacena segun el tipo de antecedente presentado
     */
    private Date fecha;
    private String descripcion;
    private TipoAntecendente tipo;
    /**
     * Constructor de la clase
     * @param fecha se recibe la fecha del antecedente
     * @param descripcion se hace un breve descripcion del antecedente
     * @param tipo se indentifica el tipo de antecedente
     */
    public Antecedentes(Date fecha, String descripcion, TipoAntecendente tipo) {
        this.fecha = fecha;
        this.descripcion = descripcion;
        this.tipo = tipo;
    }
    /**
     * Obtiene la fecha del antecedente
     * @return fecha
     */
    public Date getFecha() {
        return fecha;
    }
    /**
     * Asignacion de la variable fecha
     * @param fecha del antecedente
     */
    public void setFecha(Date fecha) {
        this.fecha = fecha;
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
     * Obtiene informacion referente al tipo de antecedente
     * @return objeto de tipo de antecedente
     */
    public TipoAntecendente getTipo() {
        return tipo;
    }
    /**
     * Asigna el objeto tipo de antecedente
     * @param tipo, objeto tipo de antecedente
     */
    public void setTipo(TipoAntecendente tipo) {
        this.tipo = tipo;
    }
    
}
