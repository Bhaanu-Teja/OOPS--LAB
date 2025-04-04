import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class SearchWordInFile {
    public static void main(String[] args) {
        try {
            File file = new File("buffered.txt");
            Scanner scanner = new Scanner(file);
            String searchWord = "efficient";
            boolean found = false;

            while (scanner.hasNextLine()) {
                String line = scanner.nextLine();
                if (line.contains(searchWord)) {
                    found = true;
                    System.out.println("Word found in line: " + line);
                }
            }
            scanner.close();

            if (!found) {
                System.out.println("Word not found in file.");
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }
}
