package vallegrande.edu.pe.view;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class CalculadoraView extends JFrame implements ActionListener {

    private JTextField pantalla;
    private double numero1, numero2, resultado;
    private String operacion;
    private boolean nuevaOperacion;

    public CalculadoraView() {
        configurarVentana();
        inicializarComponentes();
        nuevaOperacion = true;
    }

    private void configurarVentana() {
        setTitle("Calculadora MVC - Maria Ninahuanca");
        setSize(300, 400);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setResizable(false);
    }

    private void inicializarComponentes() {
        setLayout(new BorderLayout());

        pantalla = new JTextField();
        pantalla.setFont(new Font("Arial", Font.BOLD, 24));
        pantalla.setHorizontalAlignment(JTextField.RIGHT);
        pantalla.setEditable(false);
        pantalla.setText("0");

        JPanel panelBotones = new JPanel(new GridLayout(4, 4, 5, 5));
        String[] textosBotones = {"7", "8", "9", "/", "4", "5", "6", "*", "1", "2", "3", "-", "0", ".", "=", "+"};

        for (String texto : textosBotones) {
            JButton boton = new JButton(texto);
            boton.setFont(new Font("Arial", Font.BOLD, 18));
            boton.addActionListener(this);
            panelBotones.add(boton);
        }

        add(pantalla, BorderLayout.NORTH);
        add(panelBotones, BorderLayout.CENTER);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        String comando = e.getActionCommand();

        if (nuevaOperacion) {
            pantalla.setText("");
            nuevaOperacion = false;
        }

        switch (comando) {
            case "0": case "1": case "2": case "3": case "4":
            case "5": case "6": case "7": case "8": case "9":
            case ".":
                pantalla.setText(pantalla.getText() + comando);
                break;

            case "+": case "-": case "*": case "/":
                numero1 = Double.parseDouble(pantalla.getText());
                operacion = comando;
                pantalla.setText("");
                break;

            case "=":
                if (operacion != null) {
                    numero2 = Double.parseDouble(pantalla.getText());
                    resultado = realizarOperacion(numero1, numero2, operacion);
                    pantalla.setText(String.valueOf(resultado));
                    nuevaOperacion = true;
                    operacion = null;
                }
                break;
        }
    }

    private double realizarOperacion(double a, double b, String op) {
        switch (op) {
            case "+": return a + b;
            case "-": return a - b;
            case "*": return a * b;
            case "/":
                if (b != 0) return a / b;
                else {
                    JOptionPane.showMessageDialog(this, "Error: División por cero");
                    return 0;
                }
            default: return 0;
        }
    }
}