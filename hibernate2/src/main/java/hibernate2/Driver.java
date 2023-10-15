package hibernate2;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class Driver
{
	public static void main(String[] args)
	{
		EntityManagerFactory em = Persistence.createEntityManagerFactory("dev");
		EntityManager m = em.createEntityManager();
		EntityTransaction t = m.getTransaction();
		
		cat d = new cat();
		d.setAge(1);
		d.setName("lohith");
		d.setAddress("ffdhgfytg");
		d.setGender('m');
		
		t.begin();
		m.persist(d);
		t.commit();
		
	}

}
