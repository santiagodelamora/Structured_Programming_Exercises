"""
Descripción: Un banco analiza solicitudes de crédito analizando el ingreso mensual , la antiguedad laboral y el historial crediticio.
Autor: Santiago De la mora
Fecha: 01/02/2026
"""

# Declaración e inicialización de variables
ingreso_mensual = 0.0
antiguedad_laboral = 0
historial_crediticio = ""
resultado = ""
mensaje = ""

# Solicita el ingreso mensual
ingreso_mensual = int(input("Ingrese su salario mensual:\n"))

# Valida que el ingreso mensual no sea un número negativo
if ingreso_mensual < 0:
    print("\nEl ingreso mensual no puede ser negativo.\n")
else:
    # Solicita la antigüedad laboral
    antiguedad_laboral = int(input("\nIngrese su antigüedad laboral en años:\n"))

    if antiguedad_laboral < 0 or antiguedad_laboral > 70:
        print("\nLa antigüedad laboral no puede ser un número negativo ni mayor a 70.\n")
    else:
        # Solicita el nivel del historial crediticio
        historial_crediticio = input("""
Ingrese su nivel de historial crediticio
1) Bueno
2) Regular
3) Malo
""")

        # Valida si el tipo de historial crediticio es no válido
        if historial_crediticio != "1" and historial_crediticio != "2" and historial_crediticio != "3":
            print("\nSólo puede ingresar una opción del 1 al 3.\n")
        else:
            # Calcula el tipo de crédito que se debe calcular
            if ingreso_mensual >= 12000 and antiguedad_laboral >= 2 and historial_crediticio != "3":
                resultado = "Crédito aprobado"
            elif ingreso_mensual >= 8000 and antiguedad_laboral >= 1 and historial_crediticio == "2":
                resultado = "Crédito condicionado"
            else:
                resultado = "Crédito rechazado"

            mensaje = f"""
Ingreso mensual: ${ingreso_mensual:,.2f}
Antigüedad laboral: {antiguedad_laboral} años
Historial crediticio: {("Bueno" if (historial_crediticio == "1") else 
                       ("Regular" if (historial_crediticio == "2") else 
                        ("Malo" if (historial_crediticio == "3") else "")))}
Crédito asignado: -- {resultado} --"""

            # Verifica si el ingreso mensual es alto y agrega un mensaje adicional
            if ingreso_mensual > 25000:
                mensaje += "\n\nCliente candidato a crédito premium."

            # Muestra el mensaje
            print(mensaje)