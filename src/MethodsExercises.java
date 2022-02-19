import java.util.Scanner;

public class MethodsExercises {

    ////addition
//    public static int addition(int a, int b){
//        return a + b;
//    }

//    public static int subtraction(int a, int b){
//        return a - b;
//    }

//    public static int multiplication(int a, int b){
//        return a * b;
//    }

    //multiplication loop
//    public static int multiplication(int a, int b){
//        int sum = 0;
//        for (int i = 0; i < a; i++) {
//            sum += b;
//        }
//        return sum;
//    }

    //multiplication recursion
//    public static int multiplication(int a, int b){
//        if (a == 0 || b == 0){
//            return 0;
//        } else{
//            return a + multiplication(a, b - 1);
//        }
//    }

//    public static int division(int a, int b){
//        return a / b;
//    }

//    public static int remainder(int a, int b){
//        return a % b;
//    }


    //integer check

//    public static void getInteger() {
//        Scanner scanner = new Scanner(System.in);
//        boolean isTrue = true;
//
//        System.out.print("Enter a number between 1 and 10: ");
//        while (isTrue) {
//            int userInput = scanner.nextInt();
//            if (userInput >= 1 && userInput <= 10) {
//                System.out.println("You entered: " + userInput);
//                isTrue = false;
//            } else {
//                System.out.println("Your entry is not valid");
//                System.out.print("Enter a number between 1 and 10: ");
//            }
//        }
//    }


//    calculate the factorial of a number with for loop

//    public static void factorial() {
//        Scanner scanner = new Scanner(System.in);
//
//        System.out.print("Enter a number between 1 and 20: ");
//        int userInput = scanner.nextInt();
//        if (userInput >= 1 && userInput <= 20) {
//            System.out.println("You entered: " + userInput);
//            System.out.print("Do you want to continue? (y or n): ");
//            String userContinue = scanner.next();
//            if (!userContinue.equals("y")) {
//                System.out.println("Have an average day.");
//            } else {
//                long sum = 1;
//                for (long i = 1; i <= userInput; i++) {
//                    System.out.printf("%d%s%d%n", i, "! = ", (sum *= i));
//                }
//            }
//        } else {
//            System.out.println("Your entry is not valid");
//        }
//    }

//    factorial with recursion

//    public static int factorialRecur(int num) {
//        if (num == 1) {
//            return 1;
//        } else {
//            return num * factorialRecur(num - 1);
//        }
//    }
//
//    public static void factorial() {
//        Scanner scanner = new Scanner(System.in);
//
//        System.out.print("Enter a number between 1 and 20: ");
//        int userInput = scanner.nextInt();
//        if (userInput >= 1 && userInput <= 20) {
//            System.out.println("You entered: " + userInput);
//            System.out.print("Do you want to continue? (y or n): ");
//            String userContinue = scanner.next();
//            if (!userContinue.equals("y")) {
//                System.out.println("Have an average day.");
//            } else {
//                System.out.printf("%d%s%d%n", userInput , "! = ", factorialRecur(userInput));
//            }
//        } else {
//            System.out.println("Your entry is not valid");
//        }
//    }

    //dice rolling

//    public static void dice() {
//
//        Scanner scanner = new Scanner(System.in);
//
//        System.out.print("How many sides do your dice have? ");
//        int diceSides = scanner.nextInt();
//
//        System.out.print("Would you like to roll the dice? (y/n)  ");
//        String roll = scanner.next();
//
//        boolean diceBoolean = true;
//
//        while (diceBoolean) {
//            int randomNum = (int)(Math.random() * diceSides)+1;
//            int randomNum2 = (int)(Math.random() * diceSides)+1;
//            if (!roll.equals("y")) {
//                System.out.println("No dice for you!");
//                diceBoolean = false;
//            } else {
//                System.out.println(randomNum);
//                System.out.println(randomNum2);
//                System.out.print("Would you like to roll the dice again? (y/n)  ");
//                String rollAgain = scanner.next();
//                if(!rollAgain.equals("y")){
//                    diceBoolean = false;
//                }
//            }
//        }
//    }

    public static void main(String[] args) {
//        System.out.println(addition(7, 14));
//        System.out.println(subtraction(14, 7));
//        System.out.println(multiplication(2, 7));
//        System.out.println(division(21, 7));
//        System.out.println(remainder(7, 3));
//        getInteger();
//        factorial();
//        dice();


    }


}

