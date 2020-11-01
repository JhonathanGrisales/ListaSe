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
public class ListaDECircular {

    private NodoDE cabezaDeC;

    public NodoDE getCabezaDeC() {
        return cabezaDeC;
    }

    public void setCabezaDeC(NodoDE cabezaDeC) {
        this.cabezaDeC = cabezaDeC;
    }

    public ListaDECircular() {
    }

    // ADICIONAR AL INICIO
    public void adicionarAlinicioDeCircular(Perro dato) {

        if (cabezaDeC != null) {

            NodoDE tempDE = new NodoDE(dato);
            cabezaDeC.getAnteriorDE().setSiguienteDE(tempDE);
            tempDE.setSiguienteDE(cabezaDeC);
            tempDE.setAnteriorDE(cabezaDeC.getAnteriorDE());
            cabezaDeC.setAnteriorDE(tempDE);
            cabezaDeC = tempDE;

        } else {

            cabezaDeC = new NodoDE(dato);
            cabezaDeC.setSiguienteDE(cabezaDeC);
            cabezaDeC.setAnteriorDE(cabezaDeC);
        }

    }

    public void mostrarListaDEC() {

        if (cabezaDeC != null) {

            NodoDE recorrer = cabezaDeC;

            while (recorrer.getSiguienteDE() != cabezaDeC) {

                System.out.println("[ " + recorrer.getDato().getNumeroSuma() + "]");
                recorrer = recorrer.getSiguienteDE();
            }

            System.out.println("[ " + recorrer.getDato().getNumeroSuma() + "]");

        } else {

            System.out.println("No hay lementos para mostar");
        }

    }

    public int contarNodosDEC() {

        if (cabezaDeC != null) {

            NodoDE temp = cabezaDeC;
            int cont = 1;

            while (temp.getSiguienteDE() != cabezaDeC) {

                temp = temp.getSiguienteDE();
                cont++;

            }

            return cont;

        }
        int cont = 0;
        return cont;

    }

    public int sumar(String sentencia) {

        switch (sentencia) {

            case "par":

                if (cabezaDeC != null) {

                    if (contarNodosDEC() % 2 == 0) {

                        NodoDE temp = cabezaDeC.getAnteriorDE();
                        int contador = 1;
                        int suma = 0;

                        while (temp.getAnteriorDE() != cabezaDeC.getAnteriorDE()) {

                            if (contador % 2 != 0) {

                                suma = suma + temp.getDato().getEdad();
                            }

                            temp = temp.getAnteriorDE();
                            contador++;
                        }

                        if (contarNodosDEC() % 2 != 0) {

                            suma = suma + temp.getDato().getEdad();
                        }

                        return suma;

                    } else {

                        NodoDE temp = cabezaDeC.getAnteriorDE().getAnteriorDE();

                        int contador = 1;
                        int suma = 0;

                        while (temp.getAnteriorDE() != cabezaDeC.getAnteriorDE()) {

                            if (contador % 2 != 0) {

                                suma = suma + temp.getDato().getEdad();
                            }

                            temp = temp.getAnteriorDE();
                            contador++;
                        }

                        if (contarNodosDEC() % 2 == 0) {

                            suma = suma + temp.getDato().getEdad();
                        }

                        return suma;
                    }

                } else {

                    System.out.println("No hay elementos para sumar");

                }

                break;
            case "impar":

                if (cabezaDeC != null) {

                    if (contarNodosDEC() % 2 != 0) {

                        NodoDE temp = cabezaDeC.getAnteriorDE();
                        int contador = 1;
                        int suma = 0;

                        while (temp.getAnteriorDE() != cabezaDeC.getAnteriorDE()) {

                            if (contador % 2 != 0) {

                                suma = suma + temp.getDato().getEdad();
                            }

                            temp = temp.getAnteriorDE();
                            contador++;
                        }

                        if (contarNodosDEC() % 2 != 0) {

                            suma = suma + temp.getDato().getEdad();
                        }

                        return suma;

                    } else {

                        NodoDE temp = cabezaDeC.getAnteriorDE().getAnteriorDE();

                        int contador = 1;
                        int suma = 0;

                        while (temp.getAnteriorDE() != cabezaDeC.getAnteriorDE()) {

                            if (contador % 2 != 0) {

                                suma = suma + temp.getDato().getEdad();
                            }

                            temp = temp.getAnteriorDE();
                            contador++;
                        }

                        if (contarNodosDEC() % 2 == 0) {

                            suma = suma + temp.getDato().getEdad();
                        }

                        return suma;
                    }

                } else {

                    System.out.println("No hay elementos para sumar");

                }

                break;

            default:

                System.out.println("No ingreso Ninguna Opción Valida");
        }
        return 0;
    }
    
    

    
        }
