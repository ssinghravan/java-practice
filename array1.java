import java.util.Arrays;

public class array1{
    public static int[] moveZeros(int[] arr) {
        int n = arr.length;
        int index = 0;

        for (int i = 0; i < n; i++) {
            if (arr[i] != 0) {
                arr[index++] = arr[i];
            }
        }

        while (index < n) {
            arr[index++] = 0;
        }

        return arr;
    }

    public static void main(String[] args) {
        int[] input = {0, 1, 0, 3, 12};
        int[] result = moveZeros(input);
        System.out.println(Arrays.toString(result));
    }
}
