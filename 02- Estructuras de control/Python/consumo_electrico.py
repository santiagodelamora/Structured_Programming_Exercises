"""
Descripción: Una compañía de energía eléctrica desea desarrollar un programa que permita calcular el monto a pagar de un usuario doméstico.
Autor: Santiago De la mora
Fecha: 01/02/2026
"""

# Declaración e inicialización de variables
consumo_mensual = 0.0
costo_por_kw = 0.0
recargo_porcentaje = 0.0
recargo = 0.0
monto = 0.0
monto_final = 0.0
tipo_tarifa = ""
mensaje = ""

# Entrada
consumo_mensual = float(input("Ingrese su consumo mensual en KiloWatts-hora (KWh):\n"))

# Validación
if consumo_mensual < 0:
    print("\nNo puede ingresar un consumo KiloWatt-hora negativo.\n")
else:
    # Entrada
    tipo_tarifa = input("\nIngrese el tipo de tarifa\n1) Básica\n2) Intermedia\n3) Alta\n")

    # Verifica el tipo de tarifa
    match tipo_tarifa:
        case "1":
            tipo_tarifa = "Básica"
            costo_por_kw = 0.85

            # Aplica el recargo si se cumple la condición
            if consumo_mensual > 250:
                recargo_porcentaje = 0.12

        case "2":
            tipo_tarifa = "Intermedia"
            costo_por_kw = 1.25

            # Aplica el recargo si se cumple la condición
            if consumo_mensual >= 300 and consumo_mensual <= 500:
                recargo_porcentaje = 0.10
            elif consumo_mensual > 500:
                recargo_porcentaje = 0.18

        case "3":
            tipo_tarifa = "Alta"
            costo_por_kw = 2.10

            # Aplica el recargo si se cumple la condición
            if consumo_mensual > 400:
                recargo_porcentaje = 0.25

        case _:
            print("\nSólo puede ingresar una opción del 1 al 3.\n")

    # Calcula el precio a pagar
    monto = consumo_mensual * costo_por_kw
    recargo = (monto * recargo_porcentaje)        
    monto_final = monto + recargo

    # Salida
    mensaje = f"""
Tipo de tarifa aplicada: {tipo_tarifa}
Consumo registrado: {consumo_mensual:.2f} kWh
Costo por kWh: ${costo_por_kw:.2f}
Recargos aplicados: ${recargo:,.2f}
Total a pagar: ${monto_final:,.2f}"""
    
    # Agrega los mensajes especiales a la cadena si corresponde
    mensaje += "\n\nConsumo elevado se recomienda ahorro de energía." if (monto_final > 1500.0) else ""
    mensaje += "\n\nUsuario con consumo eficiente." if (consumo_mensual < 100) else ""

    print(mensaje)