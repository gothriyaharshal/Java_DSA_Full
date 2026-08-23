package Maths;

import java.util.Scanner;

public class DisplayingFrequency
{


    public static int findingFrequency(int n)
    {

        if(n==0 || n == 1) return n;
        return findingFrequency(n-1)+findingFrequency(n-2);
    }


    static void main() {
        //i want to show the frequency how did i

        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();

        for (int i = 0; i <= n; i++)
        {

            System.out.println(findingFrequency(i)+"----->");

        }

    }
}
