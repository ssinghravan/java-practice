import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;

public class class10march2 {
    public static void main(String[] args) {
        // Reading from the file
        try (FileInputStream fis = new FileInputStream("input.txt")) {
            int content;
            while ((content = fis.read()) != -1) {
                System.out.print((char) content);  // print character by character
            }
            System.out.println("\nRead operation successful!");
        } catch (IOException e) {
            e.printStackTrace();
        }

        // Writing to the file
        try (FileOutputStream fos = new FileOutputStream("input.txt", true)) {
            Scanner scanner = new Scanner(System.in);
            System.out.print("Enter user input: ");
            String input = scanner.nextLine();

            fos.write(input.getBytes());
            System.out.println("Write operation successful!");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
