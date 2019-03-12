package com.book.dao;

import java.util.List;

import com.book.model.Cart;

public interface CartDao
{
public boolean addToCart(Cart cart);
public boolean updateCart(Cart cart);
public boolean deleteFromCart(Cart cart);
public List<Cart> listcartitems(String UserName);
public Cart getCartitem(int cartId);

}
