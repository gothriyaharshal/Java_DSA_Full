package sorting;

import java.util.Scanner;

public class Bubble_Sort {

    public static void bubbleSorting(int[] arr)
    {
        boolean swapped = false;
        for (int i = 0 ; i<arr.length-1 ; i++)
        {
            for (int j = 0 ; j<arr.length-1-i ; j++)
            {
                if(arr[j]>arr[j+1])
                {
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                    swapped=true;
                }
             if(!swapped)
             {
                 return;
             }

            }

        }
    }


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

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

        bubbleSorting(arr);
        System.out.println();

        for (int i = 0; i<arr.length ; i++)
        {
            System.out.print(arr[i]+"===");
        }
    }
}
