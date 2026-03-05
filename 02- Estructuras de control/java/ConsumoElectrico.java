/**
 * Descripción: Una compañía de energía eléctrica desea desarrollar un programa que permita calcular el monto a pagar de un usuario doméstico.
 * Autor: Santiago De la mora
 * Fecha: 27/01/2026
 */

import javax.swing.JOptionPane;

public class ConsumoElectrico {
    public static void main(String[] args) {
        // Declaración e inicialización de variables
        double consumoMensual = 0.0,
                costoPorKw = 0.0,
                recargoPorcentaje = 0.0,
                recargo = 0.0,
                monto = 0.0,
                montoFinal = 0.0;
        String tipoTarifa, mensaje;

        // Entrada
        consumoMensual = Double.parseDouble(
                JOptionPane.showInputDialog(
                        null,
                        "Ingrese su consumo mensual en KiloWatts-hora (KWh)",
                        "Consumo mensual",
                        JOptionPane.PLAIN_MESSAGE
                )
        );

        // Validación
        if (consumoMensual < 0) {
            JOptionPane.showMessageDialog(
                    null,
                    "No puede ingresar un consumo KiloWatt-hora negativo.",
                    "Error",
                    JOptionPane.ERROR_MESSAGE
            );
        } else {
            // Entrada
            tipoTarifa = JOptionPane.showInputDialog(
                    null,
                    "Ingrese el tipo de tarifa\n1) Básica\n2) Intermedia\n3) Alta",
                    "Error",
                    JOptionPane.PLAIN_MESSAGE
            );

            // Verifca el tipo de tarifa
            switch (tipoTarifa) {
                case "1":
                    tipoTarifa = "Básica";
                    costoPorKw = 0.85;

                    // Aplica recargoPorcentaje si se cumple la condición
                    if (consumoMensual > 250)
                        recargoPorcentaje = 0.12;

                    break;

                case "2":
                    tipoTarifa = "Intermedia";
                    costoPorKw = 1.25;

                    // Aplica recargoPorcentaje si se cumple la condición
                    if (consumoMensual >= 300 && consumoMensual <= 500)
                        recargoPorcentaje = 0.10;
                    else if (consumoMensual > 500)
                        recargoPorcentaje = 0.18;

                    break;

                case "3":
                    tipoTarifa = "Alta";
                    costoPorKw = 2.10;

                    // Aplica recargoPorcentaje si se cumple la condición
                    if (consumoMensual > 400)
                        recargoPorcentaje = 0.25;

                    break;

                default:
                    JOptionPane.showMessageDialog(
                            null,
                            "Sólo puede ingresar una opción de el 1 al 3.",
                            "Error",
                            JOptionPane.ERROR_MESSAGE
                    );

                    return;
            }

            // Calcula el precio a pagar
            monto = consumoMensual * costoPorKw;
            recargo = (monto * recargoPorcentaje);
            montoFinal = monto + recargo;

            // Salida
            mensaje = String.format("""
                Tipo de tarifa aplicada: %s
                Consumo registrado: %.2f kWh
                Costo por kWh: $%.2f
                Recargos aplicados: $%.2f
                Total a pagar: $%.2f\n\n""",
                tipoTarifa, consumoMensual, costoPorKw, recargo, montoFinal) +
                ((montoFinal > 1500.0) ? "Consumo elevado: se recomienda ahorro de energía." : "") +
                ((consumoMensual < 100) ? "Usuario con consumo eficiente." : "");

            JOptionPane.showMessageDialog(null, mensaje, "Recibo de luz", JOptionPane.PLAIN_MESSAGE);
        }
    }
}