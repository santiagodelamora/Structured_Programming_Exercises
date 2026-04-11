"""
Descripción: Solicita un número entero positivo y muestra su tabla de multiplicar del 1 al
    10. Si el número no es válido, vuelve a solicitarlo.
Autor: Santiago Nicolás De la mora Núñez
Fecha de creación: 10/04/2026
"""

def main():
    valor = solicitar_valor()
    print(generar_tablas2(valor))

def solicitar_valor():
    numero = 0
    es_valido = True

    while True:
        try:
            numero = int(input("Ingrese un número: "))

            if numero > 0:
                es_valido = True
            else:
                print("\nError. No puede ingresar un número negativo o 0.\n")
                es_valido = False
        except ValueError:
            print("\nError. Debes introducir un número entero.\n")
            es_valido = False

        if es_valido:
            break

    return numero

def generar_tablas(numero):
    i = 1
    while i <= 10:
        print(f"{numero} x {i} = {numero * i}")

        i += 1

def generar_tablas2(numero):
    tabla = ""

    i = 1
    while i <= 10:
        tabla += f"{numero} x {i} = {numero * i}\n"

        i += 1

    return tabla

# Ejecuta la aplicación
if __name__ == '__main__':
    main()