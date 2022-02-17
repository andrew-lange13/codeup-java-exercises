import java.util.Scanner;

public class ConsoleAdventure {

    public static void main(String[] args) {
        // create scanner
        Scanner scanner = new Scanner(System.in);

        //creat random number generator
        int randomNumber = (int) (Math.random() * 20) + 1;

        //create character name variable
        String player1;

        //start game prompt
        System.out.print("Do you want to play a game? y/n:  ");
        String startPrompt = scanner.nextLine();

        // if/else to evaluate start game prompt
        if(!startPrompt.equals("y")){
            System.out.println("No game for you!");
        } else{
            System.out.println("Lets Begin!");
            // name the character
            System.out.print("What is your characters name? ");
            // assign name to player1
            player1 = scanner.nextLine();
            System.out.printf("Welcome to the dungeon %s%n", player1);
        }



    }
}
