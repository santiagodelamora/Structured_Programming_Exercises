"""
Descripción: Aplicación que simula la funcionalidad de un banco.
Autor: Santiago Nicolás De la mora Núñez
Fecha: 25/06/2026
"""

saldo = 0.0

def iniciar():
    menu()

def consultar_saldo():
    return saldo

def depositar(monto):
    global saldo

    saldo += monto
    return saldo

def retirar(monto):
    global saldo

    saldo -= monto
    return saldo

def validar_monto_positivo(monto):
    return monto > 0

def validar_saldo_suficiente(monto_a_retirar):
    global saldo

    return saldo >= monto_a_retirar

def solicitar_monto():
    monto = 0.0

    while True:
        try:
            monto = float(input("\nIntroduce el monto:\n"))

            if validar_monto_positivo(monto):
                break
            else:
                print("\nError. El monto debe ser positivo.\n")
        except ValueError:
            print("\nEl saldo debe ser un número.\n")

    return monto

def menu():
    menu, opcion = "", ""
    salir = False
    monto = 0.0

    menu = """======= Menú =======
1. Consultar saldo
2. Depositar
3. Retirar
4. Salir

Elige una opción
"""

    while not salir:
        opcion = input(menu)

        match opcion:
            case "1" | "A":
                print(f"\nTu saldo es: ${consultar_saldo()}\n")
                salir = False

            case "2" | "B":
                print(f"\nTu saldo es: ${depositar(solicitar_monto())}\n")
                salir = False

            case "3" | "C":
                monto = solicitar_monto()

                if validar_saldo_suficiente(monto):
                    print(f"\nRetiro satisfactorio, tu nuevo saldo es ${retirar(monto)}\n")
                else:
                    print(f"\nNo tienes saldo suficiente.\n")

                salir = False

            case "4" | "D":
                salir = True

            case _:
                print("\nOpción inválida.\n")
                salir = False