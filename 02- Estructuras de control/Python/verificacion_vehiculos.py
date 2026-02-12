"""
Descripción: Clasifica vehiculos de a acuero de si pasan la verificación o no, en base a su nivel de emisiones, su año y su tipo.
Autor: Santiago De la mora
Fecha: 01/02/2026
"""

# Declaración e inicialización de constantes y variables
APROBADA = "Verificación aprobada"
RECHAZADA = "Verificación rechazada"
VEHICULO_ANTIGUO = "Vehículo antiguo, requiere revisión especial."
anio = 0
nivel_emisiones = 0.0
tipo = ""
resultado = ""
mensaje = ""

# Entrada
tipo = input("Ingrese el tipo de su vehículo\n1) Particular\n2) Carga\n3) Público\n")

# Entrada
anio = int(input("\nIngrese el año de su vehículo:\n"))

# Verifica si el año no es válido
if anio < 1980 or anio > 2026:
    print("\nNo puede ingresar un año anterior a 1980 o posterior al año actual (2026).\n")
else:
    # Entrada
    nivel_emisiones = float(input("\nIngrese el nivel de emisiones:\n"))

    # Verifica si el nivel de emsiones no es válido
    if nivel_emisiones < 0.0 or nivel_emisiones > 500.0:
        print("\nEl nivel de emisiones no puede ser negativo ni mayor a 500.\n")
    else:
        # Verifica el tipo de vehículo
        match tipo:
            case "1":
                # Cambia el tipo de vehículo del número de la opción a el nombre del tipo de vehículo
                tipo = "Particular"

                # Verifica si el vehículo pasó la verificación
                if nivel_emisiones <= 50:
                    resultado = APROBADA
                else:
                    resultado = RECHAZADA
            
            case "2":
                # Cambia el tipo de vehículo del número de la opción a el nombre del tipo de vehículo
                tipo = "Carga"

                # Verifica si el vehículo pasó la verificación
                if nivel_emisiones <= 70:
                    resultado = APROBADA
                else:
                    resultado = RECHAZADA
            
            case "3":
                # Cambia el tipo de vehículo del número de la opción a el nombre del tipo de vehículo
                tipo = "Público"

                # Verifica si el vehículo pasó la verificación
                if nivel_emisiones <= 60:
                    resultado = APROBADA
                else:
                    resultado = RECHAZADA

            case _:
                print("\nSólo puede elegir una opción del 1 al 3.\n")

        # Salida
        mensaje = f"""
Tipo de vehículo: {tipo}
Año del vehículo: {anio}
Nivel de emisiones: {nivel_emisiones:.2f}

{resultado}"""

        # Verifica si el vehículo es demasiado viejo
        if anio < 2005:
            mensaje += '\n\n' + VEHICULO_ANTIGUO

        print(mensaje)