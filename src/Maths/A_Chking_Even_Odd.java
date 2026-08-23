package Maths;

import java.util.Scanner;

public class A_Chking_Even_Odd {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter you number");

        int num = scanner.nextInt();

        if((num&1)==0)
        {
            System.out.print("Number is Even");
        }
        else {
            System.out.println("Number is odd");
        }
    }
}
