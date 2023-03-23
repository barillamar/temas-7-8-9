package com.temas789;

import java.io.*;
import java.util.*;

public class ContadorPalabras {

    public static void main(String[] args) {

        /*Programa que lee un archivo de texto, cuenta el número de veces que aparece cada palabra
        y luego las muestra ordenadas por su frecuencia de aparición:
         */

        // Declarar variables

        InputStream inputStream = null;
        PrintStream printStream = System.out;
        Map<String, Integer> contador = new HashMap<String, Integer>();
        List<Map.Entry<String, Integer>> lista = new LinkedList<Map.Entry<String, Integer>>();

        try {
            // Abrir el archivo de texto

            inputStream = new FileInputStream("texto.txt");
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(inputStream));

            // Leer el archivo línea por línea

            String linea;
            while ((linea = bufferedReader.readLine()) != null) {
                // Separar la línea en palabras

                String[] palabras = linea.split("\\W+");

                // Contar el número de veces que aparece cada palabra
                for (String palabra : palabras) {
                    palabra = palabra.toLowerCase();
                    if (contador.containsKey(palabra)) {
                        contador.put(palabra, contador.get(palabra) + 1);
                    } else {
                        contador.put(palabra, 1);
                    }
                }
            }

            // Ordenar las palabras por frecuencia de aparición

            lista.addAll(contador.entrySet());
            Collections.sort(lista, new Comparator<Map.Entry<String, Integer>>() {
                public int compare(Map.Entry<String, Integer> o1, Map.Entry<String, Integer> o2) {
                    return o2.getValue().compareTo(o1.getValue());
                }
            });

            // Mostrar las palabras ordenadas por frecuencia de aparición

            for (Map.Entry<String, Integer> entrada : lista) {
                printStream.println(entrada.getKey() + ": " + entrada.getValue());
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            // Cerrar el archivo de texto y los flujos de entrada y salida
            try {
                if (inputStream != null) {
                    inputStream.close();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}

