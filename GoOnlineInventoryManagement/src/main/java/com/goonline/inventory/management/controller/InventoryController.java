package com.goonline.inventory.management.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.goonline.inventory.management.service.InventoryService;

@RestController
@RequestMapping("/inventory")
public class InventoryController {

	@Autowired
	private InventoryService inventoryService;
	
	@GetMapping("/status")
	public String status() {
		return "Inventory Ok";
	}
	
	@GetMapping("/inventories")
	public String getInventories() {
		return "Inventories Ok";
	}
	
	@GetMapping("/createInventories")
	public String createInventories() {
		inventoryService.createInventory();
		return "Inventories Ok";
	}
}
