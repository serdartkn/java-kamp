package nLayeredDemo.business.abstracts;

import java.util.List;

import nLayeredDemo.entities.concretes.Product;

public interface ProductService {

	void add(Product product);
	void update(Product product);
	void delete(Product product);
	Product get();
	List<Product> getAll(); 
	
}
