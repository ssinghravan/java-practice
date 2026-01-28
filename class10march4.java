import java.io.FileInputStream; // read from file in byte format
import java.io.IOException;
import java.io.FileOutputStream; // read from file in byte format
import java.util.Scanner;
import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.fileReader;
import java.fileWriter;

// byute communication
public class class10march4 {
    public static void main(String[] args) {


        // try (FileInputStream fis = new FileInputStream("input.txt")) {
        //     int content;
        //     while ((content = fis.read()) != -1) {
        //         System.out.print((char) content);  // print chararter by character
        //     }
        //     System.out.println("Read opereation successfull! ");
        // } catch (IOException e) {
        //     e.printStackTrace();
        // }


        // try(FileOutputStream fos = new FileOutputStream("input.txt",true)){
        //     Scanner scanner = new Scanner(System.in);
        //     System.out.println("Enter user inut: ");
        //     String input = scanner.nextLine();
            
        //     fos.write(input.getBytes());
        //     System.out.println("Read opereation successfull! ");
        // }
        // catch(IOException e){
        //     e.printStackTrace();
        // }

        // try (BufferedInputStream bis = new BufferedInputStream( new FileInputStream("input.txt"))) {
        //     int content;
        //     while ((content = bis.read()) != -1) {
        //         System.out.print((char) content);  // print chararter by character
        //     }
        //     System.out.println("Read opereation successfull! ");
        // } catch (IOException e) {
        //     e.printStackTrace();
        // }

        // // bufferOutput
        // try(BufferedOutputStream bis = new BufferedOutputStream( new FileOutputStream("input.txt",true))){
        //     Scanner scanner = new Scanner(System.in);
        //     System.out.println("Enter user inut: ");
        //     String input = scanner.nextLine();
            
        //     bis.write(input.getBytes());
        //     System.out.println("Read opereation successfull! ");
        // }
        // catch(IOException e){
        //     e.printStackTrace();
        // }


        // 
    try(FileReader fr = new FileReader("input.txt");
        FileWriter fw = new FileWriter("output.txt")) {
        int data;
        while((data = fr.read())! = -1){
            fw.write(data);
        }
        System.out.println("file co[ied]");

    }
    catch(IOException e){
            e.printStackTrace();
        }
    }

}