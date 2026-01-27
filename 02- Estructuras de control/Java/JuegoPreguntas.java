/**
 * Descripción: En un juego de preguntas a las que se responde sí o no gana
 *  quién responda correctamente las 3 preguntas. Si se responde mal, a
 *  cualquiera de ellas, ya no se pregunta la siguiente y termina el juego.
 * Autor: Santiago De la mora
 * Fecha: 22/01/2026
 */

package mx.edu.uttt.estructurasControl;

import javax.swing.*;

public class JuegoPreguntas {
    public static void main(String[] args) {
        // Declaración de variables
        String respuesta1, respuesta2, respuesta3;

        // Entrada
        respuesta1 = JOptionPane.showInputDialog(
                null,
                "¿Colón descubrió America?",
                "Pregunta 1",
                JOptionPane.PLAIN_MESSAGE
        ).toUpperCase();

        // Verifica si debe salir del juego o no
        if (respuesta1.equals("NO")) {
            JOptionPane.showMessageDialog(
                    null,
                    "Has perdido",
                    "Juego perdido",
                    JOptionPane.ERROR_MESSAGE
            );

            return;
        } else if (!respuesta1.equals("SI")) {
            JOptionPane.showMessageDialog(
                    null,
                    "Sólo puede ingresar Si o No",
                    "Error",
                    JOptionPane.ERROR_MESSAGE
            );

            return;
        }

        respuesta2 = JOptionPane.showInputDialog(
                null,
                "¿La independencia de México fue en le año 1810?",
                "Pregunta 2",
                JOptionPane.PLAIN_MESSAGE
        ).toUpperCase();

        // Verifica si debe salir del juego o no
        if (respuesta2.equals("NO")) {
            JOptionPane.showMessageDialog(
                    null,
                    "Has perdido",
                    "Juego perdido",
                    JOptionPane.ERROR_MESSAGE
            );

            return;
        } else if (!respuesta2.equals("SI")) {
            JOptionPane.showMessageDialog(
                    null,
                    "Sólo puede ingresar Si o No",
                    "Error",
                    JOptionPane.ERROR_MESSAGE
            );

            return;
        }

        respuesta3 = JOptionPane.showInputDialog(
                null,
                "¿The Doors fue un grupo de rock estadounidense?",
                "Pregunta 3",
                JOptionPane.PLAIN_MESSAGE
        ).toUpperCase();

        // Verifica si debe salir del juego o no
        if (respuesta3.equals("NO")) {
            JOptionPane.showMessageDialog(
                    null,
                    "Has perdido",
                    "Juego perdido",
                    JOptionPane.ERROR_MESSAGE
            );

            return;
        } else if (!respuesta3.equals("SI")) {
            JOptionPane.showMessageDialog(
                    null,
                    "Sólo puede ingresar Si o No",
                    "Error",
                    JOptionPane.ERROR_MESSAGE
            );

            return;
        }

        // Salida
        JOptionPane.showMessageDialog(
                null,
                "Has respondido correctamente todas las preguntas",
                "Has ganado",
                JOptionPane.PLAIN_MESSAGE
        );
    }
}
