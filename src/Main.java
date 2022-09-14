import p4.Square;
import p5.MovableCircle;
import p5.MovablePoint;

public class Main {
    public static void main(String[] args) {

//        MovablePoint point = new MovablePoint(4, 7, 2, 2);
//        point.moveDown();
//        point.moveRight();
//        System.out.println(point);

        MovableCircle circle = new MovableCircle(0, 0, 1, 1);
        circle.moveUp();
        circle.moveLeft();

        System.out.println(circle);
    }
}