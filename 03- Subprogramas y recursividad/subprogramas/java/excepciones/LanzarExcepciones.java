/**
 * Descripción: Lanzamiento de excepciones.
 * Autor: Santiago Nicolás De la mora Núñez
 * Fecha: 25/02/2026
 */

public class LanzarExcepciones {
    public static void main(String[] args) {
        int edad = -5;

        if (edad < 0) {
            throw new IllegalArgumentException("La edad no puede ser negativa");
        }

        System.out.println("Edad válida");
    }
}