package shapes;

import util.Input;

public class CircleApp {
    public static void main(String[] args) {
        Input circleInput = new Input();
        Circle newCircle = new Circle(circleInput.getInt());
        System.out.println("newCircle.getCircumference() = " + newCircle.getCircumference());
        System.out.println("newCircle.getArea() = " + newCircle.getArea());
        int circleCount = 1;
        while(circleInput.yesNo("Would you like to make another circle? yes or no?  ")){
            Circle newerCircle = new Circle(circleInput.getInt());
            System.out.println("newerCircle.getCircumference() = " + newerCircle.getCircumference());
            System.out.println("newerCircle.getArea() = " + newerCircle.getArea());
            circleCount++;
        }
        System.out.println("circleCount = " + circleCount);
    }
}
