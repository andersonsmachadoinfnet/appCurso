package br.anderson.infnet.andersonmachado.clients.domain;

public class Timezone {
	private String offset;
    private String description;

    public String getOffset() { return offset; }
    public void setOffset(String value) { this.offset = value; }

    public String getDescription() { return description; }
    public void setDescription(String value) { this.description = value; }
}
