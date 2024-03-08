package br.anderson.infnet.andersonmachado.model.domain;

import java.util.ArrayList;
import java.util.List;

public class Turma {
	private int codigo;
	private String professor;
	private String disciplina;
	//private int qtdAlunos = 0;
	private boolean iniciada = false;
	private List<Aluno> alunos;
	
	public Turma() {
		this.alunos = new ArrayList<Aluno>();// qtdAlunos = 0;
	}
	
	public float getCalcularSalario() {
		return (100 + (10 * getQtdAlunos()));
	}
	
	public int getQtdAlunos() {
		return alunos.size();
	}
	
	public String getDisciplina() {
		return disciplina;
	}
	
	public void setDisciplina(String disciplina) {
		this.disciplina = disciplina;
	}
	
	public String getProfessor() {
		return professor;
	}
	
	public void setProfessor(String professor) {
		this.professor = professor;
	}
	
	public int getCodigo() {
		return codigo;
	}
	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}

	public boolean isIniciada() {
		return iniciada;
	}

	public void setIniciada(boolean iniciada) {
		this.iniciada = iniciada;
	}

	public List<Aluno> getAlunos() {
		return alunos;
	}

	//public void setAlunos(List<Aluno> alunos) {
	//	this.alunos = alunos;
	//}
	
	public void addAluno(Aluno pAluno) {
		this.alunos.add(pAluno);
	}
}
