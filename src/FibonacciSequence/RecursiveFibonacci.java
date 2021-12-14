package FibonacciSequence;

import java.util.Scanner;

public class RecursiveFibonacci {

    public static long[] numbers;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("n = ");

        int n = scanner.nextInt();

        long result = fib(n);

        System.out.printf("F%d = %d%n",n, result);
        scanner.close();
    }

    private static long fib(int n){
        if (n <= 2) {
            return 1;
        }

        return fib(n - 1) + fib(n - 2);
    }
}