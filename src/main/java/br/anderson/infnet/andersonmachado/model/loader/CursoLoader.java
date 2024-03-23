package br.anderson.infnet.andersonmachado.model.loader;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

import br.anderson.infnet.andersonmachado.model.auxiliar.Constantes;
import br.anderson.infnet.andersonmachado.model.domain.Curso;
import br.anderson.infnet.andersonmachado.model.domain.Professor;
import br.anderson.infnet.andersonmachado.model.interfaces.IArquivoTxt;
import br.anderson.infnet.andersonmachado.model.service.CursoService;

@Component
public class CursoLoader implements ApplicationRunner, IArquivoTxt {
	@Autowired
	private CursoService service;
	
	@Override
	public void run(ApplicationArguments args) throws Exception {
		lerDoArq(Constantes.LOADER_ARQ_CURSO);
	}
	
	@Override
	public void lerDoArq(String pNomeDoArq)  {
		try {
			FileReader file = new FileReader(pNomeDoArq);
			BufferedReader leitura = new BufferedReader(file);
			String   lLinha  = leitura.readLine();
			String[] lCampos = null;
			Curso lCurso = null;
			while (lLinha != null) {
				lCampos = lLinha.split(Constantes.SEPARADOR);
				if (Constantes.PREFIXO_CLASSE_CURSO.equals(lCampos[0])) {
					if (lCurso != null) {
						service.incluir(lCurso);	
					}
					lCurso = new Curso();
					lCurso.setLinha(lLinha);
				}
				else if (Constantes.PREFIXO_CLASSE_PROFESSOR.equals(lCampos[0])) {
					Professor lProf = new Professor();
					lProf.setLinha(lLinha);
					lCurso.getProfessores().add(lProf);
				}
				
				lLinha  = leitura.readLine();
			}
			if (lCurso != null) {
				service.incluir(lCurso);	
			}
			leitura.close();
			file.close();
			
		} catch (IOException e) {
			System.out.println("[ERROR] " + e.getMessage());
		}
	}
}
