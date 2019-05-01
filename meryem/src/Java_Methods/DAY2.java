package Java_Methods;

public class DAY2 {

	public static void main(String[] args) {
	
		mains("imran","babur","kalem","meryem");
		
		System.out.println(num(12,2));
	
	}
	  
	     
	public static void mains(String... args) {
		
			    System.out.println(args.length);
			    for(String item: args){
			      System.out.println(item + " "); 
		
			    }		
	}
	public static int num(int...b) {
		int sum=0;
		for(int a:b) {
			sum+=a;
			
		}
		return sum;
	}
}