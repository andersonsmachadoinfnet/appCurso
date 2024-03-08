package br.anderson.infnet.andersonmachado.domain;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import br.anderson.infnet.andersonmachado.model.domain.Aluno;
import br.anderson.infnet.andersonmachado.model.domain.Turma;

public class TurmaTests {
	private Turma turma;
	private Aluno aluno;
	
	private final  String NOME     = "FULANO";
	private final Integer MATRICULA= 1;
	private final  String ENDERECO = "RUA XXX, Nº 10 - CENTRO - RJ";
	private final  String TELEFONE = "2199998888";
	
	private final  String DISCIPLINA = "Java";
	private final  String PROFESSOR  = "Elberth";
	private final Integer CODIGO = 1;
	private final boolean INICIADA= true;
	
	
	@BeforeEach
	void setUp() {
		aluno = new Aluno();
		turma = new Turma();
		
		aluno.setNome(NOME);
		aluno.setMatricula(MATRICULA);
		aluno.setEndereco(ENDERECO);
		aluno.setTelefone(TELEFONE);
		
		turma.addAluno(aluno);
		turma.setCodigo(CODIGO);
		turma.setDisciplina(DISCIPLINA);
		turma.setProfessor(PROFESSOR);
		turma.setIniciada(INICIADA);
	}
	
	@Test
	void recuperarDados() {
		assertEquals(NOME, turma.getAlunos().get(0).getNome());
		assertEquals(MATRICULA, turma.getAlunos().get(0).getMatricula());
		assertEquals(ENDERECO, turma.getAlunos().get(0).getEndereco());
		assertEquals(TELEFONE, turma.getAlunos().get(0).getTelefone());
		
		assertEquals(CODIGO, turma.getCodigo());
		assertEquals(DISCIPLINA, turma.getDisciplina());
		assertEquals(PROFESSOR, turma.getProfessor());
		assertEquals(INICIADA, turma.isIniciada());
	}
}
