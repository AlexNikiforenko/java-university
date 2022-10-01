package p01;

public class Task7 {

    public static void main(String[] args) {
        System.out.println(count_factorial(5));
    }

    public static long count_factorial(int n){
        long multi = 1;
        for (int i = 1; i <= n; i++)
            multi *= i;

        return multi;
    }
}
