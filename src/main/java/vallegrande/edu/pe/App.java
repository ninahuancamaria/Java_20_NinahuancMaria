package vallegrande.edu.pe;

import vallegrande.edu.pe.view.CalculadoraView;

public class App {
    public static void main(String[] args) {
        System.out.println("=== PROYECTO POO - MARIA NINAHUANCA ===");
        System.out.println("Estructura MVC - Funcionando correctamente");

        // Iniciar la calculadora
        CalculadoraView calculadora = new CalculadoraView();
        calculadora.setVisible(true);
    }
}