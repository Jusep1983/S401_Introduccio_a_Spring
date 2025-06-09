# Pruebas Comandos Básicos de Gradle

Para trabajar con Gradle en tu proyecto, asegúrate de que esté instalado y configurado correctamente en tu sistema.

Abre una terminal (desde tu IDE o desde la línea de comandos de Windows, Mac, Linux...) y navega al directorio raíz de tu proyecto.

## Comandos importantes

- **Compilar el proyecto**  


    gradle build

Este comando compila el proyecto y ejecuta las pruebas. Es el paso habitual para asegurarte de que todo está OK.

- **Empaquetar el proyecto**


    gradle assemble

Empaqueta el proyecto sin ejecutar pruebas, por ejemplo para generar archivos JAR.

- **Limpiar el proyecto**


    gradle clean

Elimina los archivos generados por compilaciones anteriores. Útil para limpiar antes de una nueva build.

- **Ejecutar la aplicación**


    gradle bootRun

Arranca la aplicación Spring Boot directamente desde Gradle, sin necesidad de hacer un build y ejecutar el JAR manualmente.

Recuerda siempre ejecutar estos comandos en la carpeta raíz del proyecto donde está el archivo build.gradle.

- **Ejemplo de URLs de tu controlador Spring Boot:**

http://localhost:9001/hello-world1?name=World

http://localhost:9001/hello-world2/World

http://localhost:9001/hello-world3?name=Jose&age=41

- **Si no pasas parámetros, se usan valores por defecto en tu controlador:**

http://localhost:9001/hello-world1

http://localhost:9001/hello-world2

http://localhost:9001/hello-world3

