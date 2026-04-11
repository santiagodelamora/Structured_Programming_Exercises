/**
 * Descripción: Crear un programa que:
 *      1. Pida el nombre del cliente
 *      2. Pida la cantidad de productos comprados
 *      3. Pida el precio de cada producto
 *      4. Calcule el total a pagar
 *      5. Aplique descuentos
 *          - 10% si el total es mayor a 1000
 *          - 5% si el total es mayor a 500
 *      6. Mostrar el total final
 *      Debe:
 *          1. Validar que cantidades y precios sean positivos
 *          2. Repetir hasta que los datos sean correctos
 *          3. Usar métodos
 * Autor: Santiago Nicolás De la mora Núñez
 * Fecha: 04/03/2026
 */

import javax.swing.JOptionPane;

public class SistemaVentas {
    public static void iniciar() {
        String nombre = solicitarCliente();
        int cantidadProductos = validarNumeroEnteroPositivo("Ingresar cantidad de productos");
        double total = calcularTotal(cantidadProductos);
        double totalConDescuento = aplicarDescuento(total);
        imprimir(total, nombre, totalConDescuento);
    }

    private static void imprimir(double total, String cliente, double totalDescuento) {
        JOptionPane.showMessageDialog(
                null,
                "Nombre del cliente: " + cliente +
                        "\nTotal sin descuento: " + total +
                        "\nTotal con descuento: " + totalDescuento,
                "Resultado de compra",
                JOptionPane.PLAIN_MESSAGE
        );
    }

    private static String solicitarCliente() {
        String nombre;

        while (true) {
            nombre = JOptionPane.showInputDialog(
                    null,
                    "Ingrese el nombre:",
                    "Nombre",
                    JOptionPane.PLAIN_MESSAGE
            );

            // Verifica si se ingresó algo (no se devolvió null)
            if (nombre != null) {
                // Quita los espacios en blanco del principio y el final
                nombre = nombre.trim();

                // Obtiene la longitud de la cadena
                int longitudNombre = nombre.length();

                // Verifica si el número de carácteres del nombre está entre 1 y 10
                if (longitudNombre >= 1 && longitudNombre <= 10) {
                    if (validarContieneNumeros(nombre)) {
                        return nombre;
                    } else {
                        JOptionPane.showMessageDialog(
                                null,
                                "No puede ingresar números.",
                                "Error",
                                JOptionPane.ERROR_MESSAGE
                        );
                    }
                } else {
                    JOptionPane.showMessageDialog(
                            null,
                            "Debe ingresar un nombre de al menos una letra y de 10 letras como máximo.",
                            "Error",
                            JOptionPane.ERROR_MESSAGE
                    );
                }
            } else {
                JOptionPane.showMessageDialog(
                        null,
                        "Debe ingresar un nombre.",
                        "Error",
                        JOptionPane.ERROR_MESSAGE
                );
            }
        }
    }

    private static boolean validarContieneNumeros(String nombre) {
        for (int i = 0; i < nombre.length(); i++) {
            // Obtiene un caracter de la cadena en función de su índice
            char caracter = nombre.charAt(i);

            // Verifica si el caracter es un dígito (número)
            if (Character.isDigit(caracter)) {
                return false;
            }
        }

        return true;
    }

    private static double calcularTotal(int cantidad) {
        // Declaración de variables
        double total, precio;

        // Inicialización de variables
        total = 0.0;

        for (int i = 1; i <= cantidad; i++) {
            precio = validarNumeroDecimalPositivo("Precio de producto");
            total += precio;
        }

        return total;
    }

    private static int validarNumeroEnteroPositivo(String mensaje) {
        int numero;

        while (true) {
            try {
                numero = Integer.parseInt(
                        JOptionPane.showInputDialog(
                                null,
                                mensaje,
                                "",
                                JOptionPane.PLAIN_MESSAGE
                        )
                );

                if (numero > 0) {
                    return numero;
                }

                JOptionPane.showMessageDialog(
                        null,
                        "Debe ingresar un número positivo.",
                        "Error",
                        JOptionPane.ERROR_MESSAGE
                );
            } catch (NumberFormatException e) {
                JOptionPane.showMessageDialog(
                        null,
                        "Sólo puede ingresar números.",
                        "Error",
                        JOptionPane.ERROR_MESSAGE
                );
            }
        }
    }

    private static double validarNumeroDecimalPositivo(String mensaje) {
        double numero;

        while (true) {
            try {
                numero = Double.parseDouble(
                        JOptionPane.showInputDialog(
                                null,
                                mensaje,
                                "",
                                JOptionPane.PLAIN_MESSAGE
                        )
                );

                if (numero > 0.0) {
                    return numero;
                }

                JOptionPane.showMessageDialog(
                        null,
                        "Debe ingresar un número positivo.",
                        "Error",
                        JOptionPane.ERROR_MESSAGE
                );
            } catch (NumberFormatException e) {
                JOptionPane.showMessageDialog(
                        null,
                        "Sólo puede ingresar números.",
                        "Error",
                        JOptionPane.ERROR_MESSAGE
                );
            }
        }
    }

    private static double aplicarDescuento(double total) {
        return (total > 1000) ? total * 0.90 :
                    ((total > 500) ? total * 0.95 : total);
    }
}