package Maths;

import java.util.Scanner;

public class Armstrong_Number {

    public static int pow(int digit, int power) {
        int p = 1;
        while (power > 0) {
            p = p * digit;
            power--;
        }
        return p;
    }

    public static int counting(int i) {
        int count = 0;
        while (i > 0) {
            count++;
            i = i / 10;
        }
        return count;
    }

    public static boolean isArmstrong(int i) {
        //first of all counting how many digit our there
        int count = counting(i);
        int temp = i;
        int sum = 0;
        //then i taking last or first digit of it and multiply with count
        while (i > 0) {
            int digit = i % 10;
            sum = sum + pow(digit, count);
            i = i / 10;
        }

        if (sum == temp) {
            return true;

        } else {
            return false;
        }
    }


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter your number range sir");
        int range = scanner.nextInt();

       /* for (int i = 1; i <= range; i++) {*/
            if (isArmstrong(371)) {
                System.out.println("yes");
            }
            else {
                System.out.println("no");
            }
    }
}
