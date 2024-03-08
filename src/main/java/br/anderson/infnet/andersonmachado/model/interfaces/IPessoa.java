package br.anderson.infnet.andersonmachado.model.interfaces;

public interface IPessoa {
	public Integer getMatricula();
	public void setMatricula(Integer pMatricula);
	
	public String getNome();
	public void setNome(String pNome);
	
	public String getEndereco();
	public void   setEndereco(String pEndereco);
	
	public String getTelefone();
	public void   setTelefone(String pTelefone);
}
