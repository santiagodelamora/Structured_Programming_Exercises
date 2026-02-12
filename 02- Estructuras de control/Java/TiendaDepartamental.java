/**
 * Descripción: Sistema de cobro en una tienda departamental.
 * Autor: Santiago De la mora
 * Fecha: 30/01/2026
 */

import javax.swing.JOptionPane;

public class TiendaDepartamental {
    public static void main(String[] args) {
        // Declaración de variables
        double subtotal, descuentoPorcentaje, descuento, impuestoPorcentaje, impuesto, total;
        String tipoCliente, formaPago, salida;

        // Solicita el tipo de cliente
        tipoCliente = JOptionPane.showInputDialog(
                null,
                """
                ¿Cuál es su tipo de cliente?
                1) Normal
                2) Miembro
                3) Empleado""",
                "Tipo de cliente",
                JOptionPane.PLAIN_MESSAGE
        );

        // Valida si el tipo de cliente es no es válido
        if (!tipoCliente.equals("1") && !tipoCliente.equals("2") && !tipoCliente.equals("3")) {
            JOptionPane.showMessageDialog(
                    null,
                    "Sólo puede seleccionar una opción del 1 al 3.",
                    "Error",
                    JOptionPane.ERROR_MESSAGE
            );
        } else {
            // Solicita el monto total de la compra
            subtotal = Double.parseDouble(
                    JOptionPane.showInputDialog(
                            null,
                            "Ingrese el monto de su compra",
                            "Monto",
                            JOptionPane.PLAIN_MESSAGE
                    )
            );

            // Valida si el monto es un número negativo o 0
            if (subtotal <= 0) {
                JOptionPane.showMessageDialog(
                        null,
                        "El monto no puede ser negativo.",
                        "Error",
                        JOptionPane.ERROR_MESSAGE
                );
            } else {
                // Solicita la forma de pago
                formaPago = JOptionPane.showInputDialog(
                        null,
                        """
                        Ingrese la forma de pago
                        1) Efectivo
                        2) Tarjeta""",
                        "Forma de pago",
                        JOptionPane.PLAIN_MESSAGE
                );

                // Verifica si la forma de pago no es la correcta
                if (!formaPago.equals("1") && !formaPago.equals("2")) {
                    JOptionPane.showMessageDialog(
                            null,
                            "Sólo puede seleccionar una opción del 1 al 2.",
                            "Error",
                            JOptionPane.ERROR_MESSAGE
                    );
                } else {
                    // Calcula los descuentos
                    if (tipoCliente.equals("2")) {
                        // Establece el tipo de cliente pero como cadena
                        tipoCliente = "Miembro";

                        descuentoPorcentaje = 0.10;
                    } else if (tipoCliente.equals("3")) {
                        // Establece el tipo de cliente pero como cadena
                        tipoCliente = "Empleado";

                        descuentoPorcentaje = 0.20;
                    } else {
                        // Establece el tipo de cliente pero como cadena
                        tipoCliente = "Normal";

                        descuentoPorcentaje = 0.00;
                    }

                    // Calcula el descuento adicional
                    if (formaPago.equals("1")) {
                        // Establece la forma de pago pero como cadena
                        formaPago = "Efectivo";

                        descuentoPorcentaje += 0.05;
                    } else {
                        // Establece la forma de pago pero como cadena
                        formaPago = "Tarjeta";

                        descuentoPorcentaje += 0.00;
                    }

                    // Calcula el impuesto
                    if (subtotal > 5000) {
                        impuestoPorcentaje = 0.05;
                    } else {
                        impuestoPorcentaje = 0.00;
                    }

                    // Calcula el descuento, el impuesto y el total a pagar
                    descuento = subtotal * descuentoPorcentaje;
                    impuesto = subtotal * impuestoPorcentaje;
                    total = subtotal - descuento + impuesto;

                    // Muestra el precio final
                    salida = String.format("""
                            Subtotal: $%.2f
                            Descuento del %d%%
                            Descuento aplicado: $%.2f
                            Impuesto del %d%%
                            Impuesto aplicado: $%.2f
                            --------------------------------------
                            Total a pagar: $%.2f
                            --------------------------------------""",
                            subtotal,
                            (int) (descuentoPorcentaje * 100),
                            descuento,
                            (int) (impuestoPorcentaje * 100),
                            impuesto,
                            total);

                    JOptionPane.showMessageDialog(
                            null,
                            salida,
                            "",
                            JOptionPane.PLAIN_MESSAGE
                    );
                }
            }
        }
    }
}
