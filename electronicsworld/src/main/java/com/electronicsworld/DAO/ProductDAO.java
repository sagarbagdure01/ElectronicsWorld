package com.electronicsworld.DAO;

import java.util.List;

import com.electronicsworld.model.Product;

public interface ProductDAO 
{
	public void addProduct(Product product);

	public List<Product> fetchAllProduct();

	public String fetchAllProductByJson();
	
	public String fetchFlagProductByJson();

	public Product getProductById(int productId);
	
	public void updateProduct(Product product);

	public void deleteProduct(int productId);
	
	public String productSearchSubCatJson(int subCategoryId);


}
