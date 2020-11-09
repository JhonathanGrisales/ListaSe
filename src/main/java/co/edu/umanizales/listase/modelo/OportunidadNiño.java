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
public class OportunidadNiño implements Serializable {

    private Infante infante;
    private byte oportunidad;

    public OportunidadNiño() {
    }

    public OportunidadNiño(Infante infante, byte oportunidad) {
        this.infante = infante;
        this.oportunidad = oportunidad;
    }

    public Infante getInfante() {
        return infante;
    }

    public void setInfante(Infante infante) {
        this.infante = infante;
    }

    public byte getOportunidad() {
        return oportunidad;
    }

    public void setOportunidad(byte oportunidad) {
        this.oportunidad = oportunidad;
    }

}
