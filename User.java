package day3Homework;

public class User {
	
	private int id;
	private String name;
    private String eMail;
    private String password;
     
     public User() {
    	 
     }
     
     public User(int id,String name, String email, String password) {
    	 
    	this();
    	this.name=name;
    	this.eMail=email;
    	this.password=password;
    	 
     }
	
    
    public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String geteMail() {
		return eMail;
	}
	public void seteMail(String eMail) {
		this.eMail = eMail;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	
	

}
