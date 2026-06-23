package AllPattern.Star_Pattern;

import java.util.Scanner;

public class G_inverted_Left {
    public static void main(String[] args) {

        Scanner scanner =new  Scanner(System.in);

        System.out.println("Enter your Row");
        int row = scanner.nextInt();

        System.out.println("Enter your column");
        int column = scanner.nextInt();

        for(int i = row ;i>=1 ; i--)
        {
            for (int j = 1 ;j<=i ; j++)
            {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
