/**
 * Descripción: Menú de copciones con validación.
 * Autor: Santiago De la mora
 * Fecha: 28/01/2026
 */

package mx.edu.uttt.ciclos;

import javax.swing.JOptionPane;

public class Menu {
    public static void main(String[] args) {
        String menu = "", opcion = "";
        boolean esValido = true;

        // Crea la cadena del menú y sus opciones
        menu = """
                ======== MENÚ =======
                1) Opción 1
                2) Opción 2
                3) Opción 3
                4) Salir
                
                Elige una opción:
                """;

        do {
            // Muestra el menú
            opcion = JOptionPane.showInputDialog(
                    null,
                    menu,
                    "",
                    JOptionPane.PLAIN_MESSAGE
            );

            switch (opcion.toUpperCase()) {
                case "A":
                case "1":
                    JOptionPane.showMessageDialog(null, "Opción 1");
                    esValido = false;
                    break;

                case "B":
                case "2":
                    JOptionPane.showMessageDialog(null, "Opción 2");
                    esValido = false;
                    break;

                case "C":
                case "3":
                    JOptionPane.showMessageDialog(null, "Opción 3");
                    esValido = false;
                    break;

                case "S":
                case "4":
                    JOptionPane.showMessageDialog(null, "El programa ha terminado");
                    esValido = true;
                    break;

                default:
                    JOptionPane.showMessageDialog(null, "Opción inválida");
                    esValido = false;
            }
        } while (!esValido);
    }
}
