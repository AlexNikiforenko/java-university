package p2;
//2.2

public class Ball {
    String type, brand;
    int size;

    public String toString() {
        return "Ball's type: " + type + '\n'
                + "Ball's Brand: " + brand + '\n'
                + "Ball's size: " + size;
    }

    public static void main(String[] args) {
        Ball ball = new Ball();
        ball.type = "Basketball";
        ball.brand = "Wilson";
        ball.size = 7;

        System.out.println(ball);
    }
}
