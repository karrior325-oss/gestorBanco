package co.banco.gestorBanco.gui;

import org.springframework.stereotype.Component;

import javax.swing.*;
import java.awt.*;

@Component


public class Ventana extends JFrame {

    private JTextField tIdentificacion, tNombre, tNumeroCuenta, tSaldo;
    private JRadioButton rbAhorros, rbCorriente;
    private JButton btnAlmacenar;

    public Ventana() {
        setTitle("Banco IO");
        setSize(400, 300);
        setLocationRelativeTo(null); // centrar
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(null); // IMPORTANTE para posicionar como en la imagen

        // Etiquetas
        JLabel lIdentificacion = new JLabel("Identificación Cliente");
        lIdentificacion.setBounds(20, 30, 150, 20);
        add(lIdentificacion);

        JLabel lNombre = new JLabel("Nombre Cliente");
        lNombre.setBounds(20, 60, 150, 20);
        add(lNombre);

        JLabel lTipo = new JLabel("Tipo Cuenta");
        lTipo.setBounds(20, 100, 150, 20);
        add(lTipo);

        JLabel lNumero = new JLabel("Número cuenta");
        lNumero.setBounds(20, 140, 150, 20);
        add(lNumero);

        JLabel lSaldo = new JLabel("Saldo Inicial");
        lSaldo.setBounds(20, 170, 150, 20);
        add(lSaldo);

        // Campos de texto
        tIdentificacion = new JTextField();
        tIdentificacion.setBounds(180, 30, 150, 20);
        add(tIdentificacion);

        tNombre = new JTextField();
        tNombre.setBounds(180, 60, 150, 20);
        add(tNombre);

        tNumeroCuenta = new JTextField();
        tNumeroCuenta.setBounds(180, 140, 150, 20);
        add(tNumeroCuenta);

        tSaldo = new JTextField();
        tSaldo.setBounds(180, 170, 150, 20);
        add(tSaldo);

        // Radio buttons
        rbAhorros = new JRadioButton("Ahorros");
        rbAhorros.setBounds(180, 100, 80, 20);

        rbCorriente = new JRadioButton("Corriente");
        rbCorriente.setBounds(260, 100, 100, 20);

        // Agrupar (solo uno puede seleccionarse)
        ButtonGroup grupo = new ButtonGroup();
        grupo.add(rbAhorros);
        grupo.add(rbCorriente);

        add(rbAhorros);
        add(rbCorriente);

        // Botón
        btnAlmacenar = new JButton("Almacenar");
        btnAlmacenar.setBounds(230, 210, 120, 30);
        add(btnAlmacenar);
    }
}


/* crear una cuenta que tenga lo siguiente;
nombre cliente
id cliente
tipocuenta (ahorros y corrietne)
num cuenta
saldo inicial
 que permita almacenar datos
 */

