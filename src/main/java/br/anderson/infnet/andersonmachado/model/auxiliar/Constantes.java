package br.anderson.infnet.andersonmachado.model.auxiliar;

import java.time.format.DateTimeFormatter;

public class Constantes {
	public static final String _FMT_DATE_MES_BR_ = "MM/yyyy";
	public static final String _FMT_DATE_BR_     = "dd/MM/yyyy";
	public static final String _FMT_DATETIME_BR_ = "dd/MM/yyyy HH:mm";
	
	public static final String SEPARADOR = ";";
	public static final String PREFIXO_CLASSE_ALUNO       = "A";
	public static final String PREFIXO_CLASSE_CURSO       = "C";
	public static final String PREFIXO_CLASSE_PROFESSOR   = "P";
	public static final String CRLF = "\r\n";

	public static final    int TESTE_ARQ_CLASSEMAE_QTD      = 5;
	public static final    int NAODEFINIDO                  = -1;
	public static final String TESTE_ARQ_NOME               = "ArquivoTeste.txt";
	public static final String TESTE_ARQ_PROCESSADO_PREFIXO = "out_";
	
	public static final String LOADER_ARQ_CURSO             = "curso.txt";
	
	public static final String EXAME_NAO_AVALIADO           = "O exame ainda não foi avaliado pelo profissional da área. Tente mais tarde.";
	public static final String PRONTUARIO_DESCRICAO         = "Este prontuário contém informações do Paciente informado.";
	
	
	public static final DateTimeFormatter FMT_DATE_MES_BR() {
		return DateTimeFormatter.ofPattern(_FMT_DATE_MES_BR_);
	}
	
	public static final DateTimeFormatter FMT_DATE_BR() {
		return DateTimeFormatter.ofPattern(_FMT_DATE_BR_);
	}
	
	public static final DateTimeFormatter FMT_DATETIME_BR() {
		return DateTimeFormatter.ofPattern(_FMT_DATETIME_BR_);
	}
}