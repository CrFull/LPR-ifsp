package com.mycompany.lpr2_tp04;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.sql.*;

/**
 *
 * @author  Atilio Almeida Costa
 *          João Victor Crivoi Cesar Souza 
 *          
 */

public class FormularioPesquisa extends JFrame {
    private JTextField txtNomePesquisa;
    private JTextField txtNome;
    private JTextField txtSalario;
    private JTextField txtCargo;
    private JButton btnPesquisar, btnAnterior, btnProximo;

    private MySQLHandler dbHandler;
    private ResultSet rs;

    public FormularioPesquisa(MySQLHandler dbHandler) {
        this.dbHandler = dbHandler;
        initialize();
    }

    private void initialize() {
        setTitle("TRABALHO PRATICO 04");
        setLayout(new GridLayout(0, 2, 10, 10)); 

        txtNomePesquisa = new JTextField();
        txtNome = new JTextField();
        txtSalario = new JTextField();
        txtCargo = new JTextField();
        btnPesquisar = new JButton("Pesquisar");
        btnAnterior = new JButton("Anterior");
        btnProximo = new JButton("Próximo");

    
        txtNome.setEditable(false);
        txtSalario.setEditable(false);
        txtCargo.setEditable(false);

  
        add(new JLabel("Nome para pesquisa:"));
        add(txtNomePesquisa);
        add(btnPesquisar);
        add(new JLabel(""));
        add(new JLabel("Nome:"));
        add(txtNome);
        add(new JLabel("Salário:"));
        add(txtSalario);
        add(new JLabel("Cargo:"));
        add(txtCargo);
        add(btnAnterior);
        add(btnProximo);


        btnPesquisar.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                pesquisar();
            }
        });

        btnAnterior.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                anterior();
            }
        });

        btnProximo.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                proximo();
            }
        });


        setSize(400, 300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
    }

    private void pesquisar() {
        try {
            String nomePesquisa = txtNomePesquisa.getText();
            rs = dbHandler.pesquisar(nomePesquisa);

            if (dbHandler.mostrar()) {
                mostrarDados();
            } else {
                JOptionPane.showMessageDialog(this, "Nenhum registro encontrado.");
            }
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
    }

    private void mostrarDados() throws SQLException {
        txtNome.setText(dbHandler.getNome());
        txtSalario.setText(dbHandler.getSalario());
        txtCargo.setText(dbHandler.getCargo());
    }

    private void anterior() {
        try {
            if (rs.previous()) {
                mostrarDados();
            } else {
                rs.next();  
            }
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
    }

    private void proximo() {
        try {
            if (rs.next()) {
                mostrarDados();
            } else {
                rs.previous();  
            }
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
    }


}
