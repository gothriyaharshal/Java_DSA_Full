package AllPattern.Number_Pattern;

import java.util.Scanner;

public class Z_BriksMids_Question {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int row = sc.nextInt();
        for(int i = row ; i>=1 ; i--)
        {
            for (int j =i ; j>=1 ; j--)
            {
                System.out.print(j);
            }

            for (int space = 1 ; space<=2*(row-i-1) ;  space++)
            {
                System.out.print(" ");
            }

            for (int f = 1 ; f<=i ; f++)
            {
                if(f==1)
                {
                    continue;
                }
                System.out.print(f);
            }

            System.out.println();

        }
    }
}
