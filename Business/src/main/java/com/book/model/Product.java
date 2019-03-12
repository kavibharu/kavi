package com.book.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Transient;

import org.springframework.web.multipart.MultipartFile;

@Entity
@Table(name="Product_Table")
public class Product
{
 @Id
 @GeneratedValue
int ProductId;    
 String ProductName;
 String productDescription;
 int supplierId;
 int categoryId;
 int Price;
 int Stock;
 
 @Transient
 MultipartFile Pimage;


public MultipartFile getPimage() {
	return Pimage;
}
public void setPimage(MultipartFile pimage) {
	Pimage = pimage;
}
public int getProductId()
{
	return ProductId;
}
public void setProductId(int productId) 
{
	ProductId = productId;
}
public String getProductName() 
{
	return ProductName;
}
public void setProductName(String productName)
{
	ProductName = productName;
}
public String getProductDescription() 
{
	return productDescription;
}
public void setProductDescription(String productDescription) 
{
	this.productDescription = productDescription;
}

public int getSupplierId()
{
	return supplierId;
}
public void setSupplierId(int supplierId)
{
	this.supplierId = supplierId;
}

public int getCategoryId()
{
	return categoryId;
}
public void setCategoryId(int categoryId) 
{
	this.categoryId = categoryId;
}
public int getPrice()
{
	return Price;
}
public void setPrice(int price) 
{
	Price = price;
}
public int getStock()
{
	return Stock;
}
public void setStock(int stock)
{
	Stock = stock;
}
@Override
public String toString() {
	return "Product [ProductId=" + ProductId + ", ProductName=" + ProductName + ", productDescription="
			+ productDescription + ", supplierId=" + supplierId + ", CategoryId=" + categoryId + ", Price=" + Price
			+ ", Stock=" + Stock + "]";
}
}
