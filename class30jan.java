import java.util.Scanner;

public class class30jan {
    public static void main(String[] args) {
    
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the value for size:   ");
        int size =sc.nextInt();
        int a[]=new int [size];
        for(int i =0 ; i<size;i++)
        {
            a[i] =sc.nextInt();
        }
        for (int g=0 ;g<10;g++) {
            System.out.print(a[g]);
            
        }
        
        for (int i = 0 ; i<size-1;i++){
            for (int j=0;j<size-i-1;j++) {
                if(a[j]>a[j++])
                {
                    int t = a[j];
                    a[j] = a[j++];
                    a[j++] = t;
                }
                
            }


        }
        for (int g=0 ;g<size-1;g++) {
            System.out.println(a[g]);
            
        }
    }    
}
