import java.util.Scanner;

import javax.swing.JOptionPane;

public class Pagamento {

	Scanner sc = new Scanner(System.in);

	private int forma;
	private int parcelas;
	private int id_cliente;
	private double valorfinal;
	private double adicional;

	public int getId_cliente() {

		return id_cliente;

	}

	public void setId_cliente(int id_cliente) {

		this.id_cliente = id_cliente;

	}

	public int getForma() {

		return forma;

	}

	public void setForma(int forma) {

		this.forma = forma;

	}

	public int getParcelas() {

		return parcelas;

	}

	public void setParcelas(int parcelas) {

		this.parcelas = parcelas;

	}

	public double getValorfinal() {

		return valorfinal;

	}

	public void setValorfinal(double valorfinal) {

		this.valorfinal = valorfinal;

	}

	public double getAdicional() {

		return adicional;

	}

	public void setAdicional(double adicional) {

		this.adicional = adicional;

	}

	public double ValorFinal() {

		return getValorfinal() + (getValorfinal() * getAdicional());

	}

	public int Parcelas() {

		return getParcelas();

	}
	
	public double ValorParcelado() {

		if (getParcelas() != 0) {

			return getValorfinal() / getParcelas();

		} else {

			return 0;
			
		}

	}

	public void DigitavelPagamento() {

		// this.setId_cliente(Integer.parseInt(JOptionPane.showInputDialog("Digite o id
		// do cliente: ")));
		// this.setNome(sc.nextLine());

		// this.setValorfinal(Double.parseDouble(JOptionPane.showInputDialog("Digite o valor final da compra: ")));
		// this.setNome(sc.nextLine());

		this.setForma(Integer.parseInt(JOptionPane.showInputDialog("Digite a forma de pagamento:\n1-Crédito\n2-Débito")));
		// this.setTelefone(sc.nextInt());

		if (this.getForma() == 1) {

			this.setParcelas(Integer.parseInt(JOptionPane.showInputDialog("Digite o número de parcelas")));

		}

	}

	public void InforPag() {

		// System.out.println("Id Cliente: " + this.getId_cliente());
		System.out.println("Valor final " + this.getValorfinal());
		System.out.println("Forma de Pagamento: " + this.getForma());
		System.out.println("Parcelas: " + this.getParcelas());
		System.out.println("");

	}

	@Override
	public String toString() {

		return  "Valor Final: " + this.getValorfinal() + "\n"
				+ "Forma de Pagamento: " + this.getForma() + "\n" 
				+ "Parcelas: " + this.getParcelas() + "\n"
				+ "Valor parcelado: " + this.ValorParcelado() + " ";

	}

}
