package Recursion;

import java.util.Scanner;

public class Printing_Number_From_One_To_n {


    public static void printing(int range) {
       if(range==0) return;

      printing(range-1);
        System.out.println(range);
    }

    public static void main(String[] args) {
        //i want to print number from 1 to n by help of recsrion

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter from 1 to how many number you want to print");

        int range = scanner.nextInt();

        printing(range);
    }
}
