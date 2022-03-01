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

    public static int[] sumStuff() {

        int[] nums = {2, 4, 8, 5, 1, 2};
        int[] numsOutput = new int[2];
        int evenSum = 0;
        int oddSum = 0;
        for (int num : nums) {
            if (num % 2 == 0) {
                evenSum += num;
            } else {
                oddSum += num;
            }
        }
        numsOutput[0] = oddSum;
        numsOutput[1] = evenSum;
        return numsOutput;
    }

    public static void main(String[] args) {

        System.out.println("sumStuff() = " + Arrays.toString(sumStuff()));


    }

}
