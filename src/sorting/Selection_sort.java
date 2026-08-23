package sorting;

import java.util.Scanner;

public class Selection_sort {

    public static void selectionSort(int[] arr)
    {
        for (int i = 0 ; i<arr.length ; i++)
        {
            int min_index = i;
            for(int j = i+1 ; j<arr.length ; j++)
            {
                if(arr[min_index]>arr[j])
                {
                    min_index=j;
                }
            }

            //swapping i and min index
            int temp = arr[i];
            arr[i] = arr[min_index];
            arr[min_index]=temp;
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
        selectionSort(arr);

        System.out.println();

        for (int i = 0; i<arr.length ; i++)
        {
            System.out.print(arr[i]+"===");
        }
    }
}
