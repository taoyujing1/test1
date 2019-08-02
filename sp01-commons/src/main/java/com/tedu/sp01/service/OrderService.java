package com.tedu.sp01.service;


import com.tedu.sp01.pojo.Order;

public interface OrderService {
	Order getOrder(String orderId); //获得订单
	void addOrder(Order order);  //保存订单
}