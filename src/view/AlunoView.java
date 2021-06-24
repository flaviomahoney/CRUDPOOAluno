package view;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import javax.swing.JLabel;

import bo.Aluno;
import controller.AlunoController;

public class AlunoView {
	
	private String matricula;
	private String nome;
	private String cidade;
	
	public void create(Aluno aluno) {
		
		AlunoController controller = new AlunoController();
		
		controller.create(aluno);
	}

	public List<Aluno> read() {
		List<Aluno> lista = new ArrayList<Aluno>();
		try {
			AlunoController controller = new AlunoController();
			lista = controller.read();
		}
		catch(Exception e1)
		{
			System.out.println(e1);
		}
		return lista;
	}

	public void update(Aluno aluno) {
		AlunoController controller = new AlunoController();
		
		controller.update(aluno);
	}

	public void delete(Aluno aluno) {
		AlunoController controller = new AlunoController();
		
		controller.delete(aluno);
		
	}
	
}











