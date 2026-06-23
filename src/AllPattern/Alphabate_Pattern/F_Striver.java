package AllPattern.Alphabate_Pattern;

import java.util.Scanner;

public class F_Striver {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter your row");
        int row = scanner.nextInt();

        System.out.println("Enter charcter from which you want to start which is grater or equal to row");
        char ch = scanner.next().charAt(0);

        for (int i = 1 ; i<=row ; i++)
        {
            char temp = ch;
            for (int j = 1 ; j<=i ; j++)
            {
                System.out.print(temp);
                temp++;
            }
            ch = (char)(ch-1);

            System.out.println();
        }

    }
}
