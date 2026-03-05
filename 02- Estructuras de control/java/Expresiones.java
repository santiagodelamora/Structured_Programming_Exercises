/**
 * Descripción: Ejercicios de expresiones.
 * Autor: Santiago De la mora
 * Fecha: 14/01/2026
 */

import javax.swing.JOptionPane;

public class Expresiones {
    public static void main(String[] args) {
        // Declaración de variables
        int suma;
        int resta;
        int multiplicacion, division, modulo, area;
        double potencia, resultado = 0.0;
        float f1 = 0.0f;
        float f2 = (float) 0.0;

        // Declaración e inicialización de constantes
        final double PI = 3.14159;
        String salida = "";

        // Expresiones algebraícas
        suma = 3 + 5;
        resta = 10 - 12;
        multiplicacion = 24 * 23;
        division = 10 / 2;
        modulo = 10 % 2;
        potencia = Math.pow(4, 2);

        salida = "======== Expresiones aritméticas ========"
            .concat("\nLa suma es: " + suma)
            .concat("\nLa resta es: " + resta)
            .concat("\nLa multiplicación: " + multiplicacion)
            .concat("\nLa división es: " + division)
            .concat("\nEl módulo es: " + modulo)
            .concat("\nLa potencia es: " + potencia);

        JOptionPane.showMessageDialog(null, salida, "", JOptionPane.PLAIN_MESSAGE);
    }
}