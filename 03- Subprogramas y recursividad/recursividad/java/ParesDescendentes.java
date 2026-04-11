/**
 * Descripción: Construye un programa que solicite un número entero positivo y utilice un
 *      método recursivo void para mostrar todos los números pares desde ese
 *      valor hasta 2 en forma descendente.
 * Autor: Santiago Nicolás De la mora Núñez
 * Fecha de creación: 16/03/2026
 */

import javax.swing.JOptionPane;

public class ParesDescendentes {
    public static void main(String[] args) {
        // Declaración de variables
        int numero;

        // Solicita un número
        numero = solicitarNumero();

        // Verifica si el usuario decidió cancelar la solicitud del número
        if (numero != 0) {
            System.out.println("Impresión recursiva");
            mostrarParesDescendentesRecursivamente(numero);

            System.out.println("\n\nImpresión iterativa");
            mostrarParesDescendentesIterativamente(numero);
        }
    }

    // Solicita el ingreso de un número entero positivo
    public static int solicitarNumero() {
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

    public static void mostrarParesDescendentesRecursivamente(int n) {
        // Caso base
        if (n == 2) {
            System.out.print(n);

            return;
        }

        // Caso recursivo
        // Verifica si el número es par
        if (n % 2 == 0) {
            System.out.print(n + " ");
        }

        mostrarParesDescendentesRecursivamente(n - 1);
    }

    public static void mostrarParesDescendentesIterativamente(int n) {
        for (int i = n; i >= 2; i--) {
            // Verifica si el número es par
            if (n % 2 == 0) {
                System.out.print(n + " ");
            }
        }
    }
}