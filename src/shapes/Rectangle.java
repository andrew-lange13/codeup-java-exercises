package shapes;

public class Rectangle {

    protected int length;
    protected int width;


    public Rectangle(int a, int b){
        length = a;
        width = b;
    }

    public int getPerimeter() {
        return (length * 2) + (width * 2);
    }

    public int getArea() {
        return length * width;
    }
}
