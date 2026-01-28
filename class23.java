
import java.util.Scanner;

public class class23 {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        //  int a = 5;
        // float f=a;
        // float g =(float)20.44;
        // char c = (char)a;

        // System.out.println(a);
        // System.out.println(f);
        // System.out.println(g);
        // System.out.println(a);
    //     int p = sc.nextInt();
    //     float r =sc.nextFloat();
    //     int t = sc.nextInt();
    //    double si =(p*r*t)/100;
    //     System.out.println(si);
    //     System.out.printf("%.2f",si);

//new one;


//     int n1=sc.nextInt();
//     int n2=sc.nextInt();
//     int res = n1>n2? n1:n2;
//     System.out.println("The biggest no. is " + res);
//    System.out.println("The biggest no. is " + ((n1 > n2) ? n1 : n2));
// new one 
        int p = sc.nextInt();
        if (p>=90)
        {
            System.out.println("A");
        }
        else if (p>=70 && p<90){
            System.out.println("B");
        }
        else if (p>=50 && p<70)

        {
            System.out.println("not ");
        }

   sc.close();

    }
    
}
