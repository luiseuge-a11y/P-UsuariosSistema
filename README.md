# Usuarios de un Sistema en Línea

Programa en Java que modela una clase `Usuario` para representar los usuarios de un sistema en línea, junto con una clase auxiliar que administra una tabla con los objetos creados, e imprime tanto tarjetas individuales como una tabla general en consola con colores ANSI.

## Descripción

El proyecto define una clase `Usuario` con atributos y acciones típicas de una cuenta en un sistema en línea (inicio de sesión, cierre de sesión, cambio de correo, recarga de saldo, cambio de estado). A partir de esa clase se crean 10 objetos, cada uno mostrado en una tarjeta individual con un color distinto en consola. Después, una segunda clase (`GestorUsuarios`) recibe esos objetos y los guarda en una tabla interna, la cual se imprime al final del programa manteniendo el color asignado a cada usuario.

## Estructura del proyecto

## Clase `Usuario`

**Atributos (6):**
| Atributo      | Tipo    | Descripción                          |
|---------------|---------|---------------------------------------|
| nombreUsuario | String  | Nombre de usuario                     |
| correo        | String  | Correo electrónico                    |
| edad          | int     | Edad del usuario                      |
| rol           | String  | Rol dentro del sistema (Cliente, Administrador, Soporte, Invitado) |
| estaActivo    | boolean | Indica si la cuenta está activa       |
| saldo         | double  | Saldo disponible del usuario          |

**Constructor:** recibe los 6 atributos como parámetros.

**Acciones (5):**
1. `iniciarSesion()` — imprime que el usuario inició sesión.
2. `cerrarSesion()` — imprime que el usuario cerró sesión.
3. `cambiarCorreo(String nuevoCorreo)` — actualiza el correo electrónico.
4. `recargarSaldo(double monto)` — suma un monto al saldo actual.
5. `cambiarEstado(boolean nuevoEstado)` — activa o desactiva la cuenta.

## Clase `GestorUsuarios`

- `guardarEnTabla(Usuario[] usuarios, String[] colores)`: recibe el arreglo de objetos `Usuario` y sus colores asignados, y los guarda en la tabla interna.
- `imprimirTabla()`: imprime en consola una tabla general con los atributos de todos los usuarios guardados, respetando el color asignado a cada fila.

## Clase `Main`

Crea 10 objetos `Usuario`, les asigna un color distinto a cada uno, imprime una tarjeta individual por usuario, los agrupa en un arreglo, los envía a `GestorUsuarios` y, al final, imprime la tabla general completa en consola.

## Cómo ejecutar

1. Abrir el proyecto en IntelliJ IDEA.
2. Abrir `Main.java`.
3. Ejecutar con el botón ▶ o `Shift + F10` (Windows/Linux) / `Ctrl + R` (Mac).

También se puede ejecutar desde la terminal, dentro de la carpeta `src`:

```bash
javac Usuario.java GestorUsuarios.java Main.java
java Main
```

> Nota: los colores en consola usan códigos ANSI; se ven correctamente en la terminal de IntelliJ y en la mayoría de terminales modernas.

## Requisitos cumplidos

- [x] La clase `Usuario` tiene al menos 6 atributos.
- [x] La clase `Usuario` tiene al menos 5 acciones (métodos).
- [x] La clase `Usuario` tiene 1 constructor.
- [x] Se crean 10 objetos a partir de la clase `Usuario`.
- [x] Existe una clase (`GestorUsuarios`) con un método que recibe los objetos creados y los guarda en una tabla.
- [x] Al final del `Main` se imprime la tabla con los atributos de los 10 objetos creados.

## Integrantes

- Badillo Mondragón José Alberto — BM26520034
- Luis Eugenio Jiménez Rodríguez — BM26520628
- Kelly Alexandra Guillén — BM26520568
- Luis Fernando Prieto Alfonzo — BM26520482
- José Ramiro Alvarez — BM26520446
