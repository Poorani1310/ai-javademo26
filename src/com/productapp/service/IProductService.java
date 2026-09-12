package com.productapp.service;

import com.productapp.exceptions.ProductNotFoundException;
import com.productapp.model.Product;

public interface IProductService 
{
	Product getById(int id) throws ProductNotFoundException;
	
	Product[] getByBrand(String brand) throws ProductNotFoundException;
	
	Product[] showProducts();
	
	Product[] getAll();
}
