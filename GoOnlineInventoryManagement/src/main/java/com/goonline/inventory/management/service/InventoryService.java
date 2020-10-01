package com.goonline.inventory.management.service;

import java.util.List;

import com.goonline.inventory.management.bean.InventoryBean;
import com.goonline.inventory.management.entity.InventoryEntity;

public interface InventoryService {
	
	List<InventoryBean> getInventoryList();

	void addInventory(InventoryBean inventory);

}
