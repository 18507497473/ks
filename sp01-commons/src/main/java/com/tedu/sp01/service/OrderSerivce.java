package com.tedu.sp01.service;


import com.tedu.sp01.pojo.Order;

public interface OrderSerivce {
	Order getOrder(String orderId);
	void addOrder(Order order);
}