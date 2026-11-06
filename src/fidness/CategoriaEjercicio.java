
package fidness;

public class CategoriaEjercicio {

    private String nombreCategoria;
    private String descripcionCategoria;

    public CategoriaEjercicio(String nombreCategoria,
            String descripcionCategoria) {

        this.nombreCategoria = nombreCategoria;
        this.descripcionCategoria = descripcionCategoria;
    }

    public void mostrarCategoria() {
        System.out.println("Categoria: " + nombreCategoria);
        System.out.println("Descripcion: " + descripcionCategoria);
    }

    public String getNombreCategoria() {
        return nombreCategoria;
    }
}
