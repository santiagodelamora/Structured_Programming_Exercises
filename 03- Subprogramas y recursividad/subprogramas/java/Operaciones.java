/**
 * Descripción: Uso de métodos y sobre carga de métodos.
 * Autor: Santiago Nicolás De la mora Núñez
 * Fecha: 12/02/2026
 */

import javax.swing.JOptionPane;

public class Operaciones {
    public static void main(String[] args) {
        int numero1 = 0, numero2 = 0, suma = 0;
        saludar();
        numero1 = solicitarValor();
        numero2 = solicitarValor();
        suma = sumar(numero1, numero2);
        imprimir(suma);
    }

    public static void imprimir(int resultado) {
        JOptionPane.showMessageDialog(null, "EL resultado es: " + resultado);
    }

    public static void saludar() {
        JOptionPane.showMessageDialog(null, "Bienvenido a los métodos estáticos en Java");
    }

    public static int solicitarValor() {
        return Integer.parseInt(JOptionPane.showInputDialog("Introduce el valor"));
    }

    /*
    Sobrecarga de métodos
    El tipo de retorno no es diferencia para un método sobrecargado
    Lo que diferencía a un método sobrecargado es el tipo de retorno de los parámetros es diferente
    */
    public static int sumar(int a, int b) {
        return a + b;
    }

    public static double sumar(double a, double b) {
        return a + b;
    }
}