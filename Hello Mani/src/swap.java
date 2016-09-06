
public class swap {

	public static void main(String[] args) 
	{
		 String a="onesecond";
		    String b="two";
		    System.out.println("a = "+a);
		    System.out.println("b = "+b);
		    System.out.println("a+b= "+ a+b);
		    a= a+b;
		    System.out.println("a=a+b= "+ a);
		    System.out.println("After Swap");
		    System.out.println("a.length()" + a.length());
		    System.out.println("a.length()" + b.length());
		    //(0, (12-9))
		    //(0,9)
		    b = a.substring(0,(a.length()-b.length())); 
		    a = a.substring(b.length());

		    System.out.println("a = "+a);
		    System.out.println("b = "+b);

	}

}
