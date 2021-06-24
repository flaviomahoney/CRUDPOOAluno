package view;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class NewView implements ActionListener {
    private JFrame janela;
    private JPanel painel;

    private JLabel email;
    private JLabel senha;
    private JLabel cd;
    private JLabel information;
    
    private JTextField txtnum1;
    private JTextField txtnum2;
    private JButton btncAluno;
    private JButton btnuAluno;
    private JButton btndAluno;
    private JButton btnrAluno;
    
    public NewView() {
    	
    	janela = new JFrame();
        painel = new JPanel();
        
        btncAluno = new JButton("Registrar Aluno");
        btncAluno.addActionListener(new CreateAlunoView());
        painel.add(btncAluno);
        
        btnrAluno = new JButton("Ver todos os Alunos");
        btnrAluno.addActionListener(new ReadAlunoView());
        painel.add(btnrAluno);
        
        btnuAluno = new JButton("Update em Aluno");
        btnuAluno.addActionListener(new UpdateAlunoView());
        painel.add(btnuAluno);
        

        btndAluno = new JButton("Deletar Aluno em Aluno");
        btndAluno.addActionListener(new DeleteAlunoView());
        painel.add(btndAluno);
        
        information = new JLabel("Flavio Mahoney - Matricula: 0050014221");
        painel.add(information);
	
        
        //btncd.addActionListener(new RegView());
        janela.add(painel, BorderLayout.CENTER);
        janela.setTitle("Login");
        janela.setSize(300,350);
        janela.setLocation(860, 320);
        janela.setVisible(true);
    }
    
    public static void main(String[] args) {
        new NewView();
    }

    @Override
    public void actionPerformed(ActionEvent e) {
    	
    }   
}