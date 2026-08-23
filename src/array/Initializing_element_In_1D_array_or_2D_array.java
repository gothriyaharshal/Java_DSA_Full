package array;

import java.util.Scanner;

public class Initializing_element_In_1D_array_or_2D_array {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Iniitalizing one d array and printing it");
        System.out.println("Enter the length of array");
        int n = scanner.nextInt();

        System.out.println("Enter array element");
        int arr[] = new int[n];

        for (int i = 0; i<arr.length ; i++)
        {
            arr[i]=scanner.nextInt();
        }

        for (int i = 0; i<arr.length ; i++)
        {
            System.out.print(arr[i]+"===");
        }


        System.out.println("Initializing 2 d array and priniting it");
        System.out.println("Enter your row sir");
        int row = scanner.nextInt();

        System.out.println("Enter your column sir");
        int column = scanner.nextInt();

        int twoDarray[][] = new int[row][column];

        for (int i = 0 ; i<twoDarray.length ; i++)
        {
            for (int j = 0 ; j<twoDarray[i].length ; j++)
            {
                twoDarray[i][j]=scanner.nextInt();
            }
        }
        System.out.println("Printing our 2 d array");
        for (int i = 0 ; i<twoDarray.length ; i++)
        {
            for (int j = 0 ; j<twoDarray[i].length ; j++)
            {
                System.out.print(twoDarray[i][j]);
            }
            System.out.println();
        }

    }
}
