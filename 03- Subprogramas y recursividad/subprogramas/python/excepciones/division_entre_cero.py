"""
Descripción: Manejo de la excepción cacusada por la división entre 0.
Autor: Santiago Nicolás De la mora Núñez
Fecha de creación: 10/04/2026
"""

num1 = int(input("Introduce el número 1: "))
num2 = int(input("Introduce el número 2: "))

try:
    resultado = num1 / num2

    print(f"Resultado: {resultado}")
except ZeroDivisionError as e:
    print("\nError. No se puede dividir entre 0.\n")
    print(e)
finally:
    print("\nFin del programa.")