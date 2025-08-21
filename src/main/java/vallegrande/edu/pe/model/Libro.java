package vallegrande.edu.pe.model;

public class Libro {
    // ATRIBUTOS
    private String titulo;
    private String autor;

    // MÉTODOS CON PARÁMETROS
    public void actualizarTitulo(String nuevoTitulo) {
        this.titulo = nuevoTitulo;
        System.out.println("Título actualizado: " + nuevoTitulo);
    }

    public boolean esAutor(String nombreAutor) {
        return this.autor.equalsIgnoreCase(nombreAutor);
    }

    // GETTERS Y SETTERS
    public String getTitulo() { return titulo; }
    public void setTitulo(String titulo) { this.titulo = titulo; }

    public String getAutor() { return autor; }
    public void setAutor(String autor) { this.autor = autor; }
}