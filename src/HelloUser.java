public class HelloUser {
	
	String userName;
	
	public HelloUser(String user) {
		this.userName = user;
	}
	
	public void greetUser() {
		System.out.println("Hello : " + this.userName);
	}
	
}
