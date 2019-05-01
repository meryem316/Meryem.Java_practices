package Java_Methods;

public class Array {

	public static void main(String[] args) {
		
   int [] a=new int[10];
    a[5]=50;
    System.out.println(a[5]);
	
      int[] b= {1,2,3,4,5,6};
      b[0]=1;
      System.out.println(b[1]);
	
       double [] c= new double[10];
       for (int i=0;i<10;i++) {
       c[i]= i*10;
     System.out.println();
       }
       for(int i=0;i<10;i++) {
    	   System.out.println("element"+i+"value"+c[i]);
       }
	}
	}
