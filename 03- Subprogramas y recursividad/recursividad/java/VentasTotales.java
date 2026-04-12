/**
 * Descripción: Elabora un programa que solicite al usuario la cantidad de ventas
 *      realizadas y después capture el monto de cada venta. Crea un método
 *      recursivo que regrese la suma total de todas las ventas.
 * Autor: Santiago Nicolás De la mora Núñez
 * Fecha de creación: 16/03/2026
 */

import javax.swing.JOptionPane;

public class VentasTotales {
    public static void main(String[] args) {
        // Declaración de variables
        int numeroVentas;

        // Solicita un número
        numeroVentas = (int) solicitarNumero("Ingrese el número de ventas", "Número de ventas", false);

        // Verifica si el usuario decidió cancelar la solicitud del número
        if (numeroVentas != 0) {
            JOptionPane.showMessageDialog(null, "Total de las ventas: " + sumarVentasRecursivamente(numeroVentas), "Cálculo recursivo", JOptionPane.PLAIN_MESSAGE);
            JOptionPane.showMessageDialog(null, "Total de las ventas: " + sumarVentasIterativamente(numeroVentas), "Cálculo iterativo", JOptionPane.PLAIN_MESSAGE);
        }
    }

    // Solicita el ingreso de un número entero positivo
    public static double solicitarNumero(String mensajeSolicitud, String tituloSolicitud, boolean decimalesPermitidos) {
        String numeroStr;
        double numero;

        while (true) {
            numeroStr = JOptionPane.showInputDialog(null, mensajeSolicitud, tituloSolicitud, JOptionPane.PLAIN_MESSAGE);

            // Verifica si se hizo click en el tache o en "Cancelar" (si el valor es null)
            if (numeroStr == null) {
                return 0;
            }

            // Verifica si se no ingresó un número o se dejó el campo vacío
            if (numeroStr.trim().isEmpty()) {
                JOptionPane.showMessageDialog(null, "No puede dejar el campo vacío.", "Error", JOptionPane.ERROR_MESSAGE);
                continue;
            }

            // Captura errores
            try {
                // Convierte la cadena en un número decimal
                numero = Double.parseDouble(numeroStr);

                // Verifica si los decimales no están permitidos
                numero = (!decimalesPermitidos) ? Math.floor(numero) : numero;

                // Verifica si el número es positivo
                if (numero > 0.0) {
                    return numero;
                } else {
                    JOptionPane.showMessageDialog(null, "No puede ingresar números negativos ni 0.", "Error", JOptionPane.ERROR_MESSAGE);
                }
            } catch (NumberFormatException e) {
                JOptionPane.showMessageDialog(null, "No puede ingresar letras ni carácteres especiales.", "Error", JOptionPane.ERROR_MESSAGE);
            }
        }
    }

    public static double sumarVentasRecursivamente(int numeroVentas) {
        // Caso base
        if (numeroVentas == 0) {
            return 0.0;
        }

        // Caso recursivo
        double montoVenta = solicitarNumero("Ingrese el monto de la venta", "Monto de venta", true);

        // Verifica si el usuario decidió cancelar el ingreso del monto de las ventas
        if (montoVenta == 0) {
            // No suma el monto ingresado al total
            return sumarVentasRecursivamente(--numeroVentas);
        }

        return montoVenta + sumarVentasRecursivamente(numeroVentas - 1);

        /*
        sumarVentasRecursivamente(3)
            return 100 + sumarVentasRecursivamente(3 - 1)
                return 100 + sumarVentasRecursivamente(2 - 1)
                    return 100 + sumarVentasRecursivamente(1 - 1)
                        return 0.0

                        0.0
                    return 100 + 0.0
                return 100 + 100
            return 100 + 200
        return 300
        */
    }

    public static double sumarVentasIterativamente(int numeroVentas) {
        // Declaración de variables
        double montoVenta, totalVentas;

        // Inicialización de variables
        totalVentas = 0.0;

        for (int i = 1; i <= numeroVentas; ++i) {
            montoVenta = solicitarNumero("Ingrese el monto de la venta", "Monto de venta", true);

            // Acumula el total de las ventas
            totalVentas += montoVenta;

            // Verifica si el usuario decidió cancelar el ingreso del monto de las ventas
            if (montoVenta == 0) {
                break;
            }
        }

        return totalVentas;
    }
}