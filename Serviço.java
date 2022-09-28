package prova1;

public class Serviço {

	private int id;
	private String nome;
	private double valor;
	private String descricao;
	
	
	
	public int getId() {
		return this.id;
	}
	
	public String getNome() {
		return this.nome;
	}
	
	public double getValor() {
		return this.valor;
	}
	
	public String getDescricao() {
		return this.descricao;
	}
	
	
	
	public void setId(int id) {
		if(id>0) {
			this.id = id;
		}
	}
	
	public void setNome(String nome) {
		if(nome.length()>=5) {
			this.nome = nome;
		}
	}
	
	public void setDescricao(String descricao) {
		if(descricao.length()>=10) {
			this.descricao = descricao;
		}
	}
	
	public void setValor(double valor) {
		if(valor >= 0) {
			this.valor = valor;
		}
	}
	
	
	
}
