package AllPattern.Star_Pattern;

import java.util.Scanner;

public class L_Cross_Pattern {

    public static void main(String[] args) {

        Scanner scanner =new  Scanner(System.in);

        System.out.println("Enter your Row");
        int row = scanner.nextInt();

        System.out.println("Enter your column");
        int column = scanner.nextInt();

        for(int i = 1 ;i<=row ; i++)
        {
            for (int j = 1 ;j<=column ; j++)
            {
                if(i==j || i+j==row+1)
                {
                    System.out.print("*");
                }
                else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }

}
