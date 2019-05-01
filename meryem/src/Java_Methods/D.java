package Java_Methods;

public class D {

	public static void main(String[] args) {
		System.out.println(at3("longword","good"));
		
		
		
	}
 public static String at3(String target,String word) {
   
	 String a = "";
	
	 a = target.substring(0,3)+word + target.substring(3);
	 return a;
 }
 
 
 public static String clean (String text ,String badWord) {

     String a = text.replace(badWord,"");
     return a;
 }

	}



