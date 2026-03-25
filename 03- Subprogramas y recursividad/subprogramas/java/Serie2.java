/**
 * Descripción: Realizar un programa que resuelve una suma de fracciones algebráicas.
 * Autor: Santiago Nicolás De la mora Núñez
 * Fecha: 24/02/2026
 */

import javax.swing.JOptionPane;

public class Serie2 {
    public static double iniciarCalculo() {
        return calcularSerie(solicitarN());
    }

    private static double calcularSerie(int n) {
        double x = solicitarX();
        int denominador1 = 3;
        int denominador2 = 1;
        double s = 0.0;

        for (int i = 1; i <= n; i++) {
            s += Math.pow(x, (3.0 / denominador1)) / denominador2;
            denominador1 += 3;
            denominador2 += 2;
        }

        return s;
    }

    private static double calcularSerie() {
        int denominador1 = 1, n = solicitarN();
        double s = 0.0, x = solicitarX();

        for (int i = 1; i <= n; i++) {
            s += Math.pow(x, (3.0 / i)) / denominador1;
            denominador1 += 2;
        }

        return s;
    }

    private static double solicitarX() {
        String xStr;
        double x;
        boolean esValido;

        // Inicializa el valor de n para que el compilador no muestre error
        x = 0.0;

        do {
            xStr = JOptionPane.showInputDialog(
                    null,
                    "Ingrese el valor de x",
                    "x",
                    JOptionPane.PLAIN_MESSAGE
            );

            // Verifica si el valor no es nulo ni vacío
            if (xStr != null && !xStr.isBlank()) {
                try {
                    x = Double.parseDouble(xStr);

                    esValido = true;
                } catch (NumberFormatException e) {
                    JOptionPane.showMessageDialog(
                            null,
                            "Sólo puede ingresar números enteros.",
                            "Error",
                            JOptionPane.ERROR_MESSAGE
                    );

                    esValido = false;
                }
            } else {
                JOptionPane.showMessageDialog(
                        null,
                        "No puede dejar el campo vacío.",
                        "Error",
                        JOptionPane.ERROR_MESSAGE
                );

                 esValido = false;
            }

        } while (!esValido);

        return x;
    }

    private static int solicitarN() {
        String nStr;
        int n;

        while (true) {
            nStr = JOptionPane.showInputDialog(
                    null,
                    "Ingrese el valor de n",
                    "n",
                    JOptionPane.PLAIN_MESSAGE
            );

            // Verifica si se ingresaron espacios vacíos o es nulo
            if (nStr != null && !nStr.isBlank()) {
                try {
                    n = Integer.parseInt(nStr);

                    // Verifica si es menor o igual a 0
                    if (n <= 0) {
                        JOptionPane.showMessageDialog(
                                null,
                                "El valor debe ser un entero positivo.",
                                "Error",
                                JOptionPane.ERROR_MESSAGE
                        );
                    } else {
                       break;
                    }
                } catch (NumberFormatException e) {
                    JOptionPane.showMessageDialog(
                            null,
                            "Sólo puede ingresar números enteros.",
                            "Error",
                            JOptionPane.ERROR_MESSAGE
                    );
                }
            } else {
                JOptionPane.showMessageDialog(
                        null,
                        "No puede dejar el campo vacío.",
                        "Error",
                        JOptionPane.ERROR_MESSAGE
                );
            }
        }

        return n;
    }
}