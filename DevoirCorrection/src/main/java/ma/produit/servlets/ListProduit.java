package ma.produit.servlets;

import java.io.IOException; 
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import ma.produit.classP.Produit;
import ma.produit.dao.ProduitDao;
import ma.produit.dao.produitDaoImpt;


@WebServlet("/ListProduit")
public class ListProduit extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    
    public ListProduit() {
        super();
        // TODO Auto-generated constructor stub
    }

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		 
		ProduitDao dao = new produitDaoImpt();
        List<Produit> products=dao.listProduits();
		request.setAttribute("products", products);
		this.getServletContext().getRequestDispatcher("/ListTransactions.jsp").forward(request,response);
		  
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
	}

}
