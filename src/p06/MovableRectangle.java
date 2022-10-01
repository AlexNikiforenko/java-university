package p06;

import p04.Shape;
import p05.Movable;

public class MovableRectangle extends Shape implements Movable {

    private int x, y, xSpeed, ySpeed;

    protected double width, length;

    public MovableRectangle(double width, double length, String color, boolean filled, int x, int y, int xSpeed, int ySpeed) {
        this.x = x;
        this.y = y;
        this.xSpeed = xSpeed;
        this.ySpeed = ySpeed;
    }

    public MovableRectangle(double width, double length) {
        this.width = width;
        this.length = length;
        this.xSpeed = 1;
        this.ySpeed = 1;
    }

    public MovableRectangle(double width, double length, String color, boolean filled) {
        this.width = width;
        this.length = length;
        this.color = color;
        this.filled = filled;
        this.xSpeed = 1;
        this.ySpeed = 1;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    @Override
    public double getArea() {
        return width * length;
    }

    @Override
    public double getPerimeter() {
        return 2 * (width + length);
    }

    @Override
    public String toString() {
        return "Rectangle width = " + width + '\n'
                + "Rectangle length = " + length + '\n'
                + "Rectangle filled = " + filled + '\n'
                + "Rectangle area = " + getArea() + '\n'
                + "Rectangle perimeter = " + getPerimeter() + '\n'
                + "Point x = " + x + " Point y = " + y + '\n'
                + "x speed = " + xSpeed + " y speed = " + ySpeed + '\n';
    }

    @Override
    public void moveUp() {
        y -= ySpeed;
    }

    @Override
    public void moveDown() {
        y += xSpeed;
    }

    @Override
    public void moveLeft() {
        x -= xSpeed;
    }

    @Override
    public void moveRight() {
        x += xSpeed;
    }
}
