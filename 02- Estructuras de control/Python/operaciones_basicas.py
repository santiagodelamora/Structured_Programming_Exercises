"""
Descripción: Operaciones básicas.
Autor: Santiago De la mora
Fecha: 21/01/2026
"""

# Importa la función que calcula la raíz cuadrada
from math import sqrt

# Declaración de variables
menu = ""
opcion = ""
valor1 = 0.0
valor2 = 0.0

# Crear menú
menu = """======== MENÚ ========
1) Suma
2) Resta
3) Multiplicación
4) División
5) Módulo
6) Potencia
7) Raíz

Elige una opción
"""

# Solicita la opción
opcion = input(menu)

# Aplica las opciones
match opcion:
    # Suma
    case "1":
        valor1 = float(input("Introduce el valor 1:\n"))
        valor2 = float(input("Introduce el valor 2:\n"))
        print(str(valor1 + valor2))

    # Resta
    case "2":
        valor1 = float(input("Introduce el valor 1:\n"))
        valor2 = float(input("Introduce el valor 2:\n"))
        print(str(valor1 - valor2))

    # Multiplicación
    case "3":
        valor1 = float(input("Introduce el valor 1:\n"))
        valor2 = float(input("Introduce el valor 2:\n"))
        print(str(valor1 * valor2))

    # División
    case "4":
        valor1 = float(input("Introduce el valor 1:\n"))
        valor2 = float(input("Introduce el valor 2:\n"))

        # Verifica si el valor 2 no es 0
        if valor2 != 0:
            print(str(valor1 / valor2))
        else:
            print("\nEl denominador no puede ser 0\n")

    # Módulo
    case "5":
        valor1 = float(input("Introduce el valor 1:\n"))
        valor2 = float(input("Introduce el valor 2:\n"))

        # Verifica si el valor 2 no es 0
        if valor2 != 0:
            print(str(valor1 % valor2))
        else:
            print("\nEl denominador no puede ser 0\n")

    # Potencia
    case "6":
        valor1 = float(input("Introduce el valor 1:\n"))
        valor2 = float(input("Introduce el valor 2:\n"))

        # Verifica si los valores no son 0
        if valor1 != 0.0 and valor2 != 0.0:
            print(str(valor1 ** valor2))
        else:
            print("\nLos valores no pueden ser 0\n")

    # Raíz cuadrada
    case "5":
        valor1 = float(input("Introduce el valor 1:\n"))

        # Verifica si el valor no es 0 o negativo
        if valor1 > 0.0:
            print(str(sqrt(valor1)))
        else:
            print("\nEl valor no puede ser 0 o negativo\n")

    # (else)
    case _:
        print("\nOpción inválida. Ingrese una opción del 1 al 7\n")