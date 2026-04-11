/**
 * Descripción: Construye un programa que solicite un número entero positivo n y utilice un
 *      método recursivo void para imprimir un triángulo numérico ascendente
 *      desde 1 hasta n.
 * Autor: Santiago Nicolás De la mora Núñez
 * Fecha de creación: 13/03/2026
 */

import javax.swing.JOptionPane;

public class TrianguloNumerico {
    public static void main(String[] args) {
        // Declaración de variables
        int numero;

        // Solicita el número
        numero = solicitarNumero();

        // Verifica si el número es diferente de 0, y si es así, imprime las pirámides de números
        if (numero != 0) {
            System.out.println("Impresión recursiva");
            imprimirRecursivamente(numero);

            System.out.println("\n\nImpresión iterativa");
            imprimirIterativamente(numero);
        }
    }

    // Solicita el ingreso de un número entero positivo
    public static int solicitarNumero() {
        /*
        Sin Cláusulas de guarda

        String numeroStr;
        int numero;
        boolean esValido;

        do {
            numeroStr = JOptionPane.showInputDialog(null, "Ingrese un número positivo", "Número positivo", JOptionPane.PLAIN_MESSAGE);

            // Verifica si no se hizo click en el tache o en "Cancelar" (si el valor no es null)
            if (numeroStr != null) {
                // Verifica si se ingresó un número y no se dejó el campo vacío
                if (!numeroStr.trim().isEmpty()) {
                    // Captura errores
                    try {
                        // Convierte la cadena en un número entero
                        numero = Integer.parseInt(numeroStr);

                        // Verifica si el número es positivo
                        if (numero > 0) {
                            return numero;
                        } else {
                            JOptionPane.showMessageDialog(null, "No puede ingresar números negativos ni 0.", "Error", JOptionPane.ERROR_MESSAGE);
                            esValido = false;
                        }
                    } catch (NumberFormatException e) {
                        JOptionPane.showMessageDialog(null, "No puede ingresar letras ni carácteres especiales.", "Error", JOptionPane.ERROR_MESSAGE);
                        esValido = false;
                    }
                } else {
                    JOptionPane.showMessageDialog(null, "No puede dejar el campo vacío.", "Error", JOptionPane.ERROR_MESSAGE);
                    esValido = false;
                }
            } else {
                // Termina la solicitud del número
                esValido = true;
            }
        } while (!esValido);

        return 0;
        */

        // Con Cláusulas de guarda
        String numeroStr;
        int numero;

        while (true) {
            numeroStr = JOptionPane.showInputDialog(null, "Ingrese un número positivo", "Número positivo", JOptionPane.PLAIN_MESSAGE);

            // Verifica si se hizo click en el tache o en "Cancelar" (si el valor es null)
            if (numeroStr == null) {
                return 0;
            }

            // Verifica si se no ingresó un número o se dejó el campo vacío
            if (numeroStr.trim().isEmpty()) {
                JOptionPane.showMessageDialog(null, "No puede dejar el campo vacío.", "Error", JOptionPane.ERROR_MESSAGE);
                continue;
            }

            // Captura errores
            try {
                // Convierte la cadena en un número entero
                numero = Integer.parseInt(numeroStr);

                // Verifica si el número es positivo
                if (numero > 0) {
                    return numero;
                } else {
                    JOptionPane.showMessageDialog(null, "No puede ingresar números negativos ni 0.", "Error", JOptionPane.ERROR_MESSAGE);
                }
            } catch (NumberFormatException e) {
                JOptionPane.showMessageDialog(null, "No puede ingresar letras ni carácteres especiales.", "Error", JOptionPane.ERROR_MESSAGE);
            }
        }
    }

    // Funciones recursivas
    // Imprime las filas
    public static void imprimirRecursivamente(int i) {
        // Caso recursivo
        if (i > 0) {
            imprimirRecursivamente(i - 1);
            imprimirRecursivamente2(i);
            System.out.println();
        }

        /*
        imprimirRecursivamente(5)
            imprimirRecursivamente(5 - 1)
            imprimirRecursivamente(5)
            System.out.println()
                imprimirRecursivamente(4 - 1)
                imprimirRecursivamente(4)
                System.out.println()
                    imprimirRecursivamente(3 - 1)
                    imprimirRecursivamente(3)
                    System.out.println()
                        imprimirRecursivamente(2 - 1)
                        imprimirRecursivamente(2)
                        System.out.println()
                            imprimirRecursivamente(1 - 1)
                            imprimirRecursivamente(1)
                            System.out.println()

                            "1 " + "\n"
                        "1 " + "2 " + "\n"
                    "1 " + "2 " + "3 " + "\n"
                "1 " + "2 " + "3 " + "4 " + "\n"
            "1 " + "2 " + "3 " + "4 " + "5 " + "\n"

        "1 " + "\n"
        "1 " + "2 " + "\n"
        "1 " + "2 " + "3 " + "\n"
        "1 " + "2 " + "3 " + "4 " + "\n"
        "1 " + "2 " + "3 " + "4 " + "5 " + "\n"
        */
    }

    // Imprime las columnas
    public static void imprimirRecursivamente2(int t) {
        if (t > 0) {
            imprimirRecursivamente2(t - 1);
            System.out.print(t + " ");
        }

        /*
        imprimirRecursivamente2(5)
            imprimirRecursivamente2(5 - 1)
            System.out.print(5 + " ")
                imprimirRecursivamente2(4 - 1)
                System.out.print(4 + " ")
                    imprimirRecursivamente2(3 - 1)
                    System.out.print(3 + " ")
                        imprimirRecursivamente2(2 - 1)
                        System.out.print(2 + " ")
                            imprimirRecursivamente2(1 - 1)
                            System.out.print(1 + " ")

                            "1 "
                        "2 "
                    "3 "
                "4 "
            "5 "

        "1 " + "2 " + "3 " + "4 " + "5 "
        */
    }

    // Función iterativa
    public static void imprimirIterativamente(int n) {
        String salida = "";

        for (int i = 1; i <= n; i++) {
            for (int t = 1; t <= i; t++) {
                salida += t + " ";
            }

            salida += "\n";
        }

        System.out.println(salida);
    }
}