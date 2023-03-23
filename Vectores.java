package com.temas789;

import java.util.Vector;

public class Vectores {

    public static void main(String[] args) {

        /*4.Crea un "Vector" del tipo de dato que prefieras, y añádele 5 elementos.
        Elimina el 2o y 3er elemento y muestra el resultado final.
         */

        Vector<String> animales = new Vector();
        animales.add("Vaca");
        animales.add("Panda");
        animales.add("Grillo");
        animales.add("Delfín");
        animales.add("Pinguino");

        animales.remove(1);
        animales.remove(1);
        System.out.println(animales);
    }
}
