package br.anderson.infnet.andersonmachado.model.interfaces;

import java.util.List;

import br.anderson.infnet.andersonmachado.model.domain.Professor;

public interface ITemProfessores {
	public List<Professor> getProfessores();
	public void setProfessores(List<Professor> professores);

}
