import java.util.ArrayList;
import java.util.Arrays;

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

    public static String boolToWord(boolean b) {
        if (b) {
            return "Yes";
        } else {
            return "No";
        }
    }

//    TODO: You get an array of numbers, return the sum of all of the positives ones. Example [1,-4,7,12] => 1 + 7 + 12 = 20 Note: if there is nothing to sum, the sum is default to 0.

    public static int sum(int[] arr) {
        int sum = 0;
        for (int pos : arr) {
            if (pos > 0) sum += pos;
        }
        return sum;
    }

    //TODO: Write a function which calculates the average of the numbers in a given list.

    public static double find_average(int[] array) {
        double listTotal = 0;
        for (int nums : array) {
            listTotal += nums;
        }
        return listTotal / array.length;
    }

    // TODO: remove the spaces from the string, then return the resultant string.

    public static String noSpace(final String x) {
        return x.replaceAll(" ", "");
    }

//    TODO: Given a string of digits, you should replace any digit below 5 with '0' and any digit 5 and above with '1'. Return the resulting string.

    public static String fakeBin(String numberString) {
        return numberString.replaceAll("[0-4]", "0").replaceAll("[5-9]", "1");
    }

//        TODO: Your task is to write a function that takes a string and return a new string with all vowels removed.

    public static String disemvowel(String str) {
        return str.replaceAll("[aAeEiIoOuU]", "");
    }

//    TODO: Implement a function that accepts 3 integer values a, b, c. The function should return true if a triangle can be built with the sides of given length and false in any other case. (In this case, all triangles must have surface greater than 0 to be accepted).

    public static boolean isTriangle(int a, int b, int c) {
        return (a + b > c) && (a + c > b) && (b + c > a);
    }

//    TODO: Given a list of integers, determine whether the sum of its elements is odd or even.

    public static String oddOrEven(int[] array) {
        int sum = 0;
        for (int num : array) {
            sum += num;
        }
        if (sum % 2 == 0) {
            return "even";
        } else {
            return "odd";
        }
    }

//    TODO: Write a function that accepts an array of 10 integers (between 0 and 9), that returns a string of those numbers in the form of a phone number.

    static int[] nums = {1, 2, 3, 4, 5, 6, 7, 8, 9, 0};

    public static String createPhoneNumber(int[] numbers) {
        return "(" + numbers[0] + numbers[1] + numbers[2] + ") " + numbers[3] + numbers[4] + numbers[5] + "-" + numbers[6] + numbers[7] + numbers[8] + numbers[9];
    }

//    TODO: If we list all the natural numbers below 10 that are multiples of 3 or 5, we get 3, 5, 6 and 9. The sum of these multiples is 23. Finish the solution so that it returns the sum of all the multiples of 3 or 5 below the number passed in. Additionally, if the number is negative, return 0 (for languages that do have them).

    public static int solution(int number) {
        ArrayList<Integer> numList = new ArrayList<>();
        int sum = 0;
        for (int i = 0; i < number; i++) {
            if (i % 3 == 0 | i % 5 == 0) {
                numList.add(i);
            }
        }
        for (int num : numList) {
            sum += num;
        }
        return sum;
    }

//    TODO: Create a function that takes an integer as an argument and returns "Even" for even numbers or "Odd" for odd numbers.

    public static String even_or_odd(int number) {
        if (number % 2 == 0) {
            return "Even";
        } else return "Odd";
    }

    public static String divisibleBy3(int num){
        if(num % 3 == 0){
            return "Divisible by 3";
        } else return "not divisible by 3";
    }

//    TODO: Given an array of integers, find the one that appears an odd number of times.

    public static int findIt(int[] a) {
        int counter = 0;
        for (int num : a) {
            for (int j : a) {
                if (num == j) counter++;
            }
            if (counter % 2 != 0) return num;
        }
        return 0;
    }

//    TODO: You receive an array with your peers' test scores. Now calculate the average and compare your score! Return True if you're better, else False!

    public static boolean betterThanAverage(int[] classPoints, int yourPoints) {
        int average = 0;
        for (int points : classPoints) {
            average += points;
        }
//        return yourPoints > (average / classPoints.length);
        return yourPoints > (average / classPoints.length);
    }

//    TODO: Given a month as an integer from 1 to 12, return to which quarter of the year it belongs as an integer number.

    public static int quarterOf(int month) {
        if (month < 4) {
            return 1;
        } else if (month < 7) {
            return 2;
        } else if (month < 10) {
            return 3;
        } else {
            return 4;
        }
    }

    //    TODO: Given two non-negative integers low and high. Return the count of odd numbers between low and high (inclusive).
    public int countOdds(int low, int high) {
        return (high + 1) / 2 - low / 2;
    }

    //    TODO: Return the average salary of employees excluding the minimum and maximum salary. Answers within 10-5 of the actual answer will be accepted.
    public double average(int[] salary) {
        /* First we sort the array
		to find the max and the min value
		from the salary array */

        Arrays.sort(salary);

		/* Our aim is to exclude the min and max
		values from the salary array */

        double min = salary[0];
        double max = salary[salary.length - 1];

		/* We now declare two variables
		itr: to keep track of the elements
		we visit and sum : sum of the elements */

        int itr = 0;
        double sum = 0d;

        /* Run the loop from the first element till
		the second last element and collect the sum
		*/

        for(int i = 1; i <= salary.length - 2; i++)
        {
            sum += salary[i];
            itr++;
        }

        /* The average is calculated accordingly */

        double avg = sum/itr;

        return avg;
    }

    public static int countBy2(int num){
        int counter = 0;
        for (int i = 0; i <= 100; i+=2) {
            counter = i;
        }
        return counter;
    }

    public static void main(String[] args) {

//        System.out.println("sumStuff() = " + Arrays.toString(sumStuff()));
        System.out.println();
//        System.out.println(square(11));
//        System.out.println(fakeBin("45385593107843568"));
//        System.out.println(createPhoneNumber(nums));
//        System.out.println(solution(10));
        System.out.println(divisibleBy3(5));


    }

}
