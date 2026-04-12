/**
 * Descripción: Realiza un programa que solicite al usuario un número entero y cree un
 *      método recursivo que regrese su tabla de multiplicar del 1 al 10.
 * Autor: Santiago Nicolás De la mora Núñez
 * Fecha de creación: 16/03/2026
 */

import javax.swing.JOptionPane;

public class TablaMultiplicar {
    public static void main(String[] args) {
        // Declaración de variables
        int numero;

        // Solicita un número
        numero = solicitarNumero();

        // Verifica si el usuario decidió cancelar la solicitud del número
        if (numero != 0) {
            System.out.println("Impresión recursiva");
            imprimirTablaMultiplicarRecursivamente(numero, 1);

            System.out.println("\nImpresión iterativa");
            imprimirTablaMultiplicarIterativamente(numero);
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

    public static void imprimirTablaMultiplicarRecursivamente(int n, int i) {
        // Caso recursivo
        if (i <= 10) {
            System.out.println(n + " x " + i + " = " + (n * i));
            imprimirTablaMultiplicarRecursivamente(n, i + 1);
        }
    }

    public static void imprimirTablaMultiplicarIterativamente(int n) {
        int i = 1;
        while (i <= 10) {
            System.out.println(n + " x " + i + " = " + (n * i));
            
            i++;
        }
    }
}