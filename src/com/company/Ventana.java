package com.company;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.FocusListener;

public class Ventana extends JFrame {

    private JLabel etiqueta;
    private JLabel etiqueta2;
    private JTextField campo;
    private JButton boton;
    private JDialog dialog;

    public Ventana() {
        super("Juego de numeros");
        etiqueta = new JLabel("Dime un numero entre 1 y 30");
        etiqueta2 = new JLabel("");
        campo = new JTextField(5);
        boton = new JButton("jugar");

        this.dialog = new JDialog(this);
        this.dialog.setSize(200, 200);
        FlowLayout f = new FlowLayout();
        setLayout(f);
        add(etiqueta);
        add(campo);
        add(boton);
        dialog.add(etiqueta2);
        boton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.out.println("hola");
                jugar();
            }
        });
    }

    private void jugar() {
        String valor = campo.getText();
        int num = Integer.parseInt(valor);
       // num++;
        int numero = (int) (Math.random() * 30) + 1;
        if(numero>num)
        etiqueta2.setText("Mi numero es:" + numero + " TE GANEEE!!!");
        else
            etiqueta2.setText("Mi numero es:" + numero + " Ganaste!!!");
        this.dialog.setVisible(true);
    }
}