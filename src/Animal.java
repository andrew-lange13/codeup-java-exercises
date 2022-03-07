public class Animal {

//    1. Create an `Animal` class. It should have private instance properties for strings `name` and `species`, and public getters and setters for both.
//1. Within your `Animal` class, define an instance method named `roar`. It should accept no arguments and return a string like "I am $NAME, hear me roar!" where `$NAME` is replaced with the value of the name property for that object.

    private String name;
    private String species;

    public String getName() {
        return name;
    }

    public String getSpecies() {
        return species;
    }

    public String roar(){
        return "I am " + getName() + " hear me roar!";
    }
}
