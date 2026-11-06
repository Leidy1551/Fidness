
package fidness;

import javax.swing.SwingUtilities;

public class Fidness {

    public static void main(String[] args) {

        SwingUtilities.invokeLater(() -> {
            VentanaLogin ventana = new VentanaLogin();
            ventana.setVisible(true);
        });

    }
}

