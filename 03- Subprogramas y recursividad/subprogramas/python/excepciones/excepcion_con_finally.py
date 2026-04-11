"""
Descripción: Manejo de excepciones con finally.
Autor: Santiago Nicolás De la mora Núñez
Fecha: 10/04/2026
"""

x = 10
y = 0
z = 0

try:
    z = x / y

    print(z)
except ZeroDivisionError:
    print("Error: división entre 0.\n")
finally:
    print("Esto siempre se ejecuta")

print("Fin del programa")