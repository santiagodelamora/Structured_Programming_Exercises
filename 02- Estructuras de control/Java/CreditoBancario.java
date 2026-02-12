/**
 * Descripción: Un banco analiza solicitudes de crédito analizando el ingreso mensual , la antiguedad laboral y el historial crediticio.
 * Autor: Santiago De la mora
 * Fecha: 30/01/2026
 */

import javax.swing.JOptionPane;

public class CreditoBancario {
    public static void main(String[] args) {
        // Declaración de variables
        double ingresoMensual;
        int antiguedadLaboral;
        String historialCrediticio, resultado, mensaje;

        // Solicita el ingreso mensual
        ingresoMensual = Double.parseDouble(
                JOptionPane.showInputDialog(
                        null,
                        "Ingrese su salario mensual",
                        "Salario mensual",
                        JOptionPane.PLAIN_MESSAGE
                )
        );

        // Valida que el ingreso mensual no sea un número negativo
        if (ingresoMensual < 0) {
            JOptionPane.showMessageDialog(
                    null,
                    "El ingreso mensual no puede ser negativo.",
                    "Error",
                    JOptionPane.ERROR_MESSAGE
            );
        } else {
            // Solicita la antigüedad laboral
            antiguedadLaboral = Integer.parseInt(
                    JOptionPane.showInputDialog(
                            null,
                            "Ingrese su antigüedad laboral en años",
                            "Antigüedad laboral",
                            JOptionPane.PLAIN_MESSAGE
                    )
            );

            // Valida que la edad no sea un número negativo ni mayor a 70 años
            if (antiguedadLaboral < 0 || antiguedadLaboral > 70) {
                JOptionPane.showMessageDialog(
                        null,
                        "La antigüedad laboral no puede ser un número negativo ni mayor a 70.",
                        "Error",
                        JOptionPane.ERROR_MESSAGE
                );
            } else {
                // Solicita el nivel del historial crediticio
                historialCrediticio = JOptionPane.showInputDialog(
                        null,
                        """
                        Ingrese su nivel de historial crediticio
                        1) Bueno
                        2) Regular
                        3) Malo
                        """,
                        "Historial crediticio",
                        JOptionPane.PLAIN_MESSAGE
                );

                // Valida si el tipo de historial crediticio es no válido
                if (!historialCrediticio.equals("1") && !historialCrediticio.equals("2") && !historialCrediticio.equals("3")) {
                    JOptionPane.showMessageDialog(
                            null,
                            "Sólo puede seleccionar una opción del 1 al 3.",
                            "Error",
                            JOptionPane.ERROR_MESSAGE
                    );
                } else {
                    // Calcula que tipo de crédito se debe entregar
                    if (ingresoMensual >= 12000 && antiguedadLaboral >= 2 && !historialCrediticio.equals("3")) {
                        resultado = "Crédito aprobado";
                    } else if (ingresoMensual >= 8000 && antiguedadLaboral >= 1 && historialCrediticio.equals("2")) {
                        resultado = "Crédito condicionado";
                    } else {
                        resultado = "Crédito rechazado";
                    }

                    mensaje = String.format("""
							Ingreso mensual: $%.2f
							Antiguedad laboral: %s años
							Historial crediticio: %s
							Crédito asignado: -- %s --""",
                            ingresoMensual,
                            antiguedadLaboral,
                            (historialCrediticio.equals("1") ? "Bueno" :
                                    (historialCrediticio.equals("2") ? "Regular" :
                                            (historialCrediticio.equals("3") ? "Malo" : ""))),
                            resultado
                    );

                    // Verifica si el ingreso mensual es alto y agrega un mensaje adicional
                    if (ingresoMensual > 25000) {
                        mensaje += "\n\nCliente candidato a crédito premium.";
                    }

                    // Muestra el mensaje
                    JOptionPane.showMessageDialog(
                            null,
                            mensaje,
                            "Resultado",
                            JOptionPane.PLAIN_MESSAGE
                    );
                }
            }
        }
    }
}