/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.edu.umanizales.listase.prueba;

import co.edu.umanizales.listase.modelo.Infante;
import co.edu.umanizales.listase.modelo.ListaDE;
import co.edu.umanizales.listase.modelo.ListaDECInfante;
import co.edu.umanizales.listase.modelo.ListaDECircular;
import co.edu.umanizales.listase.modelo.ListaSE;
import co.edu.umanizales.listase.modelo.OportunidadNiño;
import co.edu.umanizales.listase.modelo.Perro;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ThreadLocalRandom;

/**
 *
 * @author carloaiza
 */
public class ProbarListaSE {

    public static List<Infante> lista;

    public static void main(String... args) {
        //Instanciar una lista se
        ListaDECInfante listaPerros = new ListaDECInfante();
        lista = new ArrayList<>();

        Infante lulu = new Infante("Lulu", (byte) 1, "Femenino");
        OportunidadNiño niño1 = new OportunidadNiño(lulu, (byte) 1);
        listaPerros.adicionarNiñoAlinicioDeCircular(niño1);

        Infante pastor = new Infante("Pastor", (byte) 2, "Masculino");
        OportunidadNiño niño2 = new OportunidadNiño(pastor, (byte) 1);
        listaPerros.adicionarNiñoAlinicioDeCircular(niño2);
        ;
//        listaPerros.adicionarNiñoAlinicioDeCircular(kira);

        Infante tomy = new Infante("Tomy", (byte) 4, "Masculino");
        OportunidadNiño niño4 = new OportunidadNiño(tomy, (byte) 1);
        listaPerros.adicionarNiñoAlinicioDeCircular(niño4);

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
        listaPerros.mostrarListaDEC();
//        listaPerros.adicionarNodo(niño3);

        Infante kira = new Infante("Kira", (byte) 3, "Masculino");
        OportunidadNiño niño3 = new OportunidadNiño(kira, (byte) 1);
        
//        listaPerros.adicionarNodoEnSPosicion(niño3, 2);
        listaPerros.adicionarNodoPorPosicion(niño3, 3);
//listaPerros.adicionarNiñoAlinicioDeCircular(niño3);

        System.out.println("Finalizo");

//        listaPerros.eliminarNiños("niña");
        listaPerros.mostrarListaDEC();
        

//        System.out.println("Finalizo");
    }

}
