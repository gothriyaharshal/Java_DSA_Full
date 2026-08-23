package Recursion;

import java.util.Scanner;

public class Printing_Number_From_n_To_1 {

    public static void printing(int number)
    {
        if(number==0) return;

        System.out.print(number+" ");
        printing(number-1);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter from where you want to start till 1");
        int range = scanner.nextInt();

        printing(range);

    }
}
