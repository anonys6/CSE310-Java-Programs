import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.sql.Date;
import java.util.Scanner;
import java.time.format.DateTimeFormatter;
import java.time.DateTimeException;
import java.time.LocalDate;

public class CountWeekDay {
    public static void main(String[] args) {
        File inputFile = new File("input.txt");
        File outputFile = new File("output.txt");

        try (Scanner sc = new Scanner(inputFile);
                PrintWriter writer = new PrintWriter(outputFile)) {

            // String startStr = sc.nextLine();
            // String endStr = sc.nextLine();

            // DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");

            // LocalDate startDate = LocalDate.parse(startStr, formatter);
            // LocalDate endDate = LocalDate.parse(endStr, formatter);

            // long diffInDays = Math.abs(startDate.toEpochDay() - endDate.toEpochDay());

            // writer.println(diffInDays);

            String startStr = sc.nextLine();
            String endStr = sc.nextLine();

            DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");

            LocalDate startDate = LocalDate.parse(startStr, formatter);
            LocalDate endDate = LocalDate.parse(endStr, formatter);

            long diffInDays = Math.abs(startDate.toEpochDay() - endDate.toEpochDay());

            writer.println(diffInDays);

        } catch (FileNotFoundException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }
    }
}