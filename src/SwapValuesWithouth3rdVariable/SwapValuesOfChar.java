package SwapValuesWithouth3rdVariable;

import java.util.Scanner;

public class SwapValuesOfChar {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Value of a = ");
        char a = scanner.nextLine().charAt(0);
        System.out.println("Value of b = ");
        char b = scanner.nextLine().charAt(0);

        a = (char) (a + b);
        b = (char) (a - b);
        a = (char) (a - b);

        System.out.println("New Value of a = " + a);
        System.out.println("New Value of b = " + b);



    }
}
