package br.anderson.infnet.andersonmachado.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.anderson.infnet.andersonmachado.clients.IRandomUserMe;
import br.anderson.infnet.andersonmachado.clients.domain.Result;

@RestController
@RequestMapping("/api/pessoafaker")
public class PessoaFakerController {
	@Autowired
	private IRandomUserMe randomUserMe;
	
	@GetMapping(value = "/obter")
	public Result obterLista(){
		return randomUserMe.obterPessoa().getResults()[0];
	}
}
