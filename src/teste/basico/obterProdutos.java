package teste.basico;

import java.util.List;

import Modelo.basico.Produto;
import infra.produtoDAO;

public class obterProdutos {
	public static void main(String[] args) {
		
		produtoDAO dao = new produtoDAO();
		List<Produto> produtos = dao.obterTodos();
		
		for(Produto produto: produtos) {
			System.out.println("ID: " + produto.getId() + ", Nome: " + produto.getNome() + ", Preço: R$ " + produto.getPreco());
		}
		double precoTotal = produtos.stream().map(p -> p.getPreco()).reduce(0.0, (t, p) -> t + p).doubleValue();
		System.out.println("Valor total dos produtos: R$ " + precoTotal);
		
		dao.fechar();
	}
}


