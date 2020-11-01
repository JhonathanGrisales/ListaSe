/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.edu.umanizales.listase.modelo;

/**
 *
 * @author Jhony
 */
public class Infante {
    
    private String nombre;
   
    private byte identificador;
    private String genero;

    public Infante() {
    }

    public Infante(String nombre, byte identificador, String genero) {
        this.nombre = nombre;
        this.identificador = identificador;
        this.genero = genero;
    }

   

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    

    public byte getIdentificador() {
        return identificador;
    }

    public void setIdentificador(byte identificador) {
        this.identificador = identificador;
    }
    
    
    @Override

    public String toString() {
        return "Infante{" + "nombre=" + nombre + ", genero=" + genero + ", identificador=" + identificador + '}';
    }
   
          
    
}
