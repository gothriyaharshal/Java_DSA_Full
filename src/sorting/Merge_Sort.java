package sorting;

import java.util.Scanner;

public class Merge_Sort {


    public static void mergeSort(int[] arr, int start, int end) {
        if (start < end) {
            int mid = (start + end) / 2;
            mergeSort(arr, start, mid);
            mergeSort(arr, mid + 1, end);

            merging(arr, start, mid, end);
        }
    }

    public static void merging(int[] arr, int start, int mid, int end) {

        int n1 = mid - start + 1;
        int n2 = end - mid;

        int letarray[] = new int[n1];
        int rightarray[] = new int[n2];

        for (int i = 0 ; i<letarray.length ; i++)
        {
            letarray[i] = arr[i+start];
        }

        for (int j = 0 ; j<rightarray.length ; j++)
        {
            rightarray[j] = arr[j+mid+1];
        }

         int i =0 ;
        int j = 0;
        int k = start;

        while (i<n1 && j<n2)
        {
            if(letarray[i]<=rightarray[i])
            {
                arr[k]=letarray[i];
                k++;
                i++;
            }
            else {
                arr[k]=rightarray[j];
                k++;
                j++;
            }
        }

        while (i<n1)
        {
            arr[k] = letarray[i];
            k++;
            i++;
        }
        while (j<n2)
        {
            arr[k] = rightarray[j];
            j++;
            k++;
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
        mergeSort(arr, 0, arr.length - 1);

        System.out.println();

        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + "===");
        }
    }
}
