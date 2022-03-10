package fileIOLecture;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class lecture {

    public static void printPoem(Path filePath) throws IOException {
        System.out.println();
        List<String> fileContents = Files.readAllLines(filePath);
        for(int i = 0; i < fileContents.size(); i++){
            System.out.printf("%d: %s\n", i + 1, fileContents.get(i));
        }
    }

    public static void main(String[] args) throws IOException {

        String myString = "This string";

        Path pathToPoem = Paths.get("src/fileIOLecture/wow.txt");

        System.out.println(Files.exists(pathToPoem));

        printPoem(pathToPoem);

        String directory = "./src/fileIOLecture/data";

        String fileName = "groceryList.txt";

        Path dataDirectory = Paths.get(directory);

        Path dataDirectoryAndFile = Paths.get(directory, fileName);

        System.out.println();
//        System.out.println("dataDirectory = " + dataDirectory);
//        System.out.println("dataDirectoryAndFile = " + dataDirectoryAndFile);

        if(Files.notExists(dataDirectory)){
            Files.createDirectory(dataDirectory);
            Files.createFile(dataDirectoryAndFile);
        }

        // Manipulate what's inside files
        System.out.println("dataDirectoryAndFile = " + dataDirectoryAndFile);

        // set up something we want to write into text file
        List<String> groceryList = Arrays.asList("coffee", "steak", "cheese", "potatoes", "spaghetti");

        Files.write(dataDirectoryAndFile, groceryList);

        //append to list
        List<String> forgotGrocery = Arrays.asList("bread", "ramen");

        Files.write(dataDirectoryAndFile, forgotGrocery, StandardOpenOption.APPEND);

        //get info back out of text file
        List<String> printGroceryList = Files.readAllLines(dataDirectoryAndFile);
        System.out.println(printGroceryList);
        for(int i = 0; i < printGroceryList.size(); i++){
            System.out.println((i+1) + " : " + printGroceryList.get(i));
        };

        //replace found element with a new element

        List<String> printGroceryList2 = Files.readAllLines(dataDirectoryAndFile);

        List<String> newList = new ArrayList<>();

        for(String list : printGroceryList2){
            if(list.equalsIgnoreCase("cheese")){
                newList.add("non-dairy cheese");
                continue;
            }
            newList.add(list);
        }
        System.out.println("newList = " + newList);
    }


}
