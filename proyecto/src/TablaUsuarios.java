public class TablaUsuarios {

    // 'tabla' es el arreglo (la tabla) donde se van a guardar los usuarios
    Usuario[] tabla;

    // Constructor: recibe el tamano que va a tener la tabla
    TablaUsuarios(int tamano){
        this.tabla = new Usuario[tamano];
    }

    // Metodo que recibe los objetos Usuario creados y los guarda en la tabla
    void guardarUsuarios(Usuario[] usuarios){
        for (int i = 0; i < usuarios.length; i++){
            this.tabla[i] = usuarios[i];
        }
        System.out.println("Se guardaron " + usuarios.length + " usuarios en la tabla.");
    }

    // Metodo que imprime la tabla con los atributos de todos los usuarios guardados
    void imprimirTabla(){
        System.out.println("----------------------------------------------------------------------------------------------------");
        System.out.printf("%-12s %-25s %-15s %-6s %-10s %-8s%n",
                "USERNAME", "EMAIL", "PASSWORD", "EDAD", "ROL", "ACTIVO");
        System.out.println("----------------------------------------------------------------------------------------------------");

        for (int i = 0; i < this.tabla.length; i++){
            Usuario u = this.tabla[i];
            System.out.printf("%-12s %-25s %-15s %-6d %-10s %-8s%n",
                    u.username, u.email, u.password, u.edad, u.rol, u.activo);
        }
        System.out.println("----------------------------------------------------------------------------------------------------");
    }
}
