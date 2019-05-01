package Java_Methods;

public class newcalss {

	public static void main(String[] args) {
		
		    int[] nums = {1,2,34,5,6} ; 

		    
		    getSums();
		    
		    System.out.println("sum of all numers: " + getMax(nums));
		    
		    // directly passing paramter value and directly printinh the 
		    // outcome without storing them  
		    //System.out.println( getSum( new int[] {1,3,4,5,1,1,1,1} ) );  
		    
		    int max = getMax(nums) ; 
		    System.out.println("max of all numers: " + max);
		    
		    
		    String[] names = {"Emine","Firdevers","Sharif","Bahadir","Mehmet"};
		    String concatResult = addAll(names) ; 
		    
		    System.out.println(concatResult);
		    
		    
		  }
		  
		  public static int getSum(int[] meryem) {
		    
		    int sum=0;
		    for(int each: meryem) {
		      sum+=each;
		    }
		    return sum;
		    
		  }
		  
		  public static void getSums() {
			  int[] meryem = {};
			    int sum=0;
			    for(int each: meryem) {
			      sum+=each;
			    }
			    
			   System.out.println(sum);
			    
			  }
		  
		  
		  
		  public static int getMax(int[] nums) {
		        
		        int max = nums[0];
		        for (int i = 1; i < nums.length; i++) {
		            if (max < nums[i]) {
		                max = nums[i];
		            }
		        }
		        return max;
		    }

		  
		  public static String addAll(String[] strs) {
		        
		        String concatenation = "";
		        for (int i = 0; i < strs.length; i++) {
		            concatenation += strs[i];
		        }
		        return concatenation; 
		    }
	}
	
	
	
	
	

