package com.book.dao;

import java.util.List;

import com.book.model.Supplier;


public interface SupplierDao 
{
	public boolean add(Supplier supplier);
	public boolean delete(Supplier supplier);
	public boolean update(Supplier supplier);
	
	public List<Supplier> listsupplier();
	Supplier getSupplier(int SupplierId);

}


