package FibonacciSequence;

import java.util.Scanner;

public class RecursiveFibonacciBottomsUp {
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
        long[] fibonacciNumbers = new long[n + 1];

        fibonacciNumbers[0] = 1;
        fibonacciNumbers[1] = 1;
        for (int i = 2; i <=n ; i++) {
            fibonacciNumbers[i] = fibonacciNumbers[ i - 1] + fibonacciNumbers[i - 2];
        }
        return fibonacciNumbers[n];
    }
}
