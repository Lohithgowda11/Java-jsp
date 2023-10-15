package Sample;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class driver
{
	public static void main(String[] args)
	{
		EntityManagerFactory em = Persistence.createEntityManagerFactory("dev");
		EntityManager m= em.createEntityManager();
		EntityTransaction t = m.getTransaction();
		
		Program1 p =new Program1();
		p.setAge(1);
		p.setAddress("dbgjdjkjdkjd");
		p.setName("bhfh");
		p.setGender('m');
		
		t.begin();
		m.persist(p);
		t.commit();
		
		
	}

}
