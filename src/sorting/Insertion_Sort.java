package sorting;

import java.util.Scanner;

public class Insertion_Sort {

    public static void insertion(int[] arr) {
        for(int i = 1 ; i<arr.length ; i++)
        {
            int j = i;
            while (j>0 && arr[j-1]>arr[j])
            {
                int temp = arr[j];
                arr[j] = arr[j-1];
                arr[j-1] = temp;
                j--;
            }
        }
    }


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the length of array");
        int n = scanner.nextInt();

        System.out.println("Enter array element");
        int arr[] = new int[n];

        for (int i = 0; i < arr.length; i++) {
            arr[i] = scanner.nextInt();
        }

        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + "===");
        }
        insertion(arr);

        System.out.println();

        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + "===");
        }
    }
}
