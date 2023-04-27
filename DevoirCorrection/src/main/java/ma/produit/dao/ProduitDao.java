package ma.produit.dao;

import java.util.List;

import ma.produit.classP.Produit;

public interface ProduitDao {
public void addProduit(Produit p);
public List<Produit> listProduits();


}
