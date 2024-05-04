import java.io.FileReader;
import java.io.IOException;;

public class MergeFile {
    public static void main(String[] args) {

        try {
            FileReader reader1 = new FileReader("file1.txt");
            FileReader reader2 = new FileReader("file2.txt");

            int char1, char2;
            String str1 = "", str2 = "";

            while ((char1 = reader1.read()) != -1) {
                str1 = str1 + (char) char1;
            }

            while ((char2 = reader2.read()) != -1) {
                str2 = str2 + (char) char2;
            }

            System.out.println(str1 + "\n" + str2);
        } catch (IOException e) {
            System.out.println("Error reading file");
        }

    }
}
