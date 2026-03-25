/**
 * Descripción: Solicita un número entero positivo y muestra su tabla de multiplicar del 1 al
 *      10. Si el número no es válido, vuelve a solicitarlo.
 * Autor: Santiago Nicolás De la mora Núñez
 * Fecha: 10/02/2026
 */

import javax.swing.JOptionPane;

public class TablaMultiplicar {
    public static void main(String[] args) {
        // Declaración e inicialización de variables
        int numero = 0, resultado = 0;
        boolean esValido = true;
        String tabla = "";

        // Solicita el número hasta que sea válido
        do {
            numero = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese un número"));

            // Verifica si el número es negativo o 0
            if (numero < 1) {
                // Muestra un mensaje de error y condiciona al bucle a repetirse nuevamente
                JOptionPane.showMessageDialog(null, "El número no puede ser negativo ni cero.");
                esValido = false;
            } else {
                // Hace que se deje de repetir el bucle
                esValido = true;
            }
        } while (!esValido);

        // Título de la tabla
        tabla = "Tabla del " + numero + "\n";

        // Calcula la tabla de multiplicar
        for (int i = 1; i <= 10; i++) {
            // Calcula el resultado
            resultado = numero * i;

            // Construye la tabla de multiplicar
            tabla += numero + " x " + i + " = " + resultado + ((i < 10) ? "\n" : "");
        }

        // Muestra la tabla de multiplicar
        JOptionPane.showMessageDialog(null, tabla);
    }
}