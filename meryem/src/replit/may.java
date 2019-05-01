package replit;

import java.util.Scanner;

public class may {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in); 
		System.out.println("HOLD WHOESE HORSE?");
		String name = scan.next(); 
		holdYourHorse(name); 
		
		
	}
									 
	public static void holdYourHorse(String owner) {	
	
		 System.out.println(owner + ", hold your horse please!");	
	}
}