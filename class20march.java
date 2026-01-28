import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
public class class20march {
    public static void main(String[] args) {
        LocalDateTime now  = LocalDateTime.now();
        DateTimeFormatter fd = DateTimeFormatter.ofPattern("EEEE,MMMM d,YYYY");
        System.out.println("Formatted Date and Time : "+ now.format(fd));
        DateTimeFormatter day = DateTimeFormatter.ofPattern("dd-MM-YYYY EEEE");
        System.out .println("Formatted Date and time : " + now.format(day));

    }

    
}
