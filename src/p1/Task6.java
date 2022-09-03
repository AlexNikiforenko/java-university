package p1;

import java.util.ArrayList;
import java.util.Random;

public class Task6 {
    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList();
        //v1
        System.out.println("First way with Math.random()");
        for (int i = 0; i < 20; i++)
        {
            double random_num = Math.random() * 10;
            numbers.add((int)random_num);
        }
        print_array(numbers);

        //v2
        numbers.clear();
        System.out.println("\nSecond way with Random");
        Random random = new Random();
        for (int i = 0; i < 20; i++)
        {
            numbers.add(random.nextInt(10));
        }
        print_array(numbers);
    }
    public static void print_array(ArrayList<Integer> arr)
    {
        for (int i : arr)
            System.out.print(i + " ");
    }
}
