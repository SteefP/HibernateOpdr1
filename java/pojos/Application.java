package pojos;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import pojos.Baas;

public class Application {

	public static void main(String[] args) {

		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("Hibernate");
		EntityManager em = entityManagerFactory.createEntityManager();


		Baas b = em.find(Baas.class, 1);
	
		System.out.print(b);
		em.close();
		System.exit(0);
	}

}
