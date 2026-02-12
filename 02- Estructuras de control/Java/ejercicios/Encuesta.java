/**
 * Descripción: Realiza una encuesta a 10 personas con las opciones: Excelente, Bueno,
 *      Regular y Malo. Muestra el total de respuestas por opción.
 * Autor: Santiago Nicolás De la mora Núñez
 * Fecha: 11/02/2026
 */

package mx.edu.uttt.ejerciciosunidad2;

import javax.swing.JOptionPane;

public class Encuesta {
    public static void main(String[] args) {
        // Declaración e inicialización de variables
        boolean esValido = false;
        int numeroMalas = 0, numeroRegulares = 0, numeroBuenas = 0, numeroExcelentes = 0;
        String opcion = "",
            menu = ". ¿Qué nivel de calificación la daría a las instalaciónes de la carrera de TICs?\n" +
                    "1) Malo\n" +
                    "2) Regular\n" +
                    "3) Bueno\n" +
                    "4) Excelente\n";

        // Solicita la opción 10 veces
        int i = 1;
        while (i <= 10) {
            do {
                opcion = JOptionPane.showInputDialog(null,i + menu);

                // Verifica el tipo de opción seleccionada
                switch (opcion) {
                    case "1":
                        numeroMalas++;
                        esValido = true;

                        break;

                    case "2":
                        numeroRegulares++;
                        esValido = true;

                        break;
                    case "3":
                        numeroBuenas++;
                        esValido = true;

                        break;

                    case "4":
                        numeroExcelentes++;
                        esValido = true;

                        break;

                    default:
                        JOptionPane.showMessageDialog(null, "Sólo puede ingresar un número del 1 al 4.");
                        esValido = false;
                }
            } while (!esValido);

            i++;
        }

        // Muestra los resultados de la encuesta
        JOptionPane.showMessageDialog(
                null,
                "==== Resultados ====\n" +
                        "¿Qué nivel de calificación la daría a las instalaciónes de la carrera de TICs?\n" +
                        "Malo: " + numeroMalas + "\n" +
                        "Regular: " + numeroRegulares + "\n" +
                        "Bueno: " + numeroBuenas + "\n" +
                        "Excelentes: " + numeroExcelentes + "\n"
        );
    }
}