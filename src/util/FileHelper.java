package util;

import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List;

public class FileHelper {

    //TODO:Create a method named slurp, it takes a string that is the filepath, and returns a list of strings (the file contents).
    public static List<String> slurp(String filepath){
        try {
            return Files.readAllLines(Path.of(filepath));
        } catch(Exception e){
            System.out.println("File path does not exist");
            System.exit(1);
        }
        return slurp(String.valueOf(Path.of(filepath)));
    }

    public static void spit(String filename, List<String> contents, boolean append){
        try{
            Files.readAllLines(Path.of(filename));
        }
        catch(Exception e){
            System.out.println("The file already exists");
            System.exit(1);
        }
    }

}
