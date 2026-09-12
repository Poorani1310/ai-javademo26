package com.productapp.main;

import com.productapp.exceptions.ProductNotFoundException;
import com.productapp.model.Product;
import com.productapp.service.IProductService;
import com.productapp.service.ProductServiceImpl;

public class ProductMain {

	public static void main(String[] args) 
	{
		IProductService productService = new ProductServiceImpl();
		Product[] products = productService.showProducts();
		System.out.println("Show Products");
		for (Product product: products)
		{
			System.out.println(product);
		}
		
		products = productService.getAll();
		System.out.println("get All");
		for (Product product: products)
		{
			System.out.println(product);
		}
		
		System.out.println("getById 105");
		try 
		{
			Product product = productService.getById(105);
			System.out.println(product);
		} 
		catch (ProductNotFoundException e) 
		{
			System.out.println(e.getMessage());
		}
		System.out.println("getByBrand Samsung");
		try 
		{
			products = productService.getByBrand("Samsung");
			for(Product product: products)
			{
				System.out.println(product);
			}
		} 
		catch (ProductNotFoundException e) 
		{
			System.out.println(e.getMessage());
		}
		
	}

}
