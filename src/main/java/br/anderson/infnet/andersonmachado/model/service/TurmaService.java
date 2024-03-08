package br.anderson.infnet.andersonmachado.model.service;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

import br.anderson.infnet.andersonmachado.model.domain.Turma;

public class TurmaService {
	private static Map<String, Turma> turmas = new HashMap<String, Turma>();
	
	public void incluir(Turma pTurma) {
		turmas.put(pTurma.getDisciplina(), pTurma);
	}
	
	public void excluir(String pDisciplina) {
		turmas.remove(pDisciplina);
	}
	
	public Collection<Turma> obterLista() {
		return turmas.values();
	}
	
	public Turma obter(String pDisciplina) {
		return turmas.get(pDisciplina);
	}

}
