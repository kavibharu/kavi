package com.book.dao;

import com.book.model.OrderDetail;

public interface OrderDao 
{
public boolean PaymentProcess(OrderDetail orderdetail);
public boolean UpdatecartitemStatus(String UserName);

}
