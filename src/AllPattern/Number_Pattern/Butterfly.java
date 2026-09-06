package AllPattern.Number_Pattern;

import java.util.Scanner;

public class Butterfly {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter your row");
        int row = scanner.nextInt();
        System.out.println("Enter your column");
        int column = scanner.nextInt();


        for (int i = 1 ; i<=row ; i++)
        {
            //first half
            for (int first = 1 ; first<=i ; first++)
            {
                System.out.print(first);
            }

            //
            for (int  space = 1 ; space<=2*(row-i) ; space++)
            {
                System.out.print(" ");
            }

//first half
            for (int second = i ; second>=1 ; second--)
            {
                System.out.print(second);
            }

            System.out.println();
        }









        for (int i = row-1 ; i>=1 ; i--)
        {
            //first half
            for (int first = 1 ; first<=i ; first++)
            {
                System.out.print(first);
            }

            //
            for (int  space = 1 ; space<=2*(row-i) ; space++)
            {
                System.out.print(" ");
            }

//first half
            for (int second = i ; second>=1 ; second--)
            {
                System.out.print(second);
            }

            System.out.println();
        }



    }
}
