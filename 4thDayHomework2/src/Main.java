
import java.time.LocalDate;

import adapter.MerniceServiceAdapter;
import business.concretes.BaseCustomerManager;
import business.concretes.CustomerCheckManager;
import business.concretes.NeroCustomerManager;
import business.concretes.StarbucksCustomerManager;
import entites.concretes.Customer;

public class Main {

	public static void main(String[] args) {		
	
		
		BaseCustomerManager baseCustomerManager = new StarbucksCustomerManager(new MerniceServiceAdapter());
		baseCustomerManager.add(new Customer(1, "Serdar", "Tekin", LocalDate.of(5555, 9, 13), "46871452478"));	
		
		
	}

}
