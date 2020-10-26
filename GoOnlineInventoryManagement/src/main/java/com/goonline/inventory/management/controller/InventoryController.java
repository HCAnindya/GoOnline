package com.goonline.inventory.management.controller;

import java.util.List;

import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.goonline.inventory.management.bean.InventoryBean;
import com.goonline.inventory.management.service.InventoryService;


@RestController
@RequestMapping("/inventorymanagement")
@CrossOrigin(origins = "${cors.url}", allowedHeaders = "${cors.header}")
public class InventoryController {

	@Autowired
	private InventoryService inventoryService;
		
	@GetMapping("/status")
	@Produces(value = MediaType.APPLICATION_JSON)
	public ResponseEntity<String> status() {
		System.out.println("Call came");
		return new ResponseEntity<String>("Tested Ok1", HttpStatus.OK);
	}
	
	@GetMapping("/inventories")
	public ResponseEntity<List<InventoryBean>> getInventories() {		
		return new ResponseEntity<List<InventoryBean>>(inventoryService.getInventoryList(),
				HttpStatus.OK);
	}
	
	@PostMapping("/inventory")
	public ResponseEntity<String> addInventory(@RequestBody InventoryBean inventory) {
		System.out.println(inventory.getInventoryName() + ":" + inventory.getInventoryPrice());
		
		inventoryService.addInventory(inventory);
		return new ResponseEntity<String>(HttpStatus.ACCEPTED);
	}
}
