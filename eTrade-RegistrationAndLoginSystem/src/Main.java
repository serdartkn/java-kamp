import business.abstracts.AuthService;
import business.concretes.AuthManager;
import business.concretes.GoogleAuthManagerAdapter;
import dataAccess.abstracts.UserDao;
import dataAccess.concretes.HibernetUserDao;
import entities.concretes.User;

public class Main {

	public static void main(String[] args) {
		
		String[] mailList = {"blabla@gmail.com", "kodlama.io@hotmail.com", "abc123@yahoo.com"};
		
		User user1 = new User();
		user1.setFirstName("Serdar");
		user1.setLastName("Tekin");
		user1.setPassword("123456");
		user1.seteMail("blabl@gmail.com");
		
//	AuthService authService = new AuthManager(new HibernetUserDao());
//	authService.register(user1, mailList);
//	authService.login(user1, mailList);
//		
//	AuthService authService1 = new GoogleAuthManagerAdapter(new HibernetUserDao());
//	authService1.register(user1, mailList);
//	authService1.login(user1, mailList);
		
		
	}

}
