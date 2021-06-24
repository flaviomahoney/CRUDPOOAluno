package view;

import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

import bo.Aluno;

public class UpdateAlunoView implements ActionListener {
	private JFrame janela; 
    private JPanel painel;
    private JLabel nome;
	private JLabel cidade;
	private JLabel matricula;

    private JTextField txtnum1;
    private JTextField txtnum2;
    private JTextField txtnum3;
    private JTextField txtnum4;
 
    private JLabel resultado;
    private JButton btnCd;
    
	public void actionPerformed(ActionEvent e) {
		
    	janela = new JFrame();
        painel = new JPanel();
        painel.setBorder(BorderFactory.createEmptyBorder(30, 30, 10,30));
        painel.setLayout(new GridLayout(0,1));
        
        matricula= new JLabel("Insira a matricula do aluno: ");
        painel.add(matricula);
        txtnum1 = new JTextField(" ");
        painel.add(txtnum1);
        
        nome = new JLabel("Insira o Nome: ");
        painel.add(nome);
        txtnum2 = new JTextField(" ");
        painel.add(txtnum2);
        
        cidade= new JLabel("Insira Cidade do Aluno: ");
        painel.add(cidade);
        txtnum3 = new JTextField(" ");
        painel.add(txtnum3);

        
        btnCd = new JButton("Atualizar");
        btnCd.addActionListener(new ActionListener() {
            @Override public void actionPerformed(ActionEvent e) {
            	
            		Aluno aluno = new Aluno();
            		AlunoView view = new AlunoView();
            		
            		aluno.setMatricula(txtnum1.getText().trim());
            		aluno.setNome(txtnum2.getText().trim());
            		aluno.setCidade(txtnum3.getText().trim());            		
            		
            		view.update(aluno);
              }
            });

        painel.add(btnCd);
        janela.add(painel, BorderLayout.CENTER);
        janela.setTitle("Mudar Aluno Estudante");
        janela.setSize(300,400);
        janela.setLocation(940, 620);
        janela.setVisible(true);
    }   
}
