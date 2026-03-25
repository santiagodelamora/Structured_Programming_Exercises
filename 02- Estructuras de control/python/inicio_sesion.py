"""
Descripción: Implementa un sistema de inicio de sesión con un máximo de 3 intentos.
    Usuario: admin, Contraseña: 1234.
Autor: Santiago Nicolás De la mora Núñez
Fecha: 10/02/2026
"""

# Declaración e inicialización de variables y constantes
USUARIO_CORRECTO = "admin"
CONTRASENIA_CORRECTA = "1234"
usuario = ""
contrasenia = ""
intentos = 3

# Solicita las credenciales máximo 3 veces
while intentos > 0:
    usuario = input("Ingrese su nombre de usuario: ")
    contrasenia = input("Ingrese su contraseña: ")

    # Verifica si el usuario y la contraseña son correctos
    if usuario == USUARIO_CORRECTO and contrasenia == CONTRASENIA_CORRECTA:
        intentos = 0
        print("\nBienvenido nuevamente.")
    else:
        intentos -= 1
        print("\nUsuario o contraseña incorrectos." + (f"\nTe quedan {intentos} intentos.\n" if (intentos > 0) else ""))