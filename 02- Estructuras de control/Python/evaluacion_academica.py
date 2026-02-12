"""
Descripción: Una universidad evalúa a sus alumnos considerando los siguientes datos:
    • Calificación del primer parcial
    • Calificación del segundo parcial
    • Calificación del proyecto final
    El sistema debe:
    • Calcular el promedio final.
    • Determinar el estatus del alumno según las reglas:
        o Aprobado: promedio ≥ 70 y proyecto ≥ 60
        o Extraordinario: promedio entre 50 y 69
        o Reprobado: promedio < 50
    Además:
    • Si el promedio es mayor o igual a 95, mostrar el mensaje “Alumno con excelencia
      académica”.
    El programa deberá mostrar:
    • Promedio final
    • Estatus académico
    • Mensaje adicional si aplica.
Autor: Santiago De la mora
Fecha: 01/02/2026
"""

# Declaración e inicialización de variables
primer_parcial = 0.0
segundo_parcial = 0.0
proyecto_final = 0.0
promedio = 0.0
estatus = ""

# Entrada
primer_parcial = float(input("Ingrese la calificación del primer parcial:\n"))

# Validación
if primer_parcial < 0.0 or primer_parcial > 100.00:
    print("\nNo puede ingresar números negativos ni mayores a 100.0\n")
else:
    # Entrada
    segundo_parcial = float(input("\nIngrese la calificación del segundo parcial:\n"))

    # Validación
    if segundo_parcial < 0.0 or segundo_parcial > 100.00:
        print("\nNo puede ingresar números negativos ni mayores a 100.0\n")
    else:
        # Entrada
        proyecto_final = float(input("\nIngrese la calificación del proyecto_final:\n"))

        # Validación
        if proyecto_final < 0.0 or proyecto_final > 100.00:
            print("\nNo puede ingresar números negativos ni mayores a 100.0\n")
        else:
            # Calcula el promedio
            promedio = (primer_parcial + segundo_parcial + proyecto_final) / 3

            # Verifica el estatus del alumno
            if promedio < 50.0:
                estatus = "Reprobado"
            elif promedio >= 50.0 and promedio <= 69.0:
                estatus = "Extraordinario"
            elif promedio >= 70.0 and proyecto_final >= 60.0:
                estatus = "Aprobado"

            # Salida
            print(f"\nSu promedio final es: {promedio:.2f}\nEstatus: {estatus}")

            # Verifica si se debe mostrar el mensaje especial
            if promedio >= 95.0:
                print("\nAlumno con excelencia académica")