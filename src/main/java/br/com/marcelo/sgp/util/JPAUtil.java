package br.com.marcelo.sgp.util;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class JPAUtil {

	EntityManagerFactory emf = Persistence.createEntityManagerFactory("sgp");
	
	public EntityManager getEntityManager() {
		return emf.createEntityManager();
	}
	
}
