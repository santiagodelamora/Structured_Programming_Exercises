/**
 * Descripción: Solicita las ventas diarias de una semana y muestra el total vendido, el día con
 *      mayor venta y el día con menor venta.
 * Autor: Santiago Nicolás De la mora Núñez
 * Fecha: 11/02/2026
 */

import javax.swing.JOptionPane;

public class VentasSemanales {
    public static void main(String[] args) {
        // Declaración e inicialización de variables y constantes
        final int DIAS_SEMANA = 7;
        double total = 0.0, ventaActual = 0.0, venta1 = 0.0, venta2 = 0.0,
                venta3 = 0.0, venta4 = 0.0, venta5 = 0.0, venta6 = 0.0,
                venta7 = 0.0, ventaMenor = 0.0, ventaMayor = 0.0;
        boolean esValida = true;
        String diaSemanaMayoresVentas = "", diaSemanaMenoresVentas = "";

        // Solicita las ventas máximas por cada día de las semana
        for (int i = 1; i <= DIAS_SEMANA; i++) {
            do {
                ventaActual = Double.parseDouble(JOptionPane.showInputDialog(null, "Ingrese la venta " + i));

                // Verifica si la venta no es negativa
                if (ventaActual < 0) {
                    JOptionPane.showMessageDialog(null, "La venta no puede ser negativa.");

                    // Indica que se debe volver a solicitar la venta
                    esValida = false;
                } else {
                    // Indica que debe salir del bucle
                    esValida = true;
                }
            } while (!esValida);

            // Verifica el día de la semana para guardarlo en su respectiva variable
            switch (i) {
                case 1:
                    venta1 = ventaActual;
                    break;

                case 2:
                    venta2 = ventaActual;
                    break;

                case 3:
                    venta3 = ventaActual;
                    break;

                case 4:
                    venta4 = ventaActual;
                    break;

                case 5:
                    venta5 = ventaActual;
                    break;

                case 6:
                    venta6 = ventaActual;
                    break;

                case 7:
                    venta7 = ventaActual;
                    break;
            }

            total += ventaActual;
        }

        // Verifica cuál es el día de la venta mayor y el día de la venta menor
        ventaMenor = venta1;
        diaSemanaMenoresVentas = "Domingo";
        ventaMayor = venta1;
        diaSemanaMayoresVentas = "Domingo";

        if (venta2 < ventaMenor) {
            ventaMenor = venta2;
            diaSemanaMenoresVentas = "Lunes";
        }
        if (venta2 > ventaMayor) {
            ventaMayor = venta2;
            diaSemanaMayoresVentas = "Lunes";
        }

        if (venta3 < ventaMenor) {
            ventaMenor = venta3;
            diaSemanaMenoresVentas = "Martes";
        }
        if (venta3 > ventaMayor) {
            ventaMayor = venta3;
            diaSemanaMayoresVentas = "Martes";
        }

        if (venta4 < ventaMenor) {
            ventaMenor = venta4;
            diaSemanaMenoresVentas = "Miércoles";
        }
        if (venta4 > ventaMayor) {
            ventaMayor = venta4;
            diaSemanaMayoresVentas = "Miércoles";
        }

        if (venta5 < ventaMenor) {
            ventaMenor = venta5;
            diaSemanaMenoresVentas = "Jueves";
        }
        if (venta5 > ventaMayor) {
            ventaMayor = venta5;
            diaSemanaMayoresVentas = "Jueves";
        }

        if (venta6 < ventaMenor) {
            ventaMenor = venta6;
            diaSemanaMenoresVentas = "Viernes";
        }
        if (venta6 > ventaMayor) {
            ventaMayor = venta6;
            diaSemanaMayoresVentas = "Viernes";
        }
        
        if (venta7 < ventaMenor) {
            ventaMenor = venta7;
            diaSemanaMenoresVentas = "Sábado";
        }
        if (venta7 > ventaMayor) {
            ventaMayor = venta7;
            diaSemanaMayoresVentas = "Sábado";
        }

        // Salida
        JOptionPane.showMessageDialog(
                null,
                "==== Ventas semanales ====\n" +
                        "Ventas totales: " + total + "\n" +
                        "Día con mayores ventas: " + diaSemanaMayoresVentas + " ($" + ventaMayor + ")\n" +
                        "Día con menores ventas: " + diaSemanaMenoresVentas + " ($" + ventaMenor + ")"
        );
    }
}