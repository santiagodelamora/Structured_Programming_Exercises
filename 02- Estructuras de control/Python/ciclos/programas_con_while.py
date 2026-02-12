"""
Descripción: Una compañía de seguros tiene contratados a n vendedores. Cada uno hace tres ventas a la
    semana. Su política de pagos es que un vendedor recibe un sueldo base y un 10% extra por
    comisiones de sus ventas. El gerente de su compañía desea saber cuánto dinero obtendrá
    en la semana cada vendedor por concepto de comisiones por las tres ventas realizadas, y
    cuanto tomando en cuenta su sueldo base y sus comisiones.
Autor: Santiago De la mora
Fecha: 01/02/2026
"""

# Declaración e inicialización de variables y constantes
PORCENTAJE = 0.10
sueldo_base = 0.0
venta1 = 0.0
venta2 = 0.0
venta3 = 0.0
comision = 0.0
total = 0.0
sumatoria = 0.0
numero_trabajadores = 0
salida = ""
menu = ""
opcion = ""
es_valido = True

# Crea la cadena del menú y sus opciones
menu = """======== MENÚ CICLO WHILE =======
1) Opción 1
2) Opción 2
3) Opción 3
4) Salir

Elija una opción:
"""

# Muestra el menú hasta que el usuario seleccione la opción salir
while True:
    # Muestra el menú
    opcion = input(menu)

    # Decide que hacer según la opción seleccionada
    match opcion.upper():
        case "1" | "A":
            # Solicita el número de trabajadores
            numero_trabajadores = int(input("\nIntroduce el número de trabajadores:\n"))

            # Valida si el número de trabajadores es mayor a 0
            if numero_trabajadores > 0:
                sueldo_base = float(input("\nIntroduce el sueldo base:\n"))

                # Valida si el sueldo base es mayor a 0
                if sueldo_base > 0.0:
                    salida = "\n\n======== NÓMINA =======\n"

                    # Solicita las ventas del trabajador tantas veces como número de trabajadores
                    i = 1
                    while i <= numero_trabajadores:
                        # Solicita la primera venta
                        venta1 = float(input("\nIntroduce la venta 1:\n"))

                        # Solicita la segunda venta
                        venta2 = float(input("\nIntroduce la venta 2:\n"))

                        # Solicita la tercera venta
                        venta3 = float(input("\nIntroduce la venta 3:\n"))

                        # Valida si todas las ventas mayores a 0
                        if venta1 <= 0.0 or venta2 <= 0.0 or venta3 <= 0.0:
                            # Muestra un mensaje de error
                            print("\nUna o más ventas no son válidas\n")

                            continue
                        else:
                            # Calcula la comisión y el total
                            comsion = (venta1 + venta2 + venta3) * PORCENTAJE
                            total = sueldo_base + comision

                            # Crea la cadena del resultado de salida
                            salida += f"""Vendedor: {i}
Sueldo base: {sueldo_base:.2f}
Comsión: ${comision:.2f}
Total: ${total:.2f}\n\n\n"""
                            
                            # Acumula el total de las ventas
                            sumatoria += total

                        i += 1

                    # Agrega el total de deducciones al resultrado de salida y lo muestra
                    salida += f"Total de deducciones: ${sumatoria:.2f}\n"
                    print(salida)

                else:
                    # Muestra un mensaje de error
                    print("\nEl sueldo base debe de ser mayor a 0\n")

            else:
                # Muestra un mensaje de error
                print("\nEl número de trabajadores debe de ser mayor a 0\n")

            # Indica que se debe de mostrar el menú otra vez
            repetir = True

        case "2" | "B":
            print("Opción 2")
            repetir = True

        case "3" | "C":
            print("Opción 3")
            repetir = True

        case "4" | "S":
            print("El programa ha terminado.")
            repetir = False

        case _:
            print("Opción inválida")
            repetir = True

    # Sale del bucle y termina el programa
    if not repetir:
        break