/**
 * Descripción: Mulitples catch para manejo de múltiples excepciones a la vez.
 * Autor: Santiago Nicolás De la mora Núñez
 * Fecha: 25/02/2026
 */

import javax.swing.JOptionPane;

public class MultiplesCatch {
    public static void main(String[] args) {
        int numero, resultado;

        try {
            numero = Integer.parseInt(
                    JOptionPane.showInputDialog(
                            null,
                            "Ingrese el número",
                            "Número",
                            JOptionPane.PLAIN_MESSAGE
                    )
            );

            resultado = 10 / numero;

            JOptionPane.showMessageDialog(
                    null,
                    resultado,
                    "Resultado",
                    JOptionPane.PLAIN_MESSAGE
            );
        } catch (NumberFormatException e) {
            System.err.println("Error: No ingresaste un número válido.");
        } catch (ArithmeticException e) {
            System.err.println("Error: No se puede dividir entre 0.");
        }
    }
}