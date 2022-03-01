import java.util.Arrays;

public class ArraysExercises {

    public static Person[] addPerson(Person[] people, Person newPerson){
        Person[] newArr = Arrays.copyOf(people, people.length + 1);
        newArr[newArr.length - 1] = newPerson;
        System.out.println("newPerson = " + newPerson.getName());
        for (Person person : newArr) {
            System.out.println(person.getName());
        }
        return newArr;
    }

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

        Person mike = new Person("mike");
        addPerson(people, mike);


    }

}
