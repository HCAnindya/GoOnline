package com.goonline.inventory.management.service;

import com.goonline.inventory.management.bean.InventoryBean;

public interface InventoryService {
	
	InventoryBean getInventoryList();

	void addInventory(InventoryBean inventory);

}
