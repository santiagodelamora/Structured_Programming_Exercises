/**
 * Descripción: Excepción personalizada para edades inválidas.
 * Autor: Santiago Nicolás De la mora Núñez
 * Fecha de creación: 25/02/2026
 */

public class EdadInvalidaException extends Exception {
    public EdadInvalidaException(String mensaje) {
        super(mensaje);
    }
}