package com.goonline.inventory.management.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table(name = "Inventory")
public class InventoryEntity implements Serializable {

	private static final long serialVersionUID = 1L;
	
	@GeneratedValue
	@Id
	private long inventoryId;
	
	@Column(nullable = false, length = 20)
	private String inventoryName;

	@Column(nullable = false)
	private double inventoryPrice;
	
	public long getInventoryId() {
		return inventoryId;
	}
	public void setInventoryId(long inventoryId) {
		this.inventoryId = inventoryId;
	}
	public String getInventoryName() {
		return inventoryName;
	}
	public void setInventoryName(String inventoryName) {
		this.inventoryName = inventoryName;
	}
	public double getInventoryPrice() {
		return inventoryPrice;
	}
	public void setInventoryPrice(double inventoryPrice) {
		this.inventoryPrice = inventoryPrice;
	}

	

}
