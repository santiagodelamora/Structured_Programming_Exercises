"""
Descripción: Calcula el promedio de 3 calificaciones.
Autor: Santiago De la mora
Fecha: 20/01/2026
"""

# Entrada
calificacion1 = float(input("Introduce la calificación 1: "))
calificacion2 = float(input("Introduce la calificación 2: "))
calificacion3 = float(input("Introduce la calificacion 3: "))

# Calcula el promedio
promedio = calificacion1 + calificacion2 + calificacion3

# Valida que el promedio se aprobatorio
if promedio >= 7.0:
    print("Aprobado")
else:
    print("Reprobado")