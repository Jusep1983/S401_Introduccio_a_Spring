# 🧩 S401_Introduccio_a_Spring
Primer contacto con Spring Boot, proyectos REST, gestión de dependencias con Maven y Gradle, y pruebas de endpoints usando Postman.

## 📌 Enunciado general
La tarea se divide en 3 niveles (clica en la flecha ▸ para ver los detalles):

<details> <summary><strong>🧱 Nivel 1: Crear una API REST con Spring Boot usando Maven</strong></summary>
Configuración:

Proyecto generado desde Spring Initializr: 

  - Puerto configurado: 9000
  
  - Dependencias: Spring Web, Spring Boot DevTools
    
Controlador: HelloWorldController.java
    
    /hello-world1 → @RequestParam(name = "name", defaultValue = "UNKNOWN")
    
    /hello-world2/{name} → @PathVariable(name = "name", required = false)
    
    /hello-world3?name=X&age=Y → parámetros combinados

Comandos Maven usados:

    mvn compile
    mvn package
    mvn clean
    mvn spring-boot:run
    
Pruebas realizadas:

- http://localhost:9000/hello-world1?name=Jose
- http://localhost:9000/hello-world1
- http://localhost:9000/hello-world2/Jose
- http://localhost:9000/hello-world2
- http://localhost:9000/hello-world3?name=Jose&age=41
- http://localhost:9000/hello-world3
    
</details>
<details> <summary><strong>⚙️ Nivel 2 - Crear una API REST con Spring Boot usando Gradle</strong></summary>
Configuración:

Proyecto generado desde Spring Initializr:

- Puerto configurado: 9001

- Dependencias: Spring Web, Spring Boot DevTools

Controlador: HelloWorldController.java
  
    /hello-world1 → @RequestParam(name = "name", defaultValue = "UNKNOWN")
    
    /hello-world2/{name} → @PathVariable(name = "name", required = false)
    
    /hello-world3?name=X&age=Y → parámetros combinados con valores por defecto

Comandos Gradle usados:

    gradle build
    gradle assemble
    gradle clean
    gradle bootRun
    
Pruebas realizadas:

  - http://localhost:9001/hello-world1?name=Jose
  - http://localhost:9001/hello-world1
  - http://localhost:9001/hello-world2/Jose
  - http://localhost:9001/hello-world2
  - http://localhost:9001/hello-world3?name=Jose&age=41
  - http://localhost:9001/hello-world3
    
</details>
<details> <summary><strong>🧪 Nivel 3 - Entornos en Postman</strong></summary>
Se crearon dos entornos en Postman:

Entorno Maven

{{server}} = http://localhost

{{port}} = 9000

Entorno Gradle

{{server}} = http://localhost

{{port}} = 9001

Se exportaron ambos entornos en formato .json y se adjuntan como parte de la entrega.

Se realizaron capturas de pantalla de cada entorno mostrando el uso de las variables.

</details>

## 🛠️ Tecnologías utilizadas
- Java  21.0.5

- Spring Boot 3.5.0

- Gradle 8.14.2

- Apache Maven 3.9.10

- Postman

- IntelliJ IDE

## ✅ Requisitos previos
- Tener Maven y Gradle instalados y configurados.

- Tener Java 11+

- Tu IDE configurado para importar proyectos Maven y Gradle.

## 📂 Estructura del proyecto

    src
    └── main
        └── java
            └── cat.itacademy.s04.t01.n01  # o n02 en Gradle
                └── controller
                    └── HelloWorldController.java
