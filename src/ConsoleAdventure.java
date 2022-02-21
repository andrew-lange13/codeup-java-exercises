import java.util.Scanner;

public class ConsoleAdventure {


    public static void main(String[] args) {
        // create scanner
        Scanner scanner = new Scanner(System.in);

        //create random number generator
        int randomNumber = (int) (Math.random() * 6) + 1;

        //create player and enemy variables
        String player;
        int playerHealth;
        int playerAttackPoints;
        int playerDefensePoints;
        int enemy1Health;
        int enemy1AttackPoints;
        int enemy1DefensePoints;


        //start game prompt
        System.out.println("\n" +
                " █████╗ ██████╗ ██╗   ██╗███████╗███╗   ██╗████████╗██╗   ██╗██████╗ ███████╗    ████████╗██╗███╗   ███╗███████╗    ██╗██╗\n" +
                "██╔══██╗██╔══██╗██║   ██║██╔════╝████╗  ██║╚══██╔══╝██║   ██║██╔══██╗██╔════╝    ╚══██╔══╝██║████╗ ████║██╔════╝    ██║██║\n" +
                "███████║██║  ██║██║   ██║█████╗  ██╔██╗ ██║   ██║   ██║   ██║██████╔╝█████╗         ██║   ██║██╔████╔██║█████╗      ██║██║\n" +
                "██╔══██║██║  ██║╚██╗ ██╔╝██╔══╝  ██║╚██╗██║   ██║   ██║   ██║██╔══██╗██╔══╝         ██║   ██║██║╚██╔╝██║██╔══╝      ╚═╝╚═╝\n" +
                "██║  ██║██████╔╝ ╚████╔╝ ███████╗██║ ╚████║   ██║   ╚██████╔╝██║  ██║███████╗       ██║   ██║██║ ╚═╝ ██║███████╗    ██╗██╗\n" +
                "╚═╝  ╚═╝╚═════╝   ╚═══╝  ╚══════╝╚═╝  ╚═══╝   ╚═╝    ╚═════╝ ╚═╝  ╚═╝╚══════╝       ╚═╝   ╚═╝╚═╝     ╚═╝╚══════╝    ╚═╝╚═╝\n" +
                "                                                                                                                          ");
        System.out.print("Do you want to play a game? [1]:Yes  [2]:No  ");
        String startPrompt = scanner.nextLine();

        // if/else to evaluate start game prompt
        if (startPrompt.equals("1")) {
            // name the character
            System.out.print("What is your characters name? ");
            // assign name to player1
            player = scanner.nextLine();
            System.out.printf("Welcome to your adventure %s%s%n%n%n", player, "!");
            System.out.printf("There you were, minding your own business, eating a Big Mac while riding your horse through town. %n%s%n%s%n%s%n", "When suddenly a giant sinkhole emerges in front of you!!!", "Being the dimwitted hero that you are, you mindlessly jump right in the massive hole...", "As your eyes adjust to the darkness you see something truly terrifying walking towards you...");
            scanner.nextLine();
            System.out.println("" +
                    "                             ___-------___\n" +
                    "                         _-~~             ~~-_\n" +
                    "                      _-~                    /~-_\n" +
                    "   /^\\__/^\\         /~  \\                   /    \\\n" +
                    " /|  O|| O|        /      \\_______________/        \\\n" +
                    "| |___||__|      /       /                \\          \\\n" +
                    "|          \\    /      /                    \\          \\\n" +
                    "|   (_______) /______/                        \\_________ \\\n" +
                    "|         / /         \\                      /            \\\n" +
                    " \\         \\^\\\\         \\                  /               \\     /\n" +
                    "   \\         ||           \\______________/      _-_       //\\__//\n" +
                    "     \\       ||------_-~~-_ ------------- \\ --/~   ~\\    || __/\n" +
                    "       ~-----||====/~     |==================|       |/~~~~~\n" +
                    "        (_(__/  ./     /                    \\_\\      \\.\n" +
                    "               (_(___/                         \\_____)_)\n");


        } else {
            System.out.println(" " +
                    "" +
                    "\n" +
                    "  █████████    █████████   ██████   ██████ ██████████       ███████    █████   █████ ██████████ ███████████  \n" +
                    "  ███░░░░░███  ███░░░░░███ ░░██████ ██████ ░░███░░░░░█     ███░░░░░███ ░░███   ░░███ ░░███░░░░░█░░███░░░░░███ \n" +
                    " ███     ░░░  ░███    ░███  ░███░█████░███  ░███  █ ░     ███     ░░███ ░███    ░███  ░███  █ ░  ░███    ░███ \n" +
                    "░███          ░███████████  ░███░░███ ░███  ░██████      ░███      ░███ ░███    ░███  ░██████    ░██████████  \n" +
                    "░███    █████ ░███░░░░░███  ░███ ░░░  ░███  ░███░░█      ░███      ░███ ░░███   ███   ░███░░█    ░███░░░░░███ \n" +
                    "░░███  ░░███  ░███    ░███  ░███      ░███  ░███ ░   █   ░░███     ███   ░░░█████░    ░███ ░   █ ░███    ░███ \n" +
                    " ░░█████████  █████   █████ █████     █████ ██████████    ░░░███████░      ░░███      ██████████ █████   █████\n" +
                    "  ░░░░░░░░░  ░░░░░   ░░░░░ ░░░░░     ░░░░░ ░░░░░░░░░░       ░░░░░░░         ░░░      ░░░░░░░░░░ ░░░░░   ░░░░░ \n" +
                    "                                                                                                              \n" +
                    "                                                                                                              \n" +
                    "                                                                                                              ");
        }


    }
}
