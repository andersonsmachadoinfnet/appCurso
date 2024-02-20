package br.anderson.infnet.andersonmachado.model.domain;

public class Turma {
	private int codigo;
	private String professor;
	private String disciplina;
	private int qtdAlunos = 0;
	
	public Turma() {
		qtdAlunos = 0;
	}
	
	public float getCalcularSalario() {
		return (100 + (10 * qtdAlunos));
	}
	
	public int getQtdAlunos() {
		return qtdAlunos;
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

}
