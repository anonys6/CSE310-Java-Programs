import java.util.Scanner;

public class operator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter three numbers:");
        int x = scanner.nextInt();
        int y = scanner.nextInt();
        int z = scanner.nextInt();

        int max = x > y ? (x > z ? x : z) : (y > z ? y : z);

        System.out.println("The maximum number is " + max);
    }
}