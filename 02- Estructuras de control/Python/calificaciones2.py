"""
Descripción: Calcula el promedio de 3 calificaciones.
Autor: Santiago De la mora
Fecha: 21/01/2026
"""

# Declaración de variables
calificacion1 = 0.0
calificacion2 = 0.0
calificacion3 = 0.0
promedio = 0.0
NUMERO_CALIFICACION = 3

# Entrada
calificacion1 = float(input("Introduce la calificación 1: "))
calificacion2 = float(input("Introduce la calificación 2: "))
calificacion3 = float(input("Introduce la calificacion 3: "))

# Calcula el promedio
promedio = (calificacion1 + calificacion2 + calificacion3) / NUMERO_CALIFICACION

# Valida que el promedio se aprobatorio
if promedio >= 7.0:
    print("Aprobado")
else:
    print("Reprobado")