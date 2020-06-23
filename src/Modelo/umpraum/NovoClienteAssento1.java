package Modelo.umpraum;

import infra.DAO;


public class NovoClienteAssento1 {
	public static void main(String[] args) {
		Assento assento = new Assento("1A");
		Cliente cliente = new Cliente("Caio", assento);
		
		DAO<Object> dao = new DAO<>();
		
		dao.incluirAtomico(cliente);
	}
}



 