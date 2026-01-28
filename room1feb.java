
import java.util.Scanner;

 public class room1feb{
    static void cage(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your age ");
        int a=sc.nextInt();
        if (a>=18)
        System.out.println("Adult");
        else
        System.out.println("child");
        
    }
    public static void main(String[] args) {
        cage();
    }
    
}
