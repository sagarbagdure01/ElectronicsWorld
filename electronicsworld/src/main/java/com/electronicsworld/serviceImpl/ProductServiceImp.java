package com.electronicsworld.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.electronicsworld.DAO.ProductDAO;
import com.electronicsworld.DAOImpl.ProductDAOimp;
import com.electronicsworld.model.Product;
import com.electronicsworld.service.IproductService;

@Service
public class ProductServiceImp implements IproductService
{
	@Autowired
	private ProductDAO productDao;
	public void addProduct(Product product) 
	{
		productDao.addProduct(product);
	}

	public List<Product> fetchAllProduct() {
		// TODO Auto-generated method stub
		return productDao.fetchAllProduct();
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
		// TODO Auto-generated method stub
		return productDao.getProductById(productId );
	}
	
	public void updateProduct(Product product)
	{
		productDao.updateProduct(product);
	
	}

	public void deleteProduct(int productId) {
		// TODO Auto-generated method stub

	}

	public String productSearchSubCatJson(int subCategoryId) {
		// TODO Auto-generated method stub
		return null;
	}

}
