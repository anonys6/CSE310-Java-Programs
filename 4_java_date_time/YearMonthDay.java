import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.time.format.DateTimeFormatter;
import java.time.LocalDate;
import java.time.Period;
import java.util.Scanner;

public class YearMonthDay {
    public static void main(String[] args) {
        File inputFile = new File("input.txt");
        File outputFile = new File("output.txt");

        try (Scanner sc = new Scanner(inputFile);
                PrintWriter writer = new PrintWriter(outputFile)) {

            String startStr = sc.nextLine();
            String endStr = sc.nextLine();

            DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");

            LocalDate startDate = LocalDate.parse(startStr, formatter);
            LocalDate endDate = LocalDate.parse(endStr, formatter);

            Period period = Period.between(startDate, endDate);

            writer.println(period.getYears() + " years " + period.getMonths() + " months " + period.getDays() + " days");

            // Period period = Period.between(startDate, endDate);

            // writer.println(period.getYears());
            // writer.println(period.getMonths());
            // writer.println(period.getDays());

        } catch (FileNotFoundException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }
    }
}