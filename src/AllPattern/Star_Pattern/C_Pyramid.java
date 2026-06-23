package AllPattern.Star_Pattern;

import java.util.Scanner;

public class C_Pyramid {
     public static void main(String[] args) {
            Scanner scanner =new  Scanner(System.in);

            System.out.println("Enter your Row");
            int row = scanner.nextInt();

            System.out.println("Enter your column");
            int column = scanner.nextInt();

            for(int i = 1 ;i<=row ; i++)
             {
                 for (int space=1 ; space<=row-i ; space++)
                 {
                     System.out.print(" ");
                 }
                for (int j = 1 ;j<=2*i-1 ; j++)
                {

                    System.out.print("*");
                }
                System.out.println();
            }
        }
    }

