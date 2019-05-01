package Java_Methods;

public class LongestName {

	public static void main(String[] args) {
		
		longName("","","","","");
	   System.out.println(m(12,32,43,54));
	   reverseString("imranniyaz   ");
	  
	}

	public static void longName(String... abc) {

		String max = "";
		for (String c : abc) {
			if (c.length() > max.length()) {
				max = c;
			}
		}
		System.out.println(max);

	}

	public static double m(double... h) {
		double max1 = 0;

		for (double q : h) {
			if (q > max1) {

			}
		}
		return max1;
	}
		
	public static void reverseString(String s) {
		String as="";
		for (int i=s.length()-1;i>=0;i--) {
			as+=s.charAt(i);
			
		}
		System.out.println(as);
	}
		

}
