/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.edu.umanizales.listase.prueba;

import co.edu.umanizales.listase.modelo.ListaDE;
import co.edu.umanizales.listase.modelo.ListaDECircular;
import co.edu.umanizales.listase.modelo.ListaSE;
import co.edu.umanizales.listase.modelo.Perro;
import java.util.concurrent.ThreadLocalRandom;
/**
 *
 * @author carloaiza
 */
public class ProbarListaSE {

    public static void main(String... args) {
        //Instanciar una lista se
        ListaSE listaPerros = new ListaSE();

        Perro lulu = new Perro("Lulú", (byte) ThreadLocalRandom.current().nextInt(1, 20 + 1), (byte) 9, "F");
        listaPerros.adicionarNodo(lulu);

        Perro firulais = new Perro("Firulais", (byte) ThreadLocalRandom.current().nextInt(1, 20 + 1), (byte) 4, "M");
        listaPerros.adicionarNodo(firulais);

        Perro samy = new Perro("samy", (byte) ThreadLocalRandom.current().nextInt(1, 20 + 1), (byte) 4, "F");
        listaPerros.adicionarNodo(samy);

        Perro pastor = new Perro("Tobby", (byte) 3, (byte) 6, "M");
//        listaPerros.adicionarNodo(pastor);
//
//        System.out.println("finalizao");

//        listaPerros.ordenarMasculino();
//        System.out.println(listaPerros.buscarPosicion(3));
//        listaPerros.mostrarLista();
//        ListaDECircular listaPerros = new ListaDECircular();

//        Perro lulu = new Perro("Lulú", (byte) 1, (byte) 9, "F");
//        listaPerros.adicionarAlinicioDeCircular(lulu);
//
//       
////        
//        Perro firulais = new Perro("Firulais", (byte) 2, (byte) 4, "M");
//        listaPerros.adicionarAlinicioDeCircular(firulais);
//        
//         
//
//        Perro kike = new Perro("Kike", (byte) 3, (byte) 7, "M");
//        listaPerros.adicionarAlinicioDeCircular(kike);
//
//        Perro tito = new Perro("tito", (byte) 4, (byte) 9, "M");
//        listaPerros.adicionarAlinicioDeCircular(tito);
//        Perro tito = new Perro(2);
//        listaPerros.adicionarAlinicioDeCircular(tito);
//
//        Perro kike = new Perro(4);
//        listaPerros.adicionarAlinicioDeCircular(kike);
//
//        Perro onix = new Perro(8);
//        listaPerros.adicionarAlinicioDeCircular(onix);
//
////        Perro aleman = new Perro(6);
////        listaPerros.adicionarAlinicioDeCircular(aleman);
//
//        Perro lupe = new Perro(-7);
//        listaPerros.adicionarAlinicioDeCircular(lupe);

//        Perro ruper = new Perro(3);
//        listaPerros.adicionarAlinicioDeCircular(ruper);
//
//        listaPerros.mostrarListaDEC();
//        System.out.println("Numero de Nodos: " + listaPerros.contarNodosDEC() + "\n");
//
//        System.out.println("Suma Impares: " + listaPerros.sumar("impar") + "\n");
//        System.out.println("Suma Pares: " + listaPerros.sumar("par") + "\n");

listaPerros.mostrarLista();

        System.out.println("Finalizo");
        
       
        
        System.out.println(listaPerros.numero());
        
        
        
        
        

    }

}
