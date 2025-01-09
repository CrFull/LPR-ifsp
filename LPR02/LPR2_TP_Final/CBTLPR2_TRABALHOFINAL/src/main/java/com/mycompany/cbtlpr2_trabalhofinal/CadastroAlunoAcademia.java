/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.cbtlpr2_trabalhofinal;

/**
 *
 * @author  Atilio Almeida Costa
 *          João Victor Crivoi Cesar Souza 
 */
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.ResultSet;
import java.util.ArrayList;
import org.json.JSONArray;
import org.json.JSONObject;

public class CadastroAlunoAcademia  {
    
    private JFrame frame;
    private JLabel lblNome, lblIdade, lblPeso, lblAltura, lblObjetivo;
    private  JTextField txtNome, txtIdade, txtPeso, txtAltura, txtObjetivo;
    private JButton btnIncluir, btnLimpar, btnApresentaDados, btnSair;
    private MySQLHandler dbHandler;
    private ResultSet rs;
    
    
     public CadastroAlunoAcademia(MySQLHandler dbHandler) {
        this.dbHandler = dbHandler;
        initialize();
    } 
    private void initialize() {

        frame = new JFrame("Cadastro de Aluno de Academia");
        frame.setSize(400, 400);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(new GridLayout(7, 2, 5, 5));

        createFormFields();

        frame.add(lblNome);
        frame.add(txtNome);

        frame.add(lblIdade);
        frame.add(txtIdade);

        frame.add(lblPeso);
        frame.add(txtPeso);

        frame.add(lblAltura);
        frame.add(txtAltura);

        frame.add(lblObjetivo);
        frame.add(txtObjetivo);

        frame.add(btnIncluir);
        frame.add(btnLimpar);

        frame.add(btnApresentaDados);
        frame.add(btnSair);

        addActionListeners();
   

      
        frame.setVisible(true);
    }
    
    private void createFormFields(){
        lblNome = new JLabel("Nome:");
        txtNome = new JTextField();
        

        lblIdade = new JLabel("Idade:");
        txtIdade = new JTextField();
        txtIdade.setToolTipText("Idade: Apenas números abaixo de 170.");
        
        lblPeso = new JLabel("Peso:");
        txtPeso = new JTextField();
        txtPeso.setToolTipText("Peso: Apenas números abaixo de 500. Pode incluir ponto (.)");
        
        lblAltura = new JLabel("Altura:");
        txtAltura = new JTextField();
        txtAltura.setToolTipText("Altura: Apenas números e ponto (.)");
        
        lblObjetivo = new JLabel("Objetivo:");
        txtObjetivo = new JTextField();

        btnIncluir = new JButton("Incluir");
        btnLimpar = new JButton("Limpar");
        btnApresentaDados = new JButton("Apresenta Dados");
        btnSair = new JButton("Sair");
    }
        
    private void addActionListeners(){
        
        ValidadorDeCampos.addValidator(txtIdade, "idade");
        ValidadorDeCampos.addValidator(txtPeso, "peso");
        ValidadorDeCampos.addValidator(txtAltura, "altura");
        
        btnIncluir.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                insertAluno();
            }
        });

     
        btnLimpar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                txtNome.setText("");
                txtIdade.setText("");
                txtPeso.setText("");
                txtAltura.setText("");
                txtObjetivo.setText("");
            }
        });

        btnApresentaDados.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {

                ArrayList<Aluno> alunos = dbHandler.selectAllAlunos();

                JSONArray jsonArray = new JSONArray();


                for (Aluno aluno : alunos) {
                    JSONObject jsonObject = new JSONObject();
                    jsonObject.put("objetivo", aluno.getObjetivo());
                    jsonObject.put("altura", aluno.getAltura());
                    jsonObject.put("peso", aluno.getPeso());
                    jsonObject.put("idade", aluno.getIdade());
                    jsonObject.put("nome", aluno.getNome());
                   
                  
                    
                    
                    jsonArray.put(jsonObject);
                }


                JOptionPane.showMessageDialog(null, jsonArray.toString(4), "Dados dos Alunos", JOptionPane.INFORMATION_MESSAGE);

                } catch (Exception ex) {
                    JOptionPane.showMessageDialog(null, "Erro ao buscar dados: " + ex.getMessage(), "Erro", JOptionPane.ERROR_MESSAGE);
                }
            }
        });

  
        btnSair.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                frame.dispose();
            }
        });
    }
    
    private boolean isEmpty(JTextField ... campos){
        for (JTextField campo : campos) {
            if (campo.getText().trim().isEmpty()) {
                return true; 
            }
        }
        return false; 
    }
    
    private void insertAluno(){
        try{
            if(!isEmpty(txtNome, txtIdade, txtPeso, txtAltura, txtObjetivo)){
                Aluno aluno = new Aluno(
                txtNome.getText(), 
               Integer.parseInt(txtIdade.getText()), 
                Float.parseFloat(txtPeso.getText()), 
               Float.parseFloat(txtAltura.getText()), 
              txtObjetivo.getText()
                );
                
                dbHandler.insertAluno(aluno);
                JOptionPane.showMessageDialog(frame, "Dados incluídos com sucesso!", "Informação", JOptionPane.INFORMATION_MESSAGE);
            }
            else{
                JOptionPane.showMessageDialog(frame, "Há campos Vazios!", "Erro", JOptionPane.ERROR_MESSAGE);
            }
            
        }catch(Exception ex){
            JOptionPane.showMessageDialog(frame, "Falha ao inserir!", "Erro", JOptionPane.ERROR_MESSAGE);
             ex.printStackTrace();
        }
    }
 
}

