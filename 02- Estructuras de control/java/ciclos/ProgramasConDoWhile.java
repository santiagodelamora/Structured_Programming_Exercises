/**
 * Descripción: En una tienda de descuento las personas que van a pagar el importe de su compra llegan a
 *      la caja y sacan una bolita de color, que les dirá que descuento tendrán sobre el total de su
 *      compra. Determinar la cantidad que pagara cada cliente desde que la tienda abre hasta que
 *      cierra. Se sabe que si el color de la bolita es roja el cliente obtendrá un 40% de descuento;
 *      si es amarilla un 25% y si es blanca no obtendrá descuento.
 * Autor: Santiago De la mora
 * Fecha: 04/02/2026
 */

import javax.swing.JOptionPane;

public class ProgramasConDoWhile {
    public static void main(String[] args) {
        // Declaración e inicialización de variables
        double descuento = 0.0;
        boolean repetir = true;
        String opcion = "";

        do {
            // Solicita una de las varias opciones del menú
            opcion = obtenerMenu();

            switch (opcion) {
                // Programa 1
                case "1": {
                    JOptionPane.showMessageDialog(
                            null,
                            calcularResultados(),
                            "Resultados",
                            JOptionPane.PLAIN_MESSAGE
                    );

                    repetir = true;

                    break;
                }

                case "2": {
                    repetir = true;

                    break;
                }

                case "3": {
                    repetir = true;

                    break;
                }

                case "4":
                case null: {
                    JOptionPane.showMessageDialog(
                            null,
                            "I'll be back...",
                            "",
                            JOptionPane.PLAIN_MESSAGE
                    );

                    repetir = false;

                    break;
                }

                default: {
                    JOptionPane.showMessageDialog(
                            null,
                            "Opción inválida",
                            "Error",
                            JOptionPane.ERROR_MESSAGE
                    );

                    repetir = true;
                }
            }
        } while (repetir);
    }

    // Método estático
    public static String obtenerMenu() {
        // Crea la cadena del menú y sus opciones
        String menu = """
                ======== MENÚ CICLO WHILE =======
                1) Opción 1
                2) Opción 2
                3) Opción 3
                4) Salir
                
                Elige una opción:
                """;

        // Solicta y devuelve una opción
        String opcion = JOptionPane.showInputDialog(
                null,
                menu,
                "",
                JOptionPane.PLAIN_MESSAGE
        );

        System.out.println("Vale " + opcion);
        return opcion;
    }

    public static String elegirBolita() {
        String menu = """
                === Bolita elegida ===
                1) Roja
                2) Amarilla
                3) Blanca
                
                Elige una bolita:""";

        // Solicta y devuelve una opción
        return JOptionPane.showInputDialog(
                null,
                menu,
                "",
                JOptionPane.PLAIN_MESSAGE
        );
    }

    public static String calcularResultados() {
        double descuento = 0.0, total = 0.0, importe = 0.0;
        String salida = "", bolita = "";
        boolean repetir = true;
        int i = 1;

        do {
            do {
                importe = Double.parseDouble(
                        JOptionPane.showInputDialog(
                                null,
                                "Introduce el importe",
                                "Importe",
                                JOptionPane.PLAIN_MESSAGE
                        )
                );
            } while (importe <= 0 && importe != -1);

            if (importe == -1) {
                JOptionPane.showMessageDialog(
                        null,
                        "Has terminado.",
                        "Has terminado",
                        JOptionPane.PLAIN_MESSAGE
                );

                repetir = false;
            } else {
                bolita = elegirBolita();

                if (bolita.equals("1")) {
                    descuento = importe * .40;
                    total = importe - descuento;
                } else if (bolita.equals("2")) {
                    descuento = importe * .25;
                    total = importe - descuento;
                } else {
                    descuento = 0.0;
                    total = importe;
                }

                // Convierte la opción en el nombre del color seleccionado con un switch-case mejorado
                bolita = switch (bolita) {
                    case "1" -> "Roja";
                    case "2" -> "Amarilla";
                    case "3" -> "Blanca";
                    default -> "-1";
                };

                salida += String.format("""
                        Cliente %d
                        Importe: $%.2f
                        Descuento: $%.2f
                        Total: $%.2f\n\n""",
                        i, importe, descuento, total
                );

                i++;
                repetir = true;
            }
        } while (repetir);

        return salida;
    }
}