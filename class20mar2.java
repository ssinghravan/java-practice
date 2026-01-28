
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class class20mar2 {
    public static void main(String[] args) {
        String str = "17-30-2025 14:30:00";
        DateTimeFormatter formatter =DateTimeFormatter.ofPattern("dd-MM-YYYY HH:mm:ss");
        LocalDateTime loc = LocalDateTime.parse(str,formatter);
        System.out.println("paresed Date And Time :" + loc);
        
    }

    
}
