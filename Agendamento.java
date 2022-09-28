package prova1;

import java.util.Calendar;

public class Agendamento {

	private int id;
	private Calendar data;
	private int hora;
	private int minuto;
	
	private Cliente cliente;
	private Cabeleireiro cabeleireiro;
	
	
	
	public Agendamento(Cliente cliente,Cabeleireiro cabeleireiro) {
		this.cliente = cliente;
		this.cabeleireiro = cabeleireiro;
		this.data = Calendar.getInstance();
	}
	
	
	
	public Calendar getData() {
		return this.data;
	}
	
	public int getId() {
		return this.id;
	}
	
	public int getMinuto() {
		return this.minuto;
	}
	
	public int getHora() {
		return this.hora;
	}
	
	public Cliente getCliente() {
		return this.cliente;
	}
	
	public Cabeleireiro getCabeleireiro() {
		return this.cabeleireiro;
	}
	
	
	
	public void setId(int id) {
		this.id = id;
	}
	
	public void setData(Calendar data) {
		this.data = data;
	}
	
	public void setHora(int hora) {
		this.hora = hora;
	}
	
	public void setMinuto(int minuto) {
		this.minuto = minuto;
	}
	
	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}
	
	public void setCabeleireiro(Cabeleireiro cabeleireiro) {
		this.cabeleireiro = cabeleireiro;
	}
}
