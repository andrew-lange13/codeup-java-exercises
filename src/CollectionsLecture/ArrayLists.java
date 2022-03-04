package CollectionsLecture;

import java.util.ArrayList;

public class ArrayLists {

    public static void main(String[] args) {
        ArrayList<Integer> favNumbers = new ArrayList<>();

        //add elements to arraylist
        favNumbers.add(7);

        //add number at specific index
        favNumbers.add(0, 13);
        favNumbers.add(2, 9);

        //get something at specific index
        int favNum = favNumbers.get(0);
        System.out.println("favNum = " + favNum);

        //see whats in arraylist
        System.out.println("fabNumbers = " + favNumbers);

        //track arraylist size
        System.out.println("fabNumbers.size() = " + favNumbers.size());

        //With Strings - comparing them?
        ArrayList<String> favAuthors = new ArrayList<>();
        favAuthors.add("Vonnegut");
        favAuthors.add("Heinlein");
        favAuthors.add("W.C. Williams");
        favAuthors.add("Palmer Hall");

        System.out.println("favAuthors = " + favAuthors);

        ArrayList<String> copyFavAuthors = favAuthors;
        System.out.println("copyFavAuthors.equals(favAuthors) = " + copyFavAuthors.equals(favAuthors));
        copyFavAuthors.add("J.D. Salinger");
        System.out.println("copyFavAuthors.equals(favAuthors) = " + copyFavAuthors.equals(favAuthors));
        //Looks like .equals just checks the Object to Object vs the value of what is INSIDE the object

        //Other common methods: .contains; .lastIndexOf; isEmpty; .remove

        System.out.println("favAuthors.contains(\"Heinlein\") = " + favAuthors.contains("Heinlein"));
        System.out.println("favAuthors.contains(\"Asimov\") = " + favAuthors.contains("Asimov"));
        //What will happen? Do I need to look for "J.D. Salinger" or can I just do "Salinger"
        System.out.println("favAuthors.contains(\"Salinger\") = " + favAuthors.contains("Salinger"));

        System.out.println("favAuthors.contains(\"J.D. Salinger\") = " + favAuthors.contains("J.D. Salinger"));

        //Let's think about our earlier example: Let's go get that last 7!
        System.out.println();
        System.out.println("favNumbers = " + favNumbers);
        System.out.println("favNumbers.indexOf(7) = " + favNumbers.indexOf(7));
        //Salright - use the .lastIndexOf method to go get 'em :D
        System.out.println("favNumbers.lastIndexOf(7) = " + favNumbers.lastIndexOf(7));

        //isEmpty
        ArrayList<String> emptyList = new ArrayList<>();
        System.out.println("emptyList.isEmpty() = " + emptyList.isEmpty());
        System.out.println("favAuthors.isEmpty() = " + favAuthors.isEmpty());

        //.remove() - well, WOOPS, let's get rid of that 7
        Integer toRemove = new Integer(7);
        favNumbers.remove( toRemove);
        System.out.println("favNumbers = " + favNumbers);

        //What if our arrayList had an index and value match?
        favNumbers.add(1,3);
        System.out.println("favNumbers = " + favNumbers);
        Integer removeThree = 3;
        //First: Let's send up the '3' as a numeric literal
        favNumbers.remove(3);
//        System.out.println("favNumbers = " + favNumbers);
        //Second: Let's send up this 'removeThree' Object
        favNumbers.remove(removeThree);
        System.out.println("favNumbers = " + favNumbers);
    }

}
