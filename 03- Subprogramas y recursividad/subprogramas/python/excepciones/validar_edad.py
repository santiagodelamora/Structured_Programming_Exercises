"""
Descripción: Hace uso de una excepción personalizada para validar las edades inválidas.
Autor: Santiago Nicolás De la mora Núñez
Fecha de creación: 10/04/2026
"""

from edad_invalida_exception import edad_invalida_exception

def main():
    try:
        validar_edad(15)
    except edad_invalida_exception as e:
        print(f"Error: {e}")

def validar_edad(edad):
    if edad < 18:
        raise edad_invalida_exception("Debe de ser mayor de edad.")

# Ejecuta la aplicación
if __name__ == '__main__':
    main()