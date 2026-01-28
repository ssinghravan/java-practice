
import java.util.Arrays;

public class foreach1 {
    public static void main(String[] args) {
        int [] arr = {12,4,2,765,3,6};    
        Arrays.sort(arr);
        int k = arr.length;
        System.out.println("Array elements are: " + k);
        System.out.println(Arrays.toString(arr));
        for (int num : arr){
            System.out.print(num + " ");
        }
    }
    
}
