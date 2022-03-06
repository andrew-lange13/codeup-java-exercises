package Grocery;

import util.Input;

import java.util.*;

public class GroceryList {

    public static ArrayList<Map<String, Integer>> groceries = new ArrayList<>();


    public static void listyList() {

        Scanner scan = new Scanner(System.in);
        int listChoice = 0;
        boolean keepGoing = true;

        System.out.println("Would you like to make a grocery list");
        String wannaList = scan.nextLine();
        while (keepGoing) {
            if (wannaList.equalsIgnoreCase("yes")) {
                System.out.println("1: Meat\n2: Fruits\n3: Vegetables\n4: Drinks\n5: See list");
                System.out.print("Pick a category 1-5: ");
                listChoice = scan.nextInt();
                if (listChoice == 1) {
                    TreeMap<String, Integer> meatMap = new TreeMap<>();
                    groceries.add(meatMap);
                    System.out.print("Enter the name of the item you want to add: ");
                    String item = scan.next();
                    System.out.print("Enter the quantity of " + item + " you would like: ");
                    int itemNum = scan.nextInt();
                    GroceryItem newItem = new GroceryItem(item, itemNum);
                    meatMap.put(newItem.getThing(), newItem.getThingQuantity());

                } else if (listChoice == 2) {
                    TreeMap<String, Integer> fruitMap = new TreeMap<>();
                    groceries.add(fruitMap);
                    System.out.print("Enter the name of the item you want to add: ");
                    String item = scan.next();
                    System.out.print("Enter the quantity of " + item + " you would like: ");
                    int itemNum = scan.nextInt();
                    GroceryItem newItem = new GroceryItem(item, itemNum);
                    fruitMap.put(newItem.getThing(), newItem.getThingQuantity());

                } else if (listChoice == 3) {
                    TreeMap<String, Integer> veggieMap = new TreeMap<>();
                    groceries.add(veggieMap);
                    System.out.print("Enter the name of the item you want to add: ");
                    String item = scan.next();
                    System.out.print("Enter the quantity of " + item + " you would like: ");
                    int itemNum = scan.nextInt();
                    GroceryItem newItem = new GroceryItem(item, itemNum);
                    veggieMap.put(newItem.getThing(), newItem.getThingQuantity());

                } else if (listChoice == 4) {
                    TreeMap<String, Integer> drinkMap = new TreeMap<>();
                    groceries.add(drinkMap);
                    System.out.print("Enter the name of the item you want to add: ");
                    String item = scan.next();
                    System.out.print("Enter the quantity of " + item + " you would like: ");
                    int itemNum = scan.nextInt();
                    GroceryItem newItem = new GroceryItem(item, itemNum);
                    drinkMap.put(newItem.getThing(), newItem.getThingQuantity());

                } else if (listChoice == 5) {
                    keepGoing = false;
                }
            }
        }
        System.out.println("groceries = " + groceries);
        for (Map<String, Integer> entry : groceries) {
            for (String key : entry.keySet()) {
                Integer value = entry.get(key);
                System.out.print("item = " + key + "  ||  ");
                System.out.println("quantity = " + value);
            }
        }
    }



    public static void main(String[] args) {

        listyList();
        System.out.println("this is for the push");

    }
}
