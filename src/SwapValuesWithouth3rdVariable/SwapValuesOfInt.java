package SwapValuesWithouth3rdVariable;

import java.sql.SQLOutput;
import java.util.Scanner;

public class SwapValuesOfInt {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Value of a = ");
        int a = Integer.parseInt(scanner.nextLine());
        System.out.print("Value of b = ");
        int b = Integer.parseInt(scanner.nextLine());

        a = a+b;
        b = a - b;
        a = a - b;

        System.out.println("New Value of a = " + a);
        System.out.println("New Value of b = " + b);
    }
}
