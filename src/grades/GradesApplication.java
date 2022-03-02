package grades;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class GradesApplication {


    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        HashMap<String, Student> students = new HashMap<>();
        // creates student objects and adds grades
        Student bob = new Student("Bob");
        bob.addGrade(82);
        bob.addGrade(85);
        bob.addGrade(88);
        Student jeff = new Student("Jeff");
        jeff.addGrade(94);
        jeff.addGrade(91);
        jeff.addGrade(97);
        Student mike = new Student("Mike");
        mike.addGrade(76);
        mike.addGrade(81);
        mike.addGrade(72);
        Student fred = new Student("Fred");
        fred.addGrade(68);
        fred.addGrade(72);
        fred.addGrade(75);
        // adds objects to map
        students.put("bobo96", bob);
        students.put("jeffy42", jeff);
        students.put("mike_mike", mike);
        students.put("turtles83", fred);


        System.out.println("Welcome");
        System.out.println();
        System.out.println("Here are the github usernames of our students: ");
        System.out.println();
        for (String student : students.keySet()) {
            System.out.print("|" + student + "|  ");
        }
        System.out.println();
        boolean keepGoing = true;
        do {
            System.out.println();
            System.out.println("What student would you like to see more information on?");
            String userInput = scan.nextLine();
            if (userInput.equals("bobo96")) {
                System.out.println("Name: " + students.get(userInput).getName() + " - GitHub Username: " + userInput);
                System.out.println("The students grades: " + students.get(userInput).getStudentGrades());
                System.out.println("Current Average: " + students.get(userInput).getGradeAverage());
                System.out.println();
                System.out.println("Would you like to see another student?");
                String yesNo = scan.nextLine();
                if (yesNo.equalsIgnoreCase("no")) {
                    keepGoing = false;
                }
            } else if (userInput.equals("jeffy42")) {
                System.out.println("Name: " + students.get(userInput).getName() + " - GitHub Username: " + userInput);
                System.out.println("The students grades: " + students.get(userInput).getStudentGrades());
                System.out.println("Current Average: " + students.get(userInput).getGradeAverage());
                System.out.println();
                System.out.println("Would you like to see another student?");
                String yesNo = scan.nextLine();
                if (yesNo.equalsIgnoreCase("no")) {
                    keepGoing = false;
                }
            } else if (userInput.equals("turtles83")) {
                System.out.println("Name: " + students.get(userInput).getName() + " - GitHub Username: " + userInput);
                System.out.println("The students grades: " + students.get(userInput).getStudentGrades());
                System.out.println("Current Average: " + students.get(userInput).getGradeAverage());
                System.out.println();
                System.out.println("Would you like to see another student?");
                String yesNo = scan.nextLine();
                if (yesNo.equalsIgnoreCase("no")) {
                    keepGoing = false;
                }

            } else if (userInput.equals("mike_mike")) {
                System.out.println("Name: " + students.get(userInput).getName() + " - GitHub Username: " + userInput);
                System.out.println("The students grades: " + students.get(userInput).getStudentGrades());
                System.out.println("Current Average: " + students.get(userInput).getGradeAverage());
                System.out.println();
                System.out.println("Would you like to see another student?");
                String yesNo = scan.nextLine();
                if (yesNo.equalsIgnoreCase("no")) {
                    keepGoing = false;
                }
            }
            else{
                System.out.println("Sorry no student found with the GitHub username of " + userInput);
                System.out.println();
                System.out.println("Would you like to see another student?");
                String yesNo = scan.nextLine();
                if (yesNo.equalsIgnoreCase("no")) {
                    keepGoing = false;
                }
            }
        }
        while (keepGoing);


    }

}
