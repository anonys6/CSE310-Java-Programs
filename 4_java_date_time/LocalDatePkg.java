// package 4_java_date_time;

// import java.time.LocalDate;
// import java.time.LocalTime;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class LocalDatePkg {
    public static void main(String[] args) {
        // LocalDate myDate = LocalDate.now();
        // LocalTime myTime = LocalTime.now();
        // LocalDateTime myDateTime = LocalDateTime.now();

        // System.out.println("Current date: " + myDate);
        // System.out.println("Current time: " + myTime);
        // System.out.println("Current date and time: " + myDateTime);

        // LocalDateTime myDateTime = LocalDateTime.now();
        // System.out.println("Before formatting: " + myDateTime);

        // DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss");
        // String myDateTimeFormatter = myDateTime.format(formatter);
        // System.out.println("After formatting: " + myDateTimeFormatter);

        LocalDateTime myTime = LocalDateTime.now();
        System.out.println(myTime);

        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss");
        String myTimeFormatter = myTime.format(formatter);
        System.out.println(myTimeFormatter);

    }
}
