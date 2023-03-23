package com.temas789;

import java.util.ArrayList;

public class ArrayListInt {

    public static void main(String[] args) {

        /* 7. Crea un ArrayList de tipo int, y, utilizando un bucle rellénalo con elementos 1..10.
         A continuación, con otro bucle, recórrelo y elimina los numeros pares.
         Por último, vuelve a recorrerlo y muestra el ArrayList final.
         Si te atreves, puedes hacerlo en menos pasos, siempre y cuando cumplas el primer "for" de relleno.
         */

        ArrayList<Integer> numbers = new ArrayList<>();
        for(int i = 0; i <= 10; i++) {
            numbers.add(i);

            for (int num = 0; num < numbers.size(); num ++) {

                if (numbers.get(num) % 2 == 0) {
                    numbers.remove(num);
                }
            }
            System.out.println(numbers);
        }
    }
}
