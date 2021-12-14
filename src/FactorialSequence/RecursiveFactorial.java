package FactorialSequence;

import java.util.Scanner;

public class RecursiveFactorial {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("n! = ");
        int n = scanner.nextInt();

        long result = factorial(n);

        System.out.printf("%d! = %d%n",n, result);
        scanner.close();
    }

    private static long factorial(int n) {
        if (n == 0) {
            return 1;
        }else{
            return n * factorial(n - 1);
        }
    }
}
