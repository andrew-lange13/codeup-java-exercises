import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class GroceryList {

    private String groceryItem;
    private int quantity;

    public GroceryList(String item, int num){
        this.groceryItem = item;
        this.quantity = num;
    }

    public String getGroceryItem() {
        return groceryItem;
    }

    public int getQuantity() {
        return quantity;
    }

    public static ArrayList<String> groceries = new ArrayList<>();


    public static void listyList(){

        Scanner scan = new Scanner(System.in);

        System.out.println("Would you like to make a grocery list");
        String wannaList = scan.nextLine();
        if (wannaList.equalsIgnoreCase("yes")){
            System.out.println("1: Meat\n2: Fruits\n3: Vegetables\n4: Drinks");
            System.out.print("Pick a category 1-4: ");
            int listChoice = scan.nextInt();
            if (listChoice == 1){
                HashMap<Integer, String> meatMap = new HashMap<>();
                groceries.add(String.valueOf(meatMap));
                System.out.print("Enter the name of the item you want to add: ");
                String item = scan.nextLine();
                System.out.print("Enter the quantity of " + item + " you would like: ");
                int itemNum = scan.nextInt();
                meatMap.put(itemNum, item);

            }

        }
        System.out.println("groceries = " + groceries);

    }

    public static void main(String[] args) {

        listyList();



    }



}
