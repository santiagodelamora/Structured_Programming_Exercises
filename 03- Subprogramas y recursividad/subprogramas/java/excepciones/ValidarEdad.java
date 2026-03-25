/**
 * Descripción: Hace uso de una excepción personalizada para validar las edades inválidas.
 * Autor: Santiago Nicolás De la mora Núñez
 * Fecha: 25/02/2026
 */

public class ValidarEdad {
    public static void main(String[] args) {
        try {
            validarEdad(15);
        } catch (EdadInvalidaException e) {
            System.err.println("Error: " + e.getMessage());
        }
    }

    public static void validarEdad(int edad) throws EdadInvalidaException {
        if (edad < 18) {
            throw new EdadInvalidaException("Debe de ser mayor de edad.");
        }
    }
}