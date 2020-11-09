/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.edu.umanizales.listase.modelo;

import java.io.Serializable;

/**
 *
 * @author Jhony
 */
public class NodoDEInfante implements Serializable{
    
     private Infante dato;
     private OportunidadNiño datoDos;
     
    private NodoDEInfante siguienteDE;
    private NodoDEInfante anteriorDE;

    public NodoDEInfante(OportunidadNiño datoDos) {
        this.datoDos = datoDos;
    }
    
    

    public NodoDEInfante(Infante dato) {
        this.dato = dato;
    }

    public OportunidadNiño getDatoDos() {
        return datoDos;
    }

    public void setDatoDos(OportunidadNiño datoDos) {
        this.datoDos = datoDos;
    }
    
    

    public Infante getDato() {
        return dato;
    }

    public void setDato(Infante dato) {
        this.dato = dato;
    }

    public NodoDEInfante getSiguienteDE() {
        return siguienteDE;
    }

    public void setSiguienteDE(NodoDEInfante siguienteDE) {
        this.siguienteDE = siguienteDE;
    }

    public NodoDEInfante getAnteriorDE() {
        return anteriorDE;
    }

    public void setAnteriorDE(NodoDEInfante anteriorDE) {
        this.anteriorDE = anteriorDE;
    }

   
    
    
    
}
