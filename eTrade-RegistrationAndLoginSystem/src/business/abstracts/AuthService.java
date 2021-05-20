package business.abstracts;

import entities.concretes.User;

public interface AuthService {
	
	void register(User user, String[] mailList);
	void login (User user, String[] mailList);
	
}