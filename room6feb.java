import java.util.Scanner;

public class room6feb {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your roll no. : ");
        int a = sc.nextInt();
        System.out.print("Enter your percentage : ");
        float b = sc.nextFloat();
        System.out.print("Enter your name : ");
        sc.nextLine();  // Consume the leftover newline
        String c = sc.nextLine();
       
        Student s1 = new Student(a, b, c);
        Student s2 = new Student();

        s1.printd();
       s2.printd();

       
    }
}

class Student {
    int roll;
    float per;
    String name;

    // Parameterized Constructor
    Student(int roll, float per, String name) {
        this.roll = roll;
        this.per = per;
        this.name = name;
    }
    Student(){
        roll = 2;
        per = 45;
        name= "SAhil";

    }
    void printd(){
        
        System.out.println(roll);
        
        System.out.println(per);
        
        System.out.println(name);
    }

    // Overriding toString() to print object details
   
}
