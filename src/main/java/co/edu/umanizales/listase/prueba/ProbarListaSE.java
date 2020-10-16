/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.edu.umanizales.listase.prueba;

import co.edu.umanizales.listase.modelo.ListaDE;
import co.edu.umanizales.listase.modelo.ListaSE;
import co.edu.umanizales.listase.modelo.Perro;

/**
 *
 * @author carloaiza
 */
public class ProbarListaSE {

    public static void main(String... args) {
        //Instanciar una lista se
//        ListaSE listaPerros = new ListaSE();
//
//        Perro lulu = new Perro("Lulú", (byte) 1, (byte) 9, "F");
//        listaPerros.adicionarNodo(lulu);
//
//        Perro firulais = new Perro("Firulais", (byte) 2, (byte) 4, "M");
//        listaPerros.adicionarNodo(firulais);
//
//        Perro samy = new Perro("samy", (byte) 2, (byte) 4, "F");
//        listaPerros.adicionarNodo(samy);
//
//        Perro pastor = new Perro("Tobby", (byte) 3, (byte) 6, "M");
////        listaPerros.adicionarNodo(pastor);
//
//        System.out.println("finalizao");

//        listaPerros.ordenarMasculino();
//        System.out.println(listaPerros.buscarPosicion(3));
//        listaPerros.mostrarLista();
        ListaDE listaPerros = new ListaDE();

        Perro lulu = new Perro("Lulú", (byte) 1, (byte) 9, "F");
        listaPerros.adicionarNodo(lulu);

        Perro firulais = new Perro("Firulais", (byte) 2, (byte) 4, "M");
        listaPerros.adicionarNodo(firulais);

        Perro kike = new Perro("Kike", (byte) 3, (byte) 7, "M");
        listaPerros.adicionarNodo(kike);

        Perro tito = new Perro("tito", (byte) 4, (byte) 9, "M");
        listaPerros.adicionarNodo(tito);

        Perro kira = new Perro("kira", (byte) 5, (byte) 9, "F");
        
        listaPerros.mostrarLista();

        System.out.println("Finalizo");

//        listaPerros.eliminarxPosicion(5);
//        Perro casique = new Perro("Casique", (byte) 90, (byte) 3, "M");
        
        listaPerros.intercambiarPosiciones(3, 2);

        System.out.println("\n");

        listaPerros.mostrarLista();

    }

}
