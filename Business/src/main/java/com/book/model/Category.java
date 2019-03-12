package com.book.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="Category")
public class Category
{
	@Id
	@GeneratedValue
private int categoryId;
private String categoryName;
private String categorydescription;
 

public int getCategoryId()
{
	return categoryId;
}
public void setCategoryId(int categoryId)
{
	this.categoryId = categoryId;
}

public String getCategoryName()
{
	return categoryName;
}

public void setCategoryName(String categoryName) 
{
	this.categoryName = categoryName;
}

public String getCategorydescription() 
{
	return categorydescription;
}

public void setCategorydescription(String categorydescription) 
{
	this.categorydescription = categorydescription;

}
}

      

