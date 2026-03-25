/**
 * Descripción: Uso de métodos y sobre carga de métodos.
 * Autor: Santiago Nicolás De la mora Núñez
 * Fecha: 12/02/2026
 */

public class TestOperaciones {
    public static void main(String[] args) {
        int numero1 = 0, numero2 = 0, suma = 0;
        Operaciones.saludar();
        numero1 = Operaciones.solicitarValor();
        numero2 = Operaciones.solicitarValor();
        suma = Operaciones.sumar(numero1, numero2);
        Operaciones.imprimir(suma);
    }
}
