# 🧪 Calculadora - Proyecto de Pruebas con JaCoCo

Este repositorio contiene pruebas unitarias para la clase `Calculadora` escritas en **JUnit 5**, incluyendo técnicas avanzadas como **Hamcrest**, **Assumptions**, pruebas parametrizadas y cobertura de código con **JaCoCo**.

## 📦 Estructura del Proyecto

- src/main/java/Calculadora.java  
- src/test/java/CalculadoraTest.java

## 🛠 Tecnologías Usadas

- Java 17+  
- JUnit 5  
- Hamcrest Matchers  
- JaCoCo (Java Code Coverage)  
- Maven

## 📋 Cobertura con JaCoCo

Se utiliza **JaCoCo** para medir qué partes del código están cubiertas por los tests.

Configuración mínima del plugin:

- Plugin: jacoco-maven-plugin  
- Versión: 0.8.10  
- Fases: `prepare-agent` y `verify`

Para generar el reporte:

1. Ejecuta `mvn clean verify`  
2. El reporte se encuentra en `target/site/jacoco/index.html`

## 🧪 Tipos de Pruebas Incluidas

- `assertEquals` para validación directa  
- `assertTrue` para verificaciones booleanas  
- `Assumptions` para condiciones simuladas  
- `Hamcrest` para expresividad en comparaciones  
- `ParameterizedTest` con múltiples datos de entrada  
- Pruebas de excepción, como división por cero

## 🚀 Cómo Ejecutar

Desde la terminal, ejecuta: `mvn clean test`

## 🎯 Objetivos del Proyecto

- Validar operaciones: suma, resta, multiplicación, división  
- Simular condiciones externas  
- Asegurar cobertura contra errores  
- Medir cobertura total  
- Identificar métodos no testeados

## 📈 Cobertura Esperada

- Objetivo: 90%+  
- Métodos cubiertos: sumar, restar, dividir, multiplicar, esPar  
- Casos negativos: división por cero, números impares

## 👨‍🔬 Autor

Proyecto desarrollado por **Mauricio**, con enfoque en claridad semántica, buenas prácticas de testing y organización modular.

