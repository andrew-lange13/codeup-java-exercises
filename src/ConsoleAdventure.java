import java.util.Scanner;

public class ConsoleAdventure {

    public static void main(String[] args) {
        // create scanner
        Scanner scanner = new Scanner(System.in);

        //create random number generator
        int randomNumber = (int) (Math.random() * 20) + 1;

        //create character variables
        String player;
        int playerHealth;
        int playerAttackPoints;
        int playerDefensePoints;
        String enemy1;
        int enemy1Health;
        int enemy1AttackPoints;
        int enemy1DefensePoints;


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
            playerHealth = 100;
            playerAttackPoints = 10;
            playerDefensePoints = 10;
            System.out.printf("Welcome to the dungeon %s%s%n%n%s%d%s%d%s%d%s%n", player, "!", "Your health = ", playerHealth, " and you have ", playerAttackPoints, " attack points and ", playerDefensePoints, " defense points.");
            System.out.print("You only make it 7 steps into the dungeon when a level 1 goblinator attacks!! Fight or Flight?? :  ");
            String fightFlight = scanner.nextLine();
            if (!fightFlight.equalsIgnoreCase("fight")){
                System.out.println("You run away.");
            } else {
                System.out.println("Let the fight begin!");
                enemy1 = "goblinator";
                enemy1Health = 10;
                enemy1AttackPoints = 1;
                enemy1DefensePoints = 1;
                System.out.printf("%s%s%d%s%d%s%d%s%n", enemy1, " health = ", enemy1Health, " and it has ", enemy1AttackPoints, " attack points and ", enemy1DefensePoints, " defense points.");
            }

        }



    }
}
