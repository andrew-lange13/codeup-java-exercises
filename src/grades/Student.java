package grades;

import java.util.ArrayList;
import java.util.HashMap;

public class Student {

    private String studentName;
    private ArrayList<Integer> studentGrades;
    private HashMap<String, String> attendance;

    public Student(String studentName){
        this.studentName = studentName;
        this.studentGrades = new ArrayList<>();
        this.attendance = new HashMap<>();
    }

    // TODO: returns the student's name
    public String getName(){
        return studentName;
    }
    // TODO: returns students grades array
    public ArrayList<Integer> getStudentGrades() {
        return studentGrades;
    }

    // TODO: adds the given grade to the grades property
    public void addGrade(int grade){
        studentGrades.add(grade);
    }
    // TODO; returns the average of the students grades
    public int getGradeAverage(){
        int gradeSum = 0;
        for(int num : studentGrades){
            gradeSum += num;
        }
        return gradeSum / studentGrades.size();
    }


    //TODO: adds attendance records to hashmap
    public void addAttendance(String date, String value){
    }

    public static void main(String[] args) {

        Student bob = new Student("bob");
        bob.addGrade(100);
        bob.addGrade(90);
        bob.addGrade(85);
        System.out.println("bob.getGradeAverage() = " + bob.getGradeAverage());

    }



}
