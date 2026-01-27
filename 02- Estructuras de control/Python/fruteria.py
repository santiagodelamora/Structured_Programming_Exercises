"""
Descripción: Determinar cuanto gastará una persona que compre frutas en un frutería.
Autor: Santiago De la mora
Fecha: 22/01/2026
"""

# Declaración e inicialización de variables
numero_kilos = float(input("Introduce el númeor de kilos: "))
precio = float(input("Introduce el precio: "))
descuento = 0.0
total = 0.0
porcentaje = ""

# Operación
subtotal = numero_kilos * precio

if (numero_kilos > 0.0):
    if 0.0 <= numero_kilos <= 2.0:
        total = subtotal
        porcentaje = "0%"
    elif 2.1 <= numero_kilos <= 5.0:
        descuento = subtotal * 0.10
        total = subtotal - descuento
        porcentaje = "10%"
    elif 5.1 <= numero_kilos <= 10.0:
        descuento = subtotal * 0.15
        total = subtotal - descuento
        porcentaje = "15%"
    else:
        descuento = subtotal * 0.20
        total = subtotal - descuento
        porcentaje = "20%"
else:
    print("\nError. Los kilos no pueden ser negativos.")

# Salida
salida = f"""
Subtotal: {subtotal}
Descuento: {descuento}
Porcentaje: {porcentaje}
Total: {total}"""

print(salida)