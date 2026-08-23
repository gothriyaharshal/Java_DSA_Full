package Recursion;

import java.util.Scanner;

public class B_Printing_name_N_times {

public static void printing(String s , int range)
{
    if(range==0) return;

    System.out.println(s);
    printing(s,range-1);
}

    public static void main(String[] args) {
        //i want to print a particular String n times then how it is possble

        Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine();

        System.out.println("enter how many times you want to print this name");
        int range = scanner.nextInt();

        printing(s,range);
    }



/*
    public static void printing_name(String s, int n) {
        if (n != 0) {
            printing_name(s, n - 1);
            System.out.println(s);
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your name which you want to print n times");
        String s = scanner.nextLine();
        System.out.println("Enter how many times you wants to print your name");
        int n = scanner.nextInt();
        printing_name(s, n);
    }*/
}
