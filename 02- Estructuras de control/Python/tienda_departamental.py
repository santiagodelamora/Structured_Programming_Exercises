"""
Descripción: Sistema de cobro en una tienda departamental.
Autor: Santiago De la mora
Fecha: 01/02/2026
"""

# Declaración e inicialización de variables
subtotal = 0.0
descuento_porcentaje = 0.0
descuento = 0.0
impuesto_porcentaje = 0.0
impuesto = 0.0
total = 0.0
tipo_cliente = ""
forma_pago = ""
salida = ""

# Solicita el tipo de cliente
tipo_cliente = input("""¿Cuál es su tipo de cliente
1) Normal
2) Miembro
3) Empleado
""")

# Valida si el tipo de cliente no es válido
if tipo_cliente != "1" and tipo_cliente != "2" and tipo_cliente != "3":
    print("\nSólo puede seleccionar una opción del 1 al 3.\n")
else:
    # Solicita el monto total de la compra
    subtotal = float(input("\nIngrese el monto de su compra:\n"))

    # Valida si el monto es un número negativo o 0
    if subtotal <= 0:
        print("\nEl monto no puede ser negativo.\n")
    else:
        # Solicita la forma de pago
        forma_pago = input("""
Ingrese la forma de pago
1) Efectivo
2) Tarjeta
""")
        
        # Verifica si la forma de pago no es la correcta
        if forma_pago != "1" and forma_pago != "2":
            print("\nSólo puede seleccionar una opción del 1 al 2.\n")
        else:
            # Calcula los descuentos
            if tipo_cliente == "2":
                # Establece el tipode cliente pero como cadena
                tipo_cliente = "Miembro"

                descuento_porcentaje = 0.10
            elif tipo_cliente == "3":
                # Establece el tipo de cliente pero como cadena
                tipo_cliente = "Empleado"

                descuento_porcentaje = 0.20
            else:
                # Establece el tipo de cliente pero como cadena
                tipo_cliente = "Normal"

                descuento_porcentaje = 0.00

            # Calcula el descuento adicional
            if forma_pago == "1":
                # Establece la forma de pago pero como cadena
                forma_pago = "Efectivo"

                descuento_porcentaje += 0.05
            else:
                # Establece la forma de pago pero como cadena
                forma_pago = "Tarjeta"

                descuento_porcentaje += 0.00

            # Calcula el impuesto
            if subtotal > 5000:
                impuesto_porcentaje = 0.05
            else:
                impuesto_porcentaje = 0.00

            # Calcula el descuento, el impuesto y el total a pagar
            descuento = subtotal * descuento_porcentaje
            impuesto = subtotal * impuesto_porcentaje
            total = subtotal - descuento + impuesto

            # Muestra el precio final
            salida = f"""
Subtotal: ${subtotal:,.2f}
Descuento del {descuento_porcentaje:.0%}
Descuento aplicado: ${descuento:,.2f}
Impuesto del {impuesto_porcentaje:.0%}
Impuesto aplicado: ${impuesto:,.2f}
--------------------------------------
Total a pagar: ${total:,.2f}
--------------------------------------"""

            print(salida)