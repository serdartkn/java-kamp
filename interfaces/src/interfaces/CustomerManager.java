package interfaces;

public class CustomerManager {
	
	private Logger[] loggers;

	public CustomerManager(Logger[] loggers) {
		this.loggers = loggers;
		
	}
	
	public void add(Customer customer) {
		System.out.println("Müþteri Eklendi " + customer.getFirstName());
		Utils.runLoggers(loggers, customer.getFirstName());

		
	};
	
	public void delete(Customer customer ) {
		System.out.println("Müþteri Silindi " + customer.getFirstName());
		Utils.runLoggers(loggers, customer.getFirstName());

	}
	
	
}
