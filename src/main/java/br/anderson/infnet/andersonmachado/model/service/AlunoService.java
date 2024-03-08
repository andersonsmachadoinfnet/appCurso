package br.anderson.infnet.andersonmachado.model.service;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

import br.anderson.infnet.andersonmachado.model.domain.Aluno;

public class AlunoService {
    private static Map<Integer, Aluno> Alunos = new HashMap<Integer, Aluno>();
	
	public void incluir(Aluno pAluno) {
		Alunos.put(pAluno.getMatricula(), pAluno);
	}
	
	public void excluir(Integer pMatricula) {
		Alunos.remove(pMatricula);
	}
	
	public Collection<Aluno> obterLista() {
		return Alunos.values();
	}
	
	public Aluno obter(Integer pMatricula) {
		return Alunos.get(pMatricula);
	}

}
