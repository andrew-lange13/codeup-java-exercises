package shapes;

public class Circle {

    private final double radius;

    public Circle(double num) {
        radius = num;
    }

    public double getArea() {
        return Math.PI*Math.pow(radius, 2);
    }

    public double getCircumference() {
        return 2 * Math.PI * radius;
    }
}
