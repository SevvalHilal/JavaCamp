package day3Homework;

public class UserManager {
	
	public void createAccount(User user) {
		System.out.println("Kay�t olu�turuldu!" + user.getName());
		//System.out.println("�ye detaylar�: " + user.getId() + user.geteMail());
		
	}
	
	public void deleteAccount(User user) {
		
		System.out.println("Kay�t silindi!" + user.getName());
	}
	
	public void enterSystem(User user) {
		System.out.println(user.getName() + "Kodlama.io Ho�geldin'");
	}
	
	public void exitSystem(User user) {
		System.out.println(user.getName());
	}
	
	public void update(User user) {
		System.out.println("Yeni �ifreniz: " + user.getPassword());
	}
	

}
