package br.anderson.infnet.andersonmachado;

import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

import br.anderson.infnet.andersonmachado.model.domain.Turma;

@Component
public class TurmaTeste implements ApplicationRunner {
	
	@Override
	public void run(ApplicationArguments args) throws Exception {
		Turma t = new Turma();
		t.setCodigo(1);
		t.setDisciplina("Java");
		t.setProfessor("Elberth");
		System.out.println("Turma: "+t);
	}

}
