package com.book.dao;

import com.book.model.UserDetail;

public interface UserDao 
{
	public boolean registeruser(UserDetail userdetail);
	public boolean updateuser(UserDetail userdetail);
	public UserDetail getusers(String username);
	
}


