"""
Descripción: Calcular el promedio de un alumno que tiene n calificaciones en la materia de programación.
Autor: Santiago De la mora
Fecha: 01/02/2026
"""

# Declaración e inicialización de variables
n = 0
promedio = 0.0
calificacion = 0.0
menu = ""
opcion = ""
repetir = True

# Crea la cadena del menú y sus opciones
menu = """======== MENÚ PROGRAMA CON FOR =======
1) Opción 1
2) Opción 2
3) Opción 3
4) Salir

Elige una opción:
"""

# Muestra el menú hasta que se seleccione la opción 4 (salir
while True:
    # Muestra el menú
    opcion = input(menu)

    # Decide según la opción seleccionada
    match opcion.upper():
        case "1" | "A":
            # Solicita el número de calificaciones a evaluar
            n = int(input("Introduce el número de calificaciones:\n"))    

            # Valida si el número es mayor a 0
            if n > 0:
                # Reinicia el valor de la variable a 0.0
                promedio = 0.0

                # Solicita una calificación, la valida y calcula su promedio por el número de calificaciones especificadas anteriormente
                for i in range(n):
                    calificacion = float(input(f"Introduce la calificación {i}:\n"))

                    # Valida si la calificación está entre 0 y 10
                    if calificacion >= 0.0 and calificacion <= 10.0:
                        # Acumula el promedio
                        promedio += calificacion;
                    else:
                        # Muestra un mensaje de error
                        print("\nLa calificación no puede ser negativa ni mayor a 10.\n")

                        i -= 1

                # Divide el valor acumulado entre el número de elementos
                promedio /= n

                # Muestra el promedio
                print(f"El promedio es: {promedio}")
            else:
                # Muestra un mensaje de error
                print("\nEl número de califiaciones no puede ser negativo.\n")
            
            # Indica que se debe volver a mostrar el menú de opciones
            repetir = True

        case "2" | "B":
            print("Opción 2")
            repetir = True

        case "3" | "C":
            print("Opción 3")
            esValido = True

        case "4" | "S":
            print("El programa ha terminado")
            esValido = False

        case _:
            print("Opción inválida")
            esValido = True

    # Sale del bucle y termina el programa
    if not repetir:
        break