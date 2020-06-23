package Modelo.Heranca;

import infra.DAO;

public class InserindoAluno {
	public static void main(String[] args) {
		DAO<Aluno> dao = new DAO<Aluno>();
		Aluno aluno1 = new Aluno(001L, "Pedro Henrique");
		AlunoBolsista aluno2 = new AlunoBolsista(002L, "Maria Cecília", 580.00);
		
		dao.incluirAtomico(aluno1);
		dao.incluirAtomico(aluno2);
		dao.fechar();
		
	}
}


