package business.concretes;

import entities.concretes.User;

public class UserManager {
	
	
	public void add(User user) {
		
		System.out.println("Eklendi " + user.getFirstName() +" "+ user.getLastName());
		
	}
	
	public void delete(User user) {
		System.out.println("Silindi " + user.getFirstName() +" "+ user.getLastName());
		
	}
	
	public void update(User user) {
		System.out.println("G�ncellendi " + user.getFirstName() +" "+ user.getLastName());
		
	}
	
}