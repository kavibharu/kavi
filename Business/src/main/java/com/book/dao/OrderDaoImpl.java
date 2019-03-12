package com.book.dao;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import com.book.model.OrderDetail;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;
@Repository("orderDao")
@Transactional
public class OrderDaoImpl implements OrderDao 
{
     
	@Autowired
	SessionFactory sessionFactory;
	@Override
	public boolean PaymentProcess(OrderDetail orderdetail) 
	{
	   try
	   {
		 sessionFactory.getCurrentSession().save(orderdetail);
		 return true;
	   }
	   catch(Exception e)
	   {
		   System.out.println("Exception arised"+e);
		   return false;   
	   }
	}
    @Override
	public boolean UpdatecartitemStatus(String UserName)
	{
		try
		{
		  Session session=sessionFactory.getCurrentSession();
		  Query query=session.createQuery("update Cart set status='P' where UserName=:uname");
		  query.setParameter("uname",UserName);
		  int row_eff=query.executeUpdate();
		  if(row_eff>0)
			  return true;
		  else
			  return false;
		}
		catch(Exception e)
		{
			System.out.println("Exception Arised"+e);
			return false;	
		}
		
	}

}
