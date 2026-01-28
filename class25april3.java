import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class class25april3 {
    public static void main(String[] args) {
        ArrayList<Double> prices = new ArrayList<>(Arrays.asList(10.5, 20.3, 50.0));
        Collections.reverse(prices);
        System.out.println("Reversed" + prices);
    }
}
