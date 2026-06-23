package AllPattern.Alphabate_Pattern;

import java.util.Scanner;

public class C_Inverted_Left_Triangle {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter how many row does you want");
        int row = scanner.nextInt();

        System.out.println("Enter from which charchter you want to start");
        char ch = scanner.next().charAt(0);

        for(int i = row ; i>=1 ; i-- )
        {
            char temp = ch ;
            for(int j  = 1 ; j<=i ; j++)
            {
                System.out.print(temp);
                temp++;
            }
            System.out.println();
        }
    }
}
