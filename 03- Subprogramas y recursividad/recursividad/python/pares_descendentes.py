"""
Descripción: Construye un programa que solicite un número entero positivo y utilice un
    método recursivo void para mostrar todos los números pares desde ese
    valor hasta 2 en forma descendente.
Autor: Santiago Nicolás De la mora Núñez
Fecha de creación: 10/04/2026
"""

def main():
    # Solicita un número
    numero = solicitar_numero()

    # Verifica si el usuario decidió cancelar la solicitud del número
    if numero != 0:
        print("Impresión recursiva")
        mostrar_pares_descendentes_recursivamente(numero)

        print("\nImpresión iterativa")
        mostrar_pares_descendentes_iterativamente(numero)

def solicitar_numero():
    numero = 0

    while True:
        numero = input("Ingrese un número positivo: ")

        # Verifica si se no ingresó un número o se dejó el campo vacío
        if numero.strip() == "":
            print("\nError. No puede dejar el campo vacío.\n")
            continue

        # Captura errores
        try:
            # Convierte la cadena en un número entero
            numero = int(numero)

            # Verifica si el número es positivo
            if numero > 0:
                return numero
            else:
                print("\nError. No puede ingresar números negativos ni 0\n")
        except ValueError:
            print("\nError. No puede ingresar letras ni carácteres especiales.\n")

def mostrar_pares_descendentes_recursivamente(n):
    # Caso base
    if n == 2:
        print(n)

        return
    
    # Caso recursivo
    # Verifica si el número es par
    if n % 2 == 0:
        print(f"{n}", end=' ')

    mostrar_pares_descendentes_recursivamente(n - 1)

def mostrar_pares_descendentes_iterativamente(n):
    i = n
    while i >= 2:
        # Verifica si el número es par
        if i % 2 == 0:
            print(f"{i}", end=' ')

        i -= 1

# Ejecuta el programa
if __name__ == '__main__':
    main()