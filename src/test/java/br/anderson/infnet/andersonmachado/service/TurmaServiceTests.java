package br.anderson.infnet.andersonmachado.service;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import br.anderson.infnet.andersonmachado.model.domain.Aluno;
import br.anderson.infnet.andersonmachado.model.domain.Turma;
import br.anderson.infnet.andersonmachado.model.service.TurmaService;

public class TurmaServiceTests {
	private TurmaService sc;
	
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
		sc = new TurmaService();
		
		aluno.setNome(NOME);
		aluno.setMatricula(MATRICULA);
		aluno.setEndereco(ENDERECO);
		aluno.setTelefone(TELEFONE);
		
		turma.addAluno(aluno);
		turma.setCodigo(CODIGO);
		turma.setDisciplina(DISCIPLINA);
		turma.setProfessor(PROFESSOR);
		turma.setIniciada(INICIADA);
		
		sc.incluir(turma);
	}
	
	@Test
	void recuperarDados() {
		assertEquals(PROFESSOR, sc.obter(DISCIPLINA).getProfessor());
		for (Turma t : sc.obterLista()) {
			assertEquals(PROFESSOR, t.getProfessor());
		}
		assertEquals(1, sc.obterLista().size());
		sc.excluir(DISCIPLINA);
		assertEquals(0, sc.obterLista().size());
	
	}
}
