public class Main {

    // Formato y colores
    public static final String RESET = "\u001B[0m";
    public static final String FONDO_AMARILLO = "\u001B[43m";
    public static final String TEXTO_NEGRO = "\u001B[30m";

    // Colores para cada usuario
    public static final String CYAN = "\u001B[36m";
    public static final String VERDE = "\u001B[32m";
    public static final String AMARILLO = "\u001B[33m";
    public static final String AZUL = "\u001B[34m";
    public static final String PURPURA = "\u001B[35m";
    public static final String ROJO = "\u001B[31m";
    public static final String BLANCO_BRILLANTE = "\u001B[97m";
    public static final String CYAN_BRILLANTE = "\u001B[96m";
    public static final String VERDE_BRILLANTE = "\u001B[92m";
    public static final String AMARILLO_BRILLANTE = "\u001B[93m";

    public static void main(String[] args) {

        // Marco superior
        mostrarEncabezado();

        // Objetos de la clase Usuario
        Usuario u1 = new Usuario("Kelly", "kelly@gmail.com", 22, "Cliente", true, 150.00);
        Usuario u2 = new Usuario("Luis", "luis@tienda.com", 35, "Administrador", true, 1200.50);
        Usuario u3 = new Usuario("Alberto", "alberto@aol.com", 23, "Cliente", true, 45.00);
        Usuario u4 = new Usuario("Eugenio", "eugenio@aol.com", 26, "Cliente", false, 0.00);
        Usuario u5 = new Usuario("Ramiro", "rams@aol.com", 25, "Cliente", true, 500.00);
        Usuario u6 = new Usuario("Invitado", "invitado@mail.com", 18, "Invitado", false, 0.00);
        Usuario u7 = new Usuario("Sofia", "sofia@gmail.com", 29, "Soporte", true, 320.75);
        Usuario u8 = new Usuario("Carlos", "carlos@out.com", 40, "Cliente", true, 890.10);
        Usuario u9 = new Usuario("Elena", "elena@tech.com", 31, "Administrador", true, 2100.00);
        Usuario u10 = new Usuario("Mateo", "mateo@mail.com", 20, "Cliente", false, 15.25);

        // Se agrupan los usuarios en arreglos
        Usuario[] listaUsuarios = {u1, u2, u3, u4, u5, u6, u7, u8, u9, u10};
        String[] listaColores = {
                CYAN, VERDE, AMARILLO, AZUL, PURPURA,
                ROJO, BLANCO_BRILLANTE, CYAN_BRILLANTE, VERDE_BRILLANTE, AMARILLO_BRILLANTE
        };

        // Imprimir las tarjetas individuales de cada usuario
        for (int i = 0; i < listaUsuarios.length; i++) {
            imprimirUsuario(listaUsuarios[i], listaColores[i]);
        }

        // Se pasan los objetos y la lista de colores al gestor de la tabla
        GestorUsuarios gestor = new GestorUsuarios();
        gestor.guardarEnTabla(listaUsuarios, listaColores);

        // Imprimir la tabla
        gestor.imprimirTabla();
    }

    public static void mostrarEncabezado() {
        String linea1 = "  Tarea de Introduccion a la programacion  ";
        String linea2 = "Programa de cuentas de usuario para una app en linea";

        System.out.println(FONDO_AMARILLO + TEXTO_NEGRO + "┌──────────────────────────────────────────────────────────────┐" + RESET);
        System.out.println(FONDO_AMARILLO + TEXTO_NEGRO + "│" + centrarTexto(linea1, 62) + "│" + RESET);
        System.out.println(FONDO_AMARILLO + TEXTO_NEGRO + "│" + centrarTexto(linea2, 62) + "│" + RESET);
        System.out.println(FONDO_AMARILLO + TEXTO_NEGRO + "└──────────────────────────────────────────────────────────────┘" + RESET);
        System.out.println();
    }

    public static void imprimirUsuario(Usuario u, String color) {
        System.out.println(color + "------------<0>----------------");
        System.out.println("Usuario: " + u.nombreUsuario);
        System.out.println("Correo:  " + u.correo);
        System.out.println("Edad:    " + u.edad + " años");
        System.out.println("Rol:     " + u.rol);
        System.out.println("Estado:  " + (u.estaActivo ? "Activo" : "Inactivo"));
        System.out.printf("Saldo:   $%.2f%n", u.saldo);
        System.out.println("--------------------------------" + RESET);
    }

    // Centra un texto dentro de un ancho de columna determinado, rellenando con espacios
    public static String centrarTexto(String texto, int ancho) {
        int espacios = ancho - texto.length();
        int izquierda = espacios / 2;
        int derecha = espacios - izquierda;
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < izquierda; i++) sb.append(" ");
        sb.append(texto);
        for (int i = 0; i < derecha; i++) sb.append(" ");
        return sb.toString();
    }
}
