/**
 * Descripción: Clasifica vehiculos de a acuero de si pasan la verificación o no, en base a su nivel de emisiones, su año y su tipo.
 * Autor: Santiago De la mora
 * Fecha: 29/01/2026
 */

import javax.swing.JOptionPane;

public class VerificacionVehiculos {
    public static void main(String[] args) {
        // Declaración e inicialización de constantes y variables
        final String APROBADA = "Verificación aprobada",
                RECHAZADA = "Verificación rechazada",
                VEHICULO_ANTIGUO = "Vehículo antiguo, requiere revisión especial.";
        int anio = 0;
        double nivelEmisiones = 0.0;
        String tipo = "", resultado = "";
        String mensaje = "";

        // Entrada
        tipo = JOptionPane.showInputDialog(
                null,
                "Ingrese el tipo de su vehículo\n1) Particular\n2) Carga\n3) Público",
                "Tipo de vehículo",
                JOptionPane.PLAIN_MESSAGE
        );

        // Entrada
        anio = Integer.parseInt(
                JOptionPane.showInputDialog(
                        null,
                        "Ingrese el año de su vehículo",
                        "Año (modelo)",
                        JOptionPane.PLAIN_MESSAGE
                )
        );

        // Verifica si el año no es válido
        if (anio < 1980 || anio > 2026) {
            JOptionPane.showMessageDialog(
                    null,
                    "No puede ingresar un año anterior a 1980 o posterior al año actual (2026).",
                    "Error",
                    JOptionPane.ERROR_MESSAGE
            );
        } else {
            // Entrada
            nivelEmisiones = Double.parseDouble(
                    JOptionPane.showInputDialog(
                            null,
                            "Ingrese el nivel de emisiones",
                            "Nivel de emisiones",
                            JOptionPane.PLAIN_MESSAGE
                    )
            );

            // Verifica si el nivel de emsiones no es válido
            if (nivelEmisiones < 0.0 || nivelEmisiones > 500.0) {
                JOptionPane.showMessageDialog(
                        null,
                        "El nivel de emisiones no puede ser negativo ni mayor a 500.",
                        "Error",
                        JOptionPane.ERROR_MESSAGE
                );
            } else {
                // Verifica el tipo de vehículo
                switch (tipo) {
                    case "1":
                        // Cambia el tipo de vehículo del número de la opción a el nombre del tipo de vehículo
                        tipo = "Particular";

                        // Verifica si el vehículo pasó la verificación
                        if (nivelEmisiones <= 50) {
                            resultado = APROBADA;
                        } else {
                            resultado = RECHAZADA;
                        }

                        break;

                    case "2":
                        // Cambia el tipo de vehículo del número de la opción a el nombre del tipo de vehículo
                        tipo = "Carga";

                        // Verifica si el vehículo pasó la verificación
                        if (nivelEmisiones <= 70) {
                            resultado = APROBADA;
                        } else {
                            resultado = RECHAZADA;
                        }

                        break;

                    case "3":
                        // Cambia el tipo de vehículo del número de la opción a el nombre del tipo de vehículo
                        tipo = "Público";

                        // Verifica si el vehículo pasó la verificación
                        if (nivelEmisiones <= 60) {
                            resultado = APROBADA;
                        } else {
                            resultado = RECHAZADA;
                        }

                        break;

                    default:
                        JOptionPane.showMessageDialog(
                                null,
                                "Sólo puede elegir una opción del 1 al 3.",
                                "Error",
                                JOptionPane.ERROR_MESSAGE
                        );
                }

                // Salida
                mensaje = String.format("""
                        Tipo de vehículo: %s
                        Año del vehículo: %d
                        Nivel de emisiones: %.2f
                        
                        %s
                        """,
                        tipo,
                        anio,
                        nivelEmisiones,
                        resultado
                );

                // Verifica si el vehículo es demasiado viejo
                if (anio < 2005) {
                    mensaje += "\n" + VEHICULO_ANTIGUO;
                }

                JOptionPane.showMessageDialog(
                        null,
                        mensaje,
                        "Resultado de la verificación",
                        JOptionPane.PLAIN_MESSAGE
                );
            }
        }
    }
}