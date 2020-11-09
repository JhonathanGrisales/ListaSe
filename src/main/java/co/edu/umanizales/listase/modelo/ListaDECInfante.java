/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.edu.umanizales.listase.modelo;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Jhony
 */
public class ListaDECInfante {

    private NodoDEInfante cabezaInfante;
    private List<Infante> listados;
    private List<OportunidadNiño> oportunidades;
    private OportunidadNiño niñoSeleccionado;

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

    public List<Infante> getListados() {
        return listados;
    }

    public void setListados(List<Infante> listados) {
        this.listados = listados;
    }

    public List<OportunidadNiño> getOportunidades() {
        return oportunidades;
    }

    public void setOportunidades(List<OportunidadNiño> oportunidades) {
        this.oportunidades = oportunidades;
    }

    public OportunidadNiño getNiñoSeleccionado() {
        return niñoSeleccionado;
    }

    public void setNiñoSeleccionado(OportunidadNiño niñoSeleccionado) {
        this.niñoSeleccionado = niñoSeleccionado;
    }

    public void adicionarNiñoAlinicioDeCircular(OportunidadNiño dato) {

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

                System.out.println("[ " + recorrer.getDatoDos().getInfante().getNombre() + "]");
                recorrer = recorrer.getSiguienteDE();
            }

            System.out.println("[ " + recorrer.getDatoDos().getInfante().getNombre() + "]");

        } else {

            System.out.println("No hay lementos para mostar");
        }

    }

    public int contarNiños(String tipo) {

        int cont = 0;

        switch (tipo) {

            case "niño":

                if (cabezaInfante != null) {

                    NodoDEInfante ayudante = cabezaInfante;

                    while (ayudante.getSiguienteDE() != cabezaInfante) {

                        if (ayudante.getDatoDos().getInfante().getGenero().equals("Masculino")) {

                            cont++;

                        }

                        ayudante = ayudante.getSiguienteDE();

                    }

                    if (ayudante.getDatoDos().getInfante().getGenero().equals("Masculino")) {

                        cont++;

                    }

                } else {

                    System.out.println("No hay Niños");

                }

                break;

            case "niña":

                if (cabezaInfante != null) {

                    NodoDEInfante ayudante = cabezaInfante;

                    while (ayudante.getSiguienteDE() != cabezaInfante) {

                        if (ayudante.getDatoDos().getInfante().getGenero().equals("Femenino")) {

                            cont++;

                        }

                        ayudante = ayudante.getSiguienteDE();

                    }

                    if (ayudante.getDatoDos().getInfante().getGenero().equals("Femenino")) {

                        cont++;

                    }

                } else {

                    System.out.println("No hay Niñas");

                }

                break;

        }
        return cont;
    }

    public void eliminarNodoDirecto(OportunidadNiño dato) {

        if (cabezaInfante != null) {

            if (dato == cabezaInfante.getDatoDos()) {

                cabezaInfante.getSiguienteDE().setAnteriorDE(cabezaInfante.getAnteriorDE());
                cabezaInfante.getAnteriorDE().setSiguienteDE(cabezaInfante.getSiguienteDE());

                cabezaInfante = cabezaInfante.getSiguienteDE();

            } else if (dato != cabezaInfante.getDatoDos()) {

                NodoDEInfante ayudante = cabezaInfante;

                while (ayudante.getDatoDos() != dato) {

                    ayudante = ayudante.getSiguienteDE();

                }

                ayudante.getAnteriorDE().setSiguienteDE(ayudante.getAnteriorDE().getSiguienteDE().getSiguienteDE());
                ayudante.getSiguienteDE().setAnteriorDE(ayudante.getAnteriorDE());

            }

        } else {

            System.out.println("No hay elementos para aliminar ");
        }

    }

    public List<OportunidadNiño> eliminarNiños(String tipo) {

        List<OportunidadNiño> listaTemporal = new ArrayList<>();
        int cont = 0;

        switch (tipo) {

            case "niño":

                if (cabezaInfante != null) {

                    NodoDEInfante ayudante = cabezaInfante;

                    while (ayudante.getSiguienteDE() != cabezaInfante) {

                        if (ayudante.getDatoDos().getInfante().getGenero().equals("Masculino")) {

                            listaTemporal.add(ayudante.getDatoDos());
                            eliminarNodoDirecto(ayudante.getDatoDos());
                            cont++;

                        }

                        ayudante = ayudante.getSiguienteDE();

                    }

                    if (ayudante.getDatoDos().getInfante().getGenero().equals("Masculino")) {

                        listaTemporal.add(ayudante.getDatoDos());
                        eliminarNodoDirecto(ayudante.getDatoDos());
                        cont++;

                    }

                } else {

                    System.out.println("No hay Niños");

                }

                break;

            case "niña":

                if (cabezaInfante != null) {

                    NodoDEInfante ayudante = cabezaInfante;

                    while (ayudante.getSiguienteDE() != cabezaInfante) {

                        if (ayudante.getDatoDos().getInfante().getGenero().equals("Femenino")) {

                            listaTemporal.add(ayudante.getDatoDos());
                            eliminarNodoDirecto(ayudante.getDatoDos());
                            cont++;

                        }

                        ayudante = ayudante.getSiguienteDE();

                    }

                    if (ayudante.getDatoDos().getInfante().getGenero().equals("Femenino")) {

                        listaTemporal.add(ayudante.getDatoDos());
                        eliminarNodoDirecto(ayudante.getDatoDos());
                        cont++;

                    }

                } else {

                    System.out.println("No hay Niñas");

                }

                break;

        }
        return listaTemporal;
    }

//    METODO PARA AGREGAR EN POSICION DADA 
    public void adicionarNodoEnSPosicion(OportunidadNiño dato, int posicion) {

        if (cabezaInfante != null) {

            if (posicion == 1) {

                adicionarNiñoAlinicioDeCircular(dato);

            } else {

                ListaDECInfante listaTemporal = new ListaDECInfante();
                NodoDEInfante temp = cabezaInfante;
                int cont = 1;

                while (temp.getSiguienteDE() != cabezaInfante) {

                    listaTemporal.adicionarNodoAlfinal(temp.getDatoDos());
                    temp = temp.getSiguienteDE();
                    cont++;

                    if (cont == posicion) {

                        listaTemporal.adicionarNodoAlfinal(dato);
                        adicionarNodoAlfinal(temp.getDatoDos());

                    }

                }

                if (posicion > cont) {

                    listaTemporal.adicionarNodoAlfinal(temp.getDatoDos());
                    listaTemporal.adicionarNodoAlfinal(dato);

                }

                cabezaInfante = listaTemporal.getCabezaInfante();
            }

        } else {

            cabezaInfante = new NodoDEInfante(dato);
            cabezaInfante.setSiguienteDE(cabezaInfante);
            cabezaInfante.setAnteriorDE(cabezaInfante);
        }

    }

    //METODO PARA ADICCIONAR NODO
    public void adicionarNodoAlfinal(OportunidadNiño dato) {

        if (cabezaInfante != null) {

            NodoDEInfante temp = cabezaInfante;

            while (temp.getSiguienteDE() != cabezaInfante) {

                temp = temp.getSiguienteDE();

            }
            //CUANDO SALE ESTOY EN EL ULTIMO

            NodoDEInfante nuevo = new NodoDEInfante(dato);
            nuevo.setSiguienteDE(temp.getSiguienteDE());
            temp.getSiguienteDE().setAnteriorDE(nuevo);
            nuevo.setAnteriorDE(temp);
            temp.setSiguienteDE(nuevo);

        } else {

            cabezaInfante = new NodoDEInfante(dato);
            cabezaInfante.setSiguienteDE(cabezaInfante);
            cabezaInfante.setAnteriorDE(cabezaInfante);

        }

    }

}
