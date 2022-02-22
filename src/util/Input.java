package util;

import java.util.Scanner;

public class Input {

    private final Scanner scanner;

    public Input() {
        this.scanner = new Scanner(System.in);
    }

    public String getString() {
        return getString("Enter a string: ");
    }

    public String getString(String prompt) {
        System.out.print(prompt);
        return this.scanner.nextLine();
    }

    public boolean yesNo() {
        return yesNo("Enter yes or no: ");
    }

    public boolean yesNo(String prompt) {
        System.out.print(prompt);
        String userAnswer = this.scanner.next();
        return userAnswer.equalsIgnoreCase("y") | userAnswer.equalsIgnoreCase("yes");
    }

    public int getInt() {
        return getInt("Enter an integer: ");
    }

    public int getInt(String prompt) {
        System.out.print(prompt);
        return this.scanner.nextInt();
    }

    public int getInt(int min, int max) {
        return getInt("Enter an integer between " + min + " and " + max + " ", min, max);
    }

    public int getInt(String prompt, int min, int max){
        do {
            System.out.print(prompt);
            int userInt = this.scanner.nextInt();
            if(userInt >= min & userInt <= max){
                return userInt;
            }
        } while (true);
    }

    public double getDouble() {
        return getInt("Enter a double: ");
    }

    public double getDouble(String prompt) {
        System.out.print(prompt);
        return this.scanner.nextDouble();
    }

    public double getDouble(double min, double max) {
        return getDouble("Enter a double between " + min + " and " + max + "  ", min, max);
    }

    public double getDouble(String prompt, double min, double max){
        do {
            System.out.print(prompt);
            double userDouble = this.scanner.nextDouble();
            if(userDouble >= min & userDouble <= max){
                return userDouble;
            }
        } while (true);
    }


}
