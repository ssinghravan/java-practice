import java.util.Scanner;

public class primefactor {
    public static void main(String[] args) {
         Scanner n = new Scanner(System.in);
            int num = n.nextInt();
        for (int i = 1; i <= num; i++) {
            if (num % i == 0 ) {
                System.out.print(i + " ");
            }
        }
    }}