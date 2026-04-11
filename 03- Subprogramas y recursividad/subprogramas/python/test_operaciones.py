"""
Descripción: Uso de funciones.
Autor: Santiago Nicolás De la mora Núñez
Fecha: 31/03/2026
"""

import operaciones

def main():
    numero1 = 0
    numero2 = 0
    suma = 0

    operaciones.saludar()
    numero1 = operaciones.solicitarValor()
    numero2 = operaciones.solicitarValor()
    suma = operaciones.sumar(numero1, numero2)
    operaciones.imprimir(suma)

if __name__ == '__main__':
    main()