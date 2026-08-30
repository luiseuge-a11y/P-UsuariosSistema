# Usuarios de un Sistema en Línea

Programa en Java que modela una clase `Usuario` para representar los usuarios de un sistema en línea, junto con una clase auxiliar que administra una tabla con los objetos creados.

## Descripción

El proyecto define una clase `Usuario` con atributos y acciones típicas de una cuenta en un sistema en línea (inicio de sesión, cierre de sesión, cambio de contraseña, actualización de correo, etc.). A partir de esa clase se crean 10 objetos, los cuales son almacenados por una segunda clase (`TablaUsuarios`) en una tabla interna. Finalmente, el `Main` imprime en consola la tabla con los atributos de los 10 usuarios creados.

## Estructura del proyecto

```
proyecto/
└── src/
    ├── Usuario.java          # Clase principal: atributos, constructor y acciones
    ├── TablaUsuarios.java    # Clase que guarda los objetos en una tabla y la imprime
    └── Main.java             # Punto de entrada: crea los 10 objetos y muestra la tabla
```

## Clase `Usuario`

**Atributos (6):**
| Atributo   | Tipo    | Descripción                          |
|------------|---------|---------------------------------------|
| username   | String  | Nombre de usuario                     |
| email      | String  | Correo electrónico                    |
| password   | String  | Contraseña                            |
| edad       | int     | Edad del usuario                      |
| rol        | String  | Rol dentro del sistema (Cliente, Administrador, Soporte) |
| activo     | boolean | Indica si la sesión está activa       |

**Constructor:** recibe `username`, `email`, `password`, `edad` y `rol`; el atributo `activo` inicia en `false` por defecto.

**Acciones (5):**
1. `iniciarSesion()` — activa la sesión del usuario.
2. `cerrarSesion()` — desactiva la sesión del usuario.
3. `cambiarPassword(String nuevaPassword)` — actualiza la contraseña.
4. `actualizarEmail(String nuevoEmail)` — actualiza el correo electrónico.
5. `mostrarInfo()` — imprime los datos del usuario en consola.

## Clase `TablaUsuarios`

- `guardarUsuarios(Usuario[] usuarios)`: recibe el arreglo de objetos `Usuario` creados en el `Main` y los guarda en la tabla interna.
- `imprimirTabla()`: imprime en consola una tabla con los atributos de todos los usuarios guardados.

## Clase `Main`

Crea 10 objetos `Usuario`, prueba algunas de sus acciones, los agrupa en un arreglo, los envía a `TablaUsuarios` y, al final, imprime la tabla completa en consola.

## Cómo ejecutar

1. Abrir el proyecto en IntelliJ IDEA (**File → Open** y seleccionar la carpeta `proyecto`).
2. Abrir `Main.java`.
3. Ejecutar con el botón ▶ o `Shift + F10` (Windows/Linux) / `Ctrl + R` (Mac).

También se puede ejecutar desde la terminal, dentro de la carpeta `src`:

```bash
javac Usuario.java TablaUsuarios.java Main.java
java Main
```

## Requisitos cumplidos

- [x] La clase `Usuario` tiene al menos 6 atributos.
- [x] La clase `Usuario` tiene al menos 5 acciones (métodos).
- [x] La clase `Usuario` tiene 1 constructor.
- [x] Se crean 10 objetos a partir de la clase `Usuario`.
- [x] Existe una clase (`TablaUsuarios`) con un método que recibe los objetos creados y los guarda en una tabla.
- [x] Al final del `Main` se imprime la tabla con los atributos de los 10 objetos creados.

## Integrantes

- Badillo Mondragón José Alberto — BM26520034
- Luis Eugenio Jiménez Rodríguez — BM26520628
- Kelly Alexandra Guillén — BM26520568
- Luis Fernando Prieto Alfonzo — BM26520482
- José Ramiro Alvarez — BM26520446
