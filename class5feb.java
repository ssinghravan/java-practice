
import java.util.Scanner;

public class class5feb {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int y = sc.nextInt();
        int z = sc.nextInt();
        Avg k = new Avg();
        k.avg(x,y);
        
    }
}
    
    class Avg {
        

        public void  avg(double  a,double  b) {
            System.out.println(((a+b)/2));
        }
        public void avg(int a,int b , int c){
            System.out.println(((a+b+c)/3));
        }
        public void  avg(){
            System.out.println("noting");
        }
        

       
        
    }

