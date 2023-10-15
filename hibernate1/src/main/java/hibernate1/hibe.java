package hibernate1;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class hibe 
{
	public static void main(String[] args) 
	{
		EntityManagerFactory em= Persistence.createEntityManagerFactory("dev");
		EntityManager e = em.createEntityManager();
		EntityTransaction t = e.getTransaction();
		
		hibe1 d = new hibe1();
		d.setId(3);
		d.setName("hemanth");
		d.setNumber(4647896);
		
		t.begin();
		e.persist(d);
		t.commit();
	}

}
