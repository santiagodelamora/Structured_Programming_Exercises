"""
Descripción: Imprimir del 1 al n utilizando la recursividad.
Autor: Santiago Nicolás De la mora Núñez
Fecha de creación: 11/04/2026
"""

def main():
    imprimir(3)

    print()

    imprimir_hacia_atras(3)

'''
imprimir(3)
    |
    imprimir(3 - 1)
    sout(3)
        |
        imprimir(2 - 1)
        sout(2)
            |
            imprimir(1 - 1) se detiene
            sout(1)
                |
                return  (se detiene)
'''
def imprimir(n):
    # Caso base
    if n == 0:
        return
    
    # Caso general (recursivo)
    else:
        imprimir(n - 1)
        print(f"{n}", end=' ')

'''
imprimir_hacia_atras(3)
    |
    sout(3)
    imprimir_hacia_atras(3 - 1)
        |
        sout(2)
        imprimir_hacia_atras(2 - 1)
            |
            sout(1)
            imprimir_hacia_atras(1 - 1)
                |
                return  (se detiene)
'''
def imprimir_hacia_atras(n):
    # Caso base
    if n == 0:
        return
    
    # Caso general (recursivo)
    else:
        print(f"{n}", end=' ')
        imprimir(n - 1)

# Ejecuta el programa
if __name__ == '__main__':
    main()