package p6;

import p4.Rectangle;
import p5.Movable;
import p5.MovablePoint;

public class MovablePoints extends Rectangle implements Movable {

    private int x, y, xSpeed, ySpeed, x2, y2, x2Speed, y2Speed;

    private MovablePoint mPoint1 = new MovablePoint(x, y, xSpeed, ySpeed);
    private MovablePoint mPoint2 = new MovablePoint(x2, y2, x2Speed, y2Speed);

    MovablePoints() {}

    public MovablePoints(int x, int y, int xSpeed, int ySpeed, int x2, int y2, int x2Speed, int y2Speed) {
       this.x = x;
       this.y = y;
       this.xSpeed = xSpeed;
       this.ySpeed = ySpeed;
       this.x2 = x2;
       this.y2 = y2;
       this.x2Speed = x2Speed;
       this.y2Speed = y2Speed;
    }

    public boolean checkPointsSpeed(MovablePoint mPoint1, MovablePoint mPoint2) {
        if ((mPoint1.getXSpeed() == mPoint2.getXSpeed()) && (mPoint1.getYSpeed() == mPoint2.getYSpeed())) {
            return true;
        }
        else
            return false;
    }

    @Override
    public void moveUp() {
        if (checkPointsSpeed(mPoint1, mPoint2)) {
            y -= ySpeed;
            y2 -= y2Speed;
        }
        else {
            System.out.println("The points have different speed.");
        }
    }

    @Override
    public void moveDown() {
        if (checkPointsSpeed(mPoint1, mPoint2)) {
            y += ySpeed;
            y2 += y2Speed;
        }
        else {
            System.out.println("The points have different speed.");
        }
    }

    @Override
    public void moveLeft() {
        if (checkPointsSpeed(mPoint1, mPoint2)) {
            x -= xSpeed;
            x2 -= x2Speed;
        }
        else {
            System.out.println("The points have different speed.");
        }
    }

    @Override
    public void moveRight() {
        if (checkPointsSpeed(mPoint1, mPoint2)) {
            x += xSpeed;
            x2 += x2Speed;
        }
        else {
            System.out.println("The points have different speed.");
        }
    }

    @Override
    public String toString() {
        return "Rectangle width = " + width + '\n'
                + "Rectangle length = " + length + '\n'
                + "Rectangle filled = " + filled + '\n'
                + "Rectangle area = " + getArea() + '\n'
                + "Rectangle perimeter = " + getPerimeter() + '\n'
                + "Rectangle x = " + x + " Rectangle y = " + y + '\n'
                + "Rectangle x2 = " + x2 + " Rectangle y2 = " + y2 + '\n';
    }
}
