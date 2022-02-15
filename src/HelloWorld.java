// class -defining the class
//HelloWorld matches the name of the .java file

public class HelloWorld {

    //method - similar to a function in javascript
    //main method -> specific method in java that acts as our entry point when running java
    //like the front door of a house, you have to go through the door to get to any of the other rooms
    public static void main (String[] args){
        System.out.print("Hello, ");
        System.out.println("World!");
        int myFavoriteNumber = 13;
        System.out.println("My favorite number is " + myFavoriteNumber);
        String myString = "I like Turtles!";
        System.out.println(myString);
        float myNumber = 3.14f;
        System.out.println(myNumber);
//        int x = 5;
//        System.out.println(++x);
//        System.out.println(x);
//        int x = 4;
//        x += 5;
//        System.out.println(x);
//        int x = 3;
//        int y = 4;
//        y *= x;
//        System.out.println(y);
        int x = 10;
        int y = 2;
        x /= y;
        y -= x;
        System.out.println(x);
        System.out.println(y);
    }
}
