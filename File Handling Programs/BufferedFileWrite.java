import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class BufferedFileWrite {
    public static void main(String[] args) {
        try {
            BufferedWriter writer = new BufferedWriter(new FileWriter("buffered.txt"));
            writer.write("This is a buffered file writing example.");
            writer.newLine();
            writer.write("Buffered writing is more efficient.");
            writer.close();
            System.out.println("File written using BufferedWriter.");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
