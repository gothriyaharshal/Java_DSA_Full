package AllPattern.Star_Pattern;

import java.util.Scanner;

public class K_Butterfly {
    public static void main(String[] args) {

        Scanner scanner =new  Scanner(System.in);

        System.out.println("Enter your Row");
        int row = scanner.nextInt();

        System.out.println("Enter your column");
        int column = scanner.nextInt();

        for(int i = 1 ;i<=row ; i++)
        {

            for (int j = 1 ;j<=i ; j++)
            {
                System.out.print("*");
            }

            for (int space = 1 ; space<=2*(row-i) ; space++)
            {
                System.out.print(" ");
            }


            for (int j = i ;j>=1 ; j--)
            {
                System.out.print("*");
            }

            System.out.println();
        }
    }
}
