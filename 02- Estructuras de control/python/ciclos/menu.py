"""
Descripción: Menú de aplicaciones con validación.
Autor: Santiago De la mora
Fecha: 30/01/2026
"""

# Declaración e inicialización de variables
opcion = ""
repetir = True

# Crea la cadena del menú y sus opciones
menu = """======== MENÚ =======
1) Opción 1
2) Opción 2
3) Opción 3
4) Salir

Elige una opción:
"""

# Muestra el menú hasta que el usuario seleccione la opción salir
while True:
    # Muestra el menú
    opcion = input(menu)

    # Decide que hacer según la opción seleccionada
    match opcion.upper():
        case "1" | "A":
            print("Opción 1")
            repetir = True

        case "2" | "B":
            print("Opción 2")
            repetir = True

        case "3" | "C":
            print("Opción 3")
            repetir = True

        case "4" | "S":
            print("El programa ha terminado.")
            repetir = False

        case _:
            print("Opción inválida")
            repetir = True

    # Sale del bucle y termina el programa
    if not repetir:
        break