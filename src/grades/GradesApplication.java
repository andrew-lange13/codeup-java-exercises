package grades;

import java.util.ArrayList;
import java.util.HashMap;

public class GradesApplication {

    public static void main(String[] args) {

        HashMap<String, Student> students = new HashMap<>();
        Student bob = new Student("Bob");
        Student jeff = new Student("Jeff");
        Student mike = new Student("Mike");
        Student fred = new Student("Fred");
        bob.addGrade(82);
        students.put("bobo96", bob);
        students.put("jeffy42", jeff);
        students.put("mike_mike", mike);
        students.put("turtles83", fred);



    }

}
