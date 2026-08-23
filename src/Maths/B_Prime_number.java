package Maths;

import java.util.Scanner;

public class B_Prime_number {

    public static boolean isPrime(int i)
    {
        int j;
        if(i==1)
        {
            return false;
        }
        for (j = 2 ; j<i ; j++)
        {
            if(i%j==0)
            {
                return false;
            }
        }
        if(j==i)
        {
            return true;
        }
        else {
            return false;
        }
    }

    public static void main(String[] args) {

        Scanner scanner =new Scanner(System.in);

        System.out.println("Enter your number which you want to check");

        int range = scanner.nextInt();

        for(int i = 1; i<=range ; i++)
        {
            if(isPrime(i))
            {
                System.out.println("This is an prime number--> "+i);
            }
        }


    }
}
