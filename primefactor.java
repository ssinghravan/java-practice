import java.util.Scanner;

public class primefactor {
    public static void main(String[] args) {
         Scanner n = new Scanner(System.in);
            int num = n.nextInt();
           
        for (int i = 1; i <= num; i++) {
            int count = 0;
            if (num % i == 0 ) {
                
                for (int j = 2; j <= i; j++) {
                if(i%j==0){
                    count++;
                }
               
            }
             if(count==1){
                System.out.println(i + " is a prime factor");
            }
            
        }
        
    }}}