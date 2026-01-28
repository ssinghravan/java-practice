
import java.time.Duration;
import java.time.LocalTime;



public class class20march3 {
    public static void main(String[] args) {
        // LocalDate starDate=LocalDate.of(2023,1,1);
        // LocalDate endDate=LocalDate.of(2025,1,1);
        // Period p = Period.between(starDate, endDate);
        // System.out.println("period;" + p.getYears()+"Years," + p.getMonths()+ "months," + p.getDays()+ "days");
        LocalTime starTime = LocalTime.of(9,30);
        LocalTime endTime = LocalTime.of(17,0);
        Duration dur = Duration.between(starTime, endTime);
        System.out.println("Duration "+dur.toHours()+" hours");
        

    }
    
}
