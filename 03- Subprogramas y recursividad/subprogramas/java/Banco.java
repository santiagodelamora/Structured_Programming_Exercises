/**
 * Descripción: Aplicación que simula la funcionalidad de un banco.
 * Autor: Santiago Nicolás De la mora Núñez
 * Fecha: 26/02/2026
 */

import javax.swing.JOptionPane;

public class Banco {

    private static double saldo = 0.0;

    public static void iniciar() {
        menu();
    }

    private static double consultarSaldo() {
        return saldo;
    }

    private static double depositar(double monto) {
        saldo += monto;
        return saldo;
    }

    private static double retirar(double monto) {
        saldo -= monto;
        return saldo;
    }

    private static boolean validarMontoPositivo(double monto) {
        return (monto > 0);
    }

    private static boolean validarSaldoSuficiente(double montoARetirar) {
        return (saldo >= montoARetirar);
    }

    private static double solicitarMonto() {
        double monto = 0.0;

        while (true) {
            try {
                monto = Double.parseDouble(
                        JOptionPane.showInputDialog(
                                null,
                                "Introduce el monto",
                                "Monto",
                                JOptionPane.PLAIN_MESSAGE
                        )
                );

                if (validarMontoPositivo(monto)) {
                    break;
                } else {
                    JOptionPane.showMessageDialog(
                            null,
                            "El monto debe ser positivo.",
                            "Error",
                            JOptionPane.ERROR_MESSAGE
                    );
                }
            } catch (NumberFormatException e) {
                JOptionPane.showMessageDialog(
                        null,
                        "El saldo debe ser un número.",
                        "Error",
                        JOptionPane.ERROR_MESSAGE
                );
            }
        }

        return monto;
    }

    private static void menu() {
        String menu = "", opcion = "";
        boolean salir = false;
        double monto = 0.0;

        menu = """
                ======= Menú =======
                1. Consultar saldo
                2. Depositar
                3. Retirar
                4. Salir
                
                Elige una opción
                """;

        while (!salir) {
            opcion = JOptionPane.showInputDialog(
                    null,
                    menu,
                    "Menú",
                    JOptionPane.PLAIN_MESSAGE
            ).toUpperCase();

            // switch-case mejorado
            switch (opcion) {
                case "1", "A" -> {
                    JOptionPane.showMessageDialog(
                            null,
                            "Tu saldo es: " + consultarSaldo(),
                            "Saldo",
                            JOptionPane.PLAIN_MESSAGE
                    );

                    salir = false;
                }

                case "2", "B" -> {
                    JOptionPane.showMessageDialog(
                            null,
                            "Tu saldo es de: $" + depositar(solicitarMonto()),
                            "Depósito",
                            JOptionPane.PLAIN_MESSAGE
                    );

                    salir = false;
                }

                case "3", "C" -> {
                    monto = solicitarMonto();

                    if (validarSaldoSuficiente(monto)) {
                        JOptionPane.showMessageDialog(
                                null,
                                "Retiro satisfactorio, tu nuevo saldo es $" + retirar(monto),
                                "Retiro",
                                JOptionPane.PLAIN_MESSAGE
                        );
                    } else {
                        JOptionPane.showMessageDialog(
                                null,
                                "No tienes saldo suficiente.",
                                "Saldo insuficiente",
                                JOptionPane.WARNING_MESSAGE
                        );
                    }

                    salir = false;
                }

                case "4", "D" -> {
                    salir = true;
                }

                default -> {
                    salir = false;
                }
            }
        }
    }
}