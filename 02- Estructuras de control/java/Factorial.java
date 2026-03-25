/**
 * Descripción: Calcula el factorial de un número "n"
 * Autor: Santiago De la mora
 * Fecha: 04/02/2026
 */

import javax.swing.JOptionPane;

public class Factorial {
    public static void main(String[] args) {
        // Declaración de variables
        long factorial = 1;
        int n = 0;

        // Solicita el valor de n
        n = Integer.parseInt(
                JOptionPane.showInputDialog(
                        null,
                        "Introduce el valor de n",
                        "Valor de n",
                        JOptionPane.PLAIN_MESSAGE
                )
        );

        // Valida si el numero es mayor o igual a 0
        if (n >= 0) {
            // Calcula el factorial del número dado
            for (int i = 1; i <= n; i++) {
                factorial *= i;
            }

            // Salida
            JOptionPane.showMessageDialog(
                    null,
                    "!" + n + " = " + factorial,
                    "Resultado",
                    JOptionPane.PLAIN_MESSAGE
            );
        } else {
            JOptionPane.showMessageDialog(
                    null,
                    "El valor de \"n\" no puede ser negativo",
                    "Error",
                    JOptionPane.ERROR_MESSAGE
            );
        }
    }
}