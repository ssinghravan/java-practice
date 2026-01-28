import java.io.FileInputStream; 
import java.io.IOException;


public class class10march{
    public static void main(String[] args){
        try(FileInputStream fis = new FileInputStream("input.txt")){
            int content;
            while((content = fis.read()) != -1){
                System.out.println((int) content);
            }
        }
        catch(IOException e){
            System.out.println("Read opereation successfull! ");
            e.printStackTrace();
        }
    }
}