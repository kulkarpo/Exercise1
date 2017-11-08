
public class HelloUser {
	
	private String userName;
	
	public HelloUser(String pUserName) {
		userName = pUserName;
	}
	
	public void GreetUser() {
		System.out.println("Hello " + userName + "!");
	}

}
