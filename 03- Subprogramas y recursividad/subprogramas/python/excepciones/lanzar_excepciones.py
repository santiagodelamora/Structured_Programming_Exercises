"""
Descripción: Lanzamiento de excepciones.
Autor: Santiago Nicolás De la mora Núñez
Fecha de creación: 10/04/2026
"""

edad = -5

if edad < 0:
    raise ValueError("La edad no puede ser negativa")

print("Edad válida")