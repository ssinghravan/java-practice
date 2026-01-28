// report card of students.
import java.util.Scanner;


public class classw {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);   
        System.out.println("Hello students");
        System.out.println("ketne marks ka test tha");
        double o = sc.nextDouble();
        System.out.println("Enter the first subj no.");
        double m = sc.nextDouble();
        System.out.println("Enter the second subj no.");
        double e = sc.nextDouble();
        System.out.println("Enter the third subj no.");
        double s = sc.nextDouble();
        System.out.println("Enter the fourth subj no.");
        double h = sc.nextDouble();
        System.out.println("Enter the fifth subj no.");
        double c = sc.nextDouble();
        double m1= (m/o)*100;
        double e1= (e/o)*100;
        double s1= (s/o)*100;
        double h1= (h/o)*100;
        double c1= (c/o)*100;
        double total = (m1+e1+s1+h1+c1)/5;
        System.out.print(total);
        System.out.println("%");
    }
    
}
