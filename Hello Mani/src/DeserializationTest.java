import java.io.FileInputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
class DeserializationTest
{
 public static void main(String[] args)
 {
  Studentinfo si=null ;
  try  
  {
   FileInputStream fis = new FileInputStream("student.ser");
   ObjectInputStream ois = new ObjectInputStream(fis);
   si = (Studentinfo)((ObjectInputStream) ois).readObject();
  } 
  catch (Exception e)
   { e.printStackTrace(); }
  System.out.println(si.name);
  System.out. println(si.rid);
  System.out.println(si.contact);
 }
}