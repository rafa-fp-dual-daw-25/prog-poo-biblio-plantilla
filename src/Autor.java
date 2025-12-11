import java.util.ArrayList;

public class Autor {
    ArrayList<Libro> libros = new ArrayList<>();
    private int id;
    private String nombre;
    private String apellido;

    public Autor(int id, String nombre, String apellido) {
        this.id = id;
        this.nombre = nombre;
        this.apellido = apellido;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public void addLibro(Libro libro) {
        libros.add(libro);
    }

    @Override
    public String toString() {
        return "ID: " + this.id + " - Nombre: " + nombre + " - Apellidos: " + apellido;
    }
}