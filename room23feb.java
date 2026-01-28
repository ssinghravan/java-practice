import java.util.Scanner;

public class room23feb {
    String name;
    int age;
    public room23feb(String x,int y){

        name = x;
        age = y;

    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String k = sc.nextLine();
        int r=sc.nextInt();
        room23feb ob = new room23feb(k,r);
        System.out.println(ob.name + ob.age);
    }
}
