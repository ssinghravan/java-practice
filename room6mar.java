
import java.util.Scanner;

public class room6mar {

    public static void main (String[] args){
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int [] array = new int [a];
        for(int i = 0 ; i<a; i++){
            array [i] = sc.nextInt();
            
        }
        for(int i = 0 ; i<a; i++){
            for( int j =1 ; j<a ;j++){
                if (array[i]==array[i+j])
                {
                    System.out.println("there is a repetation of number" + " " + array[i]);
                }
            }
            
        }
        
        
    }
}
