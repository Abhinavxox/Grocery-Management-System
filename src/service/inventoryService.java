package service;

import java.util.List;

import model.inventory;

public interface inventoryService {
	
	boolean addinventory(inventory i);
	List<inventory> getAllInventory();
	List<inventory> searchInventory(String data);
	
}
