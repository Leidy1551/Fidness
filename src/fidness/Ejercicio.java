
package fidness;

public class Ejercicio {

    private String nombre;
    private String descripcion;
    private String instrucciones;
    private String dificultad;
    private int numeroRepeticiones;

    public Ejercicio(String nombre, String descripcion,
            String instrucciones, String dificultad,
            int numeroRepeticiones) {

        this.nombre = nombre;
        this.descripcion = descripcion;
        this.instrucciones = instrucciones;
        this.dificultad = dificultad;
        this.numeroRepeticiones = numeroRepeticiones;
    }

    public void mostrarInformacion() {
        System.out.println("Nombre: " + nombre);
        System.out.println("Descripcion: " + descripcion);
        System.out.println("Instrucciones: " + instrucciones);
        System.out.println("Dificultad: " + dificultad);
        System.out.println("Repeticiones: " + numeroRepeticiones);
    }

    public String getNombre() {
        return nombre;
  }  
public String getDescripcion() {
    return descripcion;
}

public String getInstrucciones() {
    return instrucciones;
}

public String getDificultad() {
    return dificultad;
}

public int getNumeroRepeticiones() {
    return numeroRepeticiones;
}

}
