# Pruebas proyecto Maven y Pruebas API Spring Boot

## Comandos Maven esenciales

- Compilar el proyecto  

  
    mvn compile


- Limpiar el proyecto (borra target y archivos compilados)


    mvn clean


- Empaquetar (genera el JAR)


    mvn package

- Ejecutar la aplicación desde el JAR


    java -jar target/S04T01N01-0.0.1-SNAPSHOT.jar

- Ejecutar la aplicación con Maven (sin generar JAR)


    mvn spring-boot:run

- Parar la aplicación que corre con mvn spring-boot:run: 

  Pulsa Ctrl+C y confirma con S si te pregunta en Windows.


## Pruebas API REST

Las URLs para probar tu controlador HelloWorldController son:

- Con parámetro name como query param (default "UNKNOWN")

http://localhost:9000/hello-world1?name=Jose

http://localhost:9000/hello-world1

- Con parámetro name como path variable (opcional, default "UNKNOWN")

http://localhost:9000/hello-world2/Jose

http://localhost:9000/hello-world2

- Con parámetros name y age como query params (default "UNKNOWN")

http://localhost:9000/hello-world3?name=Jose&age=41

http://localhost:9000/hello-world3
