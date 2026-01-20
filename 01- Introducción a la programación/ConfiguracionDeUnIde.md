# Configuración de un Entorno de Desarrollo Integrado (IDE)

**Alumno:** Santiago De la mora<br>
**Fecha:** 15/01/2026<br>

## 1. IDE seleccionado
- **IDE**: Visual Studio
- **Versión**: 1.108
- **Sistema operativo**: Windows 11

## 2. Justificación
- **Criterio 1**: Soporta casi cualquier lenguaje (Java, JavaScript, Python, PHP, C#, C, C++, TypeScript, HTML, CSS y YAML)
- **Criterio 2**: Es altamente personalizable
- **Criterio 3**: Es ligero y fácil de usar

## 3. Requisitos previos
- **Requisito 1**: Procesador de al menos 1.6 GHz
- **Requisito 2**: Al menos 1 GB de RAM
- **Requisito 3**: Windows 11 o 10 (64 bits)
- **Permisos**: Permisos de red, permisos de sistema de archivos

## 4. Instalación (paso a paso)
1. Ve a la página oficial de [Visual Studio Code](https://code.visualstudio.com).
2. Haz click en el botón que dice ["Download for Windows"](https://code.visualstudio.com?dv=win64user).
3. Una vez descargado el ejecutable, haz click en él, aparecerá una ventana.
4. Dentro de la ventana, haz click en _"Acepto el acuerdo"_, después, en _"Siguiente"_.
5. Te preguntará la ruta de instalación de la aplicación. Déjala como está por defecto y haz click en _"Siguiente"_.
6. Te preguntará el nombre del acceso directo para la aplicación. Déjala por defecto y haz click en _"Siguiente"_.
7. Te preguntará que tareas adicionales realizar. Haz click en _"Siguiente"_.
8. Te mostrará un resumen de todas las opciones que elegiste anteriormente. Haz click en _"Instalar"_.
9. Finalmente te dirá que la instalación habrá finalizado. Haz click en _"Finalizar"_.

### 4.1 Instalación y configuración de Git
1. Si no tienes instalado Git, dirígete al [sitio ofiial de Git](https://git-scm.com) y posteriormente haz lo siguiente:
    1. Haz click en _"Install for Windows"_.
    2. Haz click en _"Click here to download"_.
    3. Una vez instalado, haz click en el ejecutable.
    4. Te aparecerá un cuadro de diálogo preguntandote si quieres permitir que la aplicación haga cambios en el dispositivo. Haz click en _"Si"_.
    5. Te aparecerá un cuadro de diálogo de información sobre la licencia GNU. Haz click en _"Next"_.
    6. Te preguntará en que ruta instalar la aplicación. Déjala por defecto y haz click en _"Next"_.
    7. Te preguntará que componentes instalar. Déjala las opciones por defecto y haz click en _"Next"_.
    8. Te preguntará en que carpeta colocar los accesos directos. Déjalo por defecto y haz click en _"Next"_.
    9. Te preguntará que editor deseas que use Git. Selecciona _"Use Visual Studio Code as Git default editor"_ y haz click en _"Next"_.
    10. Te preguntará como nombrar la rama inicial después de crear un repositorio local. Selecciona _"Override the default branch name por new repositories"_ y haz click en _"Next"_.
    11. Te preguntará como usar Git desde la línea de comandos. Déjala por defecto y haz click en _"Next"_.
    12. Te preguntará que programa de cliente de Secure Shell te gustaría que Git use. Déjala por defecto y haz click en _"Next"_.
    13. Te preguntará que programa de cliente de Secure Shell te gustaría que Git use. Déjala por defecto y haz click en _"Next"_.
    14. Te preguntará como Git debería tratar el fin de las líneas en los archivos de texto. Déjala por defecto y haz click en _"Next"_.
    15. Te preguntará que emulador de terminal quieres usar con Git Bash. Déjala por defecto y haz click en _"Next"_.
    16. Te preguntará debería hacer `git pull`por defecto. Déjala por defecto y haz click en _"Next"_.
    17. Te preguntará que ayudante de credenciales debería ser configurado. Déjala por defecto y haz click en _"Next"_.
    18. Te preguntará que características te gustaría habilitar. Déjala por defecto y haz click en _"Next"_.
    19. Te nostrará un cuadro diálogo que indicará que la instalación ha finalizado. Deselecciona todas las casillas y haz click en _"Next"_.
    20. Abre la línea de comandos **CMD**.
    21. Establece tu nombre de usuario escribiendo el comando `git config --global user.name "<tu_nombre_de_usuario>"`.
    22. Establece tu correo electrónico escribiendo el comando `git config --global user.email "<tu_correo_electronico>"`.

2. Creación de un repositorio local
    1. Crea una carpeta.
    2. Inicializa un repositorio con el comando `git init`.
    3. Crea un archivo `.gitkeep`.
    4. Agrega el archivo `.gitkeep` a la zona de preparación con el comando `git add .gitkeep`.
    5. Confirma los cambios con el comando `git commit -m "<descripcion_de_los_cambios>"`. `<descripcion_de_los_cambios>` es donde va el mensaje con el que indicas los cambios que se hicieron.
3. Creación de un repositorio remoto
    1. Dirígete al [sitio oficial de GitHub](https://github.com) e inicia sesión o crea una cuenta.
    2. Una vez en tu perfil, dirígete a _"Repositories"_.
    3. Haz click en el botón verde _"New"_.
    4. Escribe un nombre el repositorio usando una nomenclatura consistente (por ejemplo camelCase, snake_case, kebab-case). Evita utilizar espacios.
    5. Agrega una descripción.
    6. Establece sus visibilidad (o puedes simplemente dejarlo público como está por defecto).
    7. Agrega un README.md (opcional).
    8. Agrega un archivo .gitignore (opcional).
    9. Haz click en _"Create repository"_.
    10. Una vez creado, te redirigirá a una página donde se mostrarán comandos sobre como vincular el repositorio local con el repositorio remoto. Copia los comandos del apartado que dice _"...or push an existing repository from the command line"_. Los comandos serán:
        ```
        git remote add origin https://github.com/tu_nombre_de_usuario/el_nombre_de_tu_repositorio.git
        git push -u origin main
        ```
    11. Abre la carpeta donde se encuentra tu repositorio local, desde la terminal: `Click derecho sobre la carpeta > Abrir en un terminal`.
    12. Si ya hay uno o más commits, pega los comandos del paso 10 en la terminal, si no, realiza del paso 3 al 5 del apartado 2 de esta sección _"Creación de un repositorio local"_.

### 4.2 Verificación
- ¿Cómo comprobé que funciona?
    - **Para Visual Studio Code**: Al aparecer _"Completando la instalación de Visual Studio Code"_ en la ventana y ver el acceso directo en el escritorio puedes darte cuenta que la aplicación está instalada. Cuando haces click en el acceso directo puedes te aparecerá lo siguiente:
        * Evidencia (captura o descripción): ![Visual Studio Code al abrir](https://theraspberrytechlab.com/wp-content/uploads/2025/08/vscode-splash.webp)
    - **Para Git**: Al escribir el comando `git -v` o `git --version`, no te deberá de aparecer ningún error y aparecer la versión de Git.
        * Evidencia (captura o descripción):
        ```
        Microsoft Windows [Versión 11.0.26100.3725]
        (c) Microsoft Corporation. Todos los derechos reservados.

        C:\Users\TuUsuario> git -v
        git version 2.49.0.windows.1

        C:\Users\TuUsuario>
        ```
    - **Para GitHub**: Una vez hecho `git push` por primera vez, deberán de aparecer en tu repositorio todos los archivos que hay dentro de la carpeta de tu repositorio local.
        * Evidencia (captura o descripción): ![Repositoriode GitHub recién creado](https://geekflare.com/es/wp-content/uploads/sites/24/2021/07/2-3-1536x737.png)

## 5. Configuración inicial
### 5.1 Ajustes básicos
- Te recomiento establecer tema de color oscuro. Esta opción se puede habilitar en el menú que te aparece cuando instalas la aplicación (debajo de la opción que aparece en la imagen de arriba hay una opción que dice _"Choose your theme"_).
- Si quieres que tus archivos se guarden automáticamente sin tener que usar `Ctrl + S`, activa la opción "_Autoguardado_".
    * Para ello, dirigete a `File > Auto Save` y seleciona la opción.

### 5.2 Extensiones / plugins

| ___Extensión/Plugin___ | ___Función___ | ___Por qué___ |
|---|---|---|
| **Spanish Lenguage Pack for Visual Studio Code** | Habilita el español en el IDE | Necesario si no sabes inglés. |
| **Material Icon Theme** | Estiliza los ícono de las carpetas (según su nombre) y los íconos de los archivos (según su extensión) | Facilita identificar las carpetas y sus archivos. |
| **Prettier - Code formatter** | Da formato al código al guardar el archivo | Promueve la escritura de código limpio y legible que se alinea con las convenciones del lenguaje utilizado. |
| **Bracket Pair Color DLW** | Colorea los pares de llaves, paréntesis y corchetes | Mejora la legibilidad al saber que paréntesis, corchete o llave cierra a otra. |

### 5.3 Herramientas adicionales (si aplica)
Si quieres utilizar Python en Visual Studio Code, esto es lo que tienes que hacer:
- **Compilador/intérprete**: Intérprete de Python
    * Proceso de instalación del intérprete de Python
        1. Ve al [sitio web oficial de Python](https://www.python.org).
        2. Dirígete a _"Downloads"_.
        3. Haz click en _"Download Python 3.14.2"_.
        4. Abre el instalador una vez descargado.
        5. Selecciona la casilla que dice _"Add python.exe to PATH"_.
        6. Haz click en _"Install now"_.
        7. Una vez terminada la instalación ṕuedes cerrar la ventana.
- **Prueba**:
    1. Dirígete a la _línea de comandos_ (escribe "cmd" en la barra de búsqueda de Windows).
    2. Escribe `python --version` o `python -v` en la terminal (si no te aparece ningún error y aparece la versión de Python, significa que el lenguaje fue instalado correctamente).
    3. Escribe `python` en la terminal, esto ejecutará al intérprete de Python, donde podrás escribir y ejecutar código Python.
    4. Una vez dentro del intérprete de Python prueba escribiendo `5 // 2`. Esto te dará como resultado `2`.
    5. Dirígete a Visual Studio Code e instala las siguientes extensiones:
        + Python
        + Pylance
        + Python Debugger
        + Python Enviroments
    6. Reinicia la aplicación y ya tendrás disponible Python en Visual Studio Code.

## 6. Prueba final (mini-ejercicio)
1. Abre una carpeta en Visual Studio Code.
1. Crea una nueva carpeta dentro de la carpeta que acabas de abrir.
1. Abre la terminal de Visual Studio Code con `Ctrl + T`.
1. Inicializa un nuevo repositorio con el comando `git init`.
1. Crea un nuevo archivo llamado `piramide_asteriscos.py` dentro de la carpeta.
1. Escribe este código dentro del archivo:
    ```py
    # Mitad de pirámide de asteríscos
    for i in range(10):
        for t in range(i):
            print('*', end=' ')
        print()
    ```
1. Ejecuta el archivo haciendo click en el triángulo ubicado en la parte superior derecha de Visual Studio Code.
    Debería aparecer la mitad de una pirámide de asteríscos. <br>
    Ejemplo:
    ```txt
    * 
    * * 
    * * * 
    * * * * 
    * * * * * 
    * * * * * * 
    * * * * * * * 
    * * * * * * * * 
    * * * * * * * * *
    ```

1. Dentro de la terminal, escribe `git add piramide_asteriscos.py` o simplemente `git add .` para agregar el archivo a la zona de preparación.
1. Haz un _"commit"_ para confirmar los cambios usando el comando `git commit -m "Se crea un archivo de Python que muestra una pirámide de asteriscos"`.
1. Ve a [GitHub](https://github.com) e inicia sesión o crea una cuenta si no tienes una.
1. Dirígete al apartado _"Repositories"_ y haz click en el botón _"New"_ para crear un nuevo repositorio.
1. Agrega como nombre al repositorio "piramide_de_asteriscos".
1. Te redirigirá a una nueva página en donde te apareceran dos cuadros con comandos; elige los comandos del segundo cuadro y cópialos. Los comandos deberían verse algo asi:
    ```
    git remote add origin https://github.com/tu_nombre_de_usuario/piramide_de_asteriscos.git
    git push -u origin main
    ```
1. Pega los comandos en la terminal de Visual Studio Code y espera a que se terminen de procesar.
1. Dirígete a GitHub. Tu repositorio ahora esta disponible en el repositorio remoto. Opcionalmente puedes agregar un archivo `README.md` para describir tu proyecto.

## 7. Conclusiones
- **Visual Studio Code** es un editor de código ligero, flexible, personalizable de código abierto y multilenguaje desarrollado por Microsoft.
- Es minimalista, y fácil de usar para principiantes.
- Es multiplataforma, estando disponible en Windows, MacOS y Linux, sin embargo, necesita de un procesador de 1.6 GHz o más y al menos 1 GB de RAM.
- Soporta casi cualquier lenguaje (JavaScript, Python, Java, C, C++, PHP, C#, TypeScript, HTML, CSS, YAML y Markdown) pero está principalmente enfocado para el desarrollo web (HTML, CSS y JavaScript, además de usu frameworks).
- Las extensiones son la clave de su versatilidad, ligereza y capacidad de funcionar con múltiples lenguajes.
- Está integrado con Git y GitHub.