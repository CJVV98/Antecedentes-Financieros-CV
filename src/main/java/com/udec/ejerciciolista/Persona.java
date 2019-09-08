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
 * @author Corin V
 */
public class Persona implements Serializable{
    private String nombre;
    private int cedula;
    private short edad;
    private char genero;
    private List<Antecedentes> antecedentes;

    public Persona(String nombre, int cedula, short edad, char genero, List<Antecedentes> antecedentes) {
        this.nombre = nombre;
        this.cedula = cedula;
        this.edad = edad;
        this.genero = genero;
        this.antecedentes = antecedentes;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getCedula() {
        return cedula;
    }

    public void setCedula(int cedula) {
        this.cedula = cedula;
    }

    public short getEdad() {
        return edad;
    }

    public void setEdad(short edad) {
        this.edad = edad;
    }

    public char getGenero() {
        return genero;
    }

    public void setGenero(char genero) {
        this.genero = genero;
    }

    public List<Antecedentes> getAntecedentes() {
        if(antecedentes==null){
            antecedentes=new ArrayList();
        }
        return antecedentes;
    }

    public void setAntecedentes(List<Antecedentes> antecedentes) {
        this.antecedentes = antecedentes;
    }
    
}
