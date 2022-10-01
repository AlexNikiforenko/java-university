package p01;

public class Task3 {

    public static void main(String[] args) {
        int[] numbers = {1, 2, 3, 4, 5};

        int sum = 0;
        for (int i : numbers) {
            sum += i;
        }
        System.out.println("Sum with \"for\" = " + sum);

        int i = 0;
        sum = 0;
        while (i < numbers.length + 1) {
            sum += i;
            i++;
        }
        System.out.println("Sum with \"while\" = " + sum);

        i = sum = 0;
        do
        {
            sum += i;
            i++;
        }
        while (i < numbers.length + 1);
        System.out.println("Sum with \"do while\" = " + sum);
    }

}
