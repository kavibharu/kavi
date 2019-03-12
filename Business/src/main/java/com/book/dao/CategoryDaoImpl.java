package com.book.dao;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.book.model.Category;
@Repository("categoryDao")
@Transactional
public class CategoryDaoImpl implements CategoryDao
{
  @Autowired
   SessionFactory sessionFactory;
  
	@Override
	public boolean add(Category category) 
	{
	  try
	  {
		  sessionFactory.getCurrentSession().save(category);
		  return true;
	  }
	  catch(Exception e)
	  {
		  System.out.println("Exception arised"+e);
		  return false;  
	  }
	}

	@Override
	public boolean delete(Category category) 
	{
		 try
		  {
			  sessionFactory.getCurrentSession().delete(category);
			  return true;
		  }
		  catch(Exception e)
		  {
			  System.out.println("Exception arised"+e);
			  return false;  
		  }
	}

	@Override
	public boolean update(Category category) 
	{
		 try
		  {
			  sessionFactory.getCurrentSession().update(category);
			  return true;
		  }
		  catch(Exception e)
		  {
			  System.out.println("Exception arised"+e);
			  return false;  
		  }
	}

	@Override
	public Category getCategory(int categoryId) 
	{
		Session session=sessionFactory.openSession();
	Category category=session.get(Category.class, categoryId);
	session.close();
	return category;
	}
	
	@Override
	public List<Category> listcategories() 
	{
		Session session=sessionFactory.getCurrentSession();
		Query query=session.createQuery("from Category");
		List<Category> listcategories=query.list();
	
		return listcategories;
	}



}
