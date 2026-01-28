
import java.util.Scanner;

public class linearsearching {
    public static void main(String[] args) {
        int a[]={9,5,3,7,6,2,1};
        Scanner sc = new Scanner(System.in);
        int k = sc.nextInt();
        for (int i = 0 ; i<a.length;i++)
        {
            if (k==a[i])
            {
                System.out.println(a[i] + " this no. is in " + " " + i);
            }
        }
        
    } 
}
