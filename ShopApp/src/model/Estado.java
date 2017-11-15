package model;

public class Estado {
	private int id;
	private String UF,Nome;
	
	public Estado(){
		this.id=0;
		this.UF="";
		this.Nome="";
	}

	public Estado(int id, String uF, String nome) {
		super();
		this.id = id;
		UF = uF;
		Nome = nome;
	}
	
	public Estado(String uF, String nome) {
		super();
		this.id = 0;
		UF = uF;
		Nome = nome;
	}


	@Override
	public String toString() {
		return "UF=" + UF + ", Nome=" + Nome;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getUF() {
		return UF;
	}

	public void setUF(String uF) {
		UF = uF;
	}

	public String getNome() {
		return Nome;
	}

	public void setNome(String nome) {
		Nome = nome;
	}
	
	

}
