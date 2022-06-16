package service;

import java.util.List;
import model.cart;

public interface cartService {
	
	boolean addCart(cart c);
	boolean updateCart(cart c);
	List<cart> searchCart(String data);

}
