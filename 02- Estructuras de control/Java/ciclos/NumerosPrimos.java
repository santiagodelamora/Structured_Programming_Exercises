/**
 * Descripción: Determinar si un número es primo o no.
 * Autor: Santiago De la mora
 * Fecha: 27/01/2026
 */

import javax.swing.JOptionPane;

public class NumerosPrimos {
    public static void main(String[] args) {
        int numero = 4;
        int contador = 0;

        int i = 1;
        while (i <= numero) {
            if (numero % 2 == 0) {
                contador++;
            }

            i++;
        }

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