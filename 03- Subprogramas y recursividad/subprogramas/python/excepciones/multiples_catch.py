"""
Descripción: Mulitples catch para manejo de múltiples excepciones a la vez.
Autor: Santiago Nicolás De la mora Núñez
Fecha de creación: 10/04/2026
"""

try:
    numero = int(input("Ingrese el número: "))
    resultado = 10 / numero
    print(resultado)
except ValueError as e:
    print("\nError: No ingresaste un valor número válido.")
except ZeroDivisionError as e:
    print("\nError: No se puede dividir entre 0.")