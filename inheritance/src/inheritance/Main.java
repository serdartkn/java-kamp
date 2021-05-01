package inheritance;

public class Main {

	public static void main(String[] args) {
		IndividualCustomer serdar = new  IndividualCustomer();
		serdar.customerNumber="12345";
		
		CorporateCustomer hepsiBurada = new CorporateCustomer();
		hepsiBurada.customerNumber="78910";
		
		UnionCustomer disk = new UnionCustomer();
		disk.customerNumber="031165";
		
		Customer[] customers= {serdar,hepsiBurada,disk};
		
		CustomerManager customerManager = new CustomerManager();
		customerManager.addMultiple(customers);
		
		
		
		
		
	}

}
