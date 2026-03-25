/**
 * Descripción: Solicita un número entero positivo y muestra su tabla de multiplicar del 1 al
 *      10. Si el número no es válido, vuelve a solicitarlo.
 * Autor: Santiago Nicolás De la mora Núñez
 * Fecha: 10/02/2026
 */

import javax.swing.JOptionPane;

public class TablasMultiplicar {
    public static void main(String[] args) {
        int valor = solicitarValor();
        JOptionPane.showMessageDialog(null, generarTablas2(valor), "Tabla", JOptionPane.PLAIN_MESSAGE);
    }

    public static int solicitarValor() {
        int numero = 0;
        boolean esValido = true;

        do {
            try {
                numero = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese un número", "Número", JOptionPane.PLAIN_MESSAGE));

                if (numero > 0) {
                    esValido = true;
                } else {
                    JOptionPane.showMessageDialog(null, "No puede ingresar un número negativo o cero.", "Error", JOptionPane.ERROR_MESSAGE);
                    esValido = false;
                }
            } catch (NumberFormatException exception) {
                JOptionPane.showMessageDialog(null, "Debes introducir un número entero.", "Error", JOptionPane.ERROR_MESSAGE);
                esValido = false;
            }
        } while (!esValido);

        return numero;
    }

    // Este método resuelve la impresión de la tabla
    public static void generarTablas(int numero) {
        for (int i = 1; i <= 10; i++) {
            System.out.println(numero + " x " + i + " = " + (i * numero));
        }
    }

    public static String generarTablas2(int numero) {
        String tabla = "";

        for (int i = 1; i <= 10; i++) {
            tabla += numero + " x " + i + " = " + (i * numero) + "\n";
        }

        return tabla;
    }
}