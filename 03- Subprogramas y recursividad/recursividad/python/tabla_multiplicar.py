""" 
Descripción: Realiza un programa que solicite al usuario un número entero y cree un
    método recursivo que regrese su tabla de multiplicar del 1 al 10.
Autor: Santiago Nicolás De la mora Núñez
Fecha de creación: 11/04/2026
"""

def main():
    # Solicita un número
    numero = solicitar_numero()

    print("Impresión recursiva")
    imprimir_tabla_multiplicar_recursivamente(numero, 1)

    print("\nImpresión iterativa")
    imprimir_tabla_multiplicar_iterativamente(numero)

# Solicita el ingreso de un número entero positivo
def solicitar_numero():
    numero = ""

    while True:
        numero = input("Ingrese un número positivo: ")

        # Verifica si no se ingresó un númeor o se dejó el campo vacío
        if numero.strip() == "":
            print("\nError. No se puede dejar el campo vacío.\n")
            continue

        # Captura errores
        try:
            # Convierte la cadena en un número entero
            numero = int(numero)

            # Verifica si el número es positivo
            if numero > 0:
                return numero
            else:
                print("\nError. No puede ingresar números negativos ni 0.\n")
        except ValueError:
            print("\nError. No puede ingresar letras ni carácteres especiales.\n")

def imprimir_tabla_multiplicar_recursivamente(n, i):
    # Caso recursivo
    if i <= 10:
        print(f"{n} x {i} = {n * i}")
        imprimir_tabla_multiplicar_recursivamente(n, i + 1)
    
def imprimir_tabla_multiplicar_iterativamente(n):
    i = 1
    while i <= 10:
        print(f"{n} x {i} = {n * i}")

        i += 1

# Ejecuta el programa
if __name__ == '__main__':
    main()