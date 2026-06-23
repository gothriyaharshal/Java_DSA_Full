package AllPattern.Alphabate_Pattern;

import java.util.Scanner;

public class E_Printing_Increasing_Decreasing_Pyramid {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter your row");
        int row = scanner.nextInt();

        System.out.println("Enter your charcter");
        char ch = scanner.next().charAt(0);

        for (int i = 1 ; i<=row ; i++) {

            char temp = ch;

            for (int space = 1; space <= row - i; space++) {
                System.out.print(" ");
            }

            for (int j = 1; j <= i; j++) {
                System.out.print(temp);
                temp++;
            }
            temp--;
            temp--;
            for (int j = i-1 ; j >= 1; j--)
            {
                System.out.print(temp);
                temp--;
            }
            System.out.println();
        }
    }
}
