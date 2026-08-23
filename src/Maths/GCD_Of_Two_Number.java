package Maths;

import java.util.Scanner;

public class GCD_Of_Two_Number {

    public static int findingGcd(int a , int b)
    {
        if(b==0) return a;
        return findingGcd(b,a%b);
    }

    public static int findingLcm(int a , int b , int gcd)
    {
        return  (a*b)/gcd;
    }


    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter your first number sir");
        int a = scanner.nextInt();

        System.out.println("Enter your second number sir");
        int b = scanner.nextInt();

        int GCD = findingGcd(a,b);
        System.out.println(GCD);

        int  Lcm = findingLcm(a,b,GCD);
        System.out.println(Lcm);
    }
}
