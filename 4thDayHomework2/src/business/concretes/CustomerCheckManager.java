package business.concretes;

import business.abstracts.CustomerCheckService;
import entites.concretes.Customer;



public class CustomerCheckManager implements CustomerCheckService{

	@Override
	public boolean checkIfRealPerson(Customer customer) {
		 
		return true;
	
	}
	
}

