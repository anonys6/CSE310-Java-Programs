import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoField;

public class FindDay {
    public static void main(String[] args) {
        File inputFile = new File("input.txt");
        File outputFile = new File("output.txt");

        try (Scanner sc = new Scanner(inputFile);
                PrintWriter writer = new PrintWriter(outputFile)) {

            String dateStr = sc.nextLine();

            DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");

            LocalDate date = LocalDate.parse(dateStr, formatter);

            writer.println(date.getDayOfYear());
            writer.println(date.getDayOfWeek());
            writer.println(date.getDayOfMonth());
            writer.println(date.getChronology());
            writer.println(date.getLong(ChronoField.DAY_OF_YEAR));

        } catch (FileNotFoundException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }
    }
}
