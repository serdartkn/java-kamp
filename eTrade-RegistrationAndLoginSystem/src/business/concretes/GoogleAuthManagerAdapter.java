package business.concretes;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

import business.abstracts.AuthService;
import dataAccess.abstracts.UserDao;
import entities.concretes.User;
import google.concretes.GoogleAuthManager;

public class GoogleAuthManagerAdapter implements AuthService
{
	UserDao userDao;
	public GoogleAuthManagerAdapter(UserDao userDao) 
	{
		this.userDao = userDao;
	}

	@Override
	public void register(User user, String[] mailList) 
	{
		GoogleAuthManager googleAuthManager = new GoogleAuthManager();
		
		if (checkMail(user.geteMail())) 
		{
			for (String mail : mailList) 
			{
				if (mail==user.geteMail()) 
				{
					System.out.println("Sisteme Kayýtlý E-Mail");
					return;
				}
	
			}
			userDao.add(user);
			googleAuthManager.add(user.geteMail());		
		}		
		else 
		{
			System.out.println("Google Hesabý Geçerli Deðil, Tekrar Dene.");			
		}
		
	}
	
	public boolean checkMail(String eMail) 
	{
		String regex = "^[\\w!#$%&'*+/=?`{|}~^-]+(?:\\.[\\w!#$%&'*+/=?`{|}~^-]+)*@(?:[a-zA-Z0-9-]+\\.)+[a-zA-Z]{2,6}$";
		Pattern pattern = Pattern.compile(regex);
		Matcher matcher = pattern.matcher(eMail);
			
		if (matcher.matches())
		{
			return true;
		}
		else 
		{
			return false;
		}		
	}


	@Override
	public void login(User user, String[] mailList) 
	{		
		if (checkMail(user.geteMail())) 
		{
			for (String mail : mailList) 
			{
				if (mail==user.geteMail()) 
				{					
					System.out.println("Google Hesabýzla Sisteme Giriþ Yaptýnýz" + " " + "Hoþgeldiniz" + " " + user.getFirstName() + user.getLastName());
					return;			
				}
				else
				{
					System.out.println("Google Hesabý Sistemde Kayýtlý Deðil");
					return;
				}
			}		
		}
		System.out.println("Hatalý E-Mail");
		
	}
}
	
	