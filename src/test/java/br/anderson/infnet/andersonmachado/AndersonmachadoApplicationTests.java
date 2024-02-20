package br.anderson.infnet.andersonmachado;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import br.anderson.infnet.andersonmachado.model.domain.Turma;

@SpringBootTest
class AndersonmachadoApplicationTests {

	@Test
	void contextLoads() {
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

}
