"""
Descripción: Solicita un número entero positivo y muestra su tabla de multiplicar del 1 al
    10. Si el número no es válido, vuelve a solicitarlo.
Autor: Santiago Nicolás De la mora Núñez
Fecha: 10/02/2026
"""

# Declaración e inicialización de variables
numero = 0
resultado = 0
es_valido = False
tabla = ""

# Solicita el número hasta que sea válido
while True:
    numero = int(input("Ingrese un número:\n"))

    # Verifica si el número es negativo o 0
    if numero < 1:
        # Muestra un mensaje de error y condiciona al bucle a repetirse nuevamente
        print("\nEl número no puede ser negativo ni cero.\n")
        es_valido = False
    else:
        # Hace que se deje de repetir el bucle
        es_valido = True

    # Rompe el bucle si el número ingresado fue válido
    if es_valido:
        break

# Título de la tabla
tabla = f"\nTabla del {numero}\n"

# Calcula la tabla de multiplicar
for i in range(1, 10 + 1):
    # Calcula el resultado
    resultado = numero * i

    # Construye la tabla de multiplicar
    tabla += f"{numero} x {i} = {resultado}{"\n" if (i < 10) else ""}"

# Muestra la tabla de multiplicar
print(tabla)