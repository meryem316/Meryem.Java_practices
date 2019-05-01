package Java_Methods;

public class day22 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	//write a function to test a string is a palindrome
	// static method called isPalindrome
	//it takes one String as a parameter	
	//return boolean
		
		System.out.println(isPalindrome("level"));
		System.out.println(isPalindrome2("hannah"));
        System.out.println(isPalindrome2("race car"));
        System.out.println(isPalindrome2("was it a car or a cat  i saw"));
        System.out.println(isPalindrome2("myname"));
    
			
			
		}
	public static String isPalindrome (String target) {
		String reversed="";
		for (int i=target.length()-1;i>=0;i--) {
			reversed+=target.charAt(i);	
		}
		return reversed;
		}
	 public static String reverseString(String target) {
		    
		    String reversed = "" ; 
		    
		    for (int i = target.length() - 1; i >= 0; i--) {

		      //System.out.println(target.charAt(i));
		      reversed += target.charAt(i) + "";
		    }
		    
		    return reversed;
	 }
   public static boolean isPalindrome2(String target) {
    
    String reversed = reverseString(target) ; 
    target = target.replaceAll(" ","") ; 
    reversed = reversed.replaceAll(" ","") ; 
   
    return reversed.equals(target) ; 
   }
	 }
 
    


   
       
  
    
    


