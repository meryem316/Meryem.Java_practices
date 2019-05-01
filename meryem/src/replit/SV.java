package replit;

import java.util.Scanner;

public class SV {

	public static void main(String[] args) {
	 Scanner scan=new Scanner(System.in);
	 System.out.println("Enter  your number");
	 int number1=0;
	 int number2=0;
	 
	 do { 
		 System.out.println("Enter  your number1");
		 number1=scan.nextInt();
		  System.out.println("Enter your number2");
	  number2=scan.nextInt();
	 }while (number1+number2<=100);
	 System.out.println("THE END");
}
}