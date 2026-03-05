/**
 * Descripción: Manejo de la excepción cacusada por la división entre 0.
 * Autor: Santiago Nicolás De la mora Núñez
 * Fecha: 25/02/2026
 */

import javax.swing.JOptionPane;

public class DivisionEntreCero {
    public static void main(String[] args) {
        int num1, num2, resultado;

        num1 = Integer.parseInt(
                JOptionPane.showInputDialog(
                        null,
                        "Introduce el número 1",
                        "Número 1",
                        JOptionPane.PLAIN_MESSAGE
                )
        );

        num2 = Integer.parseInt(
                JOptionPane.showInputDialog(
                        null,
                        "Introduce el número 2",
                        "Número 2",
                        JOptionPane.PLAIN_MESSAGE
                )
        );

        try {
            resultado = num1 / num2;

            JOptionPane.showMessageDialog(
                    null,
                    "Resultado: " + resultado,
                    "Resultado",
                    JOptionPane.PLAIN_MESSAGE
            );
        } catch (ArithmeticException e) {
            System.err.println(e.getMessage() + "\n");
            System.err.println(e.getCause() + "\n");
            e.printStackTrace();
            System.err.println("\nNo se puede dividir entre 0.");
            JOptionPane.showMessageDialog(
                    null,
                    "No se puede dividir entre 0.",
                    "Error",
                    JOptionPane.ERROR_MESSAGE
            );
        } finally {
            JOptionPane.showMessageDialog(
                    null,
                    "Fin del programa",
                    "",
                    JOptionPane.PLAIN_MESSAGE
            );
        }
    }
}