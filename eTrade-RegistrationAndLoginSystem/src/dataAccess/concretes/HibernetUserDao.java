package dataAccess.concretes;

import dataAccess.abstracts.UserDao;
import entities.concretes.User;

public class HibernetUserDao implements UserDao
{

	@Override
	public void add(User user) 
	{
		System.out.println("�yeli�iniz Ba�ar�yla Olu�turuldu.");
	}

}
