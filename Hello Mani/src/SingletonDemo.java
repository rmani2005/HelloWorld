public class SingletonDemo 
{
   public static void main(String[] args) 
   {
	  //Constructor is not visible error for below line
	  //Singleton tmp = new Singleton();
      Singleton tmp = Singleton.getInstance( );
      tmp.demoMethod( );
      System.out.println(tmp.hashCode());
      Singleton tmp1 = Singleton.getInstance( );
      System.out.println(tmp1.hashCode());
      tmp1.demoMethod( );
      
      
      Singleton tmp3 = Singleton.getInstance( );
      System.out.println(tmp3.hashCode());
      tmp3.demoMethod1( );
   }
}