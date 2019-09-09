/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.udec.ejerciciolista;


import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.List;


/**
 *
 * @author Corin Viracacha
 * Clase encargada de la serializacion de la informacion y el guardado en archivos
 */
public class Serializacion {
    /**
     * Metodo encargado de la serializacion del listado de tipos de antecedentes
     * @param tipo listado de tipos de antecedentes
     */
    public void serializarTipoA(List<TipoAntecendente> tipo){
        try{
            File archivo1=new File("src/main/java/archivo/listaTipoAntecedentes");
            if (!archivo1.exists()) 
		archivo1.createNewFile();
            FileOutputStream archivo=new FileOutputStream(archivo1);
            ObjectOutputStream objeto=new ObjectOutputStream(archivo);
            objeto.writeObject(tipo);
            objeto.close();
            archivo.close();
        }catch (Exception io){
            System.out.println(""+io);
        }
                 
    }
    /**
     * Metodo encargadao de la serializacion del listado de personas
     * @param persona listado de personas registradas
     */
    public void serializarPersona(List<Persona> persona){
        try{
            File archivo1=new File("src/main/java/archivo/listaPersona");
            if (!archivo1.exists()) 
		archivo1.createNewFile();
            FileOutputStream archivo=new FileOutputStream(archivo1);
            ObjectOutputStream objeto=new ObjectOutputStream(archivo);
            objeto.writeObject(persona);
            objeto.close();
            archivo.close();
        }catch (Exception io){
            System.err.println(io);
            System.out.println(io);
        }
                 
    }
    /**
     * Metodo usado para la deserializacion de los tipos de antecedentes
     * @return  listado de tipos de antecedentes
     */
    public List<TipoAntecendente> deserializarTipo(){
        List<TipoAntecendente> listaT=null;
        try{
            FileInputStream archivo=new FileInputStream("src/main/java/archivo/listaTipoAntecedentes");
            ObjectInputStream objeto=new ObjectInputStream(archivo);
            listaT=(ArrayList) objeto.readObject();
            objeto.close();
            archivo.close();
        }catch (IOException | ClassNotFoundException io){
        }
       return listaT;          
    }
    /**
     * Metodo para la deserializacion del listado de personas
     * @return listado de personas
     */
    public List<Persona> deserializarPersona(){
            List<Persona> listaPersona=null;
            try{
                FileInputStream archivo=new FileInputStream("src/main/java/archivo/listaPersona");
                ObjectInputStream objeto=new ObjectInputStream(archivo);
                listaPersona=(ArrayList) objeto.readObject();
                objeto.close();
                archivo.close();
            }catch (IOException | ClassNotFoundException io){
            }
           return listaPersona;          
        }
   
}
