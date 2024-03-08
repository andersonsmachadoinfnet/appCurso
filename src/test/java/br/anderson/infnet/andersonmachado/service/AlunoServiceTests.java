package br.anderson.infnet.andersonmachado.service;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import br.anderson.infnet.andersonmachado.model.domain.Aluno;
import br.anderson.infnet.andersonmachado.model.service.AlunoService;

public class AlunoServiceTests {
	private AlunoService sc;
	private Aluno aluno;
	
	private final  String NOME     = "FULANO";
	private final Integer MATRICULA= 1;
	private final  String ENDERECO = "RUA XXX, Nº 10 - CENTRO - RJ";
	private final  String TELEFONE = "2199998888";
	
	@BeforeEach
	void setUp() {
		aluno = new Aluno();
		aluno.setNome(NOME);
		aluno.setMatricula(MATRICULA);
		aluno.setEndereco(ENDERECO);
		aluno.setTelefone(TELEFONE);
		
		sc = new AlunoService();
		sc.incluir(aluno);
	}
	
	@Test
	void recuperarDados() {
		assertEquals(NOME, sc.obter(MATRICULA).getNome());
		for (Aluno a : sc.obterLista()) {
			assertEquals(NOME, a.getNome());
		}
		assertEquals(1, sc.obterLista().size());
		sc.excluir(MATRICULA);
		assertEquals(0, sc.obterLista().size());
	}
}
