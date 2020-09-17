package com.goonline.inventory.management.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.goonline.inventory.management.bean.InventoryBean;
import com.goonline.inventory.management.entity.InventoryEntity;
import com.goonline.inventory.management.repository.InventoryRepository;

@Service
public class InventoryServiceImpl implements InventoryService{

	@Autowired
	private InventoryRepository repository;
	
	@Override
	public InventoryBean getInventoryList() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void createInventory() {
		InventoryEntity entity = new InventoryEntity();
		entity.setInventoryName("Sketch Book");
		entity.setInventoryPrice(100);
		repository.save(entity);
		
	}

}
