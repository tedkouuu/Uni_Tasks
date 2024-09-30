package FibonacciEvenSum;

public class FibonacciEvenSum {
    public static void main(String[] args) {
        int a = 1;  // Първи член на редицата
        int b = 2;  // Втори член на редицата
        int sumEven = 0;

        // Докато стойността на текущия член не надвишава 4 милиона
        while (a <= 4000000) {
            // Проверка дали числото е четно
            if (a % 2 == 0) {
                sumEven += a;
            }
            // Преминаване към следващия член на редицата
            int next = a + b;
            a = b;
            b = next;
        }

        // Извеждане на резултата
        System.out.println("Сборът на четните членове от редицата на Фибоначи е: " + sumEven);
    }
}

}
