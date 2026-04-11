def factorial(n):
    factorial = 1

    i = 1
    while i <= n:
        factorial *= i

        i += 1

    return factorial

def calcular_serie(n):
    serie = 0

    i = 1
    while i <= n:
        serie += i / factorial(i)

        i += 1

    return serie
