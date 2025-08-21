package vallegrande.edu.pe.model;

public class Coche {
    // ATRIBUTOS
    private String marca;
    private int año;

    // CONSTRUCTOR
    public Coche(String marca, int año) {
        this.marca = marca;
        this.año = año;
    }

    // MÉTODOS
    public void mostrarInfo() {
        System.out.println("Marca: " + marca + ", Año: " + año);
    }

    public boolean esAntiguo() {
        return año < 2010;
    }

    // GETTERS Y SETTERS
    public String getMarca() { return marca; }
    public void setMarca(String marca) { this.marca = marca; }

    public int getAño() { return año; }
    public void setAño(int año) { this.año = año; }
}