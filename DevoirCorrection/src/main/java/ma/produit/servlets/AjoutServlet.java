package ma.produit.servlets;

import java.io.IOException; 
import java.io.Writer;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import ma.produit.classP.Produit;
import ma.produit.dao.ProduitDao;
import ma.produit.dao.produitDaoImpt;
@WebServlet("/AjoutServlet")
public class AjoutServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;


    public AjoutServlet() {
        super();
        // TODO Auto-generated constructor stub
    }


	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
	}


	@Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// Récupération des paramètres du formulaire
        String ref = request.getParameter("ref");
        String CptDep = request.getParameter("CptDep");
        String CptCred = request.getParameter("CptCred");
        Double Montant = Double.parseDouble(request.getParameter("Montant"));

        ProduitDao dao = new produitDaoImpt();
        dao.addProduit(new Produit(ref,CptDep,CptCred,Montant));
       

	

	}}
