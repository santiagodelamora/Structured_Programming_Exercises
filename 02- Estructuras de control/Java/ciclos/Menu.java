/**
 * Descripción: Menú de copciones con validación.
 * Autor: Santiago De la mora
 * Fecha: 28/01/2026
 */

import javax.swing.JOptionPane;

public class Menu {
    public static void main(String[] args) {
        // Declaración e inicialización de variables
        String menu = "", opcion = "";
        boolean repetir = true;

        // Crea la cadena del menú y sus opciones
        menu = """
                ======== MENÚ =======
                1) Opción 1
                2) Opción 2
                3) Opción 3
                4) Salir
                
                Elige una opción:
                """;

        // Muestra el menú hasta que el usuario seleccione la opción salir
        do {
            // Muestra el menú
            opcion = JOptionPane.showInputDialog(
                    null,
                    menu,
                    "",
                    JOptionPane.PLAIN_MESSAGE
            );

            // Decide que hacer según la opción seleccionada
            switch (opcion.toUpperCase()) {
                case "A":
                case "1":
                    JOptionPane.showMessageDialog(null, "Opción 1");
                    repetir = true;
                    break;

                case "B":
                case "2":
                    JOptionPane.showMessageDialog(null, "Opción 2");
                    repetir = true;
                    break;

                case "C":
                case "3":
                    JOptionPane.showMessageDialog(null, "Opción 3");
                    repetir = true;
                    break;

                case "S":
                case "4":
                    JOptionPane.showMessageDialog(null, "El programa ha terminado");
                    repetir = false;
                    break;

                default:
                    JOptionPane.showMessageDialog(null, "Opción inválida");
                    repetir = true;
            }
        } while (repetir);
    }
}
