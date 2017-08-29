import java.util.Scanner;

import javax.swing.JOptionPane;

public class Roupa {

	Scanner sc = new Scanner(System.in);
	
	private double preco;
	private String tamanho;
	private String material;
	private String nome;
	private String cor;
	private int id;
	
	Fornecedor fornecedor;

	public double getPreco() {

		return preco;

	}

	public void setPreco(double preco) {

		this.preco = preco;

	}

	public String getTamanho() {

		return tamanho;

	}

	public void setTamanho(String tamanho) {

		this.tamanho = tamanho;

	}

	public String getMaterial() {

		return material;

	}

	public void setMaterial(String material) {

		this.material = material;

	}

	public String getNome() {

		return nome;

	}

	public void setNome(String nome) {

		this.nome = nome;

	}

	public String getCor() {

		return cor;

	}

	public void setCor(String cor) {

		this.cor = cor;

	}

	public int getId() {

		return id;
	}

	public void setId(int id) {

		this.id = id;

	}
	
	// Chamada da classe anterior e as suas propriedades lógicas
	
	public Fornecedor getFornecedor() {
		
		return fornecedor;
		
	}

	public void setFornecedor(Fornecedor fornecedor) {
		
		this.fornecedor = fornecedor;
	
	}
	
	public void setNomeFornecedor(String fornecedor) {
		
		this.fornecedor.setNomefornecedor(fornecedor);
		
	}
	
	public String getNomeFornecedor() {
		
		return fornecedor.getNomefornecedor();
		
	}
	
	public int getQntEstoque() {
		
		return fornecedor.getQtdFornecedor();
		
	}
	
	public int getNumPedido() {
		
		return fornecedor.getPedido();
		
	}
	
	// Fim da declaração da sub classe
	
	public void DigitavelRoupa() {

		this.setNome(JOptionPane.showInputDialog("Digite o nome da roupa: "));

		this.setMaterial(JOptionPane.showInputDialog("Digite o Material da roupa: "));

		this.setCor(JOptionPane.showInputDialog("Digite a cor da roupa: "));

		this.setPreco(Double.parseDouble(JOptionPane.showInputDialog("Digite o valor da roupa: ")));

//		this.fornecedor.setNomefornecedor(JOptionPane.showInputDialog("Digite o nome do fornecedor: "));
//		
//		this.fornecedor.setPedido(Integer.parseInt(JOptionPane.showInputDialog("Digite o número do pedido: ")));
//		
//		this.fornecedor.setQtdFornecedor(Integer.parseInt(JOptionPane.showInputDialog("Digite a quantidade no estoque: ")));

	}
	
	public void InforRoupa() {
		
		System.out.println("Nome da roupa: " + this.getNome());
		System.out.println("Id da roupa " + this.getId());
		System.out.println("Material: " + this.getMaterial());
		System.out.println("Cor: " + this.getCor());
		System.out.println("Preço: " + this.getPreco());
//		System.out.println("Parcelas: " + this.fornecedor.getNomefornecedor());
//		System.out.println("Parcelas: " + this.fornecedor.getPedido());
//		System.out.println("Parcelas: " + this.fornecedor.getQtdFornecedor());
		System.out.println("");
		
	}
	
	@Override
	public String toString() {
		
		return "Id da roupa " + this.getId() + "\n"
		+ "Nome Roupa:: " + this.getNome() + "\n"
		+ "Material: " + this.getMaterial() + "\n"
		+ "Cor: " + this.getCor() + "\n"
		+ "Preço " + this.getPreco() + "\n"
		+ " ";
	
	}

}
