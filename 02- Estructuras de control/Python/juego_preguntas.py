"""
Descripción: En un juego de preguntas a las que se responde sí o no gana
    quién responda correctamente las 3 preguntas. Si se responde mal, a
    cualquiera de ellas, ya no se pregunta la siguiente y termina el juego.
Autor: Santiago De la mora
Fecha: 22/01/2026
"""

def main():
    # Recibe la entrada y verifica si debe de salir del juego no
    respuesta1 = input("1. ¿Colón descubrió America?\n").upper()

    if respuesta1 == "NO":
        print("\nHas perdido.")
        return
    elif not respuesta1 == "SI":
        print("\nSolo puede ingresar Sí o No.")
        return

    # Recibe la entrada y verifica si debe de salir del juego no
    respuesta2 = input("\n2. ¿La independencia de México fue en le año 1810?\n").upper()

    if respuesta2 == "NO":
        print("\nHas perdido.")
        return
    elif not respuesta2 == "SI":
        print("\nSolo puede ingresar Sí o No.")
        return
    
    # Recibe la entrada y verifica si debe de salir del juego no
    respuesta3 = input("\n3. ¿The Doors fue un grupo de rock estadounidense?\n").upper()

    if respuesta3 == "NO":
        print("\nHas perdido.")
        return
    elif not respuesta3 == "SI":
        print("\nSolo puede ingresar Sí o No.")
        return

    print("\nHas respondido correctamente todas las preguntas.")

if __name__ == '__main__':
    main()