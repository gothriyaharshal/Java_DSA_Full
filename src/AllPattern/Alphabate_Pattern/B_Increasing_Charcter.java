package AllPattern.Alphabate_Pattern;

import java.util.Scanner;

public class B_Increasing_Charcter {
    public static void main(String[] args) {
        Scanner scanner =new Scanner(System.in);

        System.out.println("Enter how many rows you want");

        char first_char = scanner.next().charAt(0);
        char last_char = scanner.next().charAt(0);

        for (char i = first_char ; i<=last_char ; i++)
        {
            for (char j =first_char; j<=i ; j++)
            {
                System.out.print(j);
            }
            System.out.println();
        }
    }
}
