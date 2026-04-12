"""
Descripción: Construye un programa que solicite un número entero positivo n y utilice un
    método recursivo void para imprimir un triángulo numérico ascendente
    desde 1 hasta n.
Autor: Santiago Nicolás De la mora Núñez
Fecha de creación: 11/04/2026
"""

def main():
    # Solicita el número
    numero = solicitar_numero()

    print("Impresión recursiva")
    imprimir_recursivamente(numero)

    print("\n\nImpresión iterativa")
    imprimir_iterativamente(numero)

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

# Funciones recursivas
# Imprime las filas
def imprimir_recursivamente(i):
    # Caso recursivo
    if i > 0:
        imprimir_recursivamente(i - 1)
        imprimir_recursivamente2(i)
        print()

    '''
    imprimirRecursivamente(5)
        imprimirRecursivamente(5 - 1)
        imprimirRecursivamente(5)
        System.out.println()
            imprimirRecursivamente(4 - 1)
            imprimirRecursivamente(4)
            System.out.println()
                imprimirRecursivamente(3 - 1)
                imprimirRecursivamente(3)
                System.out.println()
                    imprimirRecursivamente(2 - 1)
                    imprimirRecursivamente(2)
                    System.out.println()
                        imprimirRecursivamente(1 - 1)
                        imprimirRecursivamente(1)
                        System.out.println()

                        "1 " + "\n"
                    "1 " + "2 " + "\n"
                "1 " + "2 " + "3 " + "\n"
            "1 " + "2 " + "3 " + "4 " + "\n"
        "1 " + "2 " + "3 " + "4 " + "5 " + "\n"

    "1 " + "\n"
    "1 " + "2 " + "\n"
    "1 " + "2 " + "3 " + "\n"
    "1 " + "2 " + "3 " + "4 " + "\n"
    "1 " + "2 " + "3 " + "4 " + "5 " + "\n"
    '''

def imprimir_recursivamente2(t):
    if t > 0:
        imprimir_recursivamente2(t - 1)
        print(str(t), end=' ')

    '''
    imprimirRecursivamente2(5)
        imprimirRecursivamente2(5 - 1)
        System.out.print(5 + " ")
            imprimirRecursivamente2(4 - 1)
            System.out.print(4 + " ")
                imprimirRecursivamente2(3 - 1)
                System.out.print(3 + " ")
                    imprimirRecursivamente2(2 - 1)
                    System.out.print(2 + " ")
                        imprimirRecursivamente2(1 - 1)
                        System.out.print(1 + " ")

                        "1 "
                    "2 "
                "3 "
            "4 "
        "5 "

    "1 " + "2 " + "3 " + "4 " + "5 "
    '''

def imprimir_iterativamente(n):
    salida = ""

    i = 1
    while i <= n:
        t = 1
        while t <= i:
            salida += str(t) + ' '

            t += 1

        salida += '\n'

        i += 1

    print(salida)

# Ejecuta el programa
if __name__ == '__main__':
    main()