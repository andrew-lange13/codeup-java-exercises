import java.util.Scanner;

public class ConsoleAdventure {

    public static void main(String[] args) {
        // create scanner
        Scanner scanner = new Scanner(System.in);

        //creat random number generator
        int randomNumber = (int) (Math.random() * 20) + 1;

        //create character variable
        String player;
        int health;
        int attackPoints;
        int defensePoints;

        //start game prompt
        System.out.print("Do you want to play a game? y or n:  ");
        String startPrompt = scanner.nextLine();

        // if/else to evaluate start game prompt
        if(!startPrompt.equalsIgnoreCase("y")){
            System.out.println("No game for you!");
        } else{
            System.out.println("Lets Begin!");
            // name the character
            System.out.print("What is your characters name? ");
            // assign name to player1
            player = scanner.nextLine();
            health = 100;
            attackPoints = 10;
            defensePoints = 10;
            System.out.printf("Welcome to the dungeon %s%s%n%s%d%s%d%s%d%s", player, "!", "Your health = ", health, " and you have ", attackPoints, " attack points and ", defensePoints, " defense points.");
        }



    }
}
