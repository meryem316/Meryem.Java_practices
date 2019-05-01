package Java_Methods;

import java.util.Arrays;

public class day44 {

	public static void main(String[] args) {
	
		int x=5;
		int[]arr=new int[x];
		for(int i=0;i<arr.length;i++) {
			arr[i]=i+1;
			
		}
      System.out.println(Arrays.toString(arr));
	}
    public static int [] getArrayFrom1toX(int x) {
    	
    	
    	    int[] arr = new int[x];
    	    for (int i = 0; i < arr.length; i++) {
    	      arr[i] = i+1 ; 
    	      //System.out.println( i+1  );
    	    }
    	    
    	    return arr ; 
  
    }
}
