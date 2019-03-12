package com.book.dao;

import java.util.List;

import com.book.model.Category;



public interface CategoryDao 
{
public boolean add(Category category);
public boolean delete(Category category);
public boolean update(Category category);
public List<Category> listcategories();
public Category getCategory(int categoryId);


}
