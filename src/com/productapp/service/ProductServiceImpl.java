package com.productapp.service;

import com.productapp.exceptions.ProductNotFoundException;
import com.productapp.model.Product;

public class ProductServiceImpl implements IProductService {

	@Override
	public Product getById(int id) throws ProductNotFoundException 
	{
		Product[] products = showProducts();
		
		for(Product product : products)
		{
			if(product.getId() == id)
			{
				return product;
			}
		}
		throw new ProductNotFoundException("Id not available");
	}

	@Override
	public Product[] getByBrand(String brand) throws ProductNotFoundException 
	{
		Product[] products = showProducts();
		int i = 0;
		int count = 0;
		
		for(Product product : products)
		{
			if(product.getBrand().equalsIgnoreCase(brand))
			{
				count++;
			}
		}
		Product[] productsByBrand = new Product[count];
		
		for(Product product : products)
		{
			if(product.getBrand().equalsIgnoreCase(brand))
			{
				productsByBrand[i] = product;
				i++;
			}
		}
		if(i == 0)
		{
			throw new ProductNotFoundException("Brand not available");
		}
		return productsByBrand;		
	}

	@Override
	public Product[] showProducts() 
	{
		return new Product[] 
		{
				new Product(101, 55000L, "Laptop", "Dell"),
		        new Product(102, 25000L, "Mobile", "Samsung"),
		        new Product(103, 5000L, "Headphone", "Sony"),
		        new Product(104, 15000L, "Monitor", "Dell"),
		        new Product(105, 30000L, "Tablet", "Samsung")
		 };		
	}

	@Override
	public Product[] getAll() 
	{
		 return showProducts();
	}

}
