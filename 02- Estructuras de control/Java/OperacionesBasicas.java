/**
 * Descripción: Operaciones básicas.
 * Autor: Santiago De la mora
 * Fecha: 21/01/2026
 */

package mx.edu.uttt.estructurasControl;

import javax.swing.JOptionPane;

public class OperacionesBasicas {
    public static void main(String[] args) {
        // Declaración de variables
        String menu, opcion;
        double valor1, valor2;

        // Crear menu
        menu = """
======== MENÚ ========
1) Suma
2) Resta
3) Multiplicación
4) División
5) Módulo
6) Potencia
7) Raíz

Elige una opción
        """;

        // Solicita la opción
        opcion = JOptionPane.showInputDialog(
            null,
            menu,
            "",
            JOptionPane.PLAIN_MESSAGE
        );

        // Aplica las opciones
        switch (opcion) {
            // Suma
            case "1":
                valor1 = Double.parseDouble(
                    JOptionPane.showInputDialog(
                        null,
                        "Introduce el valor 1",
                        "Valor 1",
                        JOptionPane.PLAIN_MESSAGE
                    )
                );

                valor2 = Double.parseDouble(
                    JOptionPane.showInputDialog(
                        null,
                        "Introduce el valor 2",
                        "Valor 2",
                        JOptionPane.PLAIN_MESSAGE
                    )
                );

                JOptionPane.showMessageDialog(
                    null,
                    (valor1 + valor2),
                    "Resultado",
                    JOptionPane.PLAIN_MESSAGE
                );

                break;

            // Resta
            case "2":
                valor1 = Double.parseDouble(
                        JOptionPane.showInputDialog(
                                null,
                                "Introduce el valor 1",
                                "Valor 1",
                                JOptionPane.PLAIN_MESSAGE
                        )
                );

                valor2 = Double.parseDouble(
                        JOptionPane.showInputDialog(
                                null,
                                "Introduce el valor 2",
                                "Valor 2",
                                JOptionPane.PLAIN_MESSAGE
                        )
                );

                JOptionPane.showMessageDialog(
                        null,
                        (valor1 - valor2),
                        "Resultado",
                        JOptionPane.PLAIN_MESSAGE
                );

                break;

            // Multiplicación
            case "3":
                valor1 = Double.parseDouble(
                        JOptionPane.showInputDialog(
                                null,
                                "Introduce el valor 1",
                                "Valor 1",
                                JOptionPane.PLAIN_MESSAGE
                        )
                );

                valor2 = Double.parseDouble(
                        JOptionPane.showInputDialog(
                                null,
                                "Introduce el valor 2",
                                "Valor 2",
                                JOptionPane.PLAIN_MESSAGE
                        )
                );

                JOptionPane.showMessageDialog(
                        null,
                        (valor1 * valor2),
                        "Resultado",
                        JOptionPane.PLAIN_MESSAGE
                );

                break;

            // División
            case "4":
                valor1 = Double.parseDouble(
                        JOptionPane.showInputDialog(
                                null,
                                "Introduce el valor 1",
                                "Valor 1",
                                JOptionPane.PLAIN_MESSAGE
                        )
                );

                valor2 = Double.parseDouble(
                        JOptionPane.showInputDialog(
                                null,
                                "Introduce el valor 2",
                                "Valor 2",
                                JOptionPane.PLAIN_MESSAGE
                        )
                );

                // Verifica si el valor 2 no es 0
                if (valor2 != 0) {
                    JOptionPane.showMessageDialog(
                            null,
                            (valor1 / valor2),
                            "Resultado",
                            JOptionPane.PLAIN_MESSAGE
                    );
                } else {
                    JOptionPane.showMessageDialog(
                            null,
                            "El denominador no puede ser 0",
                            "Error",
                            JOptionPane.ERROR_MESSAGE
                    );
                }

                break;

            // Módulo
            case "5":
                valor1 = Double.parseDouble(
                        JOptionPane.showInputDialog(
                                null,
                                "Introduce el valor 1",
                                "Valor 1",
                                JOptionPane.PLAIN_MESSAGE
                        )
                );

                valor2 = Double.parseDouble(
                        JOptionPane.showInputDialog(
                                null,
                                "Introduce el valor 2",
                                "Valor 2",
                                JOptionPane.PLAIN_MESSAGE
                        )
                );

                // Verifica si el valor  no es 0
                if (valor2 != 0) {
                    JOptionPane.showMessageDialog(
                            null,
                            (valor1 % valor2),
                            "Resultado",
                            JOptionPane.PLAIN_MESSAGE
                    );
                } else {
                    JOptionPane.showMessageDialog(
                            null,
                            "El denominador no puede ser 0",
                            "Error",
                            JOptionPane.ERROR_MESSAGE
                    );
                }

                break;

            // Potencia
            case "6":
                valor1 = Double.parseDouble(
                        JOptionPane.showInputDialog(
                                null,
                                "Introduce el valor 1",
                                "Valor 1",
                                JOptionPane.PLAIN_MESSAGE
                        )
                );

                valor2 = Double.parseDouble(
                        JOptionPane.showInputDialog(
                                null,
                                "Introduce el valor 2",
                                "Valor 2",
                                JOptionPane.PLAIN_MESSAGE
                        )
                );

                // Verifica si los valores no son 0
                if (valor1 != 0.0 && valor2 != 0.0) {
                    JOptionPane.showMessageDialog(
                            null,
                            (Math.pow(valor1, valor2)),
                            "Resultado",
                            JOptionPane.PLAIN_MESSAGE
                    );
                } else {
                    JOptionPane.showMessageDialog(
                            null,
                            "Los valores no pueden ser 0",
                            "Error",
                            JOptionPane.ERROR_MESSAGE
                    );
                }

                break;

            // Raíz cuadrada
            case "7":
                valor1 = Double.parseDouble(
                        JOptionPane.showInputDialog(
                                null,
                                "Introduce el valor",
                                "Valor",
                                JOptionPane.PLAIN_MESSAGE
                        )
                );

                // Verifica si el valor no es 0
                if (valor1 > 0.0) {
                    JOptionPane.showMessageDialog(
                            null,
                            (Math.sqrt(valor1)),
                            "Resultado",
                            JOptionPane.PLAIN_MESSAGE
                    );
                } else {
                    JOptionPane.showMessageDialog(
                            null,
                            "El valor no puede ser 0",
                            "Error",
                            JOptionPane.ERROR_MESSAGE
                    );
                }

                break;

            default:
                JOptionPane.showMessageDialog(
                    null,
                    "Opción inválida. Ingrese una opción del 1 al 70",
                    "Error",
                    JOptionPane.ERROR_MESSAGE
                );
        }
    }
}
