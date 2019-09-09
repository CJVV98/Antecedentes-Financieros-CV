/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.udec.ejerciciolista;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Corin Viracacha
 * Esta clase se encarga de realizar las operaciones principales del aplicativo
 */
public class Logica {
    /**
     * listaPersona, variable que almacena la informacion de las personas y sus antecedentes
     * listaA Almacena los tipos de antecedentes registrados
     * ingreso, objeto para capturar datos ingresados por teclado
     */
    List<Persona> listaPersona;
    List<TipoAntecendente> listaA;
    Scanner ingreso;
    /**
     * En este constructor, se muestra un menu con las operaciones a ejecutar
     */
    public Logica(){ 
         ingreso=new Scanner(System.in);
         String continuar="s";     
         listaPersona=(new Serializacion()).deserializarPersona();
         if(listaPersona==null)
             listaPersona=new ArrayList();
         listaA=(new Serializacion()).deserializarTipo();
         if(listaA==null)
             listaA=new ArrayList();
         do{
            System.out.println("MENU PRINCIPAL");
            System.out.println("1. Insertar tipo antecedente");
            System.out.println("2. Insertar nueva persona");
            System.out.println("3. Editar una persona");
            System.out.println("4. Adicionar antecendentes");
            System.out.println("5. Eliminar antecendetes");
            System.out.println("6. Visualizar antecedentes");
            validarMetodo(ingreso.nextInt());
            System.out.println("Desea Continuar S/N");        
            continuar=ingreso.next();
         }while("s".equals(continuar.toLowerCase()));
    }
    /**
     * En este menu se direcciona al metodo en relacion con la opcion seleccionada
     * @param opcion, de operacion 
     */
    private void validarMetodo(int opcion) {
        switch (opcion){
            case 1:
                insertarTipoA();
                break;
            case 2:
                insertarPersona();
                break;
            case 3:
                editarPersona();
                break;
            case 4:
                adicionarAntecedentes();
                break;
            case 5:
                eliminarAntecedentes();
                break;
            case 6:
                visualizarAntecedentes();
                break;
        }
    }
    /**
     * En este metodo se inserta los tipos de antecedentes
     */
    private void insertarTipoA(){ 
        ingreso=new Scanner(System.in);
        if(listaA == null){
            listaA=new ArrayList();
        }else{
            System.out.println("Ingrese Descripcion");
            String descripcion=ingreso.nextLine();
            System.out.println("Ingrese Caractersiticas");
            String caracteristicas=ingreso.nextLine();
            System.out.println("Ingrese Estado - 0 + ");
            String estado=ingreso.nextLine();
            listaA.add(new TipoAntecendente(descripcion, caracteristicas, estado));
            System.out.println("Registro Exitoso ");
            (new Serializacion()).serializarTipoA(listaA);          
         }
    }
    /**
     * En este metodo se hace un registro de la persona se solicita nombre, cedula, edad y genero
     */
    private void insertarPersona() { 
        ingreso=new Scanner(System.in);
        System.out.println("Digite su nombre");
        String nombre=ingreso.nextLine();
        System.out.println("Digite su identificacion");
        int cedula=ingreso.nextInt();
        System.out.println("Digite su edad");
        short edad=ingreso.nextShort();
        System.out.println("Digite su genero F-femenino y M-Masculino");
        char genero=ingreso.next().charAt(0);
        Persona persona=new Persona(nombre, cedula, edad, genero, null);
        listaPersona.add(persona);
        (new Serializacion()).serializarPersona(listaPersona);
        System.out.println("Registro Exitoso ");
    }
    /**
     * En este metodo se da la posibilidad al usuario de editar los datos basicos de la persona
     */
    private void editarPersona() {
        ingreso=new Scanner(System.in);
        System.out.println("Ingrese el numero identificacionde la persona a modificar "); 
        int cedula=ingreso.nextInt();
        for (Persona persona : listaPersona) {
            if(cedula==persona.getCedula()){
                System.out.println("1. Nombre "+persona.getNombre());
                System.out.println("2. Edad "+persona.getEdad());
                System.out.println("3. Genero "+persona.getGenero());
                System.out.println("Seleccione el dato a editar "); 
                int opcion=ingreso.nextInt();
                editarAtributo(persona,opcion);
                System.out.println("Modificacion exitosa ");
            }
        }
        (new Serializacion()).serializarPersona(listaPersona);
         
        
    }
    /**
     * Metodo para adicionar antecedentes a la persona aqui se verifica si la persona existe
     */
    private void adicionarAntecedentes() {
        int contador=0;
        ingreso=new Scanner(System.in);
        System.out.println("Ingrese el numero identificacion");
        int cedula=ingreso.nextInt();
        for (Persona persona : listaPersona) {
            if(persona.getCedula()==cedula){
                persona.setAntecedentes(insertarAntecedente(persona));                
                contador++;
                
            }
        }
        if(contador<=0)
            System.out.println("La persona no esta registrada");
        else
            (new Serializacion()).serializarPersona(listaPersona);
     
    }
    /**
     * Metodo para eliminar antecedentes negativos de las personas
     */
    private void eliminarAntecedentes() {
        ingreso=new Scanner(System.in);
        System.out.println("Ingrese el numero identificacionde la persona a modificar "); 
        int cedula=ingreso.nextInt();
        for (Persona persona : listaPersona) {
            if(cedula==persona.getCedula()){
                for (int i=0;i<persona.getAntecedentes().size();i++) {
                     System.out.println(i+" -> Fecha"+persona.getAntecedentes().get(i).getFecha()+" "+persona.getAntecedentes().get(i).getTipo().getEstado());
                }
              System.out.println("Seleccione el antecedente a eliminar ");
              int index=ingreso.nextInt();
              if("-".equals(persona.getAntecedentes().get(index).getTipo().getEstado())){
                    persona.getAntecedentes().remove(index);
                    System.out.println("Eliminacion exitosa ");   
              }                  
              else
                    System.out.println("No se puede eliminar este registro");             
            }
        }
        (new Serializacion()).serializarPersona(listaPersona);
    }
    /**
     * Una vez la persona ha sido verificada en este metodo se inserta los antecedentes de la persona
     * @param personaAux objeto con la informacion de las personas
     * @return Listado de antecedentes
     */
    private List<Antecedentes> insertarAntecedente(Persona personaAux) {
         SimpleDateFormat formato = new SimpleDateFormat("dd/MM/yyyy");
         try {
                System.out.println("Ingrese la fecha");
                Date fecha=formato.parse(ingreso.next());
                ingreso.nextLine();
                System.out.println("Ingrese Descripcion");
                String descripcion=ingreso.nextLine();
                for (int i=0; i<listaA.size();i++) {
                    System.out.println(i+" "+listaA.get(i).getDescripcion()+" "+listaA.get(i).getEstado());            
                }
                System.out.println("Seleccione el tipo antecedentes");
                int opcion=ingreso.nextInt();
                TipoAntecendente tipo=listaA.get(opcion);
                List<Antecedentes> antecedentes=personaAux.getAntecedentes();
                antecedentes.add(new Antecedentes(fecha, descripcion, tipo));
                personaAux.setAntecedentes(antecedentes);
              
            } catch (ParseException ex) {
                Logger.getLogger(Logica.class.getName()).log(Level.SEVERE, null, ex);
            }
         return personaAux.getAntecedentes();
    }
    /**
     * De acuerdo al atributo a modificar, en este metodo se solicita la nueva informacion de la persona
     * @param persona objeto que contiene los datos de las persona
     * @param opcion, contiene el indicador del dato a modificar
     * 
     */
    private void editarAtributo(Persona persona, int opcion) {
        ingreso=new Scanner(System.in);
        switch (opcion){
            case 1:{
                System.out.println("Ingrese nuevo nombre ");
                persona.setNombre(ingreso.nextLine());
                break;
            }
            case 2:{
                System.out.println("Ingrese nueva Edad ");
                persona.setEdad(ingreso.nextShort());
                break;
            }
            case 3:{
                System.out.println("Modifique genero ");
                persona.setGenero(ingreso.nextLine().charAt(0));
                break;
            }
        }
    }
    /**
     * En este metodo se muestra al usuario los antecedentes de las persona buscada
     */
    private void visualizarAntecedentes() {
        ingreso=new Scanner(System.in);
        System.out.println("Ingrese el numero identificacion de la persona a consultar "); 
        int cedula=ingreso.nextInt();
        for (Persona persona : listaPersona) {
            if(cedula==persona.getCedula()){
                System.out.println("Nombre "+persona.getNombre());
                if(persona.getAntecedentes()!=null){
                    for (Antecedentes antecedentes : persona.getAntecedentes()) {
                        System.out.println("------Antecedentes------");
                        System.out.println("Fecha "+antecedentes.getFecha());
                        System.out.println("Descripcion "+antecedentes.getDescripcion());
                        System.out.println("Descripcion Antecedente "+antecedentes.getTipo().getDescripcion());
                        System.out.println("Caracteristicas "+antecedentes.getTipo().getCaracteristicas());
                        System.out.println("Estado "+antecedentes.getTipo().getDescripcion());
                    }
                }  
            }           
        }
    }

   
}
