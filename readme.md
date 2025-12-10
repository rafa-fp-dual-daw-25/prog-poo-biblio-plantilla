# 👤 Diaglogo con el cliente
Se quiere hacer un sistema de gestión de biblioteca. En la biblioteca puede haber libros y revistas. Ambas tendrán que tener un titulo, un año y un genero. El año no puede ser superior a la fecha actual. Los géneros solo pueden ser: - FICTION FANTASY, SCIENCE_FICTION, HISTORY, TECHNOLOGY, BIOGRAPHY, TECHNOLOGY y HISTORY.  
Se quiere también que se pueda visualizar cierta información con info(). De los libros se desea saber las el titulo y las páginas que tiene, en cambio, de las revistas interesa el titulo y su número. Un libro tendrá un isbn y páginas. Una revista tendrá número y frecuencia. La frecuencia podrá solo tomar estos valores: - WEEKLY, MONTHLY, QUARTERLY, ANNUAL.  
Además, los libros deberán de tener un autor. Un autor debe de tener un id, nombre, apellido y además su conjunto de libros escritos.



# 📚 Gestión de Biblioteca

Pequeño proyecto para gestionar una biblioteca con **libros**, **revistas** y **autores**.  
Incluye validaciones, tipos enumerados y una interfaz sencilla por consola.

---

## 🧩 Entidades del Sistema

### 📒 Item (clase abstracta)
- Título
- Año
- Género (enum)

📌 `info()` método abstracto.

### 📘 Libro
- ISBN
- Páginas
- Autor (obligatorio)

📌 `info()` muestra: **título** y **páginas**

---

### 📒 Revista
- Número
- Frecuencia (`WEEKLY`, `MONTHLY`, `QUARTERLY`, `ANNUAL`)

📌 `info()` muestra: **título** y **número**

---

### 👤 Autor
- ID
- Nombre
- Apellido


---

## 🎨 Géneros permitidos
- FICTION
- FANTASY
- SCIENCE_FICTION
- HISTORY
- TECHNOLOGY
- BIOGRAPHY
- TECHNOLOGY
- HISTORY

---

## ⚠️ Validaciones
- El año no puede superar el año actual → lanzar excepción.
- Frecuencia y género deben ser valores válidos de su enum.

---

## 🖥️ Menú del programa (main)

############################

Gestión Biblioteca

############################  
1 - Crear Libro/Revista  
2 - Crear Autor  
3 - Asignar Autor a un Libro  
4 - Ver todos los items disponibles  
5 - Ver todos los libros disponibles  
6 - Ver todos los libros de un autor  

---

## 🚀 Objetivo
Estructurar un pequeño sistema orientado a objetos, aplicando encapsulación, validación y uso de enums, ofreciendo una interfaz clara para gestionar elementos de la biblioteca.

