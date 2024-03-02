package Recursion.Factorial;

public class factorial {

    public static int calFatorial(int n) {

        if (n == 0)
            return 1;
        if (n == 1)
            return 1;
        return n * calFatorial(n - 1);
    }

    public static void main(String[] args) {
        System.out.println(calFatorial(5));
    }
}