package Java_Methods;

public class meryemMethod {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		printName();
		printNamev("jave");
		v("bb","hdh");
	}
   public static void printName() {
	 System.out.println("medont over loading ");
 }
  public static void printNamev( String name ) {
	  System.out.println("method over"+name);
	  
  }
  public static void v (String a,String b) {
	  System.out.println("method"+b+a);
  }
}
