


package vallegrande.edu.pe.model;

public class Estudiante {
    // ATRIBUTOS
    private String nombre;
    private int edad;

    // MÉTODOS
    public void mostrarInformacion() {
        System.out.println("Estudiante: " + nombre + ", Edad: " + edad);
    }

    public void estudiar(String materia) {
        System.out.println(nombre + " está estudiando " + materia);
    }

    // GETTERS Y SETTERS
    public String getNombre() { return nombre; }
    public void setNombre(String nombre) { this.nombre = nombre; }

    public int getEdad() { return edad; }
    public void setEdad(int edad) { this.edad = edad; }
}