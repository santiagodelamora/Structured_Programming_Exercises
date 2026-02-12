/**
 * Descripción: Calcular el promedio de un alumno que tiene n calificaciones en la materia de programación.
 * Autor: Santiago De la mora
 * Fecha: 28/01/2026
 */

import javax.swing.JOptionPane;

public class ProgramasConFor {
    public static void main(String[] args) {
        // Declaración e inicialización de variables
        int n = 0;
        double promedio = 0.0, calificacion = 0.0;
        String menu = "", opcion = "";
        boolean esValido = true;

        // Crea la cadena del menú y sus opciones
        menu = """
                ======== MENÚ PROGRAMA CON FOR =======
                1) Opción 1
                2) Opción 2
                3) Opción 3
                4) Salir
                
                Elige una opción:
                """;

        // Muestra el menú hasta que se seleccione la opción 4 (salir)
        do {
            // Muestra el menú
            opcion = JOptionPane.showInputDialog(
                    null,
                    menu,
                    "",
                    JOptionPane.PLAIN_MESSAGE
            );

            // Decide según la opción seleccionada
            switch (opcion.toUpperCase()) {
                case "A":
                case "1":
                    // Solicita el número de calificaciones a evaluar
                    n = Integer.parseInt(
                            JOptionPane.showInputDialog(
                                    null,
                                    "Introduce el número de calificaciones",
                                    "Número de califiaciones",
                                    JOptionPane.PLAIN_MESSAGE
                            )
                    );

                    // Valida si el número mayor a 0
                    if (n > 0) {
                        // Reinicia le valor de la variable a 0.0
                        promedio = 0.0;

                        // Solicita una calificación, la valida y calcula su promedio por el número de calificaciones especificadas anteriormente
                        for (int i = 1; i <= n; i++) {
                            calificacion = Double.parseDouble(
                                    JOptionPane.showInputDialog(
                                            null,
                                            "Introduce la calificación " + i,
                                            "Calificación",
                                            JOptionPane.PLAIN_MESSAGE
                                    )
                            );

                            // Valida si la calificación está entre 0 y 10
                            if (calificacion >= 0.0 && calificacion <= 10.0) {
                                // Acumula el promedio
                                promedio += calificacion;
                            } else  {
                                // Muestra un mensaje de error
                                JOptionPane.showMessageDialog(
                                        null,
                                        "La calificación no puede ser negativa ni mayor a 10.",
                                        "Error",
                                        JOptionPane.ERROR_MESSAGE
                                );

                                i--;
                            }
                        }

                        // Divide el valor acumulado entre el número de elementos
                        promedio /= n;

                        // Muestra el promedio
                        JOptionPane.showMessageDialog(
                                null,
                                "El promedio es: " + promedio,
                                "Promedio",
                                JOptionPane.PLAIN_MESSAGE
                        );
                    } else {
                        // Muestra un mensaje de error
                        JOptionPane.showMessageDialog(
                                null,
                                "El número de califiaciones no puede ser negativo.",
                                "Error",
                                JOptionPane.ERROR_MESSAGE
                        );
                    }
                    
                    // Indica que se debe volver a mostrar el menú de opciones
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