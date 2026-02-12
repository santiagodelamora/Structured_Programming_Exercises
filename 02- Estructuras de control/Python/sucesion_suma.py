"""
Descripción: Calcula la suma de la sucesión e imprimir la sucesión y la suma: 1, 4, 9, 16, 25, 36, 49, 64, 81.
    El siguiente número se calcula elevando al cuadrado su posición.
Autor: Santiago De la mora
Fecha: 10/02/2026
"""

# Declaración e inicialización de variables
potencia = 1
n = 0
suma = 0.0
sucesion = ""

# Solicita un número
n = int(input("Ingrese un número: "))

# Repite hasta completar la sucesión
i = 1
while i <= n:
    # Calcula la potencia
    potencia = i ** 2

    # Suma el resultado de la potencia
    suma += potencia

    # La agrega a la cadena
    sucesion += f"{potencia}{", " if (i < n) else ""}"

    i += 1

# Muestra el resultado
print(f"\n{sucesion}\nSuma: {suma}")