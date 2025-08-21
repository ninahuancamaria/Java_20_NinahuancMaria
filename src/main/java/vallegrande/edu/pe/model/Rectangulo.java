package vallegrande.edu.pe.model;

public class Rectangulo {
    // ATRIBUTOS
    private double largo;
    private double ancho;

    // MÉTODOS CON RETORNO
    public double calcularArea() {
        return largo * ancho;
    }

    public double calcularPerimetro() {
        return 2 * (largo + ancho);
    }

    // GETTERS Y SETTERS
    public double getLargo() { return largo; }
    public void setLargo(double largo) { this.largo = largo; }

    public double getAncho() { return ancho; }
    public void setAncho(double ancho) { this.ancho = ancho; }
}