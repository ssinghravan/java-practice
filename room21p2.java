
import java.util.Scanner;

public class room21p2

 {
    public static void main (String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter any no. ");
        int a = sc.nextInt();
        switch (a) {
            case 5:
            System.out.println("ya galat");
                
                break;
            case 6:
            System.out.println("ya galat");
            break;
            case 4:
            System.out.println("ye sahi");
            break;

            default:
                System.out.println("koi bhai sahi nahi hai");
        }

    }
    
}
