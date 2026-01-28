 class abc{
    private int data =30 ;
     abc(){
        class local{
            void msg(){
                System.out.println(data);
            }
        }
        local l =new local();
        l.msg();
        
    }
    
}
public class class21march2 {
    public static void main(String[] args) {
        abc obj = new abc();
        
    }
    
}
