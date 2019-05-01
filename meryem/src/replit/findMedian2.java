package replit;

import java.util.Scanner;

public class findMedian2 {
	public static void main(String[] args) {
		
	    Scanner scan=new Scanner(System.in);
	    int num1, num2,num3;
	     System.out.println("Enter first number:");
	    num1=scan.nextInt();
	     System.out.println("Enter second number:");
	    num2=scan.nextInt();
	    System.out.println("Enter third number:");
	    num3=scan.nextInt();
	    
	    int mediumNum=0;
	    // solution 2:
	    if(num2>num3&&num2>num1)
	        mediumNum=Math.max(num3,num1);
	    
	    else if(num1>num2&&num1>num3)
	     mediumNum=Math.max(num2, num3);
	    
	     else 
	    	 mediumNum=Math.max(num1, num2);
	    
	    System.out.println("Medium value is: "+mediumNum);
	    
		
	}

}
