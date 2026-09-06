package AllPattern.Star_Pattern;

import java.util.Scanner;

public class DDivertedPyramid {
    public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            System.out.println("Enter your row");
            int row = scanner.nextInt();

        for (int i = row ; i>=1 ; i--)
        {
            for (int space = 1 ; space<=row-i ; space++)
            {
                System.out.print(" ");
            }

            for (int j = 1 ; j<=2*i-1 ; j++)
            {
                System.out.print("*");
            }

            System.out.println();
        }



    }
}
