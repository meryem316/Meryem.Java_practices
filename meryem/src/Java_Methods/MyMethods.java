package Java_Methods;

public class MyMethods {
	public static void main(String[] args) {
		plus(34,45);
		minus(10,2);
		diveded(10,5);
		
		reverse("meryemgul");
		MyMethods.reverse("imran");
		
		
		System.out.println(multiply(5,6));
	}

	  static void plus(int a , int b) {

		
		int sum= a+ b;
		System.out.println(sum);
	}

	
     public static void minus(int a,int b) {

 		
 		int sum= a- b;
 		System.out.println(sum);
 		
     }
     public static void diveded (double a, double b) {
    	 double sum =a / b;
    	 System.out.println(sum);
     }
     
     // hello meryem , here we are writing return type methods okk?
     
     public static int multiply(int a,int b) {
    	 int sum=a*b;
    	 return sum;
     }
     public static void reverse( String name) {
    	 String word="";
    	 for(int i=name.length()-1;i>=0;i--) {
    		 word +=name.charAt(i);
    		 
    		 
    	 }
    	 System.out.println(word);
    	 
    	
    	  }
     }

