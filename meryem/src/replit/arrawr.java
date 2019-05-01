package replit;

import java.util.Arrays;

public class arrawr {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		String groceries = "Tomatoes, potatoes, "
				+ "cheese, bread, onions, pepper, "
				+ "grapes, oranges, apples";
		
		//String[] items = groceries.split("SAJKDHASKJDHASKJDHAKSJHD"); 
		String[] items = groceries.split("p"); 
		
		System.out.println(items.length);
		System.out.println(  Arrays.toString(items) );
		
		
		for (int i = 0; i < items.length; i++) {
			
			System.out.println( items[i].trim().length()     );
		 }
		
	}

}
