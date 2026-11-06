
package fidness;

import javax.swing.*;
import java.awt.*;

public class VentanaLogin extends JFrame {

    private JTextField txtUsuario;
    private JPasswordField txtContrasena;
    private JButton btnIngresar;

    public VentanaLogin() {

        setTitle("Fidness - Inicio de Sesion");
        setSize(400, 300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setLayout(new GridLayout(3, 2, 10, 10));

        JLabel lblUsuario = new JLabel("Usuario:");
        txtUsuario = new JTextField();

        JLabel lblContrasena = new JLabel("Contrasena:");
        txtContrasena = new JPasswordField();

        btnIngresar = new JButton("Ingresar");

        add(lblUsuario);
        add(txtUsuario);
        add(lblContrasena);
        add(txtContrasena);
        add(new JLabel(""));
        add(btnIngresar);

        btnIngresar.addActionListener(e -> iniciarSesion());
    }

    private void iniciarSesion() {

        try {
            String usuario = txtUsuario.getText().trim();
            String clave = new String(txtContrasena.getPassword());

            if (usuario.isEmpty() || clave.isEmpty()) {
                throw new IllegalArgumentException(
                        "Debe completar todos los campos.");
            }

            Usuario usuarioRegistrado =
                    new Usuario("admin", "1234");

if (usuarioRegistrado.iniciarSesion(usuario, clave)) {
    JOptionPane.showMessageDialog(
            this, "Inicio de sesion correcto.");

    VentanaMenuPrincipal menu = new VentanaMenuPrincipal();
    menu.setVisible(true);
    dispose();

            } else {
                JOptionPane.showMessageDialog(
                        this, "Usuario o contrasena incorrectos.");
            }

        } catch (IllegalArgumentException ex) {
            JOptionPane.showMessageDialog(
                    this, ex.getMessage());
        }
    }
}
