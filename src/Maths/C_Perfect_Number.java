package Maths;
import java.util.Scanner;
public class C_Perfect_Number {
    public static boolean isPerfect(int i)
    {
        int sum = 0;
        int j ;
        for(j = 1; j <= i/2 ;  j++) {
            if (i % j == 0) {
                sum = sum + j;
            }
        }
        if(sum == i)
        {
            return true;
        }
        else {
            return false;
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your number which you want to check");
        int range = scanner.nextInt();
        for(int i = 1; i<=range ; i++)
        {
            if(isPerfect(i))
            {
                System.out.println("This is an prime number--> "+i);
            }

        }
    }
}
