/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.udec.ejerciciolista;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Corin Viracacha
 * Clase del objeto persona
 */
public class Persona implements Serializable{
    /**
     * nombre de la persona
     * cedula, identificacion de la persona
     * edad, de la persona
     * genero, de la persona
     */
    private String nombre;
    private int cedula;
    private short edad;
    private char genero;
    private List<Antecedentes> antecedentes;
    /**
     * Constructor de la clase persona
     * @param nombre de la persona
     * @param cedula, identificacion de la persona
     * @param edad, de la persona
     * @param genero, de la persona
     * @param antecedentes, listado de antecedentes de la persona
     */
    public Persona(String nombre, int cedula, short edad, char genero, List<Antecedentes> antecedentes) {
        this.nombre = nombre;
        this.cedula = cedula;
        this.edad = edad;
        this.genero = genero;
        this.antecedentes = antecedentes;
    }
    /**
     * Retorna el nombre de la persona
     * @return nombre
     */
    public String getNombre() {
        return nombre;
    }
    /**
     * Asigna el nombre de la persona
     * @param nombre de la persona
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    /**
     * Obtiene el numero de identificacion de la persona
     * @return cedula
     */
    public int getCedula() {
        return cedula;
    }
    /**
     * Asigna el valor de la cedula
     * @param cedula de la persona
     */
    public void setCedula(int cedula) {
        this.cedula = cedula;
    }
    /**
     * Obtiene la edad de la persona
     * @return edad
     */
    public short getEdad() {
        return edad;
    }
    /**
     * Asigna el valor de la edad de la persona
     * @param edad de la persona
     */
    public void setEdad(short edad) {
        this.edad = edad;
    }
    /**
     * Obtiene el genero de la persona
     * @return genero
     */
    public char getGenero() {
        return genero;
    }
    /**
     * Asigna el genero de la persona
     * @param genero de la persona
     */
    public void setGenero(char genero) {
        this.genero = genero;
    }
    /**
     * Obtiene el listado de antecedentes de la persona
     * @return el listado de antecedentes
     */
    public List<Antecedentes> getAntecedentes() {
        if(antecedentes==null){
            antecedentes=new ArrayList();
        }
        return antecedentes;
    }
    /**
     * Asigna los antecedentes de la persona
     * @param antecedentes listado de antecedentes de la persona
     */
    public void setAntecedentes(List<Antecedentes> antecedentes) {
        this.antecedentes = antecedentes;
    }
    
}
