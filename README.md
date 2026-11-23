![Duoc UC](https://www.duoc.cl/wp-content/uploads/2022/09/logo-0.png)

# 🧠 Evaluación Sumativa Experiencia 2 – Programación Orientada a Objetos

## 👤 Autor del proyecto
- **Nombre completo:** Catalina García Santana
- **Sección:** PRY220
- **Carrera:** Analista Programador Computacional
- **Sede:** Duoc UC Online

---

## 📘 Descripción general del sistema
Este proyecto corresponde a la Evaluación Sumativa de la Experiencia 2 (Semana 5) de la asignatura *Programación Orientada a Objetos*. Se trata de un sistema desarrollado en Java para la empresa **Llanquihue Tour**, cuyo objetivo es automatizar la gestión y consulta de recorridos turísticos en la Región de Los Lagos.

El sistema procesa dinámicamente registros cargados desde un archivo plano (`guia.txt`) delimitado por punto y coma `;` mediante `BufferedReader`, almacena los datos en colecciones dinámicas (`ArrayList`) y permite realizar búsquedas y filtrados por tipo de tour a través de la consola.

---

## ⚙️ Conceptos Clave de POO Aplicados
* **Arquitectura Modular por Paquetes:** Separación clara de responsabilidades en paquetes `app`, `model`, `service`, `util` y `resources`.
* **Composición entre Clases:** La clase `Tour` contiene una instancia privada de la clase `Guia` (`private Guia guia;`), modelando una relación de composición directa entre las entidades.
* **Encapsulamiento:** Atributos privados con sus respectivos constructores, métodos getters, setters y sobrescritura del método `toString()`.
* **Manejo de Excepciones:** Control de lectura de archivos y parseo numérico con bloques `try-catch` (`IOException`, `NumberFormatException`).
* **Colecciones Dinámicas:** Gestión de datos en memoria utilizando la estructura `ArrayList`.
---
## 🧱 Estructura general del proyecto

```plaintext
📁 src/
├── app/         # Clase principal ejecutable del sistema (Main.java)
├── model/       # Clases de dominio del sistema (Tour.java, Guia.java)
├── service/     # Lógica de negocio, gestión de ArrayList y filtros (ServicioTour.java)
├── util/        # Utilidades de lectura de archivos planos con BufferedReader (LectorArchivos.java)
└── resources/   # Archivos planos de datos delimitados por punto y coma (guia.txt)
```
## 💻 Requisitos y Ejecución
- **Lenguaje:** Java (JDK 17 o superior)
- **IDE Recomendado:** Apache NetBeans / IntelliJ IDEA
- **Gestor de versiones:** Git / GitHub

### Pasos para ejecutar:
1. **Clonar o descargar el repositorio:**
```bash
git clone <>
```
# 📹 Video Explicativo
Enlace al video: []
