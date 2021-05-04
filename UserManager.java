package day3Homework;

public class UserManager {
	
	public void createAccount(User user) {
		System.out.println("Kayýt oluþturuldu!" + user.getName());
		//System.out.println("Üye detaylarý: " + user.getId() + user.geteMail());
		
	}
	
	public void deleteAccount(User user) {
		
		System.out.println("Kayýt silindi!" + user.getName());
	}
	
	public void enterSystem(User user) {
		System.out.println(user.getName() + "Kodlama.io Hoþgeldin'");
	}
	
	public void exitSystem(User user) {
		System.out.println(user.getName());
	}
	
	public void update(User user) {
		System.out.println("Yeni þifreniz: " + user.getPassword());
	}
	

}
