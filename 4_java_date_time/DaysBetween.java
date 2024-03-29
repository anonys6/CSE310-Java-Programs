import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class DaysBetween {
    public static void main(String[] args) {
        File inputFile = new File("input.txt");
        File outputFile = new File("output.txt");

        try (Scanner sc = new Scanner(inputFile);
                PrintWriter writer = new PrintWriter(outputFile)) {

            DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");

            LocalDate date1 = LocalDate.parse(sc.nextLine(), formatter);
            LocalDate date2 = LocalDate.parse(sc.nextLine(), formatter);

            long diffInDays = Math.abs(date2.toEpochDay() - date1.toEpochDay());

            writer.println(diffInDays);

        } catch (FileNotFoundException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }
    }
}