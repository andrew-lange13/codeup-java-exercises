import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class Contacts {

    public static void main(String[] args) {

        try {
            File contacts = new File("/Users/andrewlange/Documents/contacts.txt");
            if (contacts.createNewFile()) {
                System.out.println("File created: " + contacts.getName());
            } else {
                System.out.println("File already exists.");
            }
        } catch (IOException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }

    }
}
