package AllPattern.Alphabate_Pattern;

import java.util.Scanner;

public class Printing_Increasing_Decreasing_Pyramid {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter how many Row you want sir");
        int row = scanner.nextInt();

        System.out.println("Enter from which charcter you want to start this....");
        char ch = scanner.next().charAt(0);

        for (int i = 1 ; i<=row ; i++)
        {
            char temp = ch;

            //printing space
            for (int space = 1 ; space<=row-i ; space++)
            {
                System.out.print(" ");
            }

            //printing 2*i-1 time character
            for(int j = 1 ; j<=i ; j++)
            {
                System.out.print(temp+" ");
                temp++;
            }
            temp--;
            temp--;
            for (int n = 1 ; n<=i-1 ; n++)
            {
                System.out.print(temp+" ");
                temp--;
            }

            System.out.println();

        }
    }
}
