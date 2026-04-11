"""
Descripción: Crear un programa que:
    1. Pida el nombre del cliente
    2. Pida la cantidad de productos comprados
    3. Pida el precio de cada producto
    4. Calcule el total a pagar
    5. Aplique descuentos
        - 10% si el total es mayor a 1000
        - 5% si el total es mayor a 500
    6. Mostrar el total final
    Debe:
        1. Validar que cantidades y precios sean positivos
        2. Repetir hasta que los datos sean correctos
        3. Usar métodos
Autor: Santiago Nicolás De la mora Núñez
Fecha: 09/04/2026
"""

def iniciar():
    nombre = solicitar_cliente()
    cantidad_productos = validar_numero_entero_positivo("Ingresar cantidad de productos: ")
    total = calcular_total(cantidad_productos)
    total_con_descuento = aplicar_descuento(total)
    imprimir(total, nombre, total_con_descuento)

def imprimir(total, cliente, total_con_descuento):
    print(f"""
Nombre del cliente: {cliente}
Total sin descuento: {total}
Total con descuento: {total_con_descuento}""")
    
def solicitar_cliente():
    nombre = ""

    while True:
        nombre = input("Ingrese su nombre: ")

        # Verifica si se ingresó algo (no se devolvió null)
        if nombre != "":
            # Quita los espacios en blanco del principio y el final
            nombre = nombre.strip()

            # Obtiene la longitud de la cadena
            longitud_nombre = len(nombre)

            # Verifica si el número de caracteres del nombre está entre 1 y 10
            if longitud_nombre >= 1 and longitud_nombre <= 10:
                if validar_contiene_numeros(nombre):
                    return nombre
                else:
                    print("\nError. No puede ingresar números.\n")
            else:
                print("\nError. Debe ingresar un nombre de al menos una letra y 10 como máximo.\n")
        else:
            print("\nError. Debe ingresar un nombre.\n")

def validar_contiene_numeros(nombre):
    i = 0
    while i < len(nombre):
        # Obtiene el caracter de la cadena en función de su índice
        caracter = nombre[i]

        # Verifica si el carácter es un dígito (número)
        if caracter.isdecimal():
            return False
        
        i += 1
        
    return True

def calcular_total(cantidad):
    # Declaración e inicialización de variables
    total = 0

    i = 1
    while i <= cantidad:
        precio = validar_numero_decimal_positivo("Precio de producto: ")
        total += precio

        i += 1

    return total

def validar_numero_entero_positivo(mensaje):
    numero = 0

    while True:
        try:
            numero = int(input(mensaje))

            if numero > 0:
                return numero
            
            print("\nError. Debe ingresar un número positivo.\n")
        except ValueError:
            print("\nError. Sólo puede ingresar números.\n")

def validar_numero_decimal_positivo(mensaje):
    numero = 0.0

    while True:
        try:
            numero = float(input(mensaje))

            if numero > 0.0:
                return numero
            
            print("\nError. Debe ingresar un número positivo.\n")
        except ValueError:
            print("\nError. Sólo puede ingresar números.\n")

def aplicar_descuento(total):
    return total * 0.90 if (total > 1000) else (total * 0.95 if (total > 500) else total)