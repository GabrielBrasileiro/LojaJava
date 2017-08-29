import java.util.Scanner;

public class Pedido {

	Scanner sc = new Scanner(System.in);
	private String Data;
	private String Id_Pedido;
	private String Validade;
		
	public String getData() {
	
		return Data;
	
	}
	
	public void setData(String data) {
	
		Data = data;
	
	}
	
	public String getId_Pedido() {
	
		return Id_Pedido;
	
	}
	
	public void setId_Pedido(String id_Pedido) {
	
		Id_Pedido = id_Pedido;
	
	}
	
	public String getValidade() {
	
		return Validade;
	
	}
	
	public void setValidade(String validade) {
	
		Validade = validade;
	
	}
	
	public void Digitavel() {
		
		System.out.println("Digite o número do pedido: ");
		this.setId_Pedido(sc.nextLine());

		System.out.println("Digite a data do pedido: ");
		this.setData(sc.nextLine());

		System.out.println("Adicione o prazo do pedido: ");
		this.setValidade(sc.nextLine());

	}
	
	public void Infor() {

		System.out.println("Número do pedido: " + this.getId_Pedido());
		System.out.println("Data do pedido: " + this.getData());
		System.out.println("Data validade do pedido: " + this.getValidade());
//		System.out.println("Roupa Id: " + this.cliente.peca.getId());
//		System.out.println("Modelo: " + this.cliente.peca.getNome());
//		System.out.println("Cor: " + this.cliente.peca.getCor());
//		System.out.println("Nome cliente: " + this.cliente.getNome());
//		System.out.println("E-mail cliente: " + this.cliente.getEmail());
//		System.out.println("CPF Cliente: " + this.cliente.getCpf());
//		System.out.println("Valor Final: " + this.cliente.pagamento.getValorfinal());
//		System.out.println("Número de parcelas " + this.cliente.pagamento.getParcelas());
		System.out.println("");

	}
	
}
