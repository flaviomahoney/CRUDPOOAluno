package view;

import javax.swing.*;

import bo.Aluno;

import java.util.ArrayList;
import java.util.List;

import java.awt.*;
import java.awt.event.*;

public class ReadAlunoView implements ActionListener {
	private JFrame janela;
    private JPanel painel;
    private JLabel list;
    private JLabel jt;
    private JButton btn1;

    @Override
    public void actionPerformed(ActionEvent e) {
    	
    	janela = new JFrame();
        painel = new JPanel();
        
        list = new JLabel("Listagem de Alunos");
        painel.setLayout(new GridBagLayout());
        janela.setTitle("Tela de Listagem");
        janela.setSize(400,350);
        janela.setLocation(300, 320);
        
        
        //Espaçando linhas
        GridBagConstraints col = new GridBagConstraints();
        col.insets = new Insets (10,10,10,10);
        col.gridx = 0;
        col.gridy = 1;
        
        painel.add(list,col);
        col.gridx=0;
        col.gridy=2;
        
        btn1 = new JButton("Mostrar alunos");
        btn1.setBounds(20,30,50,30);
        painel.add(btn1,col);
        
        col.gridx=0;
        col.gridy=3;
        

        janela.add(painel);
        btn1.addActionListener(new ActionListener() {
            @Override public void actionPerformed(ActionEvent e) {
            	AlunoView aluno = new AlunoView();
        		List<Aluno> listaAlunos = new ArrayList<Aluno>();
        		listaAlunos = aluno.read();
        		int x=3;
        		for(Aluno alunos:listaAlunos) 
        		{
        			col.gridx=0;
        			col.gridy=x;
        			x++;
        			
        			System.out.println(listaAlunos);
        			System.out.println(alunos.getNome());
        			jt = new JLabel(" ");
        			jt.setText("Matricula : "+alunos.getMatricula()+
        					" Nome : "+alunos.getNome()+
        					" Idade : "+alunos.getCidade());
        			painel.add(jt,col);
        			painel.revalidate();
        		}
              }
            });
        janela.setVisible(true);

    }   

}
