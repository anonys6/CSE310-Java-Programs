import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

public class RemoveVowel {
    public static void main(String[] args) {
        File inputFile = new File("input.txt");
        File outputFile = new File("output.txt");

        try (Scanner sc = new Scanner(inputFile);
                PrintWriter writer = new PrintWriter(outputFile)) {

            String str = sc.nextLine();

            String remStr = str.replaceAll("[aeiouAEIOU]", "");

            writer.println(remStr);

        } catch (FileNotFoundException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }
    }
}