import java.util.ArrayList;
import java.util.Scanner;

public class GroceryList {

    private String groceryItem;
    private int quantity;

    public GroceryList(String item, int num){
        this.groceryItem = item;
        this.quantity = num;
    }

    public static void listyList(){

        Scanner scan = new Scanner(System.in);

        System.out.println("Would you like to make a grocery list");
        String wannaList = scan.nextLine();
        if (wannaList.equalsIgnoreCase("yes")){
            ArrayList<String> groceries = new ArrayList<>();
            System.out.println("1: Meat\n2: Fruits\n3: Vegetables\n4: Drinks");
            System.out.print("Pick a category 1-4: ");
            int listChoice = scan.nextInt();
            if (listChoice == 1){
                System.out.println("Meat");
            }
        }

    }

    public static void main(String[] args) {

        listyList();



    }



}
