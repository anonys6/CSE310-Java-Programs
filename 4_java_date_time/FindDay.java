import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoField;

public class FindDay {
    public static void main(String[] args) {
        String dateStr = "2002-12-20";

        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");

        LocalDate date = LocalDate.parse(dateStr, formatter);

        System.out.println(date.getDayOfYear());
        System.out.println(date.getDayOfWeek());
        System.out.println(date.getDayOfMonth());
        System.out.println(date.getChronology());
        System.out.println(date.getLong(ChronoField.DAY_OF_YEAR));
    }
}
