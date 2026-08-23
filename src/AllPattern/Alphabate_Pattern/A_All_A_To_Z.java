package AllPattern.Alphabate_Pattern;

import java.util.Scanner;

public class A_All_A_To_Z {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter first char");
        char f = scanner.next().charAt(0);
        System.out.println("Enter last char");
        char l = scanner.next().charAt(0);

        for (char i = f ; i<=l ; i++)
        {
            System.out.print(i+" ");
        }
    }
}
