package Recursion;

import java.util.Scanner;

public class C_Factorial_Of_Given_Number {


    public static int fact(int num) {
        if (num == 1 || num == 0) return 1;
        return fact(num - 1) * num;
    }

    public static void main(String[] args) {
        //finding factorial of given number using recursion
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your number sir");
        int num = scanner.nextInt();

        int result = fact(num);
        System.out.println(result);
    }












    /*
    public static int fac(int num) {
        return num == 1 ? 1 : fac(num - 1) * num;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your number");
        int num = scanner.nextInt();
        int factorial = fac(num);
        System.out.println(factorial);
    }*/
}
