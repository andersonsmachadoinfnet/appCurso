package br.anderson.infnet.andersonmachado.model.interfaces;

//import java.util.List;

public interface IArquivoTxt_linha {
	public abstract       String getPrefixo();
	public abstract      boolean isPrefixo(String pPrefixo);
	//public abstract List<String> obterLinha();
	public abstract         void setLinha(String pLinha);
}
