package interfaces;

public class Main {

	public static void main(String[] args) {
		
		Logger[] loggers = {new SmsLogger(), new FileLogger(), new DatabaseLogger()};

CustomerManager customerManager = new CustomerManager(loggers);

Customer customer1 = new Customer(1, "Serdar", "Tekin");
customerManager.add(customer1);  

	}

}
