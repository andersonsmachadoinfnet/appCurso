package br.anderson.infnet.andersonmachado.controller;

import java.util.Collection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.anderson.infnet.andersonmachado.model.domain.Curso;
import br.anderson.infnet.andersonmachado.model.domain.Professor;
import br.anderson.infnet.andersonmachado.model.service.CursoService;

@RestController
@RequestMapping("/api/curso")
public class CursoController {

	@Autowired
	private CursoService cursoService;
	
	@PostMapping(value = "/incluir")
	public void incluir(@RequestBody Curso curso) {
		cursoService.incluir(curso);
	}
	
	@PostMapping(value = "/{id}/addprof")
	public void incluir(@PathVariable Integer id, @RequestBody Professor prof) {
		cursoService.addProfessor(id, prof);
	}
	
	@DeleteMapping(value = "/{id}/excluir")
	public void excluir(@PathVariable Integer id) {
		cursoService.excluir(id);
	}
	
	@GetMapping(value = "/listar")
	public Collection<Curso> obterLista(){
		return cursoService.obterLista();
	}
		
}
