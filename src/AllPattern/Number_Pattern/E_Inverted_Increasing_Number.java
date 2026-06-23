package AllPattern.Number_Pattern;

import java.util.Scanner;

public class E_Inverted_Increasing_Number {
    public static void main(String[] args) {
        Scanner scanner =new Scanner(System.in);

        System.out.println("Enter your Row");
        int row = scanner.nextInt();

        System.out.println("Enter your column");
        int column = scanner.nextInt();
        int num = 1;
        for(int i = row ;i>=1 ; i--)
        {
            for (int j = i ;j>=1 ; j--)
            {
                System.out.print(j+" ");
            }
            System.out.println();
        }
    }
}
