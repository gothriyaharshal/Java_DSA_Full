package AllPattern.Star_Pattern;

import java.util.Scanner;

public class E_Inverted_Pyramid {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter your Row");
        int row = scanner.nextInt();

        System.out.println("Enter your column");
        int column = scanner.nextInt();

        for (int i = row; i >= 1; i--) {
            for (int space = 1; space <= row - i; space++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= 2 * i - 1; j++) {
                if (i == 1 || i == row || j == 1 || j == 2 * i - 1) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}
