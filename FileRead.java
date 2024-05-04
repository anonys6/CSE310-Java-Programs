import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

public class FileRead {
    public static void main(String[] args) {
        String filePath = "6_files/file1.txt";
        try {
            String str = new String(Files.readAllBytes(Paths.get(filePath)));
            System.out.println(str);
        } catch (Exception e) {
            System.out.println("file not found");
        }

    }
}