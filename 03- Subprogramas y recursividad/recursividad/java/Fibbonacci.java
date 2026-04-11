/**
 * Descripción: Ejecucion de SistemaVentas.java.
 * Autor: Santiago Nicolás De la mora Núñez
 * Fecha: 05/03/2026
 */

import javax.swing.JOptionPane;

public class Fibbonacci {
    public static void main(String[] args) {
        int numero = 4;

        JOptionPane.showMessageDialog(
                null,
                "Fibbonacci de " + numero + " es " + calcularFibbonacci(numero),
                "Serie Fibbonnacci",
                JOptionPane.PLAIN_MESSAGE
        );
    }

    private static int calcularFibbonacci(int numero) {
        if (numero == 0) {
            return 0;
        } else if (numero == 1) {
            return 1;
        } else {
            return calcularFibbonacci(numero - 1) + calcularFibbonacci(numero - 2);
        }
    }
}