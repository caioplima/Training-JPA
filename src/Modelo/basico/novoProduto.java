package Modelo.basico;

import infra.DAO;

public class novoProduto {
	public static void main(String[] args) {
		Produto produto = new Produto("Notebook CCE", 1390.50);
		DAO<Produto> dao = new DAO<>(Produto.class);
		dao.incluirAtomico(produto).fechar();
	}
	
}

