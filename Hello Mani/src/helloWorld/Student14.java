package helloWorld;

class Student14{  
    int id;  
    String name;  
    String city;
    String city1;
      
    Student14(int id,String name,String city)
    {  
    this.id = id;  
    this.name = name; 
    //this.city=city;
    }  
    
    Student14(int id,String name,String city, String city1)
    {  
    this(id,name,city);//now no need to initialize id and name  
    this.city1=city1;  
    System.out.println("this");
    }  
    void display(){System.out.println(id+" "+name+" "+city +" " +city1);}  
      
    public static void main(String args[])
    {  
    Student14 e1 = new Student14(111,"karan","chennai");  
    Student14 e2 = new Student14(222,"Aryan","delhi","kolkata");  
    e1.display();  
    e2.display();  
   }  
} 