public class Usuario {

    // Atributos de la clase (6 atributos)
    String username;
    String email;
    String password;
    int edad;
    String rol;
    boolean activo;

    // Constructor de la clase Usuario
    Usuario(String username, String email, String password, int edad, String rol){

        // 'this' se refiere al objeto que se está creando
        this.username = username;
        this.email = email;
        this.password = password;
        this.edad = edad;
        this.rol = rol;
        this.activo = false; // por defecto el usuario inicia desactivado (no ha iniciado sesión)
    }

    // Acciones (metodos) de la clase Usuario (5 acciones)

    // 1. Iniciar sesion
    void iniciarSesion(){
        this.activo = true;
        System.out.println(this.username + " ha iniciado sesion.");
    }

    // 2. Cerrar sesion
    void cerrarSesion(){
        this.activo = false;
        System.out.println(this.username + " ha cerrado sesion.");
    }

    // 3. Cambiar contrasena
    void cambiarPassword(String nuevaPassword){
        this.password = nuevaPassword;
        System.out.println(this.username + " actualizo su contrasena.");
    }

    // 4. Actualizar correo
    void actualizarEmail(String nuevoEmail){
        this.email = nuevoEmail;
        System.out.println(this.username + " actualizo su correo a " + this.email);
    }

    // 5. Mostrar informacion del usuario
    void mostrarInfo(){
        System.out.println("Usuario: " + this.username +
                " | Email: " + this.email +
                " | Edad: " + this.edad +
                " | Rol: " + this.rol +
                " | Activo: " + this.activo);
    }
}
