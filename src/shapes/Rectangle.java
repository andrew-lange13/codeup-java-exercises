package shapes;

public class Rectangle extends Quadrilateral implements Measurable {

//    protected int length;
//    protected int width;
//
//
//    public Rectangle(int length, int width){
//        this.length = length;
//        this.width = width;
//    }
//
//    public int getPerimeter() {
//        return (length * 2) + (width * 2);
//    }
//
//    public int getArea() {
//        return length * width;
//    }


    public Rectangle(double length, double width) {
        super(length, width);
    }

    @Override
    public double getPerimeter() {
        return 2 * (this.length + this.width);
    }

    @Override
    public double getArea() {
        return this.length * this.width;
    }

    @Override
    void setLength(double length) {
        this.length = length;
    }

    @Override
    void setWidth(double width) {

    }
}
