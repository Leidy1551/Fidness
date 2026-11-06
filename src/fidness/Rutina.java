
package fidness;

public class Rutina {

    private String nombreRutina;
    private Ejercicio[] listaEjercicios;
    private int cantidad;

    public Rutina(String nombreRutina) {
        this.nombreRutina = nombreRutina;
        this.listaEjercicios = new Ejercicio[20];
        this.cantidad = 0;
    }

    public void agregarEjercicio(Ejercicio ejercicio) {
        if (cantidad < listaEjercicios.length) {
            listaEjercicios[cantidad] = ejercicio;
            cantidad++;
        }
    }

    public void eliminarEjercicio(Ejercicio ejercicio) {
        for (int i = 0; i < cantidad; i++) {
            if (listaEjercicios[i] == ejercicio) {
                for (int j = i; j < cantidad - 1; j++) {
                    listaEjercicios[j] = listaEjercicios[j + 1];
                }
                cantidad--;
                listaEjercicios[cantidad] = null;
                break;
            }
        }
    }

    public void mostrarRutina() {
        System.out.println("Rutina: " + nombreRutina);

        for (int i = 0; i < cantidad; i++) {
            listaEjercicios[i].mostrarInformacion();
        }
    }

    public boolean exportarRutina() {
        return false;
    }
}
