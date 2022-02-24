package shapes;

public class Square extends Rectangle{

    public Square(int side) {
        super(side, side);
    }

    public int getArea(){
        return (int) Math.pow(super.length, 2);
    }

    public int getPerimeter() {
        return super.length * 4;
    }
}
