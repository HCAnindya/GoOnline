package com.goonline.inventory.management.service;

import java.util.List;

import com.goonline.inventory.management.bean.InventoryBean;

public interface InventoryService {
	
	List<InventoryBean> getInventoryList();

	void addInventory(InventoryBean inventory);

}
