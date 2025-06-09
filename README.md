# 🧩 S401_Introduccio_a_Spring
Primer contacto con Spring Boot, proyectos REST, gestión de dependencias con Maven y Gradle, y pruebas de endpoints usando Postman.

## 📌 Enunciado general
La tarea se divide en 3 niveles (clica en la flecha ▸ para ver los detalles):

<details> <summary><strong>🧱 Nivel 1 - Crear una API REST con Spring Boot usando Maven</strong></summary>
   
<br>**Proyecto generado desde Spring Initializr:**

- Puerto configurado: `9000`  
- Dependencias: `Spring Web`, `Spring Boot DevTools`

**Controlador:** `HelloWorldController.java`
- `/hello-world1` → `@RequestParam(name = "name", defaultValue = "UNKNOWN")`
- `/hello-world2/{name}` → `@PathVariable(name = "name", required = false)`
- `/hello-world3?name=X&age=Y` → parámetros combinados

**Comandos Maven usados:**
```bash
mvn compile
mvn package
mvn clean
mvn spring-boot:run
```    
**Pruebas realizadas:**

- http://localhost:9000/hello-world1?name=Jose
- http://localhost:9000/hello-world1
- http://localhost:9000/hello-world2/Jose
- http://localhost:9000/hello-world2
- http://localhost:9000/hello-world3?name=Jose&age=41
- http://localhost:9000/hello-world3
    
</details>
<details> <summary><strong>⚙️ Nivel 2 - Crear una API REST con Spring Boot usando Gradle</strong></summary>

<br>**Proyecto generado desde Spring Initializr:**

- Puerto configurado: `9001`  
- Dependencias: Spring Web, Spring Boot DevTools

**Controlador: `HelloWorldController.java`**

- `/hello-world1` → `@RequestParam(name = "name", defaultValue = "UNKNOWN")`  
- `/hello-world2/{name}` → `@PathVariable(name = "name", required = false)`  
- `/hello-world3?name=X&age=Y` → parámetros combinados con valores por defecto

**Comandos Gradle usados:**
```bash
gradle build
gradle assemble
gradle clean
gradle bootRun
```
    
**Pruebas realizadas:**

  - http://localhost:9001/hello-world1?name=Jose
  - http://localhost:9001/hello-world1
  - http://localhost:9001/hello-world2/Jose
  - http://localhost:9001/hello-world2
  - http://localhost:9001/hello-world3?name=Jose&age=41
  - http://localhost:9001/hello-world3
    
</details>
<details> <summary><strong>🧪 Nivel 3 - Entornos en Postman</strong></summary>

<br>**Se crearon dos entornos en Postman:**

🔹 **Entorno Maven**

- `{{server}}` = `http://localhost`  
- `{{port}}` = `9000`

🔹 **Entorno Gradle**

- `{{server}}` = `http://localhost`  
- `{{port}}` = `9001`

**Acciones realizadas:**

- Se exportaron ambos entornos en formato `.json` y se adjuntan como parte de la entrega.  
- Se realizaron capturas de pantalla de cada entorno mostrando el uso de las variables.

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

## 🔧 Instalación y ejecución de Niveles 1 y 2

1. **Clonar el repositorio**

```bash
   git clone https://github.com/Jusep1983/S401_Introduccio_a_Spring.git
   cd S401_Introduccio_a_Spring
```
2. Arrancar el proyecto Maven (Nivel 1)

```bash
cd S04T01N01/S04T01N01
mvn clean spring-boot:run
```
El servidor se iniciará en http://localhost:9000

3. Arrancar el proyecto Gradle (Nivel 2)

```bash
cd S04T01N02/S04T01N02
gradle clean bootRun
```
El servidor se iniciará en http://localhost:9001

## 🔧 Pruebas con Postman (Nivel 3)

Importa los entornos:

- S04T01N03/postman/environments/maven_environment.json

- S04T01N03/postman/environments/gradle_environment.json

Selecciona el entorno correspondiente en Postman (Maven o Gradle)

Envía las alguna de las siguientes peticiones:

```bash
http://localhost:9000/hello-world1?name=Jose
http://localhost:9000/hello-world1
http://localhost:9000/hello-world2/Jose
http://localhost:9000/hello-world2
http://localhost:9000/hello-world3?name=Jose&age=41
http://localhost:9000/hello-world3
http://localhost:9001/hello-world1?name=Jose
http://localhost:9001/hello-world1
http://localhost:9001/hello-world2/Jose
http://localhost:9001/hello-world2
http://localhost:9001/hello-world3?name=Jose&age=41
http://localhost:9001/hello-world3
    
```
Observa las respuestas (si no pasas parámetros, devuelve "UNKNOWN")


## 📂 Estructura del proyecto

```plaintext
S401_Introduccio_a_Spring
├── S04T01N01               # Nivel 1 - Proyecto Maven
│   └── S04T01N01
│       └── src
│           └── main
│               └── java
│                   └── cat.itacademy.s04.t01.n01
│                       └── controller
│                           └── HelloWorldController.java
├── S04T01N02               # Nivel 2 - Proyecto Gradle
│   └── S04T01N02
│       └── src
│           └── main
│               └── java
│                   └── cat.itacademy.s04.t01.n02
│                       └── controller
│                           └── HelloWorldController.java
└── S04T01N03               # Nivel 3 - Entornos Postman
    └── postman
        └── environments
            ├── maven_environment.json
            └── gradle_environment.json
```

