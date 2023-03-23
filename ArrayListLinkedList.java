package com.temas789;

import java.util.ArrayList;
import java.util.LinkedList;

public class ArrayListLinkedList {

    public static void main(String[] args) {

        /* 6.Crea un ArrayList de tipo String, con 4 elementos. Cópialo en una LinkedList.
         Recorre ambos mostrando únicamente el valor de cada elemento.
         */
        ArrayList<String> colores = new ArrayList<>();
        colores.add("Rojo");
        colores.add("Anaranjado");
        colores.add("Amarillo");
        colores.add("Verde");

        LinkedList<String> linkedList = new LinkedList<>();

        for (int i = 0; i < colores.size(); i++) {
            linkedList.add(i, colores.get(i));
        }

        System.out.println("Elementos del ArrayList: ");
        for (String items: colores) {
            System.out.println(items + " ");
        }
        System.out.println("Elementos del LinkedList: ");
        for (String items: linkedList) {
            System.out.println(items + " ");
        }
    }
}
