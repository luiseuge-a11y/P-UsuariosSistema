public class Main {
    public static void main(String[] args) {

        // Se crean 10 objetos a partir de una instancia de la clase Usuario
        Usuario user1 = new Usuario("jperez", "jperez@mail.com", "clave123", 25, "Cliente");
        Usuario user2 = new Usuario("mgomez", "mgomez@mail.com", "clave456", 31, "Cliente");
        Usuario user3 = new Usuario("lrivera", "lrivera@mail.com", "clave789", 28, "Administrador");
        Usuario user4 = new Usuario("acortes", "acortes@mail.com", "pass111", 22, "Cliente");
        Usuario user5 = new Usuario("dtorres", "dtorres@mail.com", "pass222", 35, "Soporte");
        Usuario user6 = new Usuario("cflores", "cflores@mail.com", "pass333", 19, "Cliente");
        Usuario user7 = new Usuario("rsalinas", "rsalinas@mail.com", "pass444", 40, "Administrador");
        Usuario user8 = new Usuario("vmendez", "vmendez@mail.com", "pass555", 27, "Cliente");
        Usuario user9 = new Usuario("hcastro", "hcastro@mail.com", "pass666", 33, "Soporte");
        Usuario user10 = new Usuario("nortiz", "nortiz@mail.com", "pass777", 24, "Cliente");

        // Se prueban algunas acciones de los objetos
        user1.iniciarSesion();
        user3.iniciarSesion();
        user3.cambiarPassword("nuevaClave000");
        user5.actualizarEmail("dtorres_nuevo@mail.com");
        user1.mostrarInfo();
        user1.cerrarSesion();

        // Se agrupan los 10 objetos en un arreglo para poder enviarlos a la tabla
        Usuario[] usuarios = {user1, user2, user3, user4, user5, user6, user7, user8, user9, user10};

        // Se crea la clase que administra la tabla y se le pasan los objetos creados
        TablaUsuarios tablaUsuarios = new TablaUsuarios(usuarios.length);
        tablaUsuarios.guardarUsuarios(usuarios);

        // Sentencia final: se imprime la tabla con los atributos de los 10 objetos creados
        tablaUsuarios.imprimirTabla();
    }
}
