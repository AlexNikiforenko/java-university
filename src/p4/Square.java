package p4;

public class Square extends Rectangle{
    double side = width = length;

    public Square() {}

    public Square(double side) {
        length = width = side;
    }

    public Square(double side, String color, boolean filled) {
        this.length = this.width = side;
        this.color = color;
        this.filled = filled;
    }

    public double getSide() {
        return length;
    }

    public void setSide(double side) {
        length = width = side;
    }

    @Override
    public void setWidth(double width) {
        super.setWidth(width);
    }

    @Override
    public void setLength(double length) {
        super.setLength(length);
    }

    @Override
    public String toString() {
        return "Square side = " + width + '\n'
                + "Square filled = " + filled + '\n'
                + "Square area = " + getArea() + '\n'
                + "Square perimeter = " + getPerimeter();
    }
}
