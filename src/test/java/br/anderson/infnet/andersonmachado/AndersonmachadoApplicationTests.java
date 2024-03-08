package br.anderson.infnet.andersonmachado;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import br.anderson.infnet.andersonmachado.model.domain.Aluno;
import br.anderson.infnet.andersonmachado.model.domain.Turma;

@SpringBootTest
class AndersonmachadoApplicationTests {

	@Test
	void contextLoads() {
	}
	
	@Test
	void alunoTestaClasse() {
		Aluno a = new Aluno();
		a.setMatricula(1);
		a.setNome("Anderson");
		a.setEndereco("Rua XXX");
		a.setTelefone("2199998888");
		
		assertEquals(a.getMatricula(), 1);
		assertEquals(a.getNome(),"Anderson");
		assertEquals(a.getEndereco(),"Rua XXX");
		assertEquals(a.getTelefone(),"2199998888");
	}
	
	@Test
	void turmaCalculoSalarioDoProfessor() {
		Turma t = new Turma();
		t.setCodigo(1);
		t.setDisciplina("Java");
		t.setProfessor("Elberth");
		t.setIniciada(true);
		assertEquals((float)100, t.getCalcularSalario());
	}
	
	@Test
	void turmaCalculoSalarioDoProfessorComAluno() {
		Turma t = new Turma();
		Aluno a = new Aluno();
		t.setCodigo(1);
		t.setDisciplina("Java");
		t.setProfessor("Elberth");
		
		a.setMatricula(1);
		a.setNome("Anderson");
		a.setEndereco("Rua XXX");
		a.setTelefone("2199998888");
		t.addAluno(a);
		t.setIniciada(true);
		assertEquals((float)110, t.getCalcularSalario());
	}

}
