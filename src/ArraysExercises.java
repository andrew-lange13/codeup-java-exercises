import java.util.Arrays;

public class ArraysExercises {

    public static void main(String[] args) {
//        int[] numbers = {1, 2, 3, 4, 5};
//        System.out.println(Arrays.toString(numbers));

        Person[] people = new Person[3];
//        System.out.println("people = " + people.length);

        people[0] = new Person("joe");
        people[1] = new Person("bob");
        people[2] = new Person("fred");

        for (Person person : people) {
            System.out.println(person.getName());
        }






    }

}
