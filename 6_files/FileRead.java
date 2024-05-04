import java.io.FileReader;
import java.io.IOException;

public class FileRead {
    public static void main(String[] args) {
        
        try {
            FileReader reader = new FileReader("file2.txt");

            int character;
            String str = "";

            while((character = reader.read()) != -1) {
                str = str + (char)character;
            }

            System.out.println(str);
        } catch (IOException e) {
            System.out.println("Error reading file");
        }
    }
}
