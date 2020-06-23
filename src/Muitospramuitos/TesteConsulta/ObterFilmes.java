package Muitospramuitos.TesteConsulta;

import java.util.List;

import Muitospramuitos.Ator;
import Muitospramuitos.Filme;
import infra.DAO;

public class ObterFilmes {
	public static void main(String[] args) {
		DAO<Filme> dao = new DAO<Filme>(Filme.class);
		List<Filme> filmes = dao.consultar("obterFilmesComNotaMaiorQue", "nota", 8.5);
		System.out.println("Filme com maior nota e seus atores: ");
		for( Filme filme: filmes) {
			System.out.println(filme.getNome() + " -> " + filme.getNota());
			for(Ator ator: filme.getAtores()) {
				System.out.println(ator.getNome());
			}
		}
	}
}

