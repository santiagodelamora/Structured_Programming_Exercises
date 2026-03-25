"""
Descripción: Realiza una encuesta a 10 personas con las opciones: Excelente, Bueno,
    Regular y Malo. Muestra el total de respuestas por opción.
Autor: Santiago Nicolás De la mora Núñez
Fecha: 11/02/2026
"""

# Declaración e inicialización de variables
es_valido = False
numero_malas = 0
numero_regulares = 0
numero_buenas = 0
numero_excelentes = 0
opcion = ""

menu = """. ¿Qué nivel de calificación la daría a las instalaciónes de la carrera de TICs?
1) Malo
2) Regular
3) Bueno
4) Excelente
"""

# Solicita la opción 10 veces
i = 1
while i <= 10:
    while True:
        opcion = input(("\n" if (i > 1) else "") + str(i) + menu)

        # Verifica el tipo de opción seleccionada
        match opcion:
            case "1":
                numero_malas += 1
                es_valido = True

            case "2":
                numero_regulares += 1
                es_valido = True

            case "3":
                numero_buenas += 1
                es_valido = True

            case "4":
                numero_excelentes += 1
                es_valido = True

            case _:
                print("\nSólo puede ingresar un número del 1 al 10.\n")
                es_valido = False

        # Deja de solicitar la opción si fue válida
        if es_valido:
            break

    i += 1

# Muestra los resultados de la encuesta
print(f"""\n==== Resultados ====
¿Qué nivel de calificación la daría a las instalaciónes de la carrera de TICs?
Malo: {numero_malas}
Regular: {numero_regulares}
Bueno: {numero_buenas}
Excelente: {numero_excelentes}""")