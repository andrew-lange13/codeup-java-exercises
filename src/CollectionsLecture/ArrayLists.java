package CollectionsLecture;

import java.util.ArrayList;

public class ArrayLists {

    public static void main(String[] args) {
        ArrayList<Integer> fabNumbers = new ArrayList<>();

        //add elements to arraylist
        fabNumbers.add(7);

        //add number at index 0
        fabNumbers.add(0, 13);

        //see whats in arraylist
        System.out.println("fabNumbers = " + fabNumbers);

        //track arraylist size
        System.out.println("fabNumbers.size() = " + fabNumbers.size());
    }

}
