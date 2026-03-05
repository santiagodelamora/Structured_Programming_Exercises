/**
 * Descripción: Una universidad evalúa a sus alumnos considerando los siguientes datos:
 *      • Calificación del primer parcial
 *      • Calificación del segundo parcial
 *      • Calificación del proyecto final
 *      El sistema debe:
 *      • Calcular el promedio final.
 *      • Determinar el estatus del alumno según las reglas:
 *              o Aprobado: promedio ≥ 70 y proyecto ≥ 60
 *              o Extraordinario: promedio entre 50 y 69
 *              o Reprobado: promedio < 50
 *      Además:
 *      • Si el promedio es mayor o igual a 95, mostrar el mensaje “Alumno con excelencia
 *      académica”.
 *      El programa deberá mostrar:
 *      • Promedio final
 *      • Estatus académico
 *      • Mensaje adicional si aplica.
 * Autor: Santiago De la mora
 * Fecha: 27/01/2026
 */

import javax.swing.JOptionPane;

public class EvaluacionAcademica {
    public static void main(String[] args) {
        // Declaración de variables
        double primerParcial, segundoParcial, proyectoFinal, promedio;
        String estatus = "";

        // Entrada
        primerParcial = Double.parseDouble(
                JOptionPane.showInputDialog(
                        null,
                        "Ingrese la calificación del primer parcial",
                        "Primer parcial",
                        JOptionPane.PLAIN_MESSAGE
                )
        );

        // Validación
        if (primerParcial < 0.0 || primerParcial > 100.00) {
            JOptionPane.showMessageDialog(
                    null,
                    "No puede ingresar números negativos ni mayores a 100.0",
                    "Error",
                    JOptionPane.ERROR_MESSAGE
            );
        } else {
			// Entrada
			segundoParcial = Double.parseDouble(
					JOptionPane.showInputDialog(
							null,
							"Ingrese la calificación del segundo parcial",
							"Segundo parcial",
							JOptionPane.PLAIN_MESSAGE
					)
			);

			// Validación
			if (segundoParcial < 0.0 || segundoParcial > 100.00) {
				JOptionPane.showMessageDialog(
						null,
						"No puede ingresar números negativos ni mayores a 100.0",
						"Error",
						JOptionPane.ERROR_MESSAGE
				);
			} else {
				// Entrada
				proyectoFinal = Double.parseDouble(
						JOptionPane.showInputDialog(
								null,
								"Ingrese la calificación del proyecto final",
								"Proyecto final",
								JOptionPane.PLAIN_MESSAGE
						)
				);

				// Validación
				if (proyectoFinal < 0.0 || proyectoFinal > 100.00) {
					JOptionPane.showMessageDialog(
							null,
							"No puede ingresar números negativos ni mayores a 100.0",
							"Error",
							JOptionPane.ERROR_MESSAGE
					);
				} else {
					// Calcula el promedio
					promedio = (primerParcial + segundoParcial + proyectoFinal) / 3;

					// Verifica el estatus del alumno
					if (promedio < 50.0) {
						estatus = "Reprobado";
					} else if (promedio >= 50.0 && promedio <= 69.0) {
						estatus = "Extraordinario";
					} else if (promedio >= 70.0 && proyectoFinal >= 60.0) {
						estatus = "Aprobado";
					}

					// Salida
					JOptionPane.showMessageDialog(
							null,
							String.format("Su promedio final es: %.2f\nEstatus: %s", promedio, estatus),
							"Promedio final",
							JOptionPane.PLAIN_MESSAGE
					);

					// Verifica si se debe de mostrar el mensaje especial
					if (promedio >= 95.0) {
						JOptionPane.showMessageDialog(
								null,
								"Alumno con excelencia académica",
								"¡Felicidades!",
								JOptionPane.PLAIN_MESSAGE
						);
					}
				}
			}
        }
    }
}