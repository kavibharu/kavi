package com.book.dao;

import java.util.List;

import com.book.model.Product;

public interface ProductDao
{
	public boolean add(Product product);
	public boolean delete(Product product);
	public boolean update(Product product);
	public List<Product> listproducts();
	Product getProduct(int ProductId);
	public List<Product> listcategorywiseProducts(int categoryId);
}
