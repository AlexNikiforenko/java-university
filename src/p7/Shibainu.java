package p7;

public class Shibainu extends Dog {

    public Shibainu(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public void sound() {
        System.out.println("ROUFF!");
    }
}
