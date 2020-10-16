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
public class ListaDE {

    private NodoDE cabezaDe;

    public ListaDE() {
    }

    public NodoDE getCabezaDe() {
        return cabezaDe;
    }

    public void setCabezaDe(NodoDE cabezaDe) {
        this.cabezaDe = cabezaDe;
    }

    public int contarNodos() //cabeza
    {
        if (cabezaDe != null) {
            NodoDE temp = cabezaDe;
            int cont = 1;
            while (temp.getSiguienteDE() != null) //Mientras el lazo este lleno
            {
                temp = temp.getSiguienteDE(); // Ayudante pase al siguiente perro
                cont++;
            }
            return cont;
        } else {
            return 0;
        }
    }

//METODO PARA ADICCIONAR NODO
    public void adicionarNodo(Perro dato) {

        if (cabezaDe != null) {

            NodoDE temp = cabezaDe;
            while (temp.getSiguienteDE() != null) {

                temp = temp.getSiguienteDE();

            }
            //CUANDO SALE ESTOY EN EL ULTIMO

            temp.setSiguienteDE(new NodoDE(dato));
            temp.getSiguienteDE().setAnteriorDE(temp);

        } else {

            cabezaDe = new NodoDE(dato);

        }

    }

    //METODO PARA ADICCIONAR NODO AL INICIO
    public void adicionarAlInicio(Perro dato) {

        if (cabezaDe != null) {

            //SI HAY DATOS
            NodoDE temp = new NodoDE(dato);
            temp.setSiguienteDE(cabezaDe);
            cabezaDe.setAnteriorDE(temp);
            cabezaDe = temp;

        } else {

            cabezaDe = new NodoDE(dato);
        }

    }

    //METODO PARA ELIMINAR NODO POR POSICION
    public void eliminarxPosicion(int pos) {

        if (cabezaDe != null) {

            if (pos == 1) {

                cabezaDe = cabezaDe.getSiguienteDE();
//                cabezaDe.setAnteriorDE(null);
            } else {

                int cont = 1;

                NodoDE temp = cabezaDe;

                while (temp.getSiguienteDE() != null && cont != pos) {

                    temp = temp.getSiguienteDE();

                    cont++;

                }

                if (cont == pos && temp.getSiguienteDE() != null) {

                    temp.getAnteriorDE().setSiguienteDE(temp.getSiguienteDE());
                    temp.getSiguienteDE().setAnteriorDE(temp.getAnteriorDE());
//                    temp.setSiguienteDE(null);
//                    temp.setAnteriorDE(null);

                } else if (temp.getSiguienteDE() == null) {

                    temp.getAnteriorDE().setSiguienteDE(null);
                    temp.setAnteriorDE(null);

                }

            }

        }

    }

    //METODO DE ELIMINAR POR POSICION DEL PROFE 
    public void eliminarPorPosicion(int posicion) {

        if (cabezaDe != null) {

            if (posicion == 1) {

                cabezaDe = cabezaDe.getSiguienteDE();
                if (cabezaDe != null) {

                    cabezaDe.setAnteriorDE(null);
                }
            } else {

                NodoDE temp = cabezaDe;
                int contador = 1;
                while (contador != posicion - 1) {

                    temp = temp.getSiguienteDE();
                    contador++;

                }
                //PARADO EN EL ANTERIOR A ELIMINAR
                temp.setSiguienteDE(temp.getSiguienteDE().getSiguienteDE());
                if (temp.getSiguienteDE() != null) {
                    temp.getSiguienteDE().setAnteriorDE(temp);
                }
            }
        }

    }

    //METODO DE ELIMINACION DIRECTA PROFE
    public void eliminar(Perro dato) {

        if (cabezaDe != null) {

            NodoDE temp = cabezaDe;

            while (temp.getDato().getNumero() != dato.getNumero()) {

                temp = temp.getSiguienteDE();

            }
            if (temp == cabezaDe) {

                cabezaDe = cabezaDe.getSiguienteDE();
                if (cabezaDe != null) {

                    cabezaDe.setAnteriorDE(null);
                }
            } else {

                temp.getAnteriorDE().setSiguienteDE(temp.getSiguienteDE());
                if (temp.getSiguienteDE() != null) {

                    temp.getSiguienteDE().setAnteriorDE(temp.getAnteriorDE());

                }
            }
        }

    }

    //METODO PARA INTERCAMBIAR DOS POSICIONES DADAS
    public void intercambiarPosiciones(int nodoUno, int nodoDos) {

        if (cabezaDe != null) {

            Perro temporalUno = buscarPosicionDE(nodoUno);
            Perro temporalDos = buscarPosicionDE(nodoDos);

            NodoDE temp = cabezaDe;
            int cont = 1;

            if (nodoUno < nodoDos) {

                while (temp.getSiguienteDE() != null && cont != nodoUno) {
                    cont++;
                    temp = temp.getSiguienteDE();
                }

                if (cont == nodoUno) {

                    temp.setDato(temporalDos);
                }
                cont = 1;
                temp = cabezaDe;

                while (temp.getSiguienteDE() != null && cont != nodoDos) {
                    cont++;
                    temp = temp.getSiguienteDE();
                }

                if (cont == nodoDos) {
                    temp.setDato(temporalUno);

                }
            } else if (nodoUno > nodoDos) {

                while (temp.getSiguienteDE() != null && cont != nodoDos) {
                    cont++;
                    temp = temp.getSiguienteDE();
                }

                if (cont == nodoDos) {

                    temp.setDato(temporalUno);
                }
                cont = 1;
                temp = cabezaDe;

                while (temp.getSiguienteDE() != null && cont != nodoUno) {
                    cont++;
                    temp = temp.getSiguienteDE();
                }

                if (cont == nodoUno) {
                    temp.setDato(temporalDos);

                }

            }

        }

    }

    public int contarNodosDE() //cabeza
    {
        if (cabezaDe != null) {

            NodoDE temp = cabezaDe;
            int cont = 1;
            while (temp.getSiguienteDE() != null) //Mientras el lazo este lleno
            {
                temp = temp.getSiguienteDE(); // Ayudante pase al siguiente perro
                cont++;
            }
            return cont;
        } else {
            return 0;
        }
    }

    public void mostrarLista() {

        NodoDE recorrer = cabezaDe;
        while (recorrer != null) {

            System.out.println("[ " + recorrer.getDato() + "]");
            recorrer = recorrer.getSiguienteDE();

        }

    }

    public void recorrerAlContrario() {

        NodoDE tmp = cabezaDe;
        while (tmp != null) {
            System.out.println(tmp.getDato());
            tmp = tmp.getAnteriorDE();
        }
    }

    public void eliminacionDirecta(NodoDE nodo) {

        if (nodo == cabezaDe) {

            cabezaDe = cabezaDe.getSiguienteDE();

        } else if (nodo.getSiguienteDE() != null) {

            nodo.getAnteriorDE().setSiguienteDE(nodo.getSiguienteDE());
            nodo.getSiguienteDE().setAnteriorDE(nodo.getAnteriorDE());
            nodo.setSiguienteDE(null);
            nodo.setAnteriorDE(null);

        } else if (nodo.getSiguienteDE() == null) {

            nodo.getAnteriorDE().setSiguienteDE(null);
            nodo.setAnteriorDE(null);

        }
    }

    public Perro buscarPosicionDE(int posicion) {

        if (cabezaDe != null) {

            NodoDE temp = cabezaDe;
            int cont = 1;

            while (posicion != cont) {

                temp = temp.getSiguienteDE();// Ayudante pase l siguiente perro
                cont++;
            }
            return temp.getDato();
        }

        return null;
    }

    //METODO PARA AGREGAR EN POSICION DADA 
    public void adicionarNodoEnSPosicion(Perro dato, int posicion) {

        if (cabezaDe != null) {

            if (posicion == 1) {

                adicionarAlInicio(dato);

            } else {

                ListaDE listaTemporal = new ListaDE();
                NodoDE temp = cabezaDe;
                int cont = 1;

                while (temp != null) {

                    listaTemporal.adicionarNodo(temp.getDato());
                    temp = temp.getSiguienteDE();
                    cont++;

                    if (cont == posicion) {

                        listaTemporal.adicionarNodo(dato);
                    }
                }
                if (posicion > cont) {

                    listaTemporal.adicionarNodo(dato);
                }
                cabezaDe = listaTemporal.getCabezaDe();
            }

        } else {

            cabezaDe = new NodoDE(dato);
        }

    }

    public void intercambiarExtremosDE() {

        if (cabezaDe != null) {
            NodoDE temp = cabezaDe;
            while (temp.getSiguienteDE() != null) {
                temp = temp.getSiguienteDE();
            }
            /// Parado en el último nodo
            Perro perrotemp = cabezaDe.getDato();
            cabezaDe.setDato(temp.getDato());
            temp.setDato(perrotemp);
        }
    }

    public void invertirDE() {

        if (cabezaDe != null) {
            ListaDE listaTemporal = new ListaDE();
            NodoDE temp = cabezaDe;
            while (temp != null)//Recorre de principio a fin
            {
                listaTemporal.adicionarAlInicio(temp.getDato());
                temp = temp.getSiguienteDE();//Ayudante pase al siguiente perro
            }
            cabezaDe = listaTemporal.getCabezaDe();
        }
    }

    public void ordenarMasculinoDE() {

        if (cabezaDe != null) {

            ListaDE listaTemporal = new ListaDE();

            NodoDE temp = cabezaDe;

            while (temp != null)//RECORRE DE PRINCIPIO A FIN
            {

                if ("M".equals(temp.getDato().getSexo())) {

                    listaTemporal.adicionarAlInicio(temp.getDato());

                } else {

                    listaTemporal.adicionarNodo(temp.getDato());
                }

                temp = temp.getSiguienteDE();// Ayudante pase l siguiente perro

            }

            cabezaDe = listaTemporal.getCabezaDe();

        }

    }

    public void ordenarFemeninoDE() {

        if (cabezaDe != null) {

            ListaDE listaTemporal = new ListaDE();

            NodoDE temp = cabezaDe;

            while (temp != null)//RECORRE DE PRINCIPIO A FIN
            {

                if ("F".equals(temp.getDato().getSexo())) {

                    listaTemporal.adicionarAlInicio(temp.getDato());

                } else {

                    listaTemporal.adicionarNodo(temp.getDato());
                }

                temp = temp.getSiguienteDE();// Ayudante pase l siguiente perro

            }

            cabezaDe = listaTemporal.getCabezaDe();

        }

    }

}
