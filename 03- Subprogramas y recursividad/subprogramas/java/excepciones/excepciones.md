# Manejo de excepciones en Java
> Una excepción es un error que ocurre durante la ejecución del programa y que interrumpe el flujo normal

**Ejemplos comunes**
- Dividir entre 0
- Convertir un "hola" (una cadena a un número)
- Acceder a una posición inexistente de un arreglo
- Llamar un método en un objeto con valor `null`


## Estructura básica
```java
try {
    // Código que puede generar error 💀
} catch (ClaseDeLaExcepcion e) {
    // Código que maneja el error 🤫
} finally {
    // Opcional: siempre se ejecuta 😊
}
```

## Tipos de excepciones
1. **_Checked_ (obligatorias)**: Java obliga a manejarlas. Ejemplos:
    - IOException
    - SQLException

2. **_Unchecked_ (RuntimeException)**:
    - ArithmeticException
    - NullPointerException
    - NumberFormatException

<br>

**Ejemplo 1: Manejo de excepciones**
```java
import javax.swing.JOptionPane;

public class DivisionEntreCero {
    public static void main(String[] args) {
        int num1, num2, resultado;

        num1 = Integer.parseInt(
                JOptionPane.showInputDialog(
                        null,
                        "Introduce el número 1",
                        "Número 1",
                        JOptionPane.PLAIN_MESSAGE
                )
        );

        num2 = Integer.parseInt(
                JOptionPane.showInputDialog(
                        null,
                        "Introduce el número 2",
                        "Número 2",
                        JOptionPane.PLAIN_MESSAGE
                )
        );

        try {
            resultado = num1 / num2;

            JOptionPane.showMessageDialog(
                    null,
                    "Resultado: " + resultado,
                    "Resultado",
                    JOptionPane.PLAIN_MESSAGE
            );
        } catch (ArithmeticException e) {
            JOptionPane.showMessageDialog(
                    null,
                    "No se puede dividir entre 0.",
                    "Error",
                    JOptionPane.ERROR_MESSAGE
            );
        }
    }
}
```

<br>

**Ejemplo 2: Múliples _catch_**
```java
import javax.swing.JOptionPane;

public class MultiplesCatch {
    public static void main(String[] args) {
        int numero, resultado;

        try {
            numero = Integer.parseInt(
                    JOptionPane.showInputDialog(
                            null,
                            "Ingrese el número",
                            "Número",
                            JOptionPane.PLAIN_MESSAGE
                    )
            );

            resultado = 10 / numero;

            JOptionPane.showMessageDialog(
                    null,
                    resultado,
                    "Resultado",
                    JOptionPane.PLAIN_MESSAGE
            );
        } catch (NumberFormatException e) {
            System.err.println("Error: No ingresaste un número válido.");
        } catch (ArithmeticException e) {
            System.err.println("Error: No se puede dividir entre 0.");
        }
    }
}
```

<br>

**Ejemplo 3: Uso de finally**
```java
public class ExcepcionConFinally {
    public static void main(String[] args) {
        int x = 10, y = 0, z = 0;

        try {
            z = x / y;

            System.out.println(z);
        } catch (ArithmeticException e) {
            System.out.println("Error: división entre 0");
        } finally {
            System.out.println("Esto siempre se ejecuta");
        }

        System.out.println("Fin del programa");
    }
}
```

<br>

**Ejemplo 4: Lanzamiento de excepciones**
```java
public class LanzarExcepciones {
    public static void main(String[] args) {
        int edad = -5;

        if (edad < 0) {
            throw new IllegalArgumentException("La edad no puede ser negativa");
        }

        System.out.println("Edad válida");
    }
}
```