"""
Descripción: En una tienda de descuento las personas que van a pagar el importe de su compra llegan a
    la caja y sacan una bolita de color, que les dirá que descuento tendrán sobre el total de su
    compra. Determinar la cantidad que pagara cada cliente desde que la tienda abre hasta que
    cierra. Se sabe que si el color de la bolita es roja el cliente obtendrá un 40% de descuento;
    si es amarilla un 25% y si es blanca no obtendrá descuento.
Autor: Santiago De la mora
Fecha: 05/02/2026
"""

def main():
    # Declaración e inicialización de variables
    descuento = 0.0
    repetir = True
    opcion = ""

    while True:
        # Solicita una opción de las del menú
        opcion = obtener_menu()

        # Decide que hacer según la opción seleccionada
        match opcion:
            case "1":
                # Muestra los resultados
                print(calcular_resultados())

                # Indica que se debe de mostrar el menú otra vez
                repetir = True

            case "2":
                print("Opción 2")
                repetir = True

            case "3":
                print("Opción 3")
                repetir = True

            case "4":
                print("\nI'll be back...")
                repetir = False

            case _:
                print("\nOpción inválida.\n")
                repetir = True

        # Sale del bucle y termina el programa
        if not repetir:
            break

# Solicita una opción de un menú y devuelve el resultado escogido
def obtener_menu():
    # Crea la cadena del menú y sus opciones
    menu = """======== MENÚ CICLO WHILE =======
1) Opción 1
2) Opción 2
3) Opción 3
4) Salir

Elige una opción:
"""

    # Solicita y devuelve una opción
    return input(menu)

# Solicita una opción de bolita y devuelve el resultado
def elegir_bolita():
    menu = """
=== Bolita elegida ===
1) Roja
2) Amarilla
3) Blanca

Elige una bolita:
"""
    # Solicita una opción
    return input(menu)

# Calcula el descuento y el total a pagar
def calcular_resultados():
    # Declaración e inicialización de variables
    descuento = 0.0
    total = 0.0
    importe = 0.0
    salida = ""
    bolita = ""
    repetir = True
    i = 1

    while True:
        # Solicita el importe hasta que sea un número positivo o -1
        while True:
            importe = float(input("\nIntroduce el importe:\n"))

            # Si el importe es mayor a 0 o -1, deja de pedirlo
            if importe > 0 or importe == -1:
                break

        # Verifica si el importe es "-1"
        if importe == -1:
            print("\nHas terminado.\n")

            # Indica que se sale del programa
            repetir = False
        else:
            # Elige una bolita
            bolita = elegir_bolita()

            # Verifica el tipo de bolita seleccionada
            if bolita == "1":
                descuento = importe * .40
                total = importe - descuento
            elif bolita == "2":
                descuento = importe * .25
                total = importe - descuento
            else:
                descuento = .0
                total = importe

            # Reasigna los números de la opción seleccionada en el nombre de la bolita
            match bolita:
                case "1": bolita = "Roja"
                case "2": bolita = "Amarilla"
                case "3": bolita = "Blanca"
                case _: bolita = "-1"

            # Acumula la cadena que muestra los datos
            salida += f"""Cliente {i}
Importe: ${importe}
Descuento: ${descuento}
Total: ${total}\n\n"""

            # Aumenta en 1 el número del cliente
            i += 1

            # Indica que se seguirá repitiendo el ciclo
            repetir = True

        if not repetir:
            break
    
    return salida

if __name__ == '__main__':
    main()