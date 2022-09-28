package prova1;

import java.util.Calendar;

public class Atendimento {

	private Calendar data;
	
	private Serviço[] lista;
	private Cliente cliente;
	private Cabeleireiro cabeleireiro;
	
	
	
	public Atendimento(Cliente cliente) {
		this.cliente = cliente;
		this.data = Calendar.getInstance();
	}
	
	
	
	public Calendar getData() {
		return this.data;
	}
	
	public Serviço[] getServico() {
		return lista;
	}
	
	public Cliente getCliente() {
		return this.cliente;
	}
	
	public Cabeleireiro getCabeleireiro() {
		return this.cabeleireiro;
	}
	
	
	
	public void setData(Calendar data) {
		this.data = data;
	}
	
	public void setServico(Serviço[] lista) {
		this.lista = lista;
	}
	
	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}
	
	public void setCabeleireiro(Cabeleireiro cabeleireiro) {
		this.cabeleireiro = cabeleireiro;
	}
}
