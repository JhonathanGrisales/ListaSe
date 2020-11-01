/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.edu.umanizales.listase.modelo;

import java.io.Serializable;
import java.util.concurrent.ThreadLocalRandom;

/**
 *
 * @author carloaiza
 */
public class Perro implements Serializable{
   private String nombre;
   private byte numero;
   private byte edad; 
   private String sexo;
   
   private int numeroSuma;

    public Perro() {
    }
    
    

   
    public Perro(String nombre, byte numero, byte edad, String sexo) {
        this.nombre = nombre;
        this.numero = numero;
        this.edad = edad;
        this.sexo = sexo;
    }

    public Perro(int numeroSuma) {
        this.numeroSuma = numeroSuma;
    }

    public int getNumeroSuma() {
        return numeroSuma;
    }

    public void setNumeroSuma(int numeroSuma) {
        this.numeroSuma = numeroSuma;
    }
    
    

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public byte getNumero() {
        return numero;
    }

    public void setNumero(byte numero) {
        this.numero = numero;
    }

    public byte getEdad() {
        return edad;
    }

    public void setEdad(byte edad) {
        this.edad = edad;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }
    

    @Override
    public String toString() {
        return "Perro{" + "nombre=" + nombre + ", numero=" + numero + ", edad=" + edad + ", sexo="+ sexo +'}';
    }   
   
   
    
}
