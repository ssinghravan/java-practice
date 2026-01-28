
import java.util.Scanner;

public class room29jan {
    public static void main (String[] args)
    {
        Scanner sc=new Scanner (System.in);
        int [] car = {30,43,53,22,44,11,67,};
        System.out.println(car[2]);
        car[2]=57;
        int sum=0;
        int l=car[0];
        System.out.println(car[2]);
        for(int a =0; a<car.length;a++)
        {
           System.out.println(car[a]);
           sum=sum+car[a];
           if(l>car[a])
           {
            l=car[a];
           }
        }
        System.out.println(car.length); //length of the array
       System.out.println(sum);// for sum of all the array
       double avg = sum/car.length; // for finding avg
       System.out.println(avg); //For print avg of array
       System.out.println(l);  // smallest no. in array








    }
    
}
