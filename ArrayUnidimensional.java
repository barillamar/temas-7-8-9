package com.temas789;

public class ArrayUnidimensional {

    public static void main(String[] args) {

        // 2. Crea un array unidimensional de Strings y recórrelo, mostrando únicamente sus valores.

        String[] paises = {"Alemania", "Japón", "Aruba", "Eslovaquia"};
        for (int i = 0; i < paises.length; i++) {
            System.out.println(paises[i]);
        }
    }
}
