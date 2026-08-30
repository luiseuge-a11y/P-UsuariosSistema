public class Usuario {
    // 6 Atributos
    String nombreUsuario;
    String correo;
    int edad;
    String rol;
    boolean estaActivo;
    double saldo;

    // 1 Constructor
    public Usuario(String nombreUsuario, String correo, int edad, String rol, boolean estaActivo, double saldo) {
        this.nombreUsuario = nombreUsuario;
        this.correo = correo;
        this.edad = edad;
        this.rol = rol;
        this.estaActivo = estaActivo;
        this.saldo = saldo;
    }

    // 5 Acciones (Metodos de la clase)
    public void iniciarSesion() {
        System.out.println(nombreUsuario + " ha iniciado sesion.");
    }

    public void cerrarSesion() {
        System.out.println(nombreUsuario + " ha cerrado sesion.");
    }

    public void cambiarCorreo(String nuevoCorreo) {
        this.correo = nuevoCorreo;
    }

    public void recargarSaldo(double monto) {
        this.saldo += monto;
    }

    public void cambiarEstado(boolean nuevoEstado) {
        this.estaActivo = nuevoEstado;
    }
}
