
package fidness;

import javax.swing.*;
import java.awt.*;

public class VentanaMenuPrincipal extends JFrame {

    private JButton btnConsultar;
    private JButton btnCerrarSesion;

    public VentanaMenuPrincipal() {

        setTitle("Fidness - Menu Principal");
        setSize(450, 350);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);

        JPanel panel = new JPanel();
        panel.setLayout(new GridLayout(3, 1, 15, 15));
        panel.setBackground(new Color(86, 132, 160));
        panel.setBorder(BorderFactory.createEmptyBorder(30, 60, 30, 60));

        JLabel titulo = new JLabel("MENU PRINCIPAL", SwingConstants.CENTER);
        titulo.setFont(new Font("Arial", Font.BOLD, 22));
        titulo.setForeground(Color.WHITE);

        btnConsultar = new JButton("CONSULTAR EJERCICIOS");
        btnCerrarSesion = new JButton("CERRAR SESION");

        panel.add(titulo);
        panel.add(btnConsultar);
        panel.add(btnCerrarSesion);

        add(panel);

       btnConsultar.addActionListener(e -> {
    VentanaConsultarEjercicios ventana =
            new VentanaConsultarEjercicios();
    ventana.setVisible(true);
    dispose();
});

        btnCerrarSesion.addActionListener(e -> {
            new VentanaLogin().setVisible(true);
            dispose();
        });
    }
}
