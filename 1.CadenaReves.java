package com.temas789;

public class cadenaReves {
    public static void main(String[] args) {

        // 1. Invertir una cadena

        String cadena = "Mariposa";
        String reves = "";
        for (int i = cadena.length() - 1; i >= 0; i--) {
            reves += cadena.charAt(i);
        }
        System.out.println("Cadena: " + cadena);
        System.out.println("Misma cadena pero al revés: " + reves);


    }


}
