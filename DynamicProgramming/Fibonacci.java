package DynamicProgramming;

public class Fibonacci {
    static int counter_memo = 0;
    static int counter_fib = 0;

    public static int Fib_With_Memo(int n) {
        Integer[] memo = new Integer[100];
        if (n == 0 || n == 1) {
            return n;
        }
        if (memo[n] != null) {
            return memo[n];
        }
        memo[n] = Fib_With_Memo(n - 1) + Fib_With_Memo(n - 2);
        counter_memo++;
        return memo[n];

    }

    public static int fib(int n) {
        int[] array = new int[n + 1];
        array[0] = 0;
        array[1] = 1;
        int index = 2;

        for (index = 2; index <= n; index++) {
            array[index] = array[index - 1] + array[index - 2];
            counter_fib++;
        }
        return array[n];
    }

    public static void main(String[] args) {
        System.out.println("Fib With Memo: " + Fib_With_Memo(10) + " Counter: " + counter_memo);
        System.out.println("Fibonacci: " + fib(10) + " Counter: " + counter_fib);
    }
}
