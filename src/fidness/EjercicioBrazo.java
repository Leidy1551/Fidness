
package fidness;

public class EjercicioBrazo extends Ejercicio {

    public EjercicioBrazo(String nombre, String descripcion,
            String instrucciones, String dificultad,
            int numeroRepeticiones) {

        super(nombre, descripcion, instrucciones,
                dificultad, numeroRepeticiones);
    }

    @Override
    public void mostrarInformacion() {
        System.out.println("=== EJERCICIO DE BRAZO ===");
        super.mostrarInformacion();
    }
}
