package Recursion;

import java.util.Scanner;

public class G_Sum_Of_Digit_Using_Recursion {

    public static int findingSum(int num)
    {
        if(num==0) return 0;
       return num%10 + findingSum(num/10);

    }

    public static void main(String[] args) {
        //sum of digit using recursion
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your Number sir");
        int num = scanner.nextInt();

       int result = findingSum(num);
        System.out.println(result);
    }



   /* public static int sumOfDigit(int num) {
        if (num == 0) {
            return 0;
        } else {
            int temp = sumOfDigit(num / 10);
            return temp + num % 10;
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int sum = sumOfDigit(a);
        System.out.println(sum);
    }*/
}
