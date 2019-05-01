package replit;

import java.util.Arrays;
import java.util.Scanner;

public class ttt {

	public static void main(String[] args) {
		
	  String msg="Sender:<Mike Smith>. From Number:[202-123-3456]. Message:{I love programing and problem solving}";
	  
	  String name=msg.substring(msg.indexOf('<')+1,msg.indexOf('>'));
	  String phone=msg.substring(msg.indexOf('[')+1,msg.indexOf(']'));
	  String message=msg.substring(msg.indexOf('{')+1,msg.indexOf('}'));
	  
	  
	  
	  System.out.println("Sebder: "+name);
	  System.out.println("Phone Number: "+phone);
	  System.out.println("Message body: "+message);
	  
	
	  
	 
	  
}
}