"""
Descripción: Realizar un programa que resuelve una suma de el recíproco de factoriales.
Autor: Santiago Nicolás De la mora Núñez
Fecha: 08/04/2026
"""

def main():
    iniciar()

def iniciar():
    numero = solicitar_n()
    resultado = resolver_serie(numero)

    print(f"\nEl resultado de la serie es: {resultado:.2f}")

def solicitar_n():
    numero = 0

    while True:
        try:
            numero = int(input("Ingrese n: "))
            
            if numero > 0 and numero <= 10:
                return numero
            
            print("\nError. El valor de n debe ser mayor a 0 y menor o igual a 10.\n")
        except ValueError:
            print("\nError. Debe ser entero.\n")

def resolver_serie(n):
    s = 0.0

    i = 1
    while i <= n:
        s += i / calcular_factorial(i)

        i += 1

    return s

def calcular_factorial(n):
    factorial = 1

    i = 1
    while i <= n:
        factorial *= i

        i += 1

    return factorial

# Ejecuta la aplicación
if __name__ == '__main__':
    main()