package com.temas789;

public class ArrayBidimensional {

    public static void main(String[] args) {

        //3.Crea un array bidimensional de enteros y recórrelo, mostrando la posición y el valor de cada elemento en ambas dimensiones.

        int[][] numeros = {
                {2, 4, 6, 8},
                {3, 6, 9, 12}
        };
        for (int i = 0; i < numeros.length; i++) {
            System.out.println("Valor de i: " + i);

            for (int j = 0; j < numeros[1].length; j ++) {
                System.out.println("i = " + i + ", j = " + j);
                System.out.println(numeros[i][j]);
            }
        }
    }
}
