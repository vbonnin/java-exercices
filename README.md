# java-exercices

### NotasAlumnos
La información académica de los alumnos de una determinada asignatura se encuentra almacenada en una matriz. Cada fila de la matriz guarda las notas del alumno, las dos siguientes la nota de los exámenes de teoría y el siguiente la nota del examen de prácticas. La nota final se calcula de la siguiente forma: NF = 40% Teoría + 60% Práctica.

Realiza un programa en el que definas una matriz como la anterior y muestre para cada alumno si ha aprobado o suspendido la asignatura.

### CuentaBancaria
Crea una clase llamada Cuenta para modelar cuentas bancarias.

Tendrá los siguientes atributos: titular y cantidad (puede tener decimales).

Definir un contructor sin parámetros y un constructor con el titular como parámetro.

Definir los siguientes métodos:
* ingresar(cantidad): se ingresa una cantidad a la cuenta, si la cantidad introducida es negativa, no se hará nada.
* retirar(cantidad): se retira una cantidad a la cuenta, si restando la cantidad actual a la que nos pasan es negativa, la cantidad de la cuenta pasa a ser 0.

En el programa principal, instanciar dos cuentas y probar sus atributos y métodos asociados.

### GestionDeLibros
Crear una clase Libro que contenga los siguientes atributos: isbn, titulo, autor y número de páginas.

Crear sus respectivos métodos getter y setter correspondientes para cada atributo. Crear el método toString para mostrar la información relativa al libro con el siguiente formato:
* "El libro con ISBN creado por el autor tiene páginas"

En el programa principal, crear un array de 3 libros. Mostrar la información de cada libro y cúal de ellos tiene más páginas.

### PruebaEmpleado
En este programa uso por primera vez los métodos de composición.
Se le añadira a la clase empleado una nacionalidad a través de otra clase creada con el metodo de composición.
