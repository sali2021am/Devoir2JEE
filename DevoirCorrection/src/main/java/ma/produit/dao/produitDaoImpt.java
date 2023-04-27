package ma.produit.dao;

import java.sql.ResultSet; 
import java.sql.SQLException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import org.hibernate.query.Query;

import ma.produit.classP.Produit;

public class produitDaoImpt implements ProduitDao {
	private EntityManager em ;
	
	
	public produitDaoImpt() {
		 EntityManagerFactory ef = Persistence.createEntityManagerFactory("myapp");
		 em = ef.createEntityManager();
	}
	
	public void addProduit(Produit p) {
		em.getTransaction().begin();
		try {
		em.persist(p);
		em.getTransaction().commit();
		
		}catch(Exception e) {
			em.getTransaction().rollback();
			e.printStackTrace();
		}
		
	}
	public List<Produit> listProduits() {
		Query query = (Query) em.createQuery("select p from Produit p");
		return query.getResultList();
}

	
	
}	
