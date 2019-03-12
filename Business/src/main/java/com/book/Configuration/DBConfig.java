package com.book.Configuration;

import java.util.Properties;

import javax.sql.DataSource;

import org.hibernate.SessionFactory;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.datasource.DriverManagerDataSource;
import org.springframework.orm.hibernate5.HibernateTransactionManager;
import org.springframework.orm.hibernate5.LocalSessionFactoryBuilder;
import org.springframework.transaction.annotation.EnableTransactionManagement;

import com.book.model.Cart;
import com.book.model.Category;
import com.book.model.OrderDetail;
import com.book.model.Product;
import com.book.model.Supplier;
import com.book.model.UserDetail;

@Configuration
@EnableTransactionManagement
@ComponentScan("com.book")
public class DBConfig 
{
@Bean(name="datasource")
public DataSource getH2DataSource()
{
	DriverManagerDataSource datasource=new DriverManagerDataSource();
	
	datasource.setDriverClassName("org.h2.Driver");
	datasource.setUrl("jdbc:h2:tcp://localhost/~/Pro1");
	datasource.setUsername("sa");
	datasource.setPassword("sa");
	System.out.println(">>>>>>Datasource object created<<<<<<");
	return datasource;
}

@Bean(name="sessionFactory")
public SessionFactory getSessionFactory()
{
	Properties hibernateprop=new Properties();
	
	hibernateprop.put("hibernate.hbm2ddl.auto","update");
	hibernateprop.put("hibernate.dialect","org.hibernate.dialect.H2Dialect");
	LocalSessionFactoryBuilder factory=new LocalSessionFactoryBuilder(getH2DataSource());

	factory.addProperties(hibernateprop);
	
	factory.addAnnotatedClass(Category.class);
	factory.addAnnotatedClass(Product.class);
	factory.addAnnotatedClass(Supplier.class);
	factory.addAnnotatedClass(UserDetail.class);
	factory.addAnnotatedClass(Cart.class);
    factory.addAnnotatedClass(OrderDetail.class);
	System.out.println(">>>>>>SessionFactory Object created<<<<<<");

	return factory.buildSessionFactory();
	
}
@Bean(name="TransactionManager")
public HibernateTransactionManager getTransactionManager(SessionFactory sessionFactory)
{
	System.out.println(">>>>>TransactionManager Object created<<<<<<");
	return new HibernateTransactionManager(sessionFactory);
}
}
