package prova1;

public class Cliente {

	private int id;
	private String nome;
	private String cpf;
	
	
	
	public Cliente(String cpf) {
		this.cpf = cpf;
	}
	
	
	
	public int getId() {
		return this.id;
	}
	
	public String getNome() {
		return this.nome;
	}
	
	public String getCpf() {
		return this.cpf;
	}
	
	
	
	public void setId(int id) {
		if(id>0) {
			this.id = id;
		}
	}
	
	public void setNome(String nome) {
		if(nome.length()>=3) {
			this.nome = nome;
		}
	}
	
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	
}
