package SwapValuesWithouth3rdVariable;

import java.util.Scanner;

public class SwapValuesofStrings {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Value of str a = ");
        String a = scanner.nextLine();
        System.out.print("Value of str b = ");
        String b = scanner.nextLine();

        a = a+b;
        b = a.substring(0,(a.length()/2));
        a = a.substring(a.length()/2);

        System.out.println("New Value of a = " + a);
        System.out.println("New Value of b = " + b);
    }

}
