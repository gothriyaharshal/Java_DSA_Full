package AllPattern.Number_Pattern;

import java.util.Scanner;

public class F_Increasing_DecreSing_Pyramid {
    public static void main(String[] args) {
        Scanner scanner =new Scanner(System.in);

        System.out.println("Enter your Row");
        int row = scanner.nextInt();

        System.out.println("Enter your column");
        int column = scanner.nextInt();

        for(int i = 1 ;i<=row ; i++)
        {
            for (int space = 1 ;space<=row-i ; space++)
            {
                System.out.print(" ");
            }

            for (int j = i ;j>=1 ; j--)
            {
                System.out.print(j);
            }

            for (int j = 2 ;j<=i ; j++)
            {
                System.out.print(j);
            }

            System.out.println();
        }
    }
}
