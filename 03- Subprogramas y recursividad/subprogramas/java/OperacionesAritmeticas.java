public class OperacionesAritmeticas {
    public static long factorial(int n) {
        long factorial = 1;

        for (int i = 1; i <= n; i++) {
            factorial *= i;
        }

        return factorial;
    }

    public static double calcularSerie(int n) {
        double serie = 0;

        int i = 1;
        while (i <= n) {
            serie += i / factorial(i);

            i++;
        }

        return serie;
    }
}