import java.util.Scanner;

import javax.swing.JOptionPane;

public class Cliente {

	Scanner sc = new Scanner(System.in);
	private String nome;
	private String email;
	private int telefone;
	private int cpf;
	private int qtd;
	private int id = 0;
	
	public int getId() {

		return id;

	}

	public void setId(int id) {

		this.id = id;

	}
	
	public String getNome() {

		return nome;

	}

	public void setNome(String nome) {

		this.nome = nome;

	}

	public int getTelefone() {

		return telefone;

	}

	public void setTelefone(int telefone) {

		this.telefone = telefone;

	}

	public String getEmail() {

		return email;

	}

	public void setEmail(String email) {

		this.email = email;

	}

	public int getCpf() {

		return cpf;

	}

	public void setCpf(int cpf) {

		this.cpf = cpf;

	}

	public int getQtd() {

		return qtd;

	}

	public void setQtd(int qtd) {

		this.qtd = qtd;

	}

	
	//Condição de soma da roupa
	

	// Parte para o cliente digitar as seleções

	public void DigitavelCliente() {

		this.setNome(JOptionPane.showInputDialog("Digite o nome do Cliente: "));
		//this.setNome(sc.nextLine());

		this.setTelefone(Integer.parseInt(JOptionPane.showInputDialog("Digite o seu telefone: ")));
		//this.setTelefone(sc.nextInt());

		this.setEmail(JOptionPane.showInputDialog("Digite o seu email: "));
		//this.setEmail(sc.nextLine());

		this.setCpf(Integer.parseInt(JOptionPane.showInputDialog("Digite o seu CPF: ")));
		//this.setCpf(sc.nextInt());

		//this.setQtd(Integer.parseInt(JOptionPane.showInputDialog("Digite a quantidade: ")));
		//this.setQtd(sc.nextInt());
		
	}
	
	// Sistema de exibição
	
	public void Infor() {
		
		System.out.println("Nome: " + this.getNome());
		System.out.println("Telefone: " + this.getTelefone());
		System.out.println("E-mail: " + this.getEmail());
		System.out.println("CPF: " + this.getCpf());
		//System.out.println("Quantidade de peças: " + this.getQtd());
		System.out.println("");

	}

	@Override
	public String toString() {
		
		return "Id Cliente: " + this.id + "\n"
		+ "Nome: " + this.getNome() + "\n"
		+ "Telefone: " + this.getTelefone() + "\n"
		+ "E-mail: " + this.getEmail() + "\n"
		+ "CPF: " + this.getCpf() + "\n"
		+ " ";
	
	}
	

	// public void setPagamento(double pagamento) {
	//
	// this.pagamento = pagamento;
	//
	// }

}
