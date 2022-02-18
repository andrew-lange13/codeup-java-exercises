package util;

import java.util.Scanner;

public class Input {

    private Scanner scanner;

    public Input() {
        this.scanner = new Scanner(System.in);
    }

    public String getString(){
        return getString("Enter a string: ");
    }

    public String getString(String prompt){
        System.out.println(prompt);
        return this.scanner.nextLine();
    }

    public boolean yesNo(){
        return yesNo("Enter yes or no: ");
    }

    public boolean yesNo(String prompt){
        System.out.println(prompt);
        String userAnswer = this.scanner.nextLine();
        return userAnswer.equalsIgnoreCase("y") | userAnswer.equalsIgnoreCase("yes");
    }



}
