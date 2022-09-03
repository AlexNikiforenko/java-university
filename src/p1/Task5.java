package p1;

public class Task5 {

    public static void main(String[] args) {
        int count = 10;

        for (float i = 1f; i <= count; i++)
        {
            if (i == 10)
                System.out.print(1 / i);
            else
                System.out.print(1 / i + " | ");
        }
    }

}
