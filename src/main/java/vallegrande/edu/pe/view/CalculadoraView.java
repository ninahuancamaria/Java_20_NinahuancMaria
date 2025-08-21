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

    // AGREGA ESTOS COLORES LILA
    private final Color COLOR_FONDO = new Color(240, 230, 250);       // Lila muy claro
    private final Color COLOR_BOTONES_NUM = new Color(220, 200, 240); // Lila medio
    private final Color COLOR_BOTONES_OP = new Color(160, 100, 200);  // Púrpura
    private final Color COLOR_TEXTO = new Color(80, 30, 120);         // Púrpura oscuro
    private final Color COLOR_PANTALLA = new Color(250, 245, 255);    // Blanco lila
    private final Color COLOR_IGUAL = new Color(180, 70, 220);        // Lila intenso

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
        getContentPane().setBackground(COLOR_FONDO); // FONDO LILA
    }

    private void inicializarComponentes() {
        setLayout(new BorderLayout());

        pantalla = new JTextField();
        pantalla.setFont(new Font("Segoe UI", Font.BOLD, 26));
        pantalla.setHorizontalAlignment(JTextField.RIGHT);
        pantalla.setEditable(false);
        pantalla.setText("0");
        pantalla.setBackground(COLOR_PANTALLA); // FONDO PANTALLA
        pantalla.setForeground(COLOR_TEXTO);    // TEXTO PÚRPURA

        JPanel panelBotones = new JPanel(new GridLayout(4, 4, 5, 5));
        panelBotones.setBackground(COLOR_FONDO); // FONDO PANEL

        String[] textosBotones = {"7", "8", "9", "/", "4", "5", "6", "*", "1", "2", "3", "-", "0", ".", "=", "+"};

        for (String texto : textosBotones) {
            JButton boton = crearBotonPersonalizado(texto); //  BOTONES CON COLOR
            panelBotones.add(boton);
        }

        add(pantalla, BorderLayout.NORTH);
        add(panelBotones, BorderLayout.CENTER);
    }

    // ✅ AGREGA ESTE MÉTODO PARA BOTONES COLORIDOS
    private JButton crearBotonPersonalizado(String texto) {
        JButton boton = new JButton(texto);
        boton.setFont(new Font("Arial", Font.BOLD, 18));
        boton.addActionListener(this);
        boton.setFocusPainted(false);

        // ASIGNAR COLOR SEGÚN EL TIPO DE BOTÓN
        if (texto.matches("[0-9]") || texto.equals(".")) {
            boton.setBackground(COLOR_BOTONES_NUM); //  NÚMEROS LILA
        } else if (texto.equals("=")) {
            boton.setBackground(COLOR_IGUAL);       // BOTÓN LILA INTENSO
        } else {
            boton.setBackground(COLOR_BOTONES_OP);  // OPERADORES PÚRPURA
        }

        boton.setForeground(COLOR_TEXTO);           // TEXTO PÚRPURA
        boton.setOpaque(true);
        boton.setBorderPainted(false);

        return boton;
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