"""
Descripción: Solicita dos números enteros y muestra todos los números primos que se
    encuentren dentro de ese rango.
Autor: Santiago Nicolás De la mora Núñez
Fecha: 11/02/2026
"""

# Declaración e inicialización de variables y constantes
NUMERO_PRIMO_MENOR = 2
numero_inicial = 0
numero_final = 0
numero_divisiones = 0
numeros_primos = ""
es_valido = False

# Solicita el número inicial
while True:
    numero_inicial = int(input("Ingresa el número inicial:\n"))

    # Verifica si el número es negativo, cero o uno
    if numero_inicial < 2:
        print("\nNo puede ingresar un número menor a 2.\n")

        # Indica que se debe volver a solicitar el número
        es_valido = False
    else:
        # Indica que se debe dejar de solicitar el número
        es_valido = True

    # Rompe el bucle si el número ingresado fue válido
    if es_valido:
        break

# Solicita el número final
while True:
    numero_final = int(input("\nIngresa el número final:\n"))

    # Verifica si el número es negativo, cero o uno
    if numero_final <= numero_inicial:
        print("\nEl número final no puede ser menor que el número inicial.\n")

        # Indica que se debe volver a solicitar el número
        es_valido = False
    else:
        # Indica que se debe dejar de solicitar el número
        es_valido = True

    # Rompe el bucle si el número ingresado fue válido
    if es_valido:
        break

# Muestra todos los números primos dentro del rango
i = numero_inicial
while (i <= numero_final):
    # Reinicia el contador del número de divisiones
    numero_divisiones = 0

    t = NUMERO_PRIMO_MENOR
    while (t <= i):
        # Verifica si el número final dividido entre cada número menor a él no tiene residuo (es una división exacta)
        if i % t == 0:
            # Cuenta cada división exacta
            numero_divisiones += 1

        t += 1

    # Verifica si el número se dividió solo una vez
    if numero_divisiones == 1:
        # Concatena el número y agrega un espacio
        numeros_primos += str(i) + " "

    i += 1

# Muestra los números primos
print(f"\nNúmeros primos entre {numero_inicial} y {numero_final}:\n{numeros_primos}")