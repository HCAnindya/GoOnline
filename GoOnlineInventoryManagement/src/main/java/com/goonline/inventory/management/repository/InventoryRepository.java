package com.goonline.inventory.management.repository;

import org.springframework.data.repository.CrudRepository;

import com.goonline.inventory.management.entity.InventoryEntity;

public interface InventoryRepository extends CrudRepository<InventoryEntity, Long>{
	
	

}
