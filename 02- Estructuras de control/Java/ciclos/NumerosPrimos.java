/**
 * Descripción: Determinar si un número es primo o no.
 * Autor: Santiago De la mora
 * Fecha: 27/01/2026
 */

import javax.swing.JOptionPane;

public class NumerosPrimos {
    public static void main(String[] args) {
        // Declración inicialización de variables
        int numero = 4;
        int contador = 0;

        // Repite tantas veces como la variable "número"
        int i = 1;
        while (i <= numero) {
            // Verifica si es par y aumenta el contador en 1
            if (numero % 2 == 0) {
                contador++;
            }

            i++;
        }

        // Verifica si el contador es mayor a 2 o no
        if (contador > 2) {
            JOptionPane.showMessageDialog(
                    null,
                    "Es primo",
                    "",
                    JOptionPane.PLAIN_MESSAGE
            );
        } else {
            JOptionPane.showMessageDialog(
                    null,
                    "No es primo",
                    "",
                    JOptionPane.PLAIN_MESSAGE
            );
        }
    }
}