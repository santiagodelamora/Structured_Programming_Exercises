public class RecursividadVarios {
    public static void main(String[] args) {
        /*contarAsc(5);
        System.out.println();
        contarDesc(5);
        System.out.println("\n" + sumarRecursivo(10));*/

        System.out.println("\n" + sumaPares(10));
    }

    // Métodos recursivos
    public static void contarAsc(int n) {
        // Caso base
        if (n == 1) {
            System.out.print(n + " ");
            return;
        }

        // Caso general (recursivo)
        contarAsc(n - 1);
        System.out.print(n + " ");
    }

    public static void contarDesc(int n) {
        // Caso base
        if (n == 1) {
            System.out.print(n);
            return;
        }

        // Caso general (recursivo)
        System.out.print(n + " ");
        contarDesc(n - 1);
    }

    public static int sumarIterativo(int n) {
        int suma = 0;

        for (int i = 1; i <= n; i++) {
            suma += i;
        }

        return suma;
    }

    public static int sumarRecursivo(int n) {
        if (n == 1) {
            return 1;
        } else {
            return sumarRecursivo(n - 1) + n;
        }
    }

    public static int potenciaIterativo(int base, int exponente) {
        int resultado = 0;

        for (int i = 1; i <= exponente; i++) {
            resultado *= base;
        }

        return resultado;
    }

    public static int potenciaRecursiva(int base, int exponente) {
        // Caso base
        if (exponente == 0) {
            return 1;
        }

        return base * potenciaRecursiva(base, exponente - 1);
    }

    public static int sumaPares(int n) {
        // Caso base
        if (n == 1) {
            return (n % 2 == 0) ? n : 0;
        }

        // Caso recursivo
        if (n % 2 == 0)
            return n + sumaPares(n - 1);
        else
            return sumaPares(n - 1);
    }
}