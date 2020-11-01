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
public class ListaDECInfante {
    
    private NodoDEInfante cabezaInfante;
    
    

    public ListaDECInfante(NodoDEInfante cabezaInfante) {
        this.cabezaInfante = cabezaInfante;
    }

    public ListaDECInfante() {
    }
   

    public NodoDEInfante getCabezaInfante() {
        return cabezaInfante;
    }

    public void setCabezaInfante(NodoDEInfante cabezaInfante) {
        this.cabezaInfante = cabezaInfante;
    }
    
    
    public void adicionarNiñoAlinicioDeCircular(Infante dato) {

        if (cabezaInfante != null) {

            NodoDEInfante tempDE = new NodoDEInfante(dato);
            
            cabezaInfante.getAnteriorDE().setSiguienteDE(tempDE);
            tempDE.setSiguienteDE(cabezaInfante);
            tempDE.setAnteriorDE(cabezaInfante.getAnteriorDE());
            cabezaInfante.setAnteriorDE(tempDE);
            cabezaInfante = tempDE;

        } else {

            cabezaInfante = new NodoDEInfante(dato);
            cabezaInfante.setSiguienteDE(cabezaInfante);
            cabezaInfante.setAnteriorDE(cabezaInfante);
        }

    }
    
    
    public int contarNodosDEC() {

        if (cabezaInfante != null) {

            NodoDEInfante temp = cabezaInfante;
            int cont = 1;

            while (temp.getSiguienteDE() != cabezaInfante) {

                temp = temp.getSiguienteDE();
                cont++;

            }

            return cont;

        }
        int cont = 0;
        return cont;

    }
    
     public void mostrarListaDEC() {

        if (cabezaInfante != null) {

            NodoDEInfante recorrer = cabezaInfante;

            while (recorrer.getSiguienteDE() != cabezaInfante) {

                System.out.println("[ " + recorrer.getDato() + "]");
                recorrer = recorrer.getSiguienteDE();
            }

            System.out.println("[ " + recorrer.getDato() + "]");

        } else {

            System.out.println("No hay lementos para mostar");
        }

    }
    
}
