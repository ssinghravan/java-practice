import java.util.Scanner;

public class switch1 {
    public static void main (String[]ar){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter any simble");
        char a=sc.next(). charAt(0);
        int f=5;
        int s=4;

        switch (a) 
        {
            case  '+' :
             System.out.println(f+s);
                
                break;
        
                case '-' :
                System.out.println(f-s);
                    
                    break;
            case '*' :
            
            System.out.println(f*s);
                
                break;
                case '/' :
            System.out.println(f/s);
                
                break;
            default:
                throw new AssertionError();
        }
    
}}

