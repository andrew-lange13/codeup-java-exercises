import java.io.*;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Contacts {

    public static void contactCreator() {
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

    public static void readFileIntoList() {
        List<String> contacts = Collections.emptyList();
        try {
            contacts = Files.readAllLines(Paths.get("/Users/andrewlange/Documents/contacts.txt"), StandardCharsets.UTF_8);
            for(String contact : contacts){
                System.out.printf("%s%n", contact);
            }
        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }

    public static void contactReader(){
        try {
            File contacts = new File("/Users/andrewlange/Documents/contacts.txt");
            Scanner myReader = new Scanner(contacts);
//            myReader.useDelimiter(" , ");
            while (myReader.hasNextLine()) {
                String data = myReader.nextLine();
                System.out.printf("%15s%n", data);
            }
            myReader.close();
        } catch (FileNotFoundException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }
    }

    public static void contactAdder(){
        try {
//            FileWriter contacts = new FileWriter("/Users/andrewlange/Documents/contacts.txt");
            Scanner scan = new Scanner(System.in);
            scan.useDelimiter(System.lineSeparator());
            System.out.print("Enter first name: ");
            String newFirst = scan.next();
            Files.writeString(Paths.get("/Users/andrewlange/Documents/contacts.txt"), ("\n" + newFirst), StandardOpenOption.APPEND);
            System.out.print("Enter last name: ");
            String newLast = scan.next();
            Files.writeString(Paths.get("/Users/andrewlange/Documents/contacts.txt"), (" " + newLast + "  |  "), StandardOpenOption.APPEND);
            System.out.print("Enter phone number: ");
            String newNumber = scan.next();
            Files.writeString(Paths.get("/Users/andrewlange/Documents/contacts.txt"), (newNumber + "  |"), StandardOpenOption.APPEND);
            System.out.println("Successfully wrote to the file.");
        } catch (IOException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }
    }

    private static void contactSearcher() throws IOException {
        System.out.print("Please enter the name you would like to search for: ");
        Scanner scan = new Scanner(System.in);
        String name = scan.nextLine();

        List<String> lines = Files.readAllLines(Paths.get("/Users/andrewlange/Documents/contacts.txt"));
        for (String line : lines) {
            if (line.contains(name)) {
                System.out.println(line);
            }
        }
    }

    public static void main(String[] args) throws IOException {

//        contactCreator();
//        contactReader();
//        contactAdder();
        contactReader();
//        contactSearcher();
//        readFileIntoList();

    }
}
