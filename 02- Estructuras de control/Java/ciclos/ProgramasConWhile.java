/**
 * Descripción: Una compañía de seguros tiene contratados a n vendedores. Cada uno hace tres ventas a la
 *     semana. Su política de pagos es que un vendedor recibe un sueldo base y un 10% extra por
 *     comisiones de sus ventas. El gerente de su compañía desea saber cuánto dinero obtendrá
 *     en la semana cada vendedor por concepto de comisiones por las tres ventas realizadas, y
 *     cuanto tomando en cuenta su sueldo base y sus comisiones.
 * Autor: Santiago De la mora
 * Fecha: 29/01/2026
 */

import javax.swing.JOptionPane;

public class ProgramasConWhile {
    public static void main(String[] args) {
        // Declaración de variables y constantes
        final double PORCENTAJE = 0.10;
        double sueldoBase = 0.0, venta1 = 0.0, venta2 = 0.0,
                venta3 = 0.0, comision = 0.0, total = 0.0, sumatoria = 0.0;
        int numeroTrabajadores = 0;
        String salida = "", menu = "", opcion = "";
        boolean esValido = true;

        // Crea la cadena del menú y sus opciones
        menu = """
                ======== MENÚ CICLO WHILE =======
                1) Opción 1
                2) Opción 2
                3) Opción 3
                4) Salir
                
                Elija una opción:
                """;

        // Muestra el menú hasta que el usuario seleccione la opción salir (4)
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
                    // Solicita el númeor de trabajadores
                    numeroTrabajadores = Integer.parseInt(
                            JOptionPane.showInputDialog(
                                    null,
                                    "Introduce el número de trabajadores",
                                    "Número de trabajadores",
                                    JOptionPane.PLAIN_MESSAGE
                            )
                    );

                    // Valida si el número de trabajadores es mayor a 0
                    if (numeroTrabajadores > 0) {
                        sueldoBase = Double.parseDouble(
                                JOptionPane.showInputDialog(
                                        null,
                                        "Introduce el sueldo base",
                                        "Sueldo base",
                                        JOptionPane.PLAIN_MESSAGE
                                )
                        );

                        // Valida si el sueldo base es mayor a 0
                        if (sueldoBase > 0.0) {
                            salida = "======== NÓMINA =======";

                            // Solicita las ventas del trabajador tantas veces como número de trabajadores
                            int i = 1;
                            while (i <= numeroTrabajadores) {
                                // Solicita la primera venta
                                venta1 = Double.parseDouble(
                                        JOptionPane.showInputDialog(
                                                null,
                                                "Introduce la venta 1",
                                                "Venta 1",
                                                JOptionPane.PLAIN_MESSAGE
                                        )
                                );

                                // Solicit la primera venta
                                venta2 = Double.parseDouble(
                                        JOptionPane.showInputDialog(
                                                null,
                                                "Introduce la venta 2",
                                                "Venta 2",
                                                JOptionPane.PLAIN_MESSAGE
                                        )
                                );

                                // Solicita la tercera venta
                                venta3 = Double.parseDouble(
                                        JOptionPane.showInputDialog(
                                                null,
                                                "Introduce la venta 3",
                                                "Venta 3",
                                                JOptionPane.PLAIN_MESSAGE
                                        )
                                );

                                // Valida si todas las ventas mayores a 0
                                if (venta1 <= 0.0 || venta2 <= 0.0 || venta3 <= 0.0) {
                                    // Muestra un mensaje de error
                                    JOptionPane.showMessageDialog(
                                            null,
                                            "Una o más ventas no son válidas",
                                            "Error",
                                            JOptionPane.ERROR_MESSAGE
                                    );

                                    continue;
                                } else {
                                    // Calcula la comisión y el total
                                    comision = (venta1 + venta2 + venta3) * PORCENTAJE;
                                    total = sueldoBase + comision;

                                    // Crea la cadena con el resultado de salida
                                    salida += String.format("""
                                            \nVendedor %d
                                            Sueldo base: $%.2f
                                            Comsion: $%.2f
                                            Total: $%.2f
                                            """,
                                            i, sueldoBase, comision, total
                                    );

                                    // Acumula el total de las ventas
                                    sumatoria += total;
                                }

                                i++;
                            }

                            // Agrega el total de deducciones al resultrado de salida y lo muestra
                            salida += String.format("\nTotal de deducciones: $%.2f", sumatoria);
                            JOptionPane.showMessageDialog(
                                    null,
                                    salida,
                                    "Nómina",
                                    JOptionPane.PLAIN_MESSAGE
                            );
                        } else {
                            // Muestra un mensaje de error
                            JOptionPane.showMessageDialog(
                                    null,
                                    "El sueldo base debe de ser mayor a 0",
                                    "Error",
                                    JOptionPane.ERROR_MESSAGE
                            );
                        }
                    } else {
                        // Muestra un mensaje de error
                        JOptionPane.showMessageDialog(
                                null,
                                "El número de trabajadores debe de ser mayor a 0",
                                "Error",
                                JOptionPane.ERROR_MESSAGE
                        );
                    }

                    // Indica que se debe de mostrar el menú otra vez
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