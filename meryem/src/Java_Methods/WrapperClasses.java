package Java_Methods;

import java.lang.reflect.Array;
import java.util.ArrayList;




public class WrapperClasses {

	public static void main(String[] args) {
		
		
		Boolean b=new Boolean(true);
         Boolean b1=new Boolean("false");
         Boolean b2= Boolean.valueOf(true);
         Boolean b3=Boolean.valueOf("true");
         
         
         System.out.println(b);
         System.out.println(b1);
         System.out.println(b2);
	     System.out.println(b3);
	     
	     Integer i1=new Integer(123);
	     Integer i2=new Integer("123");
	     Integer i3=new Integer(123);
	     Integer i4=new Integer("123");
	     System.out.println(i1.equals(123));
	     System.out.println(i2);
	     System.out.println(i3);
	     System.out.println(i4);
	     
	     Character c1=new Character('c');
	     Character c2=Character.valueOf('c');
	     System.out.println(c1);
	     System.out.println(c2);
	     
	     
	     String s="true";
	    boolean b5= Boolean.parseBoolean(s);
	    boolean b8=Boolean.parseBoolean("ABC");
	    boolean b9=Boolean.parseBoolean("hvjd");
	     System.out.println(b5);
	     System.out.println(b8);
	     
	    
}
	}


