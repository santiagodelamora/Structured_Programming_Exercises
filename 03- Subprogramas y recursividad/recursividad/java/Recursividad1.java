/**
 * Descripción: Imprimir del 1 al n utilizando la recursividad.
 * Autor: Santiago Nicolás De la mora Núñez
 * Fecha de creación: 10/03/2026
 */

public class Recursividad1 {
    public static void main(String[] args) {
        imprimir(3);

        System.out.println();

        imprimirHaciaAtras(3);
    }

    /*
    imprimir(3)
        |
        imprimir(3 - 1)
        sout(3)
            |
            imprimir(2 - 1)
            sout(2)
                |
                imprimir(1 - 1) se detiene
                sout(1)
                    |
                    return  (se detiene)
     */
    private static void imprimir(int n) {
        // Caso base
        if (n == 0) {
            return;
        }

        // Caso general (recursivo)
        else {
            imprimir(n - 1);

            System.out.print(n + " ");
        }
    }

    /*
    imprimirHaciaAtras(3)
        |
        sout(3)
        imprimirHaciaAtras(3 - 1)
            |
            sout(2)
            imprimirHaciaAtras(2 - 1)
                |
                sout(1)
                imprimirHaciaAtras(1 - 1)
                    |
                    return  (se detiene)
     */
    private static void imprimirHaciaAtras(int n) {
        // Caso base
        if (n == 0) {
            return;
        }

        // Caso general (recursivo)
        else {
            System.out.print(n + " ");
            imprimirHaciaAtras(n - 1);
        }
    }
}