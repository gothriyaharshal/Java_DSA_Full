package AllPattern.Number_Pattern;

import java.util.Scanner;

public class B_Left_Angled {
    public static void main(String[] args) {
        Scanner scanner =new Scanner(System.in);

        System.out.println("Enter your Row");
        int row = scanner.nextInt();

        System.out.println("Enter your column");
        int column = scanner.nextInt();

        for(int i = 1 ;i<=row ; i++)
        {
            for (int j = 1 ;j<=i ; j++)
            {

                System.out.print(j+" ");
            }
            System.out.println();
        }
    }
}
