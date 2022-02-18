import java.util.Scanner;

public class MethodsLecture {
    public static void main(String[] args) {
        System.out.println(addNums(1,3));

    }

    public static int addNums(int num1, int num2){
        int solution = num1 + num2;
        return solution;
    }

    public static int addNums(){
        Scanner scanner = new Scanner(System.in);
        System.out.print("enter two nums: ");
        int first = scanner.nextInt();
        int second = scanner.nextInt();
        return first + second;
    }
}
