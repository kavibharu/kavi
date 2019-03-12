package com.book.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table
public class Supplier 
{
@Id
@GeneratedValue
 int SupplierId;
String SupplierName;
String SupplierAddress;


public int getSupplierId() 
{
	return SupplierId;
}
public void setSupplierId(int supplierId) 
{
	SupplierId = supplierId;
}
public String getSupplierName()
{
	return SupplierName;
}
public void setSupplierName(String supplierName)
{
	SupplierName = supplierName;
}
public String getSupplierAddress()
{
	return SupplierAddress;
}
public void setSupplierAddress(String supplierAddress)
{
	SupplierAddress = supplierAddress;
}
@Override
public String toString() {
	return "Supplier [SupplierId=" + SupplierId + ", SupplierName=" + SupplierName + ", SupplierAddress="
			+ SupplierAddress + "]";
}
      
      }
