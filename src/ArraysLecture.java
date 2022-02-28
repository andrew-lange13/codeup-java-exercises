import java.util.Arrays;

public class ArraysLecture {

    public static void main(String[] args) {

//        TODO: Syntax

        int[] texasTemps = new int[3];
//        int[] - data type of variable
//        texasTemps - name of variable
//        new int[3] - initializing new array of integers
//        [3] - length of the array

//        TODO: assign values to the slots

        texasTemps[0] = 36;
        texasTemps[1] = 45;
        texasTemps[2] = 86;

//        print out value at index specified
        System.out.println(texasTemps[0]);

//          TODO: weather types array

        String[] weatherTypes = new String[3];

        weatherTypes[0] = "sunny";
        weatherTypes[1] = "rainy";
        weatherTypes[2] = "cloudy";

        System.out.println(weatherTypes[1]);

//      TODO: Handling multiple elements at a time

        int[] dailySteps = {10000, 12000, 8000, 15000};
        System.out.println(Arrays.toString(dailySteps));

        // TODO: Create array of ints and print array

        int[] intArray = {1,2,3,4,5,6,7,8,9,10};
        System.out.println("Arrays.toString(intArray) = " + Arrays.toString(intArray));

        // TODO: create a method that returns the sum of all the integers in the array

        System.out.println("sumArray() = " + sumArray());


    }

    // TODO: create a method that returns the sum of all the integers in the array
    public static int sumArray(){
        int sum = 0;
        int[] nums = {5, 8, 7, 9, 3};
        for (int num : nums){
            sum += num;
        }
        return sum;
    }

}
