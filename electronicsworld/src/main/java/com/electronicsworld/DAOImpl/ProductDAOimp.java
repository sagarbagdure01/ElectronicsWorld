package com.electronicsworld.DAOImpl;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.electronicsworld.DAO.ProductDAO;
import com.electronicsworld.model.Product;

@Repository
public class ProductDAOimp implements ProductDAO {

	
	@Autowired
	private SessionFactory sessionFactory;
	public void addProduct(Product product) 
	{
		
		System.out.println("trying to open connection start");
		Session con = sessionFactory.openSession();
		System.out.println("started");
		System.out.println("trying to beging trasaction");
		Transaction tran = con.beginTransaction();
		System.out.println("transaction started");
		con.save(product);
		tran.commit();
		con.close();
	

	}

	public List<Product> fetchAllProduct() {
		
		Session session=sessionFactory.openSession();
		Query query=session.createQuery("from Product");
		List<Product> productList=query.list();
		
		session.close();
		return productList;
		
	}

	public String fetchAllProductByJson() {
		// TODO Auto-generated method stub
		return null;
	}

	public String fetchFlagProductByJson() {
		// TODO Auto-generated method stub
		return null;
	}

	public Product getProductById(int productId) {
		
		Session session=sessionFactory.openSession();
		Product product=(Product)session.get(Product.class, productId);
		session.close();
		return product;
		
		
	}
	
	public void updateProduct(Product product)
	{
		Session session=sessionFactory.openSession();
		session.update(product);
		session.flush();
		session.close();
		
	}

	public void deleteProduct(int productId) {
		// TODO Auto-generated method stub

	}

	public String productSearchSubCatJson(int subCategoryId) {
		// TODO Auto-generated method stub
		return null;
	}

}
