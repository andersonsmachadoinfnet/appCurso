package br.anderson.infnet.andersonmachado.domain;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import br.anderson.infnet.andersonmachado.model.domain.Aluno;

@SpringBootTest
public class AlunoTests {
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
	}
	
	@Test
	void recuperarDados() {
		assertEquals(NOME, aluno.getNome());
		assertEquals(MATRICULA, aluno.getMatricula());
		assertEquals(ENDERECO, aluno.getEndereco());
		assertEquals(TELEFONE, aluno.getTelefone());
	}
	
}
