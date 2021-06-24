package controller;

import java.util.ArrayList;
import java.util.List;

import bo.Aluno;
import model.AlunoDAO;

public class AlunoController {
	
	public void create(Aluno aluno) {
		
		AlunoDAO model = new AlunoDAO();
		model.create(aluno);
	}
	
	public void update(Aluno aluno) {
		
		AlunoDAO model = new AlunoDAO();
		model.update(aluno);
	}
	
	public List<Aluno> read() {
		
		List<Aluno> listaAlunos = new ArrayList<Aluno>();
		
		try {
			AlunoDAO model = new AlunoDAO();
			listaAlunos = model.read();
		}
		catch(Exception e) {
			System.out.println("Erro ao ler read");
		}
		
		return listaAlunos;
	}

	public void delete(Aluno aluno) {
		
		AlunoDAO model = new AlunoDAO();
		model.delete(aluno);
	}


}
