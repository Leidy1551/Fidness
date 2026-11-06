
package fidness;

public class Usuario {

    private String nombreUsuario;
    private String contrasena;

    public Usuario(String nombreUsuario, String contrasena) {
        this.nombreUsuario = nombreUsuario;
        this.contrasena = contrasena;
    }

    public String getNombreUsuario() {
        return nombreUsuario;
    }

    public boolean iniciarSesion(String usuario, String clave) {
        return nombreUsuario.equals(usuario)
                && contrasena.equals(clave);
    }

    public void cerrarSesion() {
        System.out.println("Sesion cerrada correctamente.");
    }
}
