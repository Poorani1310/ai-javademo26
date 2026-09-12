package com.productapp.model;

public class Product 
{
	private int id;
	private long price;
	private String name;
	private String brand;
	
	public Product() 
	{
		super();
	}

	public Product(int id, long price, String name, String brand) 
	{
		super();
		this.id = id;
		this.price = price;
		this.name = name;
		this.brand = brand;
	}
	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public long getPrice() {
		return price;
	}

	public void setPrice(long price) {
		this.price = price;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	@Override
	public String toString() {
		return "Product [Id= " + id + ", Price= " + price + ", Name= " + name + ", Brand= " + brand + "]";
	}
	
	

}
