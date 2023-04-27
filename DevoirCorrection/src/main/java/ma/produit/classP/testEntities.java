package ma.produit.classP;

import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class testEntities {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		EntityManagerFactory ef = Persistence.createEntityManagerFactory("myapp");
	}

}
