interface shape{
     default   void area(){
        System.out.println("Finding area");
    }

}
class  circle implements shape{
    public  void area(){
        double r =5.0;
         System.out.println("Area is " + (3.14*r*r));
     }
}
public class class5mar {
    public static void main(String[] args) {
        circle c = new circle();
        c.area();
       //circle.area();
    }
    
}
