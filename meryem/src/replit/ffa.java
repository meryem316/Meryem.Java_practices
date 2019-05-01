package replit;

import java.util.Scanner;

public class ffa {

	public static void main(String[] args) {
	Scanner scan=new Scanner(System.in);
	
	 String S1= "java";
	 String S2="java";
	 String S3=new String("java");
	 String S4="cat";
	 System.out.println(S1==S2);
	 System.out.println(S1==S3);
	 System.out.println(S3==S4);
	 System.out.println(S1.equals(S3));
	 System.out.println(S1.equals(S2));
}
}
