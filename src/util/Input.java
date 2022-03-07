package util;

import java.util.Scanner;

public class Input {

    private final Scanner scanner;

    public Input() {
        this.scanner = new Scanner(System.in);
        this.scanner.useDelimiter(System.lineSeparator());
    }

    public String getString() {
        return this.scanner.next();
    }

    public String getString(String prompt) {
        System.out.print(prompt);
        return this.scanner.next();
    }

    public boolean yesNo() {
        String userAnswer = this.scanner.next();
        return userAnswer.equalsIgnoreCase("y") | userAnswer.equalsIgnoreCase("yes");
    }

    public boolean yesNo(String prompt) {
        System.out.print(prompt);
        String userAnswer = this.scanner.next();
        return userAnswer.equalsIgnoreCase("y") | userAnswer.equalsIgnoreCase("yes");
    }

    public int getInt() {
        return this.scanner.nextInt();
    }

    public int getInt(String prompt) {
        try {
            System.out.print(prompt);
            return Integer.parseInt(this.getString());
        } catch (Exception e) {
            System.out.println("Couldn't parse that ish" + e.getMessage());
            e.printStackTrace();
        }
        return getInt();
    }

    public int getInt(int min, int max) {
        return getInt("Enter an integer between " + min + " and " + max + " ", min, max);
    }

    public int getInt(String prompt, int min, int max) {
        do {
            System.out.print(prompt);
            int userInt = this.scanner.nextInt();
            if (userInt >= min & userInt <= max) {
                return userInt;
            }
        } while (true);
    }

    public double getDouble() {
        return this.scanner.nextDouble();
    }

    public double getDouble(String prompt) {
        try {
            System.out.print(prompt);
            return Double.parseDouble(getString());
        } catch (Exception e) {
            System.out.println("Couldn't parse that ish" + e.getMessage());
            e.printStackTrace();
        }
        return getDouble();
    }


    public double getDouble(double min, double max) {
        return getDouble("Enter a double between " + min + " and " + max + "  ", min, max);
    }

    public double getDouble(String prompt, double min, double max) {
        do {
            System.out.print(prompt);
            double userDouble = this.scanner.nextDouble();
            if (userDouble >= min & userDouble <= max) {
                return userDouble;
            }
        } while (true);
    }

    public String getBinary(){
        System.out.print("Enter a number: ");
         int binaryGuy = this.scanner.nextInt();
         return Integer.toBinaryString(binaryGuy);
    }

}
