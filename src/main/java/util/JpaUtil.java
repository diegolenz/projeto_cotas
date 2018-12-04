package util;


import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class JpaUtil {

	public JpaUtil() {
		// TODO Auto-generated constructor stub
	}

	
	private static EntityManagerFactory emt=Persistence.createEntityManagerFactory("controle_hotel");
	
	public static EntityManager getEM() {
		
		return emt.createEntityManager();
		
	}

}
