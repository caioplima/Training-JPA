package teste.basico;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import Modelo.basico.Usuario;

public class AlterarUsuario01 {
	public static void main(String[] args) {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("exercicios-jpa");
		EntityManager em = emf.createEntityManager();
		
		em.getTransaction().begin();
		
		Usuario usuario = em.find(Usuario.class, 7L);
		usuario.setNome("Leonardo");
		usuario.setEmail("leonardo@teste.com.br");
		em.merge(usuario);
		em.getTransaction().commit();
		
		//em.detach(usuario) -> quando o detach for usado, o objeto (usuario) não vai estar gerenciável e precisa do merge para alterar..
		// caso contrário o merge não é necessário.
		
		em.close();
		emf.close();
	}
}


