public class GestorUsuarios {
    private Usuario[] tablaUsuarios;
    private String[] coloresUsuarios; // Guarda el color de cada usuario

    public static final String RESET = "\u001B[0m";

    // Metodo que recibe los objetos y sus colores
    public void guardarEnTabla(Usuario[] usuarios, String[] colores) {
        this.tablaUsuarios = usuarios;
        this.coloresUsuarios = colores;
    }

    // Metodo que imprime la tabla manteniendo los colores individuales por fila
    public void imprimirTabla() {
        System.out.println("\n=========================================================================================================");
        System.out.println("                               TABLA GENERAL DE USUARIOS REGISTRADOS                                    ");
        System.out.println("=========================================================================================================");
        System.out.printf("%-5s %-12s %-25s %-6s %-15s %-10s %-10s%n", "ID", "NOMBRE", "CORREO", "EDAD", "ROL", "ESTADO", "SALDO");
        System.out.println("---------------------------------------------------------------------------------------------------------");

        for (int i = 0; i < tablaUsuarios.length; i++) {
            Usuario u = tablaUsuarios[i];
            String color = coloresUsuarios[i]; // Recupera el color asignado al usuario i

            // Imprime toda la fila que le corresponde a este usuario
            System.out.print(color);
            System.out.printf("%-5d %-12s %-25s %-6d %-15s %-10s $%-9.2f%n",
                    (i + 1),
                    u.nombreUsuario,
                    u.correo,
                    u.edad,
                    u.rol,
                    (u.estaActivo ? "Activo" : "Inactivo"),
                    u.saldo
            );
        }
        System.out.print(RESET); // Restablece el color
        System.out.println("---------------------------------------------------------------------------------------------------------\n");
    }
}
