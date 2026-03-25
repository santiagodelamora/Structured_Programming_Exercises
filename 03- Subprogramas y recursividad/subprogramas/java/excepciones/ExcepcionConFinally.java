/**
 * Descripción: Manejo de excepciones con finally.
 * Autor: Santiago Nicolás De la mora Núñez
 * Fecha: 25/02/2026
 */

public class ExcepcionConFinally {
    public static void main(String[] args) {
        int x = 10, y = 0, z = 0;

        try {
            z = x / y;

            System.out.println(z);
        } catch (ArithmeticException e) {
            System.out.println("Error: división entre 0");
        } finally {
            System.out.println("Esto siempre se ejecuta");
        }

        System.out.println("Fin del programa");
    }
}