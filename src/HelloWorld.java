import java.util.Scanner;

public class HelloWorld {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Hello ASE2017 - How are you now? :)");
		
		//Read the name
		System.out.println("Please enter your name : ");
		Scanner myScanner = new Scanner(System.in);
		String name = myScanner.nextLine();
		
		//create HelloUser object and call GreetUser
		HelloUser user = new HelloUser(name);
		user.GreetUser();
	}

}
