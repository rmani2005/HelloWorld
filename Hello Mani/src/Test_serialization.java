import java.io.FileOutputStream;
import java.io.ObjectOutputStream;

class Test_serialization
{
 public static void main(String[] args)
 {
 try
 {
  Studentinfo si = new Studentinfo("Abhi", 104, "110044");
  FileOutputStream fos = new FileOutputStream("student.ser");
  ObjectOutputStream oos = new ObjectOutputStream(fos);
  oos.writeObject(si);
  oos.close();
  fos.close();
  }
  catch (Exception e)
  { e. printStackTrace(); }
 }
}