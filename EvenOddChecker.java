import java.util.Scanner;

public class EvenOddChecker {
    public static void main(String[] args) {
        System.out.println("Enter a whole number (non-negative integer):");
        Scanner input=new Scanner(System.in);
        // Validate the input format
        if (!input.matches("-\\d+")) {
            System.out.println("Invalid input. Please enter a non-negative integer.");
            return;
        }

        int num = Integer.parseInt(input);

        // Check if even or odd
        if (num % 2 == 0) {
            System.out.println("You entered an even number: " + num);
        } else {
            System.out.println("You entered an odd number: " + num);
        }
    }
}
