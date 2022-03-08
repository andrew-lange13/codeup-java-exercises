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
        try {
            return Integer.parseInt(this.getString());
        } catch(Exception e){
            e.printStackTrace();
            throw new NumberFormatException();
        }
    }

    public int getInt(String prompt) {
        try {
            System.out.print(prompt);
            return Integer.parseInt(this.getString());
        } catch (Exception e) {
            e.printStackTrace();
            throw new NumberFormatException();
        }
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
        try {
            return Double.parseDouble(getString());
        } catch(Exception e){
            e.printStackTrace();
            throw new NumberFormatException();
        }
    }

    public double getDouble(String prompt) {
        try {
            System.out.print(prompt);
            return Double.parseDouble(getString());
        } catch (Exception e) {
            e.printStackTrace();
            throw new NumberFormatException();
        }
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

    public int getBinary(){
        System.out.print("Enter a number: ");
         String binaryGuy = this.scanner.next();
         return Integer.valueOf(binaryGuy, 2);
    }

    public int getHex(){
        System.out.print("Enter a number: ");
        String hexGuy = this.scanner.next();
        return Integer.valueOf(hexGuy, 16);
    }

}
