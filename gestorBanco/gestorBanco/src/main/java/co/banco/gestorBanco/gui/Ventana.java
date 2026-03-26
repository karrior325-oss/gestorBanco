package co.banco.gestorBanco.gui;

import co.banco.gestorBanco.dto.Cliente;
import co.banco.gestorBanco.dto.Cuenta;
import co.banco.gestorBanco.dto.CuentaAhorros;
import co.banco.gestorBanco.dto.CuentaCorriente;
import co.banco.gestorBanco.permanencia.Permanencia;
import org.springframework.stereotype.Component;

import javax.swing.*;
import java.awt.*;

@Component


public class Ventana extends JFrame {

    private JTextField tIdentificacion, tNombre, tNumeroCuenta, tSaldo;
    private JRadioButton rbAhorros, rbCorriente;
    private JButton btnAlmacenar;

    public Ventana() {
        setTitle("Bancooooo");
        setSize(400, 300);
        setLocationRelativeTo(null); // centrar
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(null); // IMPORTANTE para posicionar como en la imagen

        // Etiquetas
        JLabel lIdentificacion = new JLabel("Identificación Cliente");
        lIdentificacion.setBounds(20, 30, 150, 20);
        add(lIdentificacion);

        tIdentificacion = new JTextField();
        tIdentificacion.setBounds(180, 30, 150, 20);
        add(tIdentificacion);


        //nombre cliente
        JLabel lNombre = new JLabel("Nombre Cliente");
        lNombre.setBounds(20, 60, 150, 20);
        add(lNombre);

        tNombre = new JTextField();
        tNombre.setBounds(180, 60, 150, 20);
        add(tNombre);


        //tipo cuenta
        JLabel lTipo = new JLabel("Tipo Cuenta");
        lTipo.setBounds(20, 100, 150, 20);
        add(lTipo);

        //num cuenta
        JLabel lNumero = new JLabel("Número cuenta");
        lNumero.setBounds(20, 140, 150, 20);
        add(lNumero);

        tNumeroCuenta = new JTextField();
        tNumeroCuenta.setBounds(180, 140, 150, 20);
        add(tNumeroCuenta);


        //saldo inicial
        JLabel lSaldo = new JLabel("Saldo Inicial");
        lSaldo.setBounds(20, 170, 150, 20);
        add(lSaldo);

        tSaldo = new JTextField();
        tSaldo.setBounds(180, 170, 150, 20);
        add(tSaldo);




        // BOTONEEES ahorroos y corriente
        rbAhorros = new JRadioButton("Ahorros");
        rbAhorros.setBounds(180, 100, 80, 20);

        ButtonGroup grupo = new ButtonGroup();
        grupo.add(rbAhorros);
        grupo.add(rbCorriente);



        rbCorriente = new JRadioButton("Corriente");
        rbCorriente.setBounds(260, 100, 100, 20);

        add(rbAhorros);
        add(rbCorriente);



        // Botón
        btnAlmacenar = new JButton("Almacenar");
        btnAlmacenar.setBounds(230, 210, 120, 30);
        add(btnAlmacenar);

        btnAlmacenar.addActionListener(e -> {

            String id = tIdentificacion.getText();
            String nombre = tNombre.getText();
            String numero = tNumeroCuenta.getText();
            double saldo = Double.parseDouble(tSaldo.getText());

            Cliente cliente = new Cliente(id, nombre);

            Cuenta cuenta;

            String tipoCuenta;
            if (rbAhorros.isSelected()) {
                cuenta = new CuentaAhorros(numero, saldo, cliente);
                tipoCuenta = "Ahorros";
            } else {
                cuenta = new CuentaCorriente(numero, saldo, cliente);
                tipoCuenta = "Corriente";
            }

            // Guardar (puedes dejarlo o quitarlo)
            Permanencia gestor = new Permanencia();
            gestor.guardarCuenta(cuenta);

            // 🔥 MENSAJE EMERGENTE
            JOptionPane.showMessageDialog(this,
                    "Cuenta guardada exitosamente\n\n" +
                            "Cliente: " + nombre + "\n" +
                            "Identificación: " + id + "\n" +
                            "Tipo Cuenta: " + tipoCuenta + "\n" +
                            "Número: " + numero + "\n" +
                            "Saldo: " + saldo
            );

        });
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

