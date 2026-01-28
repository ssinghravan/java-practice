
interface student {
    void prepares();
     
  
}
interface Engineer{
   void designs();
      
  
}
class Lpu implements student,Engineer{
 public void prepares()
 {
  System.out.println("Ready for CA");
 }
 public void designs(){
  System.out.println("For engineer");
 }
}






public class class14feb2 {

    public static void main(String[] args) {
        Lpu l = new Lpu();
        l.prepares();
        l.designs();
    }
    
}
