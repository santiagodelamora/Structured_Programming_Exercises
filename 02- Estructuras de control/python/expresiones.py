"""
Descripción: Ejercicios de expresiones.
Autor: Santiago De la mora
Fecha: 15/01/2026
"""

# Expresiones aritméticas
suma = 3 + 5
resta = 10 - 12
multiplicacion = 34 * 23
division = 10 / 2
division_entera = 12 // 5
modulo = 10 % 2
potencia = 4 ** 2

'''
salida = "Hola soy la suma: " + str(suma)
print(salida)

salida = 'Hola soy la suma:'
print(salida, suma)

salida = 'Hola soy la "suma": ' + str(suma)
print(salida)

salida = "Hola sot la 'suma': " + str(suma)
print(salida)
'''

# Interpolación de strings
salida = f"""
======== Expresiones aritméticas ========
La suma es: {suma}
La resta es: {resta}
La multiplicacion es: {multiplicacion}
La división es: {division}
La division entera es: {division_entera}
El módulo es: {modulo}
La potencia es: {potencia}
"""

print(salida)