import java.util.ArrayList;

public class Dados {

	ArrayList<Cliente> arrayRegistroCliente = new ArrayList<>();
	ArrayList<Roupa> arrayRegistroRoupa = new ArrayList<>();
	ArrayList<Pagamento> arrayRegistroPagamento = new ArrayList<>();

	public void registroCliente(Cliente cliente) {

		arrayRegistroCliente.add(cliente);

	}

	public String listaClientes() {

		String lista = "";

		for (int c = 0; c < this.arrayRegistroCliente.size(); c++) {

			Cliente cl = this.arrayRegistroCliente.get(c);
			lista += "Id Cliente: " + cl.getId() + "\n" 
					+ "Nome: " + cl.getNome() + "\n" 
					+ "Telefone: " + cl.getTelefone()+ "\n" 
					+ "E-mail: " + cl.getEmail() + "\n" 
					+ "CPF: " + cl.getCpf() + "\n" 
					+ "\n";

		}

		return lista;

	}

	public void registroRoupa(Roupa roupa) {

		arrayRegistroRoupa.add(roupa);

	}

	public String listaRoupas() {

		String lista = "";

		for (int r = 0; r < this.arrayRegistroRoupa.size(); r++) {

			Roupa rp = this.arrayRegistroRoupa.get(r);
			lista += "Id da roupa " + rp.getId() + "\n"
					+ "Nome Roupa:: " + rp.getNome() + "\n"
					+ "Material: " + rp.getMaterial() + "\n"
					+ "Cor: " + rp.getCor() + "\n"
					+ "Preço " + rp.getPreco() + "\n"
					+ "\n";

		}

		return lista;

	}

	public void registroPagamento(Pagamento pagamento) {

		arrayRegistroPagamento.add(pagamento);

	}

}
