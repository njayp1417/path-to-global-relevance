import java.io.FileWriter;
import java.io.FileReader;
import java.util.Scanner;
import java.io.IOException;



public class FilePratice {
    public static void main(String[] args) {

        try {
            FileWriter writer = new FileWriter("notes.txt");
            writer.write("Hello from Java! \n");
            writer.write("This is my first file. \n");
            writer.close();
            System.out.println("File written successfully.");

        } catch (IOException e) {
            System.out.println("write error: " + e.getMessage());

        }
        try {
            Scanner reader = new Scanner(new FileReader("notes.txt"));
            while(reader.hasNextLine()) {
                System.out.println(reader.nextLine());
            }
            reader.close();

        } catch (IOException e) {
            System.out.println("Read error: " + e.getMessage());
        }
    }
}

