import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

public class TemplateIO {
    public static void main(String[] args) {
        File inputFile = new File("input.txt");
        File outputFile = new File("output.txt");

        try (Scanner sc = new Scanner(inputFile);
                PrintWriter writer = new PrintWriter(outputFile)) {

            // Your code here. Use scanner to read from the input file
            // and writer to write to the output file.

            writer.println("Hello World");

        } catch (FileNotFoundException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }
    }
}