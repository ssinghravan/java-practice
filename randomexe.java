public class randomexe {
    public static void main(String[] args) {
        int x = 10;
        String y = "Sahil";
        double z = 100.123;
        randomexe2 obj = new randomexe2(x,y,z);
        randomexe2 obj2 = new randomexe2(100,"Raj",100.123);
        System.out.println(obj.a);
        System.out.println(obj2.b);
        System.out.println(obj.c);
        
    }
    
}
class randomexe2{
    int a;
    String b;
    double c;

    public randomexe2(int a, String b, double c) {
        this.a=a;
        this.b=b;
        this.c=c;
    }
    

}
