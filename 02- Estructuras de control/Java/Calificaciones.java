/**
 * Descripción: Calcula el promedio de 3 calificacione.
 * Autor: Santiago De la mora
 * Fecha: 20/01/2026
 */

import javax.swing.JOptionPane;

public class Calificaciones {
    public static void main(String[] args) {
        // Declaración de variables
        double calificacion1 = 0.0, calificacion2 = 0.0, calificacion3 = 0.0, promedio = 0.0;

        // Entrada
        calificacion1 = Double.parseDouble(
            JOptionPane.showInputDialog(
                null,
                "Ingrese la calificación 1:",
                "Califiacion 1",
                JOptionPane.PLAIN_MESSAGE
            )
        );

        calificacion2 = Double.parseDouble(
            JOptionPane.showInputDialog(
                null,
                "Ingrese la calificación 2:",
                "Califiacion 2",
                JOptionPane.PLAIN_MESSAGE
            )
        );

        calificacion3 = Double.parseDouble(
            JOptionPane.showInputDialog(
                null,
                "Ingrese la calificación 3:",
                "Califiacion 3",
                JOptionPane.PLAIN_MESSAGE
            )
        );

        // Calcula el promedio
        promedio = (calificacion1 + calificacion2 + calificacion3) / 3;

        // Valida que el promedio sea aprobatorio
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