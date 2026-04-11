# Recursividad

1. ¿Qué es la recursividad?
La **recursividad** es una técnica donde un método se llama a sí mismo para resolver un problema.

> Nota: En lugar de utilizar ciclos (while, for, do-while, for-each) el método se repite a sí mismo hasta que se cumple una condición que lo detiene.

2. Conceptos clave
    1. **Caso base**: Es la condición que detiene la recursión. Si no existe, se produce un error (StackOverflowError).

    2. **Caso recursivo o caso general**: Es cuando el método se vuelve a llamar a sí mismo, pero acercándose al caso base.