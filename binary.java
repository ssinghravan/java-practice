
import java.util.Arrays;
import java.util.Scanner;

public class binary {
    public static void main(String[] args) {
        int[] arr = {23, 5, 67, 34, 1, 0};

        Arrays.sort(arr); // Sorts the array in ascending order
        for (int i =0 ; i <arr.length; i++) {
            System.out.print(arr[i] + " ");
            
        }
        System.out.println("");
         
        Scanner sc = new Scanner(System.in);
        int k = sc.nextInt();
        // System.out.println("Sorted array: " + Arrays.toString(arr));
         int mid = arr.length/2;

        System.out.println(arr[mid]);
        
        
        if(arr[mid]<=k){
            if (arr[mid]== k){
                System.out.println(arr[mid] + " the index is "  + mid);
    
            }
            else{
                for (int i =mid ; i <arr.length; i++) {
                    if (k==arr[i])
                {
                    System.out.println(arr[i] + " this no. is in " + " " + i);
                }
                }
            }

        }
        if (arr[mid]>k){
            for (int i =0 ; i <mid; i++) {
                if (k==arr[i])
                {
                    System.out.println(arr[i] + " this no. is in " + " " + i);
                }
            }
           
        }
       
    }
}

                            
