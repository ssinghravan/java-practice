
import java.util.Scanner;

public class room21 {
    public static void main(String [] args){
        Scanner sc= new Scanner(System.in);
        // System.out.println("sahil" + Math.sqrt(36));
        // System.out.println("sahil" + Math.max(36,40));
        // System.out.println("sahil" + Math.min( 56,36));
        // System.out.println("sahil" + Math.abs(-36.886));
        // System.out.println("sahil" + Math.random());
        
        //2th 

        System.out.println("Enter Your password"); //password is 8541
        int a=sc.nextInt();
        // if (a==8541) {
        //     System.out.println("Your password is write");

            
        // }
        // else
        // {
        //     System.out.println("Your password is worng");
        // }

        // 2th ka v second part using short hand like    ?     :      ;
        
          
         String k = (a==8541)?"Your password is write": "Your password is worng";

    }
    
}

