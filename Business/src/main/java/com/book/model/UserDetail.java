package com.book.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
@Entity
@Table
public class UserDetail 
{
@Id
String UserName;
String Password;
boolean enabled;
String role;

String CustomerName;
String MobileNumber;
String Emaild;
String Address;

public String getUserName() {
	return UserName;
}
public void setUserName(String userName) 
{
	UserName = userName;
}
public String getPassword()
{
	return Password;
}
public void setPassword(String password)
{
	Password = password;
}
public boolean isEnabled()
{
	return enabled;
}
public void setEnabled(boolean enabled)
{
	this.enabled = enabled;
}
public String getRole() 
{
	return role;
}
public void setRole(String role) 
{
	this.role = role;
}
public String getCustomerName() 
{
	return CustomerName;
}
public void setCustomerName(String customerName) 
{
	CustomerName = customerName;
}
public String getMobileNumber() 
{
	return MobileNumber;
}
public void setMobileNumber(String mobileNumber) 
{
	MobileNumber = mobileNumber;
}
public String getEmaild()
{
	return Emaild;
}
public void setEmaild(String emaild) 
{
	Emaild = emaild;
}
public String getAddress()
{
	return Address;
}
public void setAddress(String address) 
{
	Address = address;
}


    
}
