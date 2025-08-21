// Esta clase es para hacer las pruebas de las clases que no son de la calculadora

package vallegrande.edu.pe;

import vallegrande.edu.pe.model.Coche;
import vallegrande.edu.pe.model.Estudiante;
import vallegrande.edu.pe.model.Libro;
import vallegrande.edu.pe.model.Rectangulo;

public class Pruebas {
    public static void main(String[] args) {
        System.out.println("=== PRUEBAS DE CLASES POO ===");

        // 1. PRUEBA ESTUDIANTE
        System.out.println("\n1. CLASE ESTUDIANTE:");
        Estudiante estudiante = new Estudiante();
        estudiante.setNombre("Ana");
        estudiante.setEdad(20);
        estudiante.mostrarInformacion();
        estudiante.estudiar("Matemáticas");

        // 2. PRUEBA RECTÁNGULO
        System.out.println("\n2. CLASE RECTÁNGULO:");
        Rectangulo rectangulo = new Rectangulo();
        rectangulo.setLargo(5.0);
        rectangulo.setAncho(3.0);
        System.out.println("Área: " + rectangulo.calcularArea());
        System.out.println("Perímetro: " + rectangulo.calcularPerimetro());

        // 3. PRUEBA LIBRO
        System.out.println("\n3. CLASE LIBRO:");
        Libro libro = new Libro();
        libro.setTitulo("Cien años de soledad");
        libro.setAutor("Gabriel García Márquez");
        libro.actualizarTitulo("Cien años de soledad - Edición especial");
        System.out.println("¿Es de García Márquez? " + libro.esAutor("Gabriel García Márquez"));

        // 4. PRUEBA COCHE (CON 4 PARÁMETROS)
        System.out.println("\n4. CLASE COCHE:");
        Coche coche = new Coche("Toyota", 2020, "Corolla", 25000.0);
        coche.mostrarInformacion();
        coche.aplicarDescuento(10.0);
        System.out.println("¿Es antiguo? " + coche.esAntiguo());

        System.out.println("\n=== PRUEBAS COMPLETADAS ===");
    }
}