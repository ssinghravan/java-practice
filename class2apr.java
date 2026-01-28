 interface calculator  {
    int add (int a, int b);

    
}
public class class2apr {
    public static void main(String[] args) {
        
        calculator c =(a,b) ->{
            int sum = a+b;
            return sum;
        };
        System.out.println("Sum is : " + c.add(4, 8));
    }
    
}
