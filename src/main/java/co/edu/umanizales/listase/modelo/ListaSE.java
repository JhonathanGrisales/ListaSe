/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.edu.umanizales.listase.modelo;

/**
 *
 * @author carloaiza
 */
public class ListaSE {

    private Nodo cabeza;

    public ListaSE() {
    }

    public Nodo getCabeza() {
        return cabeza;
    }

    public void setCabeza(Nodo cabeza) {
        this.cabeza = cabeza;
    }

    /**
     * Método para adicionar un nodo
     *
     * - Si tiene perros llamar a un ayudante recorrer todos los perros ,
     * mirando si tienen otro ammarrado cuando llegue al perro libre (No
     * ammarrado a otro) amarra el nuevo perro
     *
     * si no tiene perros El perro entrante Es la cabeza
     */
    public void adicionarNodo(Perro dato) {
        if (cabeza == null) {
            //No tiene perros
            cabeza = new Nodo(dato);
        } else {
            // tiene perros
            Nodo temp = cabeza;
            while (temp.getSiguiente() != null) {
                temp = temp.getSiguiente();
            }
            //Ubicado o parado en el último
            temp.setSiguiente(new Nodo(dato));
        }
    }

    /**
     * Método que sirve para contar la cantidad de elementos de la Lista SE
     *
     * @return int cantidad de elementos
     */
    public int contarNodos() //cabeza
    {
        if (cabeza != null) {
            Nodo temp = cabeza;
            int cont = 1;
            while (temp.getSiguiente() != null) //Mientras el lazo este lleno
            {
                temp = temp.getSiguiente(); // Ayudante pase al siguiente perro
                cont++;
            }
            return cont;
        } else {
            return 0;
        }
    }

    /**
     * Método que adiciona un nodo al inicio
     *
     * @param perro Dato a agregar *
     */
    public void adicionarNodoAlInicio(Perro perro) {
        if (cabeza != null) {
            Nodo temp = new Nodo(perro);
            temp.setSiguiente(cabeza);
            cabeza = temp;
        } else {
            cabeza = new Nodo(perro);
        }
    }

    //METODO PARA MOSTRAR LOS DATOS DE LA LISTA
    public void mostrarLista() {

        Nodo recorrer = cabeza;
        while (recorrer != null) {

            System.out.println("[ " + recorrer.getDato() + "]");
            recorrer = recorrer.getSiguiente();

        }

    }

    /**
     * Método que permite intercambiar los datos de los extremos de la lista *
     */
    public void intercambiarExtremos() {
        if (cabeza != null) {
            Nodo temp = cabeza;
            while (temp.getSiguiente() != null) {
                temp = temp.getSiguiente();
            }
            /// Parado en el último nodo
            Perro perrotemp = cabeza.getDato();
            cabeza.setDato(temp.getDato());
            temp.setDato(perrotemp);
        }
    }

    public void invertir() {
        if (cabeza != null) {
            ListaSE listaTemporal = new ListaSE();
            Nodo temp = cabeza;
            while (temp != null)//Recorre de principio a fin
            {
                listaTemporal.adicionarNodoAlInicio(temp.getDato());
                temp = temp.getSiguiente();//Ayudante pase al siguiente perro
            }
            cabeza = listaTemporal.getCabeza();
        }
    }

    //Metodo para eliminar un nodo especifico 
    //@param id de perro a eliminar
    public void eliminarNodoporId(int id) {

        if (cabeza != null) {

            //SI EL ELEMENTO A ELIMINAR ESTA EN LA CABEZA
            if (cabeza.getDato().getNumero() == id) {

                Nodo temp = cabeza.getSiguiente();
                cabeza = temp;

//SI EL ELEMENTO A ELIMINAR NO ESTA EN LA CABEZA
            } else {

                Nodo anterior, temporal;
                anterior = cabeza;
                temporal = cabeza.getSiguiente();

                //Recorro la lista 
                while (temporal != null && temporal.getDato().getNumero() != id) {

                    anterior = anterior.getSiguiente();
                    temporal = temporal.getSiguiente();

                }

                if (temporal.getDato().getNumero() == id) {

                    //DEJAMOS DE APUNTAR EL NODO PARA ELIMINARLO 
                    anterior.setSiguiente(temporal.getSiguiente());
                    temporal = anterior.getSiguiente();

                }

            }

        } else {

            System.out.println("No hay elemetos para eliminar");
        }

    }

    public void ordenarMasculino() {

        if (cabeza != null) {

            ListaSE listaTemporal = new ListaSE();

            Nodo temp = cabeza;

            while (temp != null)//RECORRE DE PRINCIPIO A FIN
            {
                if (temp.getDato().getSexo() == "M") {

                    listaTemporal.adicionarNodoAlInicio(temp.getDato());
                } else {

                    listaTemporal.adicionarNodo(temp.getDato());
                }

                temp = temp.getSiguiente();// Ayudante pase l siguiente perro

            }

            cabeza = listaTemporal.getCabeza();

        }

    }

    public void ordenarFemenino() {

        if (cabeza != null) {

            ListaSE listaTemporal = new ListaSE();

            Nodo temp = cabeza;

            while (temp != null)//RECORRE DE PRINCIPIO A FIN
            {
                if (temp.getDato().getSexo() == "F") {

                    listaTemporal.adicionarNodoAlInicio(temp.getDato());
                } else {

                    listaTemporal.adicionarNodo(temp.getDato());
                }

                temp = temp.getSiguiente();// Ayudante pase l siguiente perro

            }

            cabeza = listaTemporal.getCabeza();

        }

    }

    public Perro buscarElemento(int idEncontrar) {

        if (cabeza != null) {

            Nodo temp = cabeza;
            Nodo encontrado = null;

            while (temp != null) {

                if (temp.getDato().getNumero() == idEncontrar) {

                    encontrado = temp;

                }

                temp = temp.getSiguiente();// Ayudante pase l siguiente perro

            }
            return encontrado.getDato();
        }
        return null;

    }

    public Perro buscarPosicion(int buscar) {

        if (cabeza != null) {

            int cont = 1;

            Nodo temp = cabeza;
            Nodo encontrado = null;

            while (buscar != cont) {

                temp = temp.getSiguiente();// Ayudante pase l siguiente perro
                cont++;

            }

            encontrado = temp;
            return encontrado.getDato();

        }

        return null;
    }

}
