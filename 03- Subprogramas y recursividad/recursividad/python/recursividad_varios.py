def main():
    '''contar_asc(5)
    print()
    contar_desc(5)
    print(f"\n{sumarRecursivo(10)}")'''

    print(f"\n{suma_pares(10)}")

# Funciones recursivas
def contar_asc(n):
    # Caso base
    if n == 1:
        print(f"{n}", end=' ')
        return
    
    # Caso general (recursivo)
    contar_asc(n - 1)
    print(f"{n}", end=' ')

def contar_desc(n):
# Caso base
    if n == 1:
        print(f"{n}")
        return
    
    # Caso general (recursivo)
    print(f"{n}", end=' ')
    contar_desc(n - 1)

def sumar_iterativo(n):
    suma = 0

    i = 1
    while i <= n:
        suma += n

        i += 1

    return suma

def sumar_recursivo(n):
    if n == 1:
        return 1
    else:
        return sumar_recursivo(n - 1) + 1
    
def potencia_iterativo(base, exponente):
    resultado = 0

    i = 1
    while i <= exponente:
        resultado *= base

        i += 1

    return resultado

def potencia_recursiva(base, exponente):
    # Caso base
    if exponente == 0:
        return 1
    
    # Caso recursivo
    return base * potencia_recursiva(base, exponente - 1)

def suma_pares(n):
    # Caso base
    if n == 1:
        return n if (n % 2 == 0) else 0
    
    # Caso recursivo
    if n % 2 == 0:
        return n + suma_pares(n - 1)
    else:
        return suma_pares(n - 1)

# Ejecuta el programa
if __name__ == '__main__':
    main()