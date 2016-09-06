public class Singleton {
	/* A private Constructor prevents any other 
	    * class from instantiating.
	    */
   private Singleton()
   { 
	   
   }
   private static Singleton singleton = new Singleton( );
   
   
   
   
   /* Static 'instance' method */
   public static Singleton getInstance( ) {
      return singleton;
   }
   /* Other methods protected by singleton-ness */
   protected static void demoMethod( ) {
      System.out.println("demoMethod for singleton"); 
   }
   
   protected static void demoMethod1( ) {
	      System.out.println("demoMethod for singleton1"); 
	   }
}