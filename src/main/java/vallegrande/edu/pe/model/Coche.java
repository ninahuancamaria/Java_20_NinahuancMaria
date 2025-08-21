package vallegrande.edu.pe.model;

public class Coche {
    // ATRIBUTOS
    private String marca;
    private int año;
    private String modelo;    // ← Agregar este atributo
    private double precio;    // ← Agregar este atributo

    // CONSTRUCTOR ACTUALIZADO - Con 4 parámetros
    public Coche(String marca, int año, String modelo, double precio) {
        this.marca = marca;
        this.año = año;
        this.modelo = modelo;
        this.precio = precio;
    }

    // MÉTODOS (mantener igual)
    public void mostrarInformacion() {
        System.out.println("Coche: " + marca + " " + modelo + " (" + año + ")");
        System.out.println("Precio: $" + precio);
    }

    public void aplicarDescuento(double porcentaje) {
        double descuento = precio * (porcentaje / 100);
        precio -= descuento;
        System.out.println("Descuento aplicado: $" + descuento);
        System.out.println("Nuevo precio: $" + precio);
    }

    public boolean esAntiguo() {
        return año < 2010;
    }

    // GETTERS Y SETTERS
    public String getMarca() { return marca; }
    public void setMarca(String marca) { this.marca = marca; }

    public int getAño() { return año; }
    public void setAño(int año) { this.año = año; }

    public String getModelo() { return modelo; }
    public void setModelo(String modelo) { this.modelo = modelo; }

    public double getPrecio() { return precio; }
    public void setPrecio(double precio) { this.precio = precio; }
}