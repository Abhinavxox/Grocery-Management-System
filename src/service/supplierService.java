package service;

import java.util.List;

import model.supplier;

public interface supplierService {
	
	boolean addSupplier(supplier s);
	List<supplier> getAllSupplier();

}
