package Java_Methods;

import java.util.Arrays;

public class newMth {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		add(12,23,2);
		
		
		//               0  1 2 3 4 5
		int[] numbers = {12,3,5,7,9,15};
		printSum(numbers);
		
		int [] meryem = {2,5,7,8,9,0,8,6,4,3,2};
		printSum(meryem);
		
		
		int[] nums1= {1,2,3,4};
		int[] nums2= {5,6,7,8};
		System.out.println(Arrays.toString(combineArray(nums1, nums2)));
		
		
//		for (int i = 0; i < numbers.length; i++) {
//			System.out.print(numbers[i]+" ");
//			
//		}
		
		
	}
	public static int[] combineArray(int[] arr,int[] art) {
		int a=arr.length;
		int b=art.length;
		int c=a+b;
		int[] newNums=new int[arr.length+art.length];
		for(int i=0;i<a;i++)
		{
			newNums[i]=arr[i];
		}
		for(int j=0;j<b;j++)
		{
			newNums[a+j]=art[j];
		}
		return newNums;
			
		
	}
	
	
	

	public static void printSum(int[] a) {
		int storage = 0;
		for (int meryem : a) {
			storage += meryem;
		}
		System.out.println(storage);
	}

	public static void add(int a, int b, int c) {
		int sum = a + b + c;
		System.out.println(sum);

	}

}