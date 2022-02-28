package shapes;

public class Square extends Quadrilateral{

//    public Square(int side) {
//        super(side, side);
//    }
//
//    public int getArea(){
//        return (int) Math.pow(super.length, 2);
//    }
//
//    public int getPerimeter() {
//        return super.length * 4;
//    }


    public Square(double side) {
        super(side, side);
    }

    @Override
    public double getPerimeter() {
        return this.length * 4;
    }

    @Override
    public double getArea() {
        return this.length * this.length;
    }

    @Override
    void setLength(double side) {
        this.length = side;
        this.width = side;
    }

    @Override
    void setWidth(double side) {
        this.length = side;
        this.width = side;
    }
}
