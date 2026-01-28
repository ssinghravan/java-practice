class par{

    void  set(){
        System.out.println("it's par");
    }
}
class ch1 extends par{
        @Override
    void  set(){
        System.out.println("it's ch1");
    }

}
class ch2 extends par{
    void  set(){
        System.out.println("it's ch2");
    }
    
}

class ch3 extends par{
    void  set(){
        System.out.println("it's ch3");
    }
    
}

public class room24march {
    public static void main(String[] args) {
        par obj = new par();
        par obj1 = new ch1(); 
        ch1 obj2 = new ch1(); 
        ch1 obj3 = new ch1();        
        obj1.set();
    }
    
}
