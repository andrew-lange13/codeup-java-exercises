import java.lang.Math;
import java.util.Scanner;

public class HighLow {

    public static void main(String[] args) {

        int randomNumber = (int) (Math.random() * 100) + 1;
//        System.out.println("Random number: " + randomNumber);

        Scanner scanner = new Scanner(System.in);
        int userGuess;
        int guessCounter = 0;
        do {
            System.out.print("Guess a number between 1 and 100: ");
            guessCounter++;
            userGuess = scanner.nextInt();
            if (userGuess < 1 || userGuess > 100) {
                System.out.println("Your guess is outside range, try again");
            } else if (userGuess > randomNumber) {
                System.out.println("LOWER");
                System.out.printf("That was guess number %d%s%d%s%n", guessCounter, ", You have ", (10 - guessCounter), " guesses remaining.");
            } else if (userGuess < randomNumber) {
                System.out.println("HIGHER");
                System.out.printf("That was guess number %d%s%d%s%n", guessCounter, ", You have ", (10 - guessCounter), " guesses remaining.");
            } else {
                System.out.println("GOOD GUESS");
                System.out.printf("Good job, it only took you %d%s%n", guessCounter, " guesses!");
            }

        }
        while (userGuess != randomNumber && guessCounter < 10);
    }
}
