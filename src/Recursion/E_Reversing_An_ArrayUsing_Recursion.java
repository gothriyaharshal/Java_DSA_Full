package Recursion;

import java.util.Scanner;

public class E_Reversing_An_ArrayUsing_Recursion {

    public static void reversingArray(int[] arr,int start , int end)
    {
         if (start<end)
        {
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end]=temp;
           reversingArray(arr,start+1,end-1);
        }
    }




    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the lenght of array");
        int n = scanner.nextInt();

        int[] arr = new int[n];

        for (int i = 0; i < arr.length; i++) {
            arr[i] = scanner.nextInt();
        }
         int start = 0;
        int end = arr.length-1;

        reversingArray(arr,start,end);

        for (int i = 0 ; i<arr.length; i++)
        {
            System.out.print(arr[i]+"--->");
        }
    }
}
