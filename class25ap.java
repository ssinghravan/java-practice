import java.util.ArrayList;
import java.util.Arrays;

public class class25ap {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5, 6));
        ArrayList<Integer> odd = new ArrayList<>();

        for (int num : list) {
            if (num % 2 != 0) {
                odd.add(num);
            }
        }

        list = odd;
        System.out.println("Modified list: " + list);
    }
}
