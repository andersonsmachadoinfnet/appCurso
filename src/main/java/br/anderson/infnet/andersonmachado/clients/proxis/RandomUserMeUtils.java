package br.anderson.infnet.andersonmachado.clients.proxis;

import br.anderson.infnet.andersonmachado.clients.domain.RandomUserMeResult;
import br.anderson.infnet.andersonmachado.model.domain.Aluno;
import br.anderson.infnet.andersonmachado.model.domain.Professor;

public class RandomUserMeUtils {
	public Aluno getAluno(RandomUserMeResult v) {
		Aluno a = new Aluno();
		a.setNome(v.getResults()[0].getName().getFirst()+" "+
				  v.getResults()[0].getName().getLast());
		a.setTelefone(v.getResults()[0].getCell());
		return a;
	}
	
	public Professor getProfessor(RandomUserMeResult v) {
		Professor p = new Professor();
		p.setNome(v.getResults()[0].getName().getFirst()+" "+
				  v.getResults()[0].getName().getLast());
		p.setTelefone(v.getResults()[0].getCell());
		return p;
	}
}
