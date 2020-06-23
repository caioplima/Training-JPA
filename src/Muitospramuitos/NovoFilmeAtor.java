package Muitospramuitos;

import infra.DAO;

public class NovoFilmeAtor {
	public static void main(String[] args) {
		Filme filmeA = new Filme("Titanic", 9.1);
		Filme filmeB = new Filme("Wall Street", 8.5);
		
		
		Ator ator1 = new Ator("Leoanrdo Di Caprio");
		Ator ator2 = new Ator("kate Winslet");
		
		filmeA.adicionarAtor(ator1);
		filmeA.adicionarAtor(ator2);
		filmeB.adicionarAtor(ator1);
		
		DAO<Filme> dao = new DAO<Filme>();
		dao.incluirAtomico(filmeA);
		dao.incluirAtomico(filmeB);
		
	}
}

