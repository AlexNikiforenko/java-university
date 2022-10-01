package p07;

public class Dobermann extends Dog{
    public Dobermann(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public void sound() {
        System.out.println("ROUUUUUUUFFF!");
    }
}
