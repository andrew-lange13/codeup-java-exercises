public class EdabitPractice {

    public static int SumOfTwoNumbers(int num1, int num2){
        return num1 + num2;
    }

    public static int countTrue(boolean[] arr) {
        int count = 0;
        for (boolean i : arr)
            if (i) count += 1;
        return count;
    }

}
