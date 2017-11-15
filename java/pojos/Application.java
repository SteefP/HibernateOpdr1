package pojos;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import pojos.Baas;

public class Application {

	public static void main(String[] args) {

		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("Hibernate");
		EntityManager em = entityManagerFactory.createEntityManager();

		em.getTransaction().begin();
		Product product1 = new Product(1, "Productnaam", "Dit is de product omschrijving");
		Baas baas1 = new Baas(0, "Steef", "Gitaar");
		em.persist(product1);
		em.persist(baas1);
		em.getTransaction().commit();

	

		Baas b = em.find(Baas.class, 1);
	
		System.out.print(b);
		em.close();
		System.exit(0);
	}

}
