1. Descargar el Repositorio de GitHub
Opción A: Descargar como ZIP
Abre el navegador y ve al repositorio de GitHub (en este caso ya nos encontramos en el repositorio).

Haz clic en el botón verde "Code" y selecciona "Download ZIP".

Extrae el archivo ZIP en una carpeta fácil de encontrar 

Opción B: Usar Git (recomendado para actualizaciones)
Instala Git desde git-scm.com (siguiente, siguiente… hasta finalizar).

Abre Git Bash (Windows) o Terminal (macOS/Linux).

Ejecuta:

bash
git clone https://github.com/tu-usuario/tu-repositorio.git
cd tu-repositorio
2. Instalar Java (requisito para BlueJ)
Windows/macOS/Linux:
Descarga Java JDK 11+ desde Oracle o OpenJDK.

Ejecuta el instalador y sigue los pasos.

Verifica la instalación:

Abre Terminal (macOS/Linux) o CMD (Windows).

Ejecuta:

bash
java -version
Debe mostrar la versión instalada (ej: openjdk 17.0.1).

3. Instalar BlueJ
Descarga BlueJ desde bluej.org.

Windows:

Ejecuta el instalador .exe y sigue los pasos.

macOS:

Arrastra BlueJ a la carpeta Applications.

Linux:

Descomprime el archivo .tar.gz y ejecuta ./bluej en la terminal.

4. Abrir el Proyecto en BlueJ
Inicia BlueJ.

Haz clic en "Project" > "Open Project".

Navega hasta la carpeta donde descargaste el repositorio (ej: C:\BlueJ-Projects\tu-repositorio).

Selecciona la carpeta del proyecto (debe contener archivos .bluej).

5. Compilar y Ejecutar el Código
Compila todas las clases:

Haz clic en el botón "Compile" en la esquina superior izquierda de BlueJ.

Ejecuta el programa:

Haz clic derecho en la clase Main (o la clase principal).

Selecciona void main(String[] args).

Haz clic en "OK".

6. Solucionar Problemas Comunes
Error: "Class not found"
Verifica que todas las clases estén en la misma carpeta del proyecto.

Revisa que los nombres de las clases coincidan exactamente (Java distingue mayúsculas/minúsculas).

Error: "Java not installed"
Asegúrate de que Java JDK esté instalado correctamente (paso 2).

En BlueJ, ve a "Tools" > "Preferences" > "Libraries" y selecciona la ruta de tu JDK.

Error en fechas o formatos
Si el código usa fechas, ingrésalas en el formato exacto especificado (ej: "2025-12-25 19:30").
