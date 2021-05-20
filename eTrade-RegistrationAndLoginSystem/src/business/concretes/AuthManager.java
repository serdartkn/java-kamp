package business.concretes;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

import business.abstracts.AuthService;
import dataAccess.abstracts.UserDao;
import entities.concretes.User;

public class AuthManager implements AuthService {
	
	UserDao userDao;
	public AuthManager(UserDao userDao)	{
		
		this.userDao = userDao;
	}
	
	@Override
	public void register(User user, String[] mailList) {
		
		if(user.getFirstName().length()>=2 && user.getLastName().length()>=2 && user.getPassword().length()>=6)	{
			
			if (checkMail(user.geteMail()))	{
				
				for (String mail : mailList) {
					
					if (mail==user.geteMail()) {
						
						System.out.println("Sisteme Kayıtlı E-Mail");
						return;
					}		
				}
				userDao.add(user);
				sendMail(user);
				validMail(false);	
				
			}else {
				
				System.out.println("Hatalı E-Mail");			
			}			
			
		}else {
			
			if (user.getFirstName().length()<2) {
				
				System.out.println("İsminiz En Az 2 Karakter İçermelidir.");
				return;
				
			}else if (user.getLastName().length()<2) {
				
				System.out.println("Soyisminiz En Az 2 Karakter İçermelidir.");
				return;
				
			}else if (user.getPassword().length()<6) {
				
				System.out.println("Parolanız En Az 6 Karakter Olmalıdır.");
				return;
				
			}else if (user.geteMail().length()<1) {
				
				System.out.println("Mailiniz En Az 6 Karakter Olmalıdır.");
				return;				
			}
		}				
	}
	
	public void sendMail(User user) {
		
		System.out.println("E-Mail Adresinizi Doğrulamak İçin" + " " + user.geteMail() + " " +  "Adresine Gönderilen Aktivasyon Linkine Tıklayınız.");
	}
	
	public void validMail(boolean click) {
		
		if(click) {
			
			System.out.println("E-Mail Adresiniz Başarıyla Doğrulandı.");
			
		}else {
			
			System.out.println("Opss! Yolunda Gitmeyen Bir Şeyler Oldu, Doğrulama Mailini Tekrar Almayı Dene.");
		}		
	}
	
	public boolean checkMail(String eMail) 	{
		
		String regex = "^[\\w!#$%&'*+/=?`{|}~^-]+(?:\\.[\\w!#$%&'*+/=?`{|}~^-]+)*@(?:[a-zA-Z0-9-]+\\.)+[a-zA-Z]{2,6}$";
		Pattern pattern = Pattern.compile(regex);
		Matcher matcher = pattern.matcher(eMail);
		
		if (matcher.matches()) {
			
			return true;
			
		}else {
			
			return false;
		}		
	}	
	
	@Override
	public void login(User user, String[] mailList)	{
		
		if (checkMail(user.geteMail())) {
			
			for (String mail : mailList) {
				
				if (mail==user.geteMail()) {
					
					if (user.getPassword().length()>=6) {
						
						System.out.println("Sisteme Giriş Yaptınız" + " " + "Hoşgeldiniz" + " " + user.getFirstName() + " " + user.getLastName());
						return;
						
					}else {
						
						System.out.println("Yanlış Şifre Girdiniz.");
						return;
					}					
				}		
			}
			
			System.out.println("E-Mail Sistemde Kayıtlı Değil");
			return;			
		}
		System.out.println("Hatalı E-Mail");		
	}
}