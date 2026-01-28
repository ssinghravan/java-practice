import java.util.Arrays;
import java.util.List;
public class class17ap{
	public static doble sum(List<? extends Number> list){
		double sum = 0.0;
		for(Number n:lst){
			sum +=n.doubleValue();
		}
		return sum;
    }
	public static void main(String[] args){
	List<Integer>i = Arrays.asList(1,2,3);
	System.out.println("Sum: "+ sum(i));

	List<String>strList = Arrays.asList("Hello", "lets", "enjoy");
	List<Double>inlist=Arrays.asList(1.34,2.96,3.05);
	System.out.println("Sum: "+ sum(dList));
	List<String>sl = Arrays.asList("Hello", "lets", "enjoy");
	System.out.println("Sum: "+ sum(sl));
	}
}
