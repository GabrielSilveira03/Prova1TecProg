package prova1;

import java.util.Scanner;

public class Teste {
//Fornecimento de dados pelo usuário
	public static void mostrarOpcoes() {
		System.out.println("------------------------- ESCOLHA UMA OPCAO -------------------------");
		System.out.println("1 - Registrar Cliente");
		System.out.println("2 - Registrar Cabeleireiro");
		System.out.println("3 - Registrar Serviço");
		System.out.println("4 - Registrar Agendamento");
		System.out.println("5 - Registrar Atendimento");
		System.out.println("0 - Para sair do programa");
	}
	
	public static Cliente registrarCliente() {
		Scanner entrada = new Scanner(System.in);
		System.out.println("Informe o CPF do Cliente:");
		String cpf = entrada.next();
		Cliente cli = new Cliente(cpf);
		System.out.println("Informe o nome do Cliente:");
		cli.setNome(entrada.nextLine());
		System.out.println("Informe o id do Cliente:");
		cli.setId(entrada.nextInt());
		
		entrada.close();
		
		return cli;
	}
	
	public static Cabeleireiro registrarCabeleireiro() {
		Scanner entrada = new Scanner(System.in);
		System.out.println("Informe o CPF do Cliente:");
		String cpf = entrada.next();
		System.out.println("Informe o nome do Cliente:");
		String nome = entrada.nextLine();
		Cabeleireiro cab = new Cabeleireiro(nome,cpf);
		System.out.println("Informe o id do Cliente:");
		cab.setId(entrada.nextInt());
		
		entrada.close();
		
		return cab;
	}
	
	public static Serviço registrarServiço() {
		Scanner entrada = new Scanner(System.in);
		Serviço srv = new Serviço();
		System.out.println("Informe o id do Serviço:");
		srv.setId(entrada.nextInt());
		System.out.println("Informe o nome do Serviço:");
		srv.setNome(entrada.nextLine());
		System.out.println("Informe a descrição do Serviço:");
		srv.setDescricao(entrada.nextLine());
		System.out.println("Informe o valor do Serviço(formato:0.00)");
		srv.setValor(entrada.nextDouble());
		
		
		entrada.close();
		
		return srv;
	}
	
	public static Agendamento registrarAgendamento(Cliente cli, Cabeleireiro cab) {
		Scanner entrada = new Scanner(System.in);
		Agendamento agd = new Agendamento(cli,cab);
		System.out.println("Informe o id do Agendamento:");
		agd.setId(entrada.nextInt());
		System.out.println("Informe a hora do Agendamento(apenas a hora):");
		agd.setHora(entrada.nextInt());
		System.out.println("Informe os minutos do Agendamento(apenas os minutos):");
		agd.setMinuto(entrada.nextInt());

		entrada.close();
		
		return agd;
	}
	
	public static void registrarAtendimento(Cliente cli,Cabeleireiro cab,Serviço[] lista) {
		Atendimento atd = new Atendimento(cli);
		atd.setCabeleireiro(cab);
		atd.setServico(lista);
	}
	
	
//Exibir resultados
	public static void exibirCliente(Cliente cli) {
		System.out.println("Id do Cliente:" + cli.getId());
		System.out.println("Nome do Cliente:" + cli.getNome());
		System.out.println("CPF do Cliente:" + cli.getCpf());
	}
	
	public static void exibirCabeleireiro(Cabeleireiro cab) {
		System.out.println("Id do Cabeleireiro:" + cab.getId());
		System.out.println("Nome do Cabeleireiro:" + cab.getNome());
		System.out.println("CPF do Cabeleireiro:" + cab.getCpf());
	}
	
	public static void exibirServiço(Serviço srv) {
		System.out.println("Id do Serviço:" + srv.getId());
		System.out.println("Nome do Serviço:" + srv.getNome());
		System.out.println("Descrição do Serviço:" + srv.getDescricao());
		System.out.println("Valor do Serviço:" + srv.getValor());
	}
	
	public static void exibirAgendamento(Agendamento agd) {
		System.out.println("Id do Agendamento:" + agd.getId());
		System.out.println("Data do Agendamento:" + agd.getData());
		System.out.println("Hora do Agendamento:" + agd.getHora());
		System.out.println("Minuto do Agendamento:" + agd.getMinuto());
		System.out.println("Id do Cliente:" + agd.getCliente().getId());
		System.out.println("Nome do Cliente:" + agd.getCliente().getNome());
		System.out.println("CPF do Cliente:" + agd.getCliente().getCpf());
		System.out.println("Id do Cabeleireiro:" + agd.getCabeleireiro().getId());
		System.out.println("Nome do Cabeleireiro:" + agd.getCabeleireiro().getNome());
		System.out.println("CPF do Cabeleireiro:" + agd.getCabeleireiro().getCpf());
	}
	
	public static void exibirAtendimento(Atendimento atd) {
		System.out.println("Data do Agendamento:" + atd.getData());
		System.out.println("Id do Cliente:" + atd.getCliente().getId());
		System.out.println("Nome do Cliente:" + atd.getCliente().getNome());
		System.out.println("CPF do Cliente:" + atd.getCliente().getCpf());
		System.out.println("Id do Cabeleireiro:" + atd.getCabeleireiro().getId());
		System.out.println("Nome do Cabeleireiro:" + atd.getCabeleireiro().getNome());
		System.out.println("CPF do Cabeleireiro:" + atd.getCabeleireiro().getCpf());
		for (int contador = 0; contador < atd.getServico().length; contador++) {
			System.out.println("Id do Serviço:" + atd.getServico()[contador].getId());
			System.out.println("Nome do Serviço:" + atd.getServico()[contador].getNome());
			System.out.println("Descrição do Serviço:" + atd.getServico()[contador].getDescricao());
			System.out.println("Valor do Serviço:" + atd.getServico()[contador].getValor());
		}
	}
	
	
	public static void main(String[] args) {
		//Funcionalidade 1
		Cliente cliente1 = new Cliente("987.123.654-0");
		cliente1.setId(1);
		cliente1.setNome("Luis");
		Cliente cliente2 = new Cliente("987.654.321-0");
		cliente2.setId(2);
		cliente2.setNome("Matheus");
		Cliente cliente3 = new Cliente("123.456.789-0");
		cliente3.setId(3);
		cliente3.setNome("Pedro");
			
		Cabeleireiro cabeleireiro1 = new Cabeleireiro("Gabriel", "321.654.987-0");
		cabeleireiro1.setId(1);
		Cabeleireiro cabeleireiro2 = new Cabeleireiro("Vinicius", "789.456.123-0");
		cabeleireiro2.setId(2);
		Cabeleireiro cabeleireiro3 = new Cabeleireiro("Vitor", "789.321.456-00");
		cabeleireiro3.setId(3);

		Serviço servico1 = new Serviço();
		servico1.setId(1);
		servico1.setNome("Corte Masculino");
		servico1.setDescricao("Corte de Cabelo Masculino");
		servico1.setValor(40.00);
		Serviço servico2 = new Serviço();
		servico2.setId(2);
		servico2.setNome("Corte Feminino");
		servico2.setDescricao("Corte de Cabelo Feminino");
		servico2.setValor(60.00);
		Serviço servico3 = new Serviço();
		servico3.setId(3);
		servico3.setNome("Lavagem");
		servico3.setDescricao("Lavgem de cabelo unissex");
		servico3.setValor(20.00);
			
		Serviço[] lista1 = {servico1,servico2};
		Serviço[] lista2 = {servico2,servico3};
		Serviço[] lista3 = {servico1,servico2,servico3};
			
		Agendamento agendamento1 = new Agendamento(cliente1, cabeleireiro1);
		agendamento1.setId(1);
		agendamento1.setHora(15);
		agendamento1.setMinuto(30);
		Agendamento agendamento2 = new Agendamento(cliente2, cabeleireiro2);
		agendamento2.setId(2);
		agendamento2.setHora(17);
		agendamento2.setMinuto(00);
		Agendamento agendamento3 = new Agendamento(cliente3, cabeleireiro3);
		agendamento3.setId(3);
		agendamento3.setHora(14);
		agendamento3.setMinuto(45);
		
		Atendimento atendimento1 = new Atendimento(cliente1);
		atendimento1.setCabeleireiro(cabeleireiro1);
		atendimento1.setServico(lista1);
		Atendimento atendimento2 = new Atendimento(cliente2);
		atendimento2.setCabeleireiro(cabeleireiro2);
		atendimento2.setServico(lista2);
		Atendimento atendimento3 = new Atendimento(cliente3);
		atendimento3.setCabeleireiro(cabeleireiro3);
		atendimento3.setServico(lista3);
			
		
//Funcionalidade 2
		Scanner entrada = new Scanner(System.in);
		int OP = -1,tamanho=0;
		while(OP != 0) {
			mostrarOpcoes();
			OP = entrada.nextInt();
			switch(OP) {
				case 1:
					registrarCliente();
					break;
				case 2:
					registrarCabeleireiro();
					break;
				case 3:
					registrarServiço();
					break;
				case 4:
					System.out.println("Preencha o registro de Cliente e Cabeleireiro,após isso será possível preencher o Agendamento");
					registrarAgendamento(registrarCliente(),registrarCabeleireiro());
					break;
				case 5:
					System.out.println("Informe a quantidade de serviços do Atendimento:");
					tamanho = entrada.nextInt();
					Serviço[] lista = new Serviço[tamanho];
					for (int contador = 0; contador < tamanho; contador++) {
						lista[contador] = registrarServiço();
					}
					registrarAtendimento(registrarCliente(),registrarCabeleireiro(),lista);
					break;
				case 0:
					OP = 0;
					break;
			}
		}
		
		entrada.close();
		
//Funcionalidade 3
		exibirCliente(cliente1);
		System.out.println();
		exibirCliente(cliente2);
		System.out.println();
		exibirCliente(cliente3);
		System.out.println();
		System.out.println();
		exibirCabeleireiro(cabeleireiro1);
		System.out.println();
		exibirCabeleireiro(cabeleireiro2);
		System.out.println();
		exibirCabeleireiro(cabeleireiro3);
		System.out.println();
		System.out.println();
		exibirServiço(servico1);
		System.out.println();
		exibirServiço(servico2);
		System.out.println();
		exibirServiço(servico3);
		System.out.println();
		System.out.println();
		exibirAgendamento(agendamento1);
		System.out.println();
		exibirAgendamento(agendamento2);
		System.out.println();
		exibirAgendamento(agendamento3);
		System.out.println();
		System.out.println();
		exibirAtendimento(atendimento1);
		System.out.println();
		exibirAtendimento(atendimento2);
		System.out.println();
		exibirAtendimento(atendimento3);
		
	}

}
