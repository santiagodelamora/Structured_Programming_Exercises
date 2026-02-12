/**
 * Descripción: Solicita dos números enteros y muestra todos los números primos que se
 *      encuentren dentro de ese rango.
 * Autor: Santiago Nicolás De la mora Núñez
 * Fecha: 11/02/2026
 */

package mx.edu.uttt.ejerciciosunidad2;

import javax.swing.JOptionPane;

public class NumerosPrimosDentroDeRango {
    public static void main(String[] args) {
        // Declaración e inicialización de variables y constantes
        final int NUMERO_PRIMO_MENOR = 2;
        int numeroInicial = 0, numeroFinal = 0, numeroDivisiones = 0;
        String numerosPrimos = "";
        boolean esValido = false;

        // Solicita el número inicial
        do {
            numeroInicial = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingresa número inicial"));

            // Verifica si el número es negativo, cero o uno
            if (numeroInicial < 2) {
                JOptionPane.showMessageDialog(null, "No puede ingresar un número menor a 2.");

                // Indica que se debe volver a solicitar el número
                esValido = false;
            } else {
                // Indica que se debe dejar de repetir el bucle
                esValido = true;
            }
        } while (!esValido);

        // Solicita el número final
        do {
            numeroFinal = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese el número final"));

            // Verifica si el número es menor o igual al número inicial
            if (numeroFinal <= numeroInicial) {
                JOptionPane.showMessageDialog(null, "El número final no puede ser menor que el número inicial.");

                // Indica que se debe volver a solicitar el número
                esValido = false;
            } else {
                // Indica que se debe dejar de repetir el bucle
                esValido = true;
            }
        } while (!esValido);

        // Muestra todos los números primos dentro del rango
        for (int i = numeroInicial; i <= numeroFinal; i++) {
            // Reinicia el contador de número de divisiones
            numeroDivisiones = 0;

            for (int t = NUMERO_PRIMO_MENOR; t <= i; t++) {
                // Verifica si el número final dividido entre cada número menor a él no tiene residuo (es una división exacta)
                if (i % t == 0) {
                    // Cuenta cada división exacta
                    numeroDivisiones++;
                }
            }

            // Verifica si el número se dividió solo una vez
            if (numeroDivisiones == 1) {
                // Concatena el número y agrega un espacio
                numerosPrimos += i + "  ";
            }
        }

        // Muestra los números primos
        JOptionPane.showMessageDialog(
                null,
                "Números primos entre " + numeroInicial + " y " + numeroFinal + ":\n" +
                        numerosPrimos
        );
    }
}