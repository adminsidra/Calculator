import java.io.FileWriter;
import java.io.FileReader;
import java.io.IOException;

public class FileDemo {
    public static void main(String[] args) {
        try {
            FileWriter writer = new FileWriter("output.txt");
            writer.write("Hello, this is a file handling example.");
            writer.close();
            FileReader reader = new FileReader("output.txt");
            int i;
            while ((i = reader.read()) != -1)
                System.out.print((char) i);
            reader.close();
        } catch (IOException e) {
            System.out.println("Error: " + e);
        }
    }
}
