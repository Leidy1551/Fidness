
package fidness;

import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;

public class VentanaConsultarEjercicios extends JFrame {

    private  Ejercicio[] ejercicios;
    private JList<String> listaEjercicios;
    private JTextArea areaInformacion;

    public VentanaConsultarEjercicios() {

        setTitle("Fidness - Consultar Ejercicios");
        setSize(550, 450);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);

        ejercicios = new Ejercicio[4];

        ejercicios[0] = new EjercicioPierna(
                  "Sentadillas",
        "Ejercicio para fortalecer las piernas",
        "Flexionar las rodillas y bajar lentamente",
        "Media", 15);

        ejercicios[1] = new EjercicioBrazo(
                "Flexiones",
                "Ejercicio para fortalecer los brazos",
                "Apoyar las manos y flexionar los codos",
                "Media", 12);

        ejercicios[2] = new EjercicioPierna(
                "Zancadas",
                "Ejercicio para trabajar piernas y gluteos",
                "Dar un paso adelante y flexionar las rodillas",
                "Media", 10);

        ejercicios[3] = new EjercicioBrazo(
                "Curl de biceps",
                "Ejercicio para fortalecer los biceps",
                "Flexionar los codos levantando las pesas",
                "Facil", 12);

        JPanel panel = new JPanel(new BorderLayout(10, 10));
        panel.setBackground(new Color(86, 132, 160));
        panel.setBorder(BorderFactory.createEmptyBorder(15, 20, 15, 20));

        JLabel titulo = new JLabel(
                "CONSULTA DE EJERCICIOS", SwingConstants.CENTER);
        titulo.setFont(new Font("Arial", Font.BOLD, 20));
        titulo.setForeground(Color.WHITE);

        DefaultListModel<String> modelo = new DefaultListModel<>();

        for (Ejercicio ejercicio : ejercicios) {
            modelo.addElement(ejercicio.getNombre());
        }

        listaEjercicios = new JList<>(modelo);
        listaEjercicios.setSelectionMode(
                ListSelectionModel.SINGLE_SELECTION);

        areaInformacion = new JTextArea();
        areaInformacion.setEditable(false);
        areaInformacion.setLineWrap(true);
        areaInformacion.setWrapStyleWord(true);

        JButton btnVer = new JButton("VER INFORMACION");
        JButton btnVolver = new JButton("VOLVER AL MENU");

        JPanel botones = new JPanel(new GridLayout(1, 2, 10, 10));
        botones.add(btnVer);
        botones.add(btnVolver);

        panel.add(titulo, BorderLayout.NORTH);
        panel.add(new JScrollPane(listaEjercicios), BorderLayout.WEST);
        panel.add(new JScrollPane(areaInformacion), BorderLayout.CENTER);
        panel.add(botones, BorderLayout.SOUTH);

        add(panel);

        btnVer.addActionListener(e -> mostrarEjercicio());

        btnVolver.addActionListener(e -> {
            new VentanaMenuPrincipal().setVisible(true);
            dispose();
        });
    }

    private void mostrarEjercicio() {

        try {
            int posicion = listaEjercicios.getSelectedIndex();

            if (posicion == -1) {
                throw new IllegalArgumentException(
                        "Debe seleccionar un ejercicio.");
            }

            Ejercicio ejercicio = ejercicios[posicion];

            
areaInformacion.setText(
        "EJERCICIO: " + ejercicio.getNombre()
        + "\n\nDESCRIPCION: " + ejercicio.getDescripcion()
        + "\n\nINSTRUCCIONES: " + ejercicio.getInstrucciones()
        + "\n\nDIFICULTAD: " + ejercicio.getDificultad()
        + "\n\nREPETICIONES: " + ejercicio.getNumeroRepeticiones()
);


        } catch (IllegalArgumentException ex) {
            JOptionPane.showMessageDialog(this, ex.getMessage());
        }
    }
}
