
package fidness;

public class EjercicioPierna extends Ejercicio {

    public EjercicioPierna(String nombre, String descripcion,
            String instrucciones, String dificultad,
            int numeroRepeticiones) {

        super(nombre, descripcion, instrucciones,
                dificultad, numeroRepeticiones);
    }

    @Override
    public void mostrarInformacion() {
        System.out.println("=== EJERCICIO DE PIERNA ===");
        super.mostrarInformacion();
    }
}
