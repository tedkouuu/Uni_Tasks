package Second_Task;

public class FibonacciEvenSum {
    public static void main(String[] args) {

        int a = 1;
        int b = 2;
        int sumEven = 0;

        while (a <= 4000000) {

            if (a % 2 == 0) {
                sumEven += a;
            }
            int next = a + b;
            a = b;
            b = next;
        }

        System.out.println(sumEven);
    }
}

