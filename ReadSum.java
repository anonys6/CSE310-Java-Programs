import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

public class ReadSum {
    public static void main(String[] args) {
        File inputFile = new File("input.txt");
        File outputFile = new File("output.txt");

        try (Scanner sc = new Scanner(inputFile);
                PrintWriter writer = new PrintWriter(outputFile)) {

            // Your code here. Use scanner to read from the input file
            // and writer to write to the output file.
            int sum1 = 0;
            while(sc.hasNextInt()) {
                int temp = sc.nextInt();
                if (temp == 0) {
                    break;
                } else {
                    sum1 = sum1 + temp;
                }
            }
            

            int sum2 = 0;
            while(sc.hasNextInt()) {
                int temp = sc.nextInt();
                if (temp == 0) {
                    break;
                } else {
                    sum2 = sum2 + temp;
                }
            }

            int sum3 = 0;
            while(sc.hasNextInt()) {
                int temp = sc.nextInt();
                if (temp == 0) {
                    break;
                } else {
                    sum3 = sum3 + temp;
                }
            }

            int sum4 = 0;
            while(sc.hasNextInt()) {
                int temp = sc.nextInt();
                if (temp == 0) {
                    break;
                } else {
                    sum4 = sum4 + temp;
                }
            }

            int sum5 = 0;
            while(sc.hasNextInt()) {
                int temp = sc.nextInt();
                if (temp == 0) {
                    break;
                } else {
                    sum5 = sum5 + temp;
                }
            }

            int totalSum = sum1 + sum2 + sum3 + sum4 + sum5;

            writer.println("sum1: " + sum1);
            writer.println("sum2: " + sum2);
            writer.println("sum3: " + sum3);
            writer.println("sum4: " + sum4);
            writer.println("sum5: " + sum5);
            writer.println("totalSum: " + totalSum);


                    


        } catch (FileNotFoundException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }
    }
}