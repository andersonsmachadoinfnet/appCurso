package br.anderson.infnet.andersonmachado.clients.domain;

import java.time.OffsetDateTime;

public class Dob {
	private OffsetDateTime date;
    private long age;

    public OffsetDateTime getDate() { return date; }
    public void setDate(OffsetDateTime value) { this.date = value; }

    public long getAge() { return age; }
    public void setAge(long value) { this.age = value; }
}
