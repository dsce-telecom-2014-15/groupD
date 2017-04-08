package myproject;

import java.util.Scanner;

/**
 * 
 * @author Aashika
 *
 */
public class hellouser {


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		 	hellouser user = new hellouser();
		 		user.userName = scanner.next();
		 	System.out.println("Hello " + user.toString());
		 scanner.close();
		 }

	private String userName;
		 
		 	@Override
		 	public String toString() {
		 		return this.userName;
		 }
	
	}


