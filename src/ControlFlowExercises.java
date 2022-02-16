import java.util.Scanner;

public class ControlFlowExercises {
    public static void main(String[] args) {

        // while loop to 15

        /*int i = 5;
        while(i <= 15){
            System.out.print(i + " ");
            i++;
        }*/

        //for loop to 15

       /* for(int i = 5; i<=15; i++){
            System.out.print(i + " ");
        }*/

        // do while to 100 by 2

       /* int i = 0;
        do{
            System.out.println(i);
            i += 2;
        }while(i <= 100);*/

        // for loop to 100 by 2

        /*for(int i = 0; i <= 100; i+=2){
            System.out.println(i);
        }*/

        // do while from 100 to -10 by 5

        /*int i = 100;
        do{
            System.out.println(i);
            i -= 5;
        }while(i >= -10);*/

        // for loop from 100 to -10 by 5

//        for(int i = 100; i >= -10; i -=5){
//            System.out.println(i);
//        }

        // do while squared to one million

        /*long i = 2;
        do{
            System.out.println(i);
            i *= i;
        }while(i < 1000000);*/

        // for loop squared to one million

        /*for(long i = 2; i < 1000000; i *= i){
            System.out.println(i);
        }*/

        //Fizzbuzz

        /*for(int i = 1; i <= 100; i++){
            if(i % 3 == 0 && i % 5 == 0){
                System.out.println("FizzBuzz");
            }else if(i % 5 == 0){
                System.out.println("Buzz");
            }else if(i % 3 == 0){
                System.out.println("Fizz");
            }else {
                System.out.println(i);
            }
        }*/

        //table of powers

        /*Scanner scanner = new Scanner(System.in);

        System.out.print("Enter an integer: ");
        int userInt = scanner.nextInt();

        System.out.print("Do you want to continue? y or n : ");
        String userInput = scanner.next();

        if (!userInput.equals("y")) {
            System.out.print("Bye Felicia!");
        } else {
            System.out.println();
            System.out.println("Here is your table!" + "\n");
            System.out.println("number | squared  | cubed");
            System.out.println("------ | -------  | -----");
            for (int i = 1; i <= 3; i++) {
                System.out.println(i + "      | " + (i * i) + "        | " + (i * i * i));
            }
            for (int i = 4; i <= userInt; i++) {
                System.out.println(i + "      | " + (i * i) + "       | " + (i * i * i));
            }
        }*/

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter your grade (0-100): ");
        int userGrade = scanner.nextInt();

        System.out.println("You entered: " + userGrade);

        System.out.print("Do you want to continue? y or n : ");
        String userInput = scanner.next();

        if(!userInput.equals("y")){
            System.out.println("Bye Felicia!");
        } else if(userGrade >= 98){
            System.out.println("A+");
        }else if(userGrade >= 88){
            System.out.println("A");
        }else if(userGrade >= 85){
            System.out.println("B+");
        }else if(userGrade >= 80){
            System.out.println("B");
        }else if(userGrade >= 67){
            System.out.println("C");
        }else if(userGrade >= 60){
            System.out.println("D");
        }else{
            System.out.println("F");
        }



    }
}
