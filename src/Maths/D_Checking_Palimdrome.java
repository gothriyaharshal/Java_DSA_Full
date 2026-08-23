package Maths;

import java.util.Scanner;

public class D_Checking_Palimdrome {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int num = scanner.nextInt();
        int temp = num;
        int rev = 0;

        while (num != 0) {int digit = num % 10;rev = rev * 10 + digit;num = num / 10;}

        if (temp == rev){System.out.println("true");}
    }
}
