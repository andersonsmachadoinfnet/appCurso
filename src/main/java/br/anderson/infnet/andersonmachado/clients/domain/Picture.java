package br.anderson.infnet.andersonmachado.clients.domain;

public class Picture {
	private String large;
    private String medium;
    private String thumbnail;

    public String getLarge() { return large; }
    public void setLarge(String value) { this.large = value; }

    public String getMedium() { return medium; }
    public void setMedium(String value) { this.medium = value; }

    public String getThumbnail() { return thumbnail; }
    public void setThumbnail(String value) { this.thumbnail = value; }
}
