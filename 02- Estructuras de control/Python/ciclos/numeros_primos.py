"""
Descripción: Determinar si un número es primo o no.
Autor: Santiago De la mora
Fecha: 01/02/2026
"""

# Declaración e inicialización de variables
numero = 4
contador = 0
i = 1

# Repite tantas veces como la variable "número"
while i <= numero:
    # Verifica si es para y aumenta el contador en 1
    if numero % 2 == 0:
        contador += 1

    i += 1

# Verifica si el contador es mayor a 2 o no
if contador > 2:
    print("Es primo")
else:
    print("No es primo")