package com.temas789;

import java.util.Scanner;

import static com.temas789.ExcepcionThrows.DividePorCero.Dividir;

public  class ExcepcionThrows {

    /* 8. Crea una función DividePorCero. Esta, debe generar una excepción ("throws")
        a su llamante del tipo ArithmeticException que será capturada por su llamante
        (desde "main", por ejemplo). Si se dispara la excepción, mostraremos el mensaje
        "Esto no puede hacerse". Finalmente, mostraremos en cualquier caso: "Demo de código".
         */

    public static class DividePorCero {

        static int Dividir(int a, int b) throws ArithmeticException {
            return a / b;

        }
    }

        public static void main(String[] args) {

            Scanner scanner = new Scanner(System.in);
            System.out.println("Elige dos números para dividirlos: ");
            System.out.println("Número: ");
            int a = scanner.nextInt();
            System.out.println("Otro número: ");
            int b = scanner.nextInt();

            try {
                System.out.println("El resultado es: " + Dividir(a, b));
            } catch (ArithmeticException e) {
                System.out.println("No es posible esta división");
            } finally {
                System.out.println("Demo código");
            }


        }

}
