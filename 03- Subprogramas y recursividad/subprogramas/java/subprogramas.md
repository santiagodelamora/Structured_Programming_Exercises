# Subprogramas en Java

1. **¿Qué es una función?**<br>
En Java una función se llama **método**
Un `método` es un bloque de código que:
- Realiza una tarea específica
- Puede recibir datos (parámetros)
- Puede devolver un resultado
- Puede reutilizarse

2. Estrucura de un método
```java
modificadorAcceso static tipoRetorno nombreMetodo(tipoDato parametro) {
    // Cuerpo
    return valor; // Si aplica
}
```

Ejemplo:
```java
public static int sumar(int a, int b) {
    // Cuerpo
    return a + b; // Si aplica
}
```

3. ¿Por qué utilizar métodos estáticos?<br>
Porqué el método `main` es estático:<br>
Un método estático:
    - Pertenece a la clase
    - No se nesesita crear una clase para llamarlo
    - Se llama directamente desde el nombre de la clase