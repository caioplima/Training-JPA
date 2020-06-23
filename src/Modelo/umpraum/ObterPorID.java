package Modelo.umpraum;

import infra.DAO;

public class ObterPorID {
	public static void main(String[] args) {
		DAO<Cliente> daoCliente = new DAO<>(Cliente.class);
		Cliente cliente = daoCliente.obterPorId(1L);
		System.out.println("Nome: " + cliente.getNome() + ", Assento: " + cliente.getAssento());
		daoCliente.fechar();
	}
}


