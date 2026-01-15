# Buenas Prácticas y Documentación de Código

**Alumno:** Santiago De la mora<br>
**Fecha:** 14/01/2026<br>

---

> "Las buenas prácticas son indispensables para la realización de un código ordenado, limpio, coherente, claro, seguro y escalable."

---

## 1. Objetivo del reporte
- Investigar y profundizar en las buenas prácticas de escritura de código (con énfasis en Java y Python).
- Investigar acerca de los estándares y herramientas para una buena documentación del código.

## 2. Buenas prácticas de codificación
### 2.1 Nombres de variables
- **Reglas**: 
    * Usar nombres descriptivos y pronunciables (evitar `x`, `temp` o `data`).
    * Usar convenciones estándar según el lenguaje: **camelCase** (Java/JavaScript), **snake_case** (Python) o **PascalCase** (Clases).
    * Usar solo **minúsculas**, **mayúsculas**, **guiones bajos** y **números**.
    * No usar **carácteres especiales**, ni **vocales con acentos**, ni la letra `ñ`.
    * No usar **palabras reservadas del lenguaje**.
    * No comenzar el nombre con un número
    * Evitar nombres largos.
    * Usar `is` (o `es` si se escribe código en español) como prefijo de variables booleanas.
- **Ejemplos**: 
    + `int anioNacimiento = 2007;`
    + `boolean isActivo = true;`
    + `public class GeneradorDeTickets {}`
    + `def solicitar_edad():`
    + `es_nombre_valido = false`

### 2.2 Comentarios
- **Cuándo comentar**: Solo cuando el código no puede explicar el "por qué" de una decisión compleja o un algoritmo técnico específico.
- **Qué evitar**: Comentarios obvios que describen "qué" hace el código (ej. `// Incrementa i en 1`) o código comentado (código muerto).

### 2.3 Estructura del código
- **Indentación**: Consistente en todo el proyecto (usualmente **2** o **4** espacios). Ayuda a visualizar la jerarquía lógica.
- **Modularidad**: Aplicar el **Principio de Responsabilidad Única** (**SRP**): cada función o clase debe hacer solo una cosa.
- **Evitar duplicidad**: Aplicar el principio **DRY** (_Don't Repeat Yourself_). Si un proceso se repite, debe abstraerse en una función o componente reutilizable.

## 3. Documentación del código
### 3.1 Estándares
- **Estándar elegido**: JSDoc / Doxygen / Pydoc (Documentación técnica integrada).
- Elementos recomendados: Descripción de la función.
    * `@param`: Tipo y descripción de los parámetros de entrada.
    * `@returns`: Tipo y descripción del valor devuelto.
    * `@throws`: Posibles excepciones o errores.

### 3.2 Herramientas / enfoque
- **README / generadores / extensiones**: Uso de archivos **README.md** (**Markdown**) para visión general, **Swagger**/**OpenAPI** para APIs, y generadores automáticos como **Sphinx* o **Compodoc**.
- **Ventajas**: Facilita el _onboarding_ de nuevos desarrolladores, reduce la deuda técnica y sirve como contrato de uso para otros equipos.

## 4. Ejemplos prácticos
### 4.1 Antes / Después (Ejemplo 1: Nombres y Estructura)
**Antes:**
```java
public double calc(double a, double b) {
  double r = a * 0.16;
  double t = a + r - b;
  return t;
}
```

**Después:**
```java
/**
 * Calcula el total de una factura aplicando IVA y un descuento fijo.
 */
public double calcularTotalFactura(double subtotal, double descuento) {
  final double IVA_PORCENTAJE = 0.16;
  final double impuesto = subtotal * IVA_PORCENTAJE;
  
  return subtotal + impuesto - descuento;
}
```

### 4.2 Antes / Después (Ejemplo 2: Modularidad y Duplicidad)

**Antes:**
```py
# Validar usuario 1
if (u1.edad >= 18 and u1.email.includes("@")): pass

# Validar usuario 2
if (u2.edad >= 18 and u2.email.includes("@")): pass
```

**Después**
```py
def es_usuario_valido(usuario):
  es_mayor_de_edad = usuario.edad >= 18
  tiene_email_valido = usuario.email.includes("@")
  return es_mayor_de_edad and tiene_email_valido

if (es_usuario_valido(u1)): pass
```

### 4.3 Ejemplo de documentación
**Python**:
```py
 def procesar_pago(monto: float, divisa: str) -> bool:
    """
    Registra el pago en la base de datos financiera.

    Args:
        monto (float): Cantidad total a cobrar.
        divisa (str): Código ISO de la moneda (ej. 'MXN', 'USD').

    Returns:
        bool: True si el pago fue aprobado, False en caso contrario.
    """

    # Lógica de procesamiento...
    return True
```

**Java**:
```java
/**
 * Registra el pago en la base de datos financiera.
 * * <p>Esta función se encarga de validar la transacción con el procesador
 * correspondiente y persistir el resultado en el historial financiero.</p>
 *
 * @param monto   La cantidad total a cobrar (debe ser mayor a cero).
 * @param divisa  El código ISO de la moneda en formato String (ej. "MXN", "USD").
 * @return        {@code true} si el pago fue aprobado y registrado; 
 * {@code false} en caso de rechazo o error.
 */
public boolean procesarPago(double monto, String divisa) {
    // Lógica de procesamiento...
    return true;
}
```

## 5. Recomendaciones finales
- **Refactorización constante**: No tengas miedo de mejorar el código que ya funciona si encuentras una forma más limpia de hacerlo.

- **Revisiones de código (_Code Reviews_)**: Fomenta que otros lean tu código para detectar vicios o errores que tú no ves.

- **Escribe código para humanos**: Recuerda que el compilador entiende cualquier cosa, pero el código limpio está diseñado para que otro programador (o tú en 6 meses) pueda leerlo sin frustración.

## 6. Fuentes consultadas
1. Martin, R. C. (2008). _Clean Code: A Handbook of Agile Software Craftsmanship_. Prentice Hall.
2. Fowler, M. (2018). _Refactoring: Improving the Design of Existing Code_. Addison-Wesley Professional.
3. Google. (s.f.). _Google Style Guides_. Recuperado de https://google.github.io/styleguide/