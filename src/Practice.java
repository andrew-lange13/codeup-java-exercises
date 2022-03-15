import java.util.List;
import java.util.Scanner;

public class Practice {

//    public static int SumOfTwoNumbers(int num1, int num2){
//        return num1 + num2;
//    }
//
//    public static int countTrue(boolean[] arr) {
//        int count = 0;
//        for (boolean i : arr)
//            if (i) count += 1;
//        return count;
//    }

//    TODO: Write a program that creates an array, and then prints the sum of the even and odd integers in a new array [sumOdd, sumEven]

//    public static int[] sumStuff() {
//
//        int[] nums = {2, 4, 8, 5, 1, 2};
//        int[] numsOutput = new int[2];
//        int evenSum = 0;
//        int oddSum = 0;
//        for (int num : nums) {
//            if (num % 2 == 0) {
//                evenSum += num;
//            } else {
//                oddSum += num;
//            }
//        }
//        numsOutput[0] = oddSum;
//        numsOutput[1] = evenSum;
//        return numsOutput;
//    }


//    TODO: 1. Create a command line grocery list maker
//
//    - before prompting the user to enter each item, ask how many items will be
//            entered
//    - for each item, the user should be prompted to enter in the name, quantity,
//    and category of each grocery item
//    - Create a `GroceryItem` class from which to instantiate `GroceryItem`
//    objects to store in an array
//    - once the user has entered all items, print out all items grouped by
//    category and alphabetized in each group

//    public static void groceryList(){
//        Scanner scan = new Scanner(System.in);
//        System.out.print("How many items will be entered: ");
//        int numItems = scan.nextInt();
//
//    }


//
//     TODO: 2. Build a command line Tic Tac Toe game.
//
//            - the game board should be a multi-dimensional array of Strings
//    - be sure the board displays the column letter and row number:
//
//    A   B   C
//            1  -O- --- ---
//            2  --- -X- ---
//            3  --- --- ---
//
//            - the "O" in the example above is at 1a and the "X" is at 2B
//    - the winning three in a row should match should be drawn with stars instead
//    of dashes:
//
//    A   B   C
//            1  *O* *O* *O*
//            2  --- -X- ---
//            3  -X- --- ---
//
//            - player one and player two should alternate turns
//    - be sure to display who's turn it is and who won

    //1. Create an `Assessment` class with a public static method named `half`. It should accept a number and return the number divided by two.
//    public static double half(double num){
//        return num / 2;
//    }

    //2. Within your `Assessment` class create a public static method named `shout`. It should accept a string and return the same string in all upper case with 3 exclamation marks added to the end of it.

//    public static String shout(String string){
//        return string.toUpperCase() + " !!!";
//    }

//    1. Within your `Assessment` class create a public static method named `removeCats`. It should accept a list of animal objects and return a list of animal objects where any animal object with a species of "Felis catus" is removed.

//    public static List<Animal> removeCats(List<Animal> animal){
//        animal.remove("Felis catus");
//        return animal;
//    }

    //TODO: Complete the method that takes a boolean value and return a "Yes" string for true, or a "No" string for false.

    public static String boolToWord(boolean b)
    {
        if(b){
            return "Yes";
        } else{
            return "No";
        }
    }

//    TODO: You get an array of numbers, return the sum of all of the positives ones. Example [1,-4,7,12] => 1 + 7 + 12 = 20 Note: if there is nothing to sum, the sum is default to 0.

    public static int sum(int[] arr){
        int sum = 0;
        for(int pos : arr){
            if(pos >0) sum += pos;
        }
        return sum;
    }

    public static void main(String[] args) {

//        System.out.println("sumStuff() = " + Arrays.toString(sumStuff()));
        System.out.println();
//        System.out.println(square(11));

    }

}
