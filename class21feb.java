public class class21feb {
    public static void main(String[] args) {
        // int i=1;
        // while(i<=5){
        //     System.out.print(i+" ");
        //     i++;
        // }
        animal a= new dog();
        if (a instanceof dog){
            System.out.println("a is instance of dog");
        }

        
    
}
}
class animal{}
class dog extends animal{}