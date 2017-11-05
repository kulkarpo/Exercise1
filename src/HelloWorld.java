//import HelloUser;
import java.io.*;
import java.util.*;

public class HelloWorld {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Hello ASE2017 - How are you? :)");
		
		System.out.println("Enter your name");
		Scanner sc =  new Scanner(System.in);
		String name = sc.nextLine();
		HelloUser hu = new HelloUser(name);
		hu.greetUser();
	}

}

