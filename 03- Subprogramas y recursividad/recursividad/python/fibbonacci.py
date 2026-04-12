"""
Descripción: Ejecucion de SistemaVentas.java.
Autor: Santiago Nicolás De la mora Núñez
Fecha: 10/04/2026
"""

def main():
    numero = 4
    print(f"Serie Fibbonacci de {numero} es {calcular_fibbonacci(numero)}")

def calcular_fibbonacci(numero):
    if numero == 0:
        return 0
    elif numero == 1:
        return 1
    else:
        return calcular_fibbonacci(numero - 1) + calcular_fibbonacci(numero - 2)

# Ejecuta el programa
if __name__ == '__main__':
    main()