package br.anderson.infnet.andersonmachado.model.service;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

import org.springframework.stereotype.Component;

import br.anderson.infnet.andersonmachado.model.domain.Curso;
import br.anderson.infnet.andersonmachado.model.domain.Professor;

@Component
public class CursoService {
    private static Map<Integer, Curso> Curso = new HashMap<Integer, Curso>();
	
	public void incluir(Curso pEscola) {
		pEscola.setId(Curso.size()+1);
		Curso.put(pEscola.getId(), pEscola);
	}
	
	public void excluir(Integer pId) {
		Curso.remove(pId);
	}
	
	public Collection<Curso> obterLista() {
		return Curso.values();
	}
	
	public Curso obter(Integer pId) {
		return Curso.get(pId);
	}
	
	public void addProfessor(Integer pCursoId, Professor pProf) {
		Curso.get(pCursoId).getProfessores().add(pProf);
	}

}
