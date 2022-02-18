import java.util.Scanner;

public class Bob {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        boolean bobTalk = true;

//        System.out.println(bobInput);
        while (bobTalk) {
            String bob = "Talk to Bob or type exit to leave: ";
            System.out.print(bob);
            String bobInput = scanner.nextLine();
            if (bobInput.isEmpty()) {
                System.out.println("Fine. Be that way!");
            } else if (bobInput.endsWith("?")) {
                System.out.println("Sure.");
            } else if (bobInput.endsWith("!")) {
                System.out.println("Whoa, chill out!");
            } else if (bobInput.equals("exit")) {
                bobTalk = false;
            } else {
                System.out.println("Whatever.");
            }
        }
    }
}
