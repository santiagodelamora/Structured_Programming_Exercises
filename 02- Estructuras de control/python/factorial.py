"""
Descripción: Calcula el factorial de un número "n".
Autor: Santiago De la mora
Fecha: 10/02/2026
"""

# Declaración e inicialización de variables
factorial = 1
n = 0

# Solicita el valor de n
n = int(input("Introduce el valor de n: "))

# Valida si el número es mayor o igual a 0
if n >= 0:
    # Calcula el factorial del número dado
    for i in range (1, n + 1):
        factorial *= i
        
    # Salida
    print(f"\n!{n} = {factorial}")
else:
    # Mensaje de error
    print('\nEl valor de "n" no puede ser negativo.')