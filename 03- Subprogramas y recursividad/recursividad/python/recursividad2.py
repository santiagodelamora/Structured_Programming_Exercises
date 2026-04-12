"""
Descripción: Imprimir del 1 al n utilizando la recursividad.
Autor: Santiago Nicolás De la mora Núñez
Fecha de creación: 11/04/2026
"""

def main():
    resultado = 0

    '''resultado = sumar_iterativo(5)
    print(f"La suma es: {resultado}")

    resultado = sumar_iterativo(5)
    print(f"La suma es: {resultado}")'''

    resultado = potencia(2, 4)
    print(f"2⁴ = {resultado}")

def sumar_iterativo(n):
    suma = 0

    i = 1
    while i <= n:
        suma += i

        i += 1

    return suma

'''
sumar_recursivo(5)
    |
    return 5 + sumar_recursivo(5 - 1)
        |
        return 4 + sumar_recursivo(4 - 1)
            |
            return 3 + sumar_recursivo(3 - 1)
                |
                return 2 + sumar_recursivo(2 - 1)
                    |
                    return 1
'''
def sumar_recursivo(n):
    # Caso base
    if n == 1:
        return 1
    
    # Caso recursivo
    else:
        return n + sumar_recursivo(n - 1)
    
'''
potencia(2, 4)
    |
    return 2 * potencia(2, 4 - 1)
        |
        return 2 * potencia(2, 3 - 1)
            |
            return 2 * potencia(2, 2 - 1)
                |
                return 2
'''
def potencia(base, exponente):
    # Caso base
    if exponente == 1:
        return base

    # Caso recursivo
    else:
        return base * potencia(2, exponente - 1)

# Ejecuta el programa
if __name__ == '__main__':
    main()