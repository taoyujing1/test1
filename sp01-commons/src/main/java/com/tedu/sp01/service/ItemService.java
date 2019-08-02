package com.tedu.sp01.service;

import java.util.List;

import com.tedu.sp01.pojo.Item;

public interface ItemService {

	List<Item> getItems(String orderId);
	void decreaseNumbers(List<Item> list); //得到一组商品,减少商品库存
}