package replit;

import java.util.Arrays;

public class fiugad {

	public static void main(String[] args) {
		int num[] =new int[50];
	
		
		for (int i=0; i<50 ;i++) {
		
			num[i]=i+1;
			
		}
		System.out.println(Arrays.toString(num));
		
		
		// get even number from 1-100
		int numbers []=new int[51];
		for(int i=0;i<=50;i++) {
			numbers[i]=i*2;
			
		}System.out.println(Arrays.toString(numbers));
		
         int n[]=new int [50];
         for (int i=0;i< 50;i++) {
	       n[i]=i*2+1;
	        
	
         }     System.out.println(Arrays.toString(n));
         
         
         
         String movie[]=new String[4];
         movie[0]="we";
         movie[1]="be";
         movie[2]="see";
         movie[3]="gee";
          System.out.println(Arrays.toString(movie));
          
          System.out.println(movie.length);
          
          for (int i=0;i<movie.length;i++) {
         
          System.out.println(movie[i]+movie[i].length());
          
          int max=movie[0].length();
          for(int j=1;j<movie.length;j++) {
        	  if(movie[j].length()>max);
        	  max=movie[j].length();
          } System.out.println(max);
        	  
          
          
          int index=0;
        	  for (int k =1;k<movie.length;k++) {
        	  if (movie[k].length()>max) {
        		  max=movie[k].length();
        		
        		  index=k;
        		 
        	  }
        	  }
        	  System.out.print(index+movie[index]);
        	  
          }
	}  


