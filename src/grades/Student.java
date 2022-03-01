package grades;

import java.util.ArrayList;

public class Student {

    private final String studentName;
    private final ArrayList<Integer> studentGrades;

    public Student(String studentName){
        this.studentName = studentName;
        this.studentGrades = new ArrayList<>();
    }

    // TODO: returns the student's name
    public String getName(){
        return studentName;
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


    public static void main(String[] args) {

        Student bob = new Student("bob");
        bob.addGrade(100);
        bob.addGrade(90);
        bob.addGrade(85);
        System.out.println("bob.getGradeAverage() = " + bob.getGradeAverage());

    }



}
