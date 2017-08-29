import java.util.ArrayList;

import javax.swing.JOptionPane;

public class Programa {

	public static void main(String[] args) {

		Dados dados = new Dados();

		// ArrayList<Cliente> arrayRegistroCliente = new ArrayList<>();
		// ArrayList<Roupa> arrayRegistroRoupa = new ArrayList<>();
		// ArrayList<Pagamento> arrayRegistroPagamento = new ArrayList<>();

		int opcao = 0;

		// Saida das caixas de texto
		String menu = "1 - Registrar Cliente\n" + "2 - Resgistrar Roupa\n" + "3 - Fazer Compra\n"
				+ "4 - Lista de Clientes\n" + "5 - Lista de Roupas\n" + "6 - Sair\n";

		// Declaração valor final
		double valorFinal;

		// Comparativos situacinais
		int id_cliente, qtd_roupas, id_roupa;

		// Número que é aramazenado no ArrayList
		int contACliente = 0, contARoupas = 0;

		// Contador da quantidade em si
		int contCliente = 0, contRoupas = 0, contPedidos = 0;

		do {

			opcao = Integer.parseInt(JOptionPane.showInputDialog(menu));

			if (opcao == 1) {

				// Registro Cliente

				Cliente c = new Cliente();
				c.DigitavelCliente();
				c.setId(contACliente++);

				dados.registroCliente(c);

				JOptionPane.showMessageDialog(null, "Cadastro do Cliente realizado com sucesso\n" + c);
				System.out.println(c);

				contCliente++; // Contador de Clientes local

			}

			if (opcao == 2) {

				// Registro das roupas

				Roupa r = new Roupa();
				r.DigitavelRoupa();
				r.setId(contARoupas++);

				dados.registroRoupa(r);

				JOptionPane.showMessageDialog(null, "Cadastro da roupa realizado com sucesso\n" + r);
				System.out.println(r);

				contRoupas++; // Contador de roupas local

			}

			if (opcao == 3) {

				// Registro dos pagamentos
				id_cliente = Integer.parseInt(JOptionPane.showInputDialog("Digite o id do cliente: "));

				// Função para adquirir tamanho do array
				for (int i = 0; i < dados.arrayRegistroCliente.size(); i++) {

					Cliente cl = dados.arrayRegistroCliente.get(i);

					System.out.println("Clientes cadastrados acessados:\n" + cl);

					// Foi adquirido a informação interna do arraylist e comparada com a informaçãolocal
					if (cl.getId() == id_cliente) {
						
						id_roupa = Integer.parseInt(JOptionPane.showInputDialog("Digite o id da roupa que vai comprar: "));
						
						for (int r = 0; r < dados.arrayRegistroRoupa.size(); r++) {
							
							Roupa rp = dados.arrayRegistroRoupa.get(r);

							System.out.println("\nRoupa cadastrada acessada:\n" + rp);
							
							if (rp.getId() == id_roupa) {
								
								valorFinal = dados.arrayRegistroRoupa.get(r).getPreco();
								
								Pagamento p = new Pagamento();
								p.DigitavelPagamento();
								p.setValorfinal(valorFinal);

								dados.registroPagamento(p);

								JOptionPane.showMessageDialog(null, "Recibo pagamento:\n" + p + "\n\nInformações do cliente:\n" + dados.arrayRegistroCliente.get(i).toString() + "\nInformações da roupa:\n" + dados.arrayRegistroRoupa.get(i).toString());
								System.out.println(p);

								contPedidos++;
								
							}
							
						}

					}

				}

			}

			if (opcao == 4) {

				JOptionPane.showMessageDialog(null, "Número de Clientes Cadastrados: \n" + contCliente);

				JOptionPane.showMessageDialog(null, "Clientes Cadastradas: \n" + dados.listaClientes());

			}

			// Exemplo de saída
			if (opcao == 5) {

				JOptionPane.showMessageDialog(null, "Número de Roupas Cadastrados: \n" + contRoupas);

				JOptionPane.showMessageDialog(null, "Roupas Cadastrados: \n" + dados.listaRoupas());

			}

		} while (opcao != 6);

	}

}
// Gabriel Brasileiro