package com.electronicsworld.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import com.electronicsworld.model.Product;
import com.electronicsworld.serviceImpl.ProductServiceImp;

@Controller
public class ProductController
{
	@Autowired
	private ProductServiceImp productService;
	@RequestMapping("/AddProduct")
	public String addProduct(Model model)
	{
		model.addAttribute("product",new Product());
		return "AddProduct";
	}
	
	@RequestMapping("/save")
	public String saveProduct(@ModelAttribute(name="product") Product product,Model model)
	{
		 productService.addProduct(product);
	
		return "redirect:/display";
	}
	
	@RequestMapping("/display")
	public String getProduct(Model model)
	{
		
		List<Product> productlist=productService.fetchAllProduct();
		model.addAttribute("productlist", productlist);
		return "display";
	}
	
	
	@RequestMapping("/update/{id}")
	public String updateProduct(@PathVariable int id,Model model)
	{
		Product product=productService.getProductById(id);
		model.addAttribute("product", product);
		
		
		return "AddProduct";
	}
}
