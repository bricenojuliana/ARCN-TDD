# Proyecto: FizzBuzz con TDD

## Descripción
Este proyecto implementa el clásico problema de FizzBuzz utilizando la metodología de **Desarrollo Guiado por Pruebas (TDD)** en **Java**. El desarrollo se llevó a cabo en **GitHub Codespaces**, aprovechando **JUnit** para la creación y ejecución de pruebas automatizadas.

## Tecnologías Utilizadas
- **Java** para la implementación del código.
- **JUnit 5** para las pruebas unitarias.
- **Maven** como herramienta de gestión de dependencias y automatización de compilación.
- **GitHub Codespaces** como entorno de desarrollo en la nube.

## Funcionalidad
La aplicación toma un número entero y devuelve:
- "Fizz" si el número es múltiplo de 3.
- "Buzz" si el número es múltiplo de 5.
- "FizzBuzz" si es múltiplo de ambos.
- El número como cadena de texto si no es múltiplo de ninguno.

## Estructura del Proyecto
```
 ARCN-TDD/
 ├── src/
 │   ├── main/
 │   │   └── java/
 │   │       └── FizzBuzz.java  # Implementación de la lógica
 │   ├── test/
 │   │   └── java/
 │   │       └── FizzBuzzTest.java  # Pruebas unitarias con JUnit
 ├── pom.xml  # Configuración de Maven y dependencias
 ├── README.md  # Documentación del proyecto
```

## Ejecución
Para ejecutar las pruebas, usa el siguiente comando en la terminal:
```bash
mvn test
```
Esto validará que la implementación cumple con los criterios definidos en las pruebas unitarias.
