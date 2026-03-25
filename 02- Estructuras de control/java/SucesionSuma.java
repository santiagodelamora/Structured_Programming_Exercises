/**
 * Descripción: Calcula la suma de la sucesión e imprimir la sucesión y la suma: 1, 4, 9, 16, 25, 36, 49, 64, 81.
 * El siguiente número se calcula elevando al cuadrado su posición.
 * Autor: Santiago De la mora
 * Fecha: 04/02/2026
 */

import javax.swing.JOptionPane;

public class SucesionSuma {
    public static void main(String[] args) {
        // Declaración de variables
        int potencia = 1, n = 0;
        double suma = 0.0;
        String sucesion = "";

        // Solicita un número
        n = Integer.parseInt(
                JOptionPane.showInputDialog(
                        null,
                        "Ingrese un número",
                        "",
                        JOptionPane.PLAIN_MESSAGE
                )
        );

        // Repite hasta completar la sucesión
        int i = 1;
        while (i <= n) {
            // Calcula la potencia
            potencia = (int) Math.pow(i, 2);

            // Suma el resultado de la potencia
            suma += potencia;

            // La agrega a la cadena
            sucesion += potencia + ((i < n) ? ", " : "");

            i++;
        }

        // Muestra el resultado
        JOptionPane.showMessageDialog(
                null,
                sucesion + "\n" + "Suma: " + suma,
                "Resultado",
                JOptionPane.PLAIN_MESSAGE
        );
    }
}