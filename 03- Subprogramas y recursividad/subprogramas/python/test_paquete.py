import paquete.operaciones_aritmeticas

def main():
    serie = 0
    n = 2

    serie = paquete.operaciones_aritmeticas.calcular_serie(n)
    print(f"El resultado de la serie es: {serie}")

# Ejecuta la aplicación
if __name__ == '__main__':
    main()