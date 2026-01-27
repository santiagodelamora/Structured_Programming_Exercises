/**
 * Descripción: Calcula el promedio de 3 calificaciones.
 * Autor: Santiago De la mora
 * Fecha: 21/01/2026
 */

package mx.edu.uttt.estructurasControl;

import javax.swing.*;

public class Calificaciones2 {
    public static void main(String[] args) {
        // Declaración de variables
        double calificacion1, calificacion2, calificacion3, promedio;
        final int NUMERO_CALIFICACION = 3;

        // Entrada
        calificacion1 = Double.parseDouble(
            JOptionPane.showInputDialog(
                null,
                "Introduce la calificación 1",
                "Calificacion 1",
                JOptionPane.PLAIN_MESSAGE
            )
        );

        calificacion2 = Double.parseDouble(
            JOptionPane.showInputDialog(
                null,
                "Introduce la calificación 2",
                "Calificacion 2",
                JOptionPane.PLAIN_MESSAGE
            )
        );

        calificacion3 = Double.parseDouble(
            JOptionPane.showInputDialog(
                null,
                "Introduce la calificación 3",
                "Calificacion 3",
                JOptionPane.PLAIN_MESSAGE
            )
        );

        // Calcula el promedio
        promedio = (calificacion1 + calificacion2 + calificacion3) / 3;

        // Validación con una estructura de control selectiva doble
        if (promedio >= 7.0) {
            JOptionPane.showMessageDialog(
                null,
                "Aprobado",
                "",
                JOptionPane.PLAIN_MESSAGE
            );
        } else {
            JOptionPane.showMessageDialog(
                null,
                "Reprobado",
                "",
                JOptionPane.ERROR_MESSAGE
            );
        }
    }
}
