package twoDArray;

import java.util.Scanner;

public class Addition {


    public static void addition(int arr1[][],int row1 , int column1,int arr2[][], int row2, int column2)
    {
        if(row1!=row2 &&  column1!=column2) return ;

        int ans[][] = new int[row1][column1];

        for (int i = 0 ; i<ans.length ; i++)
        {
            for (int j = 0 ; j<ans[i].length ; j++)
            {
                ans[i][j] = arr1[i][j]+arr2[i][j];
            }
        }

        for (int i = 0 ; i<ans.length ; i++)
        {
            for (int j = 0 ; j<ans[i].length ; j++)
            {
                System.out.print(ans[i][j]);
            }
            System.out.println();
        }
    }


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter how many row you want");
        int row1 = scanner.nextInt();

        System.out.println("Enter your column");
        int column1 = scanner.nextInt();

        int arr1[][] = new int[row1][column1];
        for (int i = 0 ; i<arr1.length ; i++)
        {
            for (int j = 0 ; j<arr1[i].length ; j++)
            {
                arr1[i][j] = scanner.nextInt();
            }
        }

        for (int i = 0 ; i<arr1.length ; i++)
        {
            for (int j = 0 ; j<arr1[i].length ; j++)
            {
                System.out.print(arr1[i][j]);
            }
            System.out.println();
        }



        System.out.println("Enter how many row you want");
        int row2 = scanner.nextInt();

        System.out.println("Enter your column");
        int column2 = scanner.nextInt();

        int arr2[][] = new int[row2][column2];
        for (int i = 0 ; i<arr2.length ; i++)
        {
            for (int j = 0 ; j<arr2[i].length ; j++)
            {
                arr2[i][j] = scanner.nextInt();
            }
        }

        for (int i = 0 ; i<arr2.length ; i++)
        {
            for (int j = 0 ; j<arr2[i].length ; j++)
            {
                System.out.print(arr2[i][j]);
            }
            System.out.println();
        }



         addition(arr1,row1 , column1,arr2,row2,column2);

    }
}
