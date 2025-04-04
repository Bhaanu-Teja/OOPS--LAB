import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class FileAnalyzer {
    public static void main(String[] args) {
        int lines = 0, words = 0, characters = 0;

        try {
            BufferedReader reader = new BufferedReader(new FileReader("log.txt"));
            String line;
            while ((line = reader.readLine()) != null) {
                lines++;
                characters += line.length();
                words += line.split("\\s+").length;
            }
            reader.close();
            System.out.println("Lines: " + lines);
            System.out.println("Words: " + words);
            System.out.println("Characters: " + characters);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
