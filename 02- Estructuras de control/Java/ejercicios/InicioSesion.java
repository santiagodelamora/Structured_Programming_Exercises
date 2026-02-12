/**
 * Descripción: Implementa un sistema de inicio de sesión con un máximo de 3 intentos.
 *      Usuario: admin, Contraseña: 1234.
 * Autor: Santiago Nicolás De la mora Núñez
 * Fecha: 10/02/2026
 */

package mx.edu.uttt.ejerciciosunidad2;

import javax.swing.JOptionPane;

public class InicioSesion {
    public static void main(String[] args) {
        // Declaración e inicialización de variables y constantes
        final String USUARIO_CORRECTO = "admin", CONTRASENIA_CORRECTA = "1234";
        String usuario = "", contrasenia = "";
        int intentos = 3;

        // Solicita las credenciales máximo 3 veces
        do {
            usuario = JOptionPane.showInputDialog(null, "Ingrese su nombre de usuario:");
            contrasenia = JOptionPane.showInputDialog(null, "Ingrese su contraseña:");

            // Verifica si el usuario y la contraseña son correctos
            if (usuario.equals(USUARIO_CORRECTO) && contrasenia.equals(CONTRASENIA_CORRECTA)) {
                intentos = 0;
                JOptionPane.showMessageDialog(null, "Bienvenido nuevamente.");
            } else {
                intentos--;
                JOptionPane.showMessageDialog(
                        null,
                        "Usuario o contraseña incorrectos." +
                                ((intentos > 0) ? "\nTe quedan " + intentos + " intentos." : "")
                );
            }
        } while (intentos > 0);
    }
}