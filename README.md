# 🧮 Calculadora en Java

Aplicación de consola desarrollada en **Java** como proyecto práctico para repasar y reforzar los fundamentos del lenguaje.

El programa permite realizar operaciones matemáticas básicas mediante un menú interactivo y utiliza métodos independientes para organizar la lógica de la aplicación.

---

## 📌 Descripción

Esta aplicación implementa una calculadora que permite realizar las siguientes operaciones:

* Suma
* Resta
* Multiplicación
* División

El usuario interactúa con el programa desde la consola mediante un menú. La aplicación permanece ejecutándose hasta que se selecciona la opción de salida.

Como parte de la implementación, se incorporan validaciones para controlar opciones inválidas, entradas no numéricas y divisiones entre cero.

---

## 🎯 Objetivos del Proyecto

Este proyecto fue desarrollado principalmente para:

* Repasar los fundamentos de Java.
* Practicar la entrada de datos mediante `Scanner`.
* Trabajar con métodos y parámetros.
* Utilizar estructuras de control.
* Practicar el manejo de excepciones.
* Reforzar el uso de `switch`.
* Aplicar validaciones básicas en una aplicación de consola.
* Familiarizarse nuevamente con características modernas del lenguaje Java.

---

## 🚀 Características

* Menú interactivo en consola.
* Operaciones de suma, resta, multiplicación y división.
* Uso de números decimales mediante `double`.
* Ejecución continua mediante un ciclo `while`.
* Validación de opciones del menú.
* Manejo de excepciones mediante `try-catch`.
* Validación para evitar la división entre cero.
* Métodos independientes para organizar la funcionalidad.

---

## 🛠️ Tecnologías Utilizadas

* **Java**
* `Scanner`
* `while`
* `if / else`
* `switch`
* `try / catch`
* Métodos estáticos
* `double`
* Text Blocks
* Lambda-style switch cases (`case ->`)

---

## 📂 Estructura del Proyecto

```text
calculadora-java/
│
├── CalculadoraApp.java
└── README.md
```

### `CalculadoraApp.java`

Contiene la clase principal de la aplicación, el menú y los métodos encargados de ejecutar las operaciones matemáticas.

---

## ⚙️ Requisitos

Para ejecutar el proyecto necesitas tener instalado:

* Java Development Kit (JDK)
* Un entorno de desarrollo compatible con Java o una terminal.

La implementación utiliza características modernas del lenguaje como **Text Blocks** y la sintaxis `case ->`, por lo que se recomienda utilizar una versión moderna de Java.

---

## ▶️ Ejecución

### 1. Clonar el repositorio

```bash
git clone https://github.com/Anthony140823/Proyecto-Calculadora---Java.git
```

### 2. Acceder al proyecto

```bash
cd calculadora-java
```

### 3. Compilar

```bash
javac CalculadoraApp.java
```

### 4. Ejecutar

```bash
java CalculadoraApp
```

---

## 💻 Uso

Al iniciar la aplicación se mostrará el menú:

```text
**** Aplicacion Calculadora ****

1. Suma
2. Resta
3. Multiplicación
4. División
5. Salir

Ingrese una opcion:
```

El usuario selecciona una operación e introduce los dos operandos.

### Ejemplo de suma

```text
Ingrese una opcion: 1

Proporciona valor de operando1: 15
Proporciona valor de operando2: 8

Resultado Suma: 23.0
```

### Ejemplo de división entre cero

```text
Ingrese una opcion: 4

Proporciona valor de operando1: 10
Proporciona valor de operando2: 0

No es posible dividir entre zero!
```

---

## 🧠 Conceptos Aplicados

### Entrada de datos

Se utiliza `Scanner` para recibir información desde la consola:

```java
Scanner sc = new Scanner(System.in);
```

Los valores introducidos por el usuario se leen como texto y posteriormente se convierten al tipo correspondiente mediante métodos como:

```java
Integer.parseInt()
Double.parseDouble()
```

### Métodos

La aplicación separa determinadas responsabilidades mediante métodos:

```java
private static void mostrarMenu()
```

y

```java
private static void ejecutarOperacion(int opcion, Scanner sc)
```

Esto permite mantener el método `main()` más organizado.

### Estructura `switch`

Las operaciones se seleccionan mediante la sintaxis moderna de `switch`:

```java
switch (opcion) {
    case 1 -> {
        // Suma
    }
    case 2 -> {
        // Resta
    }
    case 3 -> {
        // Multiplicación
    }
    case 4 -> {
        // División
    }
}
```

### Manejo de excepciones

El programa utiliza `try-catch` para controlar errores producidos durante la conversión de los valores introducidos por el usuario:

```java
try {
    // Procesamiento de datos
}
catch (Exception e) {
    System.out.println("Ocurrio un error: " + e.getMessage());
}
```

### Validación de división

Antes de realizar una división se verifica que el segundo operando no sea cero:

```java
if (operando2 == 0) {
    System.out.println("No es posible dividir entre zero!");
}
```

---

## 📚 Aprendizajes

Este proyecto permitió repasar y consolidar conocimientos fundamentales de Java, especialmente:

* Sintaxis básica del lenguaje.
* Clases y métodos.
* Modificadores de acceso.
* Métodos `static`.
* Entrada de datos con `Scanner`.
* Conversión de tipos.
* Variables de tipo `double`.
* Ciclos `while`.
* Condicionales.
* `switch` moderno.
* Manejo de excepciones.
* Validación de datos.
* Organización de una aplicación de consola.

Además, el proyecto permitió practicar nuevamente Java después de haber trabajado previamente con Python, reforzando la capacidad de trasladar conceptos de programación entre diferentes lenguajes.

---

## 🔮 Mejoras Futuras

Algunas mejoras que podrían implementarse en futuras versiones:

* Separar la lógica matemática en una clase independiente.
* Crear una clase `Calculadora` aplicando Programación Orientada a Objetos.
* Utilizar excepciones más específicas en lugar de `catch (Exception)`.
* Crear métodos independientes para cada operación.
* Agregar nuevas operaciones matemáticas.
* Implementar historial de operaciones.
* Crear pruebas unitarias con JUnit.
* Incorporar una interfaz gráfica.
* Mejorar la validación de datos introducidos por el usuario.

---

## 👨‍💻 Autor

**Anthony JeanPaul Reyes Risco**

Desarrollador de software en formación, enfocado en fortalecer sus habilidades mediante proyectos prácticos y el aprendizaje continuo de diferentes tecnologías.

---

## 📄 Licencia

Este proyecto fue desarrollado con fines educativos y forma parte de mi portafolio personal de aprendizaje en Java.
