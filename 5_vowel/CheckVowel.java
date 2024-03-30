import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

public class CheckVowel {
    public static void main(String[] args) {
        File inputFile = new File("input.txt");
        File outputFile = new File("output.txt");

        try (Scanner sc = new Scanner(inputFile);
                PrintWriter writer = new PrintWriter(outputFile)) {

            char ch = sc.nextLine().charAt(0);

            boolean isVowel = "aeiouAEIOU".indexOf(ch) != -1;

            if (isVowel) {
                writer.println(ch + " is vowel");
            } else {
                writer.println(ch + " is consonant");
            }

        } catch (FileNotFoundException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }
    }
}