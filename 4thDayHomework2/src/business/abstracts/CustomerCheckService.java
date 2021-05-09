package business.abstracts;

import entites.concretes.Customer;

public interface CustomerCheckService {
	
	boolean checkIfRealPerson(Customer customer);

}
