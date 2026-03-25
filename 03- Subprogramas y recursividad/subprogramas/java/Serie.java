import javax.swing.JOptionPane;

public class Serie {
    public static void main(String[] args) {
        iniciar();
    }

    public static void iniciar() {
        int numero;
        double resultado;

        numero = solicitarN();
        resultado = resolverSerie(numero);

        JOptionPane.showMessageDialog(
                null,
                "El resultado de la serie es: " + resultado,
                "Serie factorial",
                JOptionPane.PLAIN_MESSAGE
        );

        /*
        O

        JOptionPane.showMessageDialog(
                null,
                "El resultado de la serie es: " + resolverSerie(solicitarN()),
                "Serie factorial",
                JOptionPane.PLAIN_MESSAGE
        );
         */
    }

    public static int solicitarN() {
        int numero;

        while (true) {
            try {
                numero = Integer.parseInt(
                        JOptionPane.showInputDialog(
                                null,
                                "Ingrese n",
                                "Ingreso de n",
                                JOptionPane.PLAIN_MESSAGE
                        )
                );

                if (numero > 0 && numero <= 10) {
                    return numero;
                }

                JOptionPane.showMessageDialog(
                        null,
                        "El valor de n debe ser mayor a 0 y menor o igual a 10.",
                        "Error",
                        JOptionPane.ERROR_MESSAGE
                );
            } catch (NumberFormatException e) {
                JOptionPane.showMessageDialog(
                        null,
                        "Debe ser entero.",
                        "Error",
                        JOptionPane.ERROR_MESSAGE
                );
            }
        }
    }

    public static double resolverSerie(int n) {
        double s;
        s = 0.0;

        for (int i = 1; i <= n; ++i) {
            s += ((double) i) / calcularFactorial(i);
        }

        return s;
    }

    public static long calcularFactorial(int n) {
        long factorial;
        factorial = 1;

        for (int i = 1; i <= n; ++i) {
            factorial *= i;

            // Depuración
            System.out.println("!" + i + factorial);
        }

        return factorial;
    }
}