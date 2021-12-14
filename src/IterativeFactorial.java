package FactorialSequence;

import java.util.Scanner;

public class IterativeFactorial {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("n! = ");
        int n = scanner.nextInt();

        long result = factorial(n);

        System.out.printf("%d! = %d%n",n, result);
        scanner.close();
    }

    private static long factorial(int n) {
        long result = 1;

        for (int i = 1; i < n; i++) {
            result = result * i;
        }
        return result;
    }
}
