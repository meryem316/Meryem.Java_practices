package replit;

import java.util.Arrays;

public class array {

	public static void main(String[] args) {
	
`
		
		String[] arr1= { "A","B","C" };
		System.out.println( Arrays.toString(arr1 )); 
		// toString: can convert the single dimentional array to String
		
		// multi-dimentional array: 
			// N dimentinal array is an array that contains multiple (N-1) dimentinal array
		
		String[][] arr2D= {{ "A","B","C" },{ "D","E","F" },{ "G","H","I" }};
		// [ index number of one dimentional array ][index number of the element in given one dimentional array ]
		
		// in 2D arrays: [Row number][column number];
		System.out.println( arr2D[0][1] );
		// to print: E
		System.out.println(arr2D[1][1]);
		// to print: I
		System.out.println(arr2D[2][2]);
		
		// print: [D, E, F]
		System.out.println(Arrays.toString( arr2D[1] ));
		
		// print the entire 2D array: 
		System.out.println(Arrays.deepToString( arr2D ));
		
		
		
		// 3D Arrays:
			String[][][] arr3D = {{{ "A","B","C" },{ "D","E","F" }}  ,
					{ { "J","K","L" },{ "P","Q","R" } }};
			//[index number of 2D array][index number of 1D array in given 2D][ index num of elemnt in given one dimentional]
			
			// print: D
			System.out.println(arr3D[0][1][1]);
			// print: [D,E,F]
			System.out.println( Arrays.toString(arr3D[0][1]) ); 
			// print:[ [ A,B,C],[D,E,F] ]
			System.out.println( Arrays.deepToString( arr3D[0] ) );
			// print the entire 3D array:
			System.out.println(Arrays.deepToString( arr3D ) );
			
			
		// 4D arrays: contains multiple 3D arrays
		String[][][][] arr4D = {    {{{ "A","B","C" },{ "D","E","F" }},{{ "J","K","L"  },{ "P","Q","R" }}} 
		, { {{ "1","2","3" },{ "4","5","6" }}, {{ "7","8","9" }} }   };	
		
		// [3d index num] [ 2d index num][1d index num] [index num of elemnt]
		
		// print:8
		System.out.println( arr4D[1][1][0][1] );
		// print: [1,2,3]
		System.out.println(  Arrays.toString( arr4D[1][0][0] ));
		
		// print: [[1,2,3],[4,5,6]]:
		System.out.println(Arrays.deepToString( arr4D[1][0]));
		// print: [[[1,2,3],[4,5,6]], [[7,8,9]]]:
		System.out.println(Arrays.deepToString( arr4D[1] ) );
		// print the entire 4D array:
		System.out.println(Arrays.deepToString( arr4D ) );

		
}
}