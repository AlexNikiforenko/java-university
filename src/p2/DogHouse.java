package p2;

import java.util.ArrayList;
import java.util.Scanner;

// 2.4
public class DogHouse {
    ArrayList<Dog> dogHouse = new ArrayList<>();

    public void addDog(Dog dog) {
        dogHouse.add(dog);
    }

    public void printDogs() {
        for (Dog dog : dogHouse) {
            System.out.println(dog);
        }
    }

    public static void main(String[] args) {
        Dog dog_1 = new Dog("Jack", 7);
        Dog dog_2 = new Dog("Sigma", 4);
        DogHouse dogHouse = new DogHouse();
        dogHouse.addDog(dog_1);
        dogHouse.addDog(dog_2);
        dogHouse.printDogs();
    }
}
