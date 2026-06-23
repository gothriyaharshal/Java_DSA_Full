package AllPattern.Star_Pattern;
/*11 12 13 14 15
21 22 23 24 25
31 32 33 34 35
41 42 43 44 45*/
import java.util.Scanner;

public class M_Plus {
    public static void main(String[] args) {

        Scanner scanner =new  Scanner(System.in);

        System.out.println("Enter your Row");
        int row = scanner.nextInt();

        System.out.println("Enter your column");
        int column = scanner.nextInt();

        for(int i = 1 ;i<=row ; i++)
        {
            for (int j = 1 ;j<=column ; j++)
            {
                if(i==(row/2)+1 || j==(column/2)+1)
                {
                    System.out.print("*");
                }
                else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}
