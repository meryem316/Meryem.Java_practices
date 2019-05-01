package Java_Methods;

public class H {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	
      //String [] name= {"emran","meryem","dinelu"};
       // int [] nums= {1,2,3,4,5};
        //for(int i=0;i<name.length;i++) {
        //	System.out.println("Employess name"+name[i]+" ,ID:"+nums[i]);
       // }

	

     String  words= "baby is to this have is perfect name for you";
     String [] eachWrod=words.split(" ");//"baby","is","to"
     findWord ("is",eachWrod);
    }
    public static void findWord (String a, String[] b) {
	int count=0;
	for(int i=0;i<b.length;i++) {
		if(b[i].equals(a))		
		count++;
	}
		System.out.println("Number of is"+count);
	}
}
        			
    		
	


