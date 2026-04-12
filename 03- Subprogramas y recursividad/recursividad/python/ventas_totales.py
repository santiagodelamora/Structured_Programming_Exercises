"""
Descripción: Elabora un programa que solicite al usuario la cantidad de ventas
    realizadas y después capture el monto de cada venta. Crea un método
    recursivo que regrese la suma total de todas las ventas.
Autor: Santiago Nicolás De la mora Núñez
Fecha de creación: 11/04/2026
"""

import math

def main():
    # Solicita un número
    numero_ventas = int(solicitar_numero("Ingrese el número de ventas", False))

    print(f"Total de las ventas: {sumar_ventas_recursivamente(numero_ventas)}")
    print(f"Total de las ventas: {sumar_ventas_iterativamente(numero_ventas)}")

# Solicita el ingreso de un número entero positivo
def solicitar_numero(mensaje_solicitud, decimales_permitidos):
    numero = ""

    while True:
        numero = input(mensaje_solicitud + ': ')

        # Verifica si no se ingresó un númeor o se dejó el campo vacío
        if numero.strip() == "":
            print("\nError. No se puede dejar el campo vacío.\n")
            continue

        # Captura errores
        try:
            # Convierte la cadena en un número decimal
            numero = float(numero)

            # Verifica si los decimales no están permitidos
            numero = math.floor(numero) if not decimales_permitidos else numero

            # Verifica si el número es positivo
            if numero > 0.0:
                return numero
            else:
                print("\nError. No puede ingresar números negativos ni 0.\n")
        except ValueError:
            print("\nError. No puede ingresar letras ni carácteres especiales.\n")

def sumar_ventas_recursivamente(numero_ventas):
    # Caso base
    if numero_ventas == 0:
        return 0.0
    
    # Caso recursivo
    monto_venta = solicitar_numero("Ingrese el monto de la venta", True)

    return monto_venta + sumar_ventas_recursivamente(numero_ventas - 1)
    
    '''
    sumar_ventas_recursivamente(3)
            return 100 + sumar_ventas_recursivamente(3 - 1)
                return 100 + sumar_ventas_recursivamente(2 - 1)
                    return 100 + sumar_ventas_recursivamente(1 - 1)
                        return 0.0

                        0.0
                    return 100 + 0.0
                return 100 + 100
            return 100 + 200
        return 300
    '''

def sumar_ventas_iterativamente(numero_ventas):
    # Declaración e inicialización de variables
    monto_venta = 0.0
    total_ventas = 0.0

    i = 1
    while i<= numero_ventas:
        monto_venta = solicitar_numero("Ingrese el monto de la venta", True)

        # Acumula el total de las ventas
        total_ventas += monto_venta

        i += 1

    return total_ventas

# Ejecuta el programa
if __name__ == '__main__':
    main()