/**
 * Descripción: Imprimir del 1 al n utilizando la recursividad.
 * Autor: Santiago Nicolás De la mora Núñez
 * Fecha de creación: 10/03/2026
 */

public class Recursividad2 {
    public static void main(String[] args) {
        int resultado;

        /*resultado = sumarIterativo(5);
        System.out.println("La suma es: " + resultado);

        resultado = sumarIterativo(5);
        System.out.println("La suma es: " + resultado);*/

        resultado = potencia(2, 4);
        System.out.println("2⁴ = " + resultado);
    }

    private static int sumarIterativo(int n) {
        int suma = 0;

        for (int i = 1; i <= n; i++) {
            suma += i;
        }

        return suma;
    }

    /*
    sumarRecursivo(5)
        |
        return 5 + sumarRecursivo(5 - 1)
            |
            return 4 + sumarRecursivo(4 - 1)
                |
                return 3 + sumarRecursivo(3 - 1)
                    |
                    return 2 + sumarRecursivo(2 - 1)
                        |
                        return 1
     */
    private static int sumarRecursivo(int n) {
        // Caso base
        if (n == 1) {
            return 1;
        }

        // Caso recursivo
        else {
            return n + sumarRecursivo(n - 1);
        }
    }

    /*
    potencia(2, 4)
        |
        return 2 * potencia(2, 4 - 1)
            |
            return 2 * potencia(2, 3 - 1)
                |
                return 2 * potencia(2, 2 - 1)
                    |
                    return 2
     */
    private static int potencia(int base, int exponente) {
        // Caso base
        if (exponente == 1) {
            return base;
        }

        // Caso recursivo
        else {
            return base * potencia(2, exponente - 1);
        }
    }
}