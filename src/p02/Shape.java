package p02;
// 2.1
public class Shape {
    String name;
    int side_1, side_2, side_3;

    public String toString() {
        return "Shape name: " + name
                + "\nFirst side: " + side_1 + '\n'
                + "Second side: " + side_2 + '\n'
                + "Third side: " + side_3;
    }

    public static void main(String[] args) {
        Shape shape = new Shape();
        shape.name = "Triangle";
        shape.side_1 = 3;
        shape.side_2 = 4;
        shape.side_3 = 5;

        System.out.println(shape);
    }
}
