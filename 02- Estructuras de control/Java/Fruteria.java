/**
 * Descripción: Determinar cuanto gastará una persona que compre frutas en un frutería.
 * Autor: Santiago De la mora
 * Fecha: 22/01/2026
 */

import javax.swing.*;

public class Fruteria {
    public static void main(String[] args) {
        // Declaración de variables
        double numeroKilos = 0.0, precio = 0.0, subtotal = 0.0, descuento = 0.0, total = 0.0;
        String porcentaje = "", salida;

        // Entrada
        numeroKilos = Double.parseDouble(
                JOptionPane.showInputDialog(null,
                        "Introduce el número de kilos",
                        "Número de kilos",
                        JOptionPane.PLAIN_MESSAGE
                )
        );

        precio = Double.parseDouble(
                JOptionPane.showInputDialog(
                        null,
                        "Introduce el precio",
                        "Precio",
                        JOptionPane.PLAIN_MESSAGE
                )
        );

        // Operación
        subtotal = numeroKilos * precio;

        if (numeroKilos > 0.0) {
            if (numeroKilos >= 0.0 && numeroKilos <= 2.0) {
                descuento = 0.0;
                total = subtotal;
                porcentaje = "0%";
            } else if (numeroKilos >= 2.01 && numeroKilos <= 5.00) {
                descuento = subtotal * 0.10;
                total = subtotal - descuento;
                porcentaje = "10%";
            } else if (numeroKilos >= 5.01 && numeroKilos <= 10.00) {
                descuento = subtotal * 0.15;
                total = subtotal - descuento;
                porcentaje = "15%";
            } else {
                descuento = subtotal * 0.20;
                total = subtotal - descuento;
                porcentaje = "20%";
            }
        } else {
            JOptionPane.showMessageDialog(
                    null,
                    "Los kilos no pueden ser negativos",
                    "Error",
                    JOptionPane.ERROR_MESSAGE
            );
        }

        // Salida
        salida = String.format("""
            Subtotal: %.2f
            Descuento: %.2f
            Porcentaje: %s
            Total: %.2f
            """,
            subtotal, descuento, porcentaje, total
        );
    }
}