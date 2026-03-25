"""
Descripción: Solicita las ventas diarias de una semana y muestra el total vendido, el día con
    mayor venta y el día con menor venta.
Autor: Santiago Nicolás De la mora Núñez
Fecha: 11/02/2026
"""

# Declaración e inicialización de variables y constantes
DIAS_SEMANA = 7
total, venta_actual, venta1, venta2, venta3, venta4, venta5, venta6, venta7, venta_menor, venta_mayor = 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0
es_valida = True
dia_semana_mayores_ventas, dia_semana_menores_ventas = "", ""

# Solicita las ventas máximas por cada día de la semana
i = 1
while (i <= DIAS_SEMANA):
    while True:
        venta_actual = float(input(f"{"\n" if (i > 1) else ""}Ingresa la venta {i}:\n"))

        # Verifica si la venta no es negativa
        if venta_actual < 0:
            print("\nLa venta no puede ser negativa.\n")

            # Indica que se debe volver a solicitar la venta
            es_valida = False
        else:
            # Indica que se debe dejar de solicitar la venta
            es_valida = True

        # Rompe el bucle si el número ingresado fue válido
        if es_valida:
            break
    
    # Verifica el día de la semana para guardarlo en su respectiva variable
    match i:
        case 1: venta1 = venta_actual
        case 2: venta2 = venta_actual
        case 3: venta3 = venta_actual
        case 4: venta4 = venta_actual
        case 5: venta5 = venta_actual
        case 6: venta6 = venta_actual
        case 7: venta7 = venta_actual

    total += venta_actual
    i += 1

# Verifica cuál es el día de la venta mayor y el día de la venta menor
venta_menor = venta1
dia_semana_menores_ventas = "Domingo"
venta_mayor = venta1
dia_mayores_ventas = "Domingo"

if venta2 < venta_menor:
    venta_menor = venta2
    dia_semana_menores_ventas = "Lunes"

if venta2 > venta_mayor:
    venta_mayor = venta2
    dia_semana_mayores_ventas = "Lunes"

if venta3 < venta_menor:
    venta_menor = venta3
    dia_semana_menores_ventas = "Martes"

if venta3 > venta_mayor:
    venta_mayor = venta3
    dia_semana_mayores_ventas = "Martes"

if venta4 < venta_menor:
    venta_menor = venta4
    dia_semana_menores_ventas = "Miércoles"

if venta4 > venta_mayor:
    venta_mayor = venta4
    dia_semana_mayores_ventas = "Miércoles"

if venta5 < venta_menor:
    venta_menor = venta5
    dia_semana_menores_ventas = "Jueves"

if venta5 > venta_mayor:
    venta_mayor = venta5
    dia_semana_mayores_ventas = "Jueves"

if venta6 < venta_menor:
    venta_menor = venta6
    dia_semana_menores_ventas = "Viernes"

if venta6 > venta_mayor:
    venta_mayor = venta6
    dia_semana_mayores_ventas = "Viernes"

if venta7 < venta_menor:
    venta_menor = venta7
    dia_semana_menores_ventas = "Sábado"

if venta7 > venta_mayor:
    venta_mayor = venta7
    dia_semana_mayores_ventas = "Sábado"

# Salida
print(f"""\n==== Ventas semanales ====
Ventas totales: {total}
Día con mayores ventas: {dia_semana_mayores_ventas} (${venta_mayor})
Día con menores ventas: {dia_semana_menores_ventas} (${venta_menor})""")