package service;

import java.util.List;

import model.customer;

public interface customerService {
	
	boolean addCustomer (customer c);
	List<customer> getAllCustomer();
	
}
