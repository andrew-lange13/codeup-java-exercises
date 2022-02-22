package shapes;

import util.Input;

public class CircleApp {

    private static int circleCount;

    public static void circleCreator(){
        Input circleInput = new Input();
        Circle newCircle = new Circle(circleInput.getInt());
        System.out.println("newCircle.getCircumference() = " + newCircle.getCircumference());
        System.out.println("newCircle.getArea() = " + newCircle.getArea());
        circleCount += 1;
        while(circleInput.yesNo("Would you like to make another circle? yes or no?  ")){
            Circle newerCircle = new Circle(circleInput.getInt());
            System.out.println("newerCircle.getCircumference() = " + newerCircle.getCircumference());
            System.out.println("newerCircle.getArea() = " + newerCircle.getArea());
            circleCount++;
        }
        System.out.println("circleCount = " + circleCount);
    }

    public static void main(String[] args) {
        circleCreator();

    }
}
