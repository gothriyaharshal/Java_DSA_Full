package Maths;

import java.util.Scanner;

public class E_Fact {
    public static int fact(int num)
    {
return  0;
    }

    public static void main(String[] args) {
        Scanner scanner =new Scanner(System.in);

        System.out.println("Enter your number which you want to check");

        int range = scanner.nextInt();

        int result = 1;
        while (range!=0)
        {
            result = range*result;
            range--;
        }
        System.out.println(result);
    }
}
