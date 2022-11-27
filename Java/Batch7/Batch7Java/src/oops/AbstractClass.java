package oops;

public abstract class AbstractClass {
	
	//encapsulation
	private String user;
	private String password;
	
	//complete method
	public boolean LoginPage(String user, String password) {
		this.user = user;
		this.password = password;
		if(this.user.equals("testuser")&& this.password.equals("testpassword")) {
		 System.out.println("Valid Login Credentials");
		 return true;
		}else {
			System.out.println("Login failed");
			return false;
		}
	}
	
	//abstraction - hiding actual implementation
	//incomplete method - abstract method
	public abstract double transaction(String user, String password, double amount);
}
