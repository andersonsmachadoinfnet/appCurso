package br.anderson.infnet.andersonmachado.clients.domain;

public class RandomUserMeResult {
	private Result[] results;
    private Info info;

    public Result[] getResults() { return results; }
    public void setResults(Result[] value) { this.results = value; }

    public Info getInfo() { return info; }
    public void setInfo(Info value) { this.info = value; }
}
