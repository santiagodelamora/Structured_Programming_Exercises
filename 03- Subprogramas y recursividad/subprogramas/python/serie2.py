"""
Descripción: Realizar un programa que resuelve una suma de fracciones algebráicas.
Autor: Santiago Nicolás De la mora Núñez
Fecha: 09/04/2026
"""

def iniciar_calculo():
    return calcular_serie(solicitar_n())

def calcular_serie(n):
    x = solicitar_x()

    denominador1 = 3
    denominador2 = 1
    s = 0.0

    i = 1
    while i <= n:
        s = (x ** (3.0 / denominador1)) / denominador2
        denominador1 += 3
        denominador2 += 2

        i += 1

    return s

def calcular_serie_2():
    denominador1 = 1
    n = solicitar_n()
    s = 0.0
    x = solicitar_x()

    i = 1
    while i <= n:
        s += (x ** (3.0 / i)) / denominador1
        denominador1 += 2

    return s

def solicitar_x():
    x = 0.0
    es_valido = False

    while True:
        x = input("Ingrese el valor de x: ")

        # Verifica si la cadena no está vacía
        if x != "":
            try:
                x = float(x)
                es_valido = True
            except ValueError:
                print("\nError. Sólo puede ingresar números enteros.\n")
                es_valido = False
        else:
            print("\nError. No puede dejar el campo vacío.\n")
            es_valido = False

        if es_valido:
            break

    return x

def solicitar_n():
    n = 0

    while True:
        n = input("Ingrese el valor de n: ")

        # Verifica si la cadena está vacía
        if n != "":
            try:
                n = int(n)

                # Verifica si es menor o igual a 0
                if n <= 0:
                    print("\nError. El valor debe de ser un entero positivo.\n")
                else:
                    break
            except ValueError:
                print("\nError. Sólo puede ingresar números enteros.\n")
        else:
            print("\nError. No puede dejar el campo vacío.\n")

    return n