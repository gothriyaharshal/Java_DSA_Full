package array;

import java.util.Scanner;

public class ProgrammToCheckArrayIsSortedOrNot {

    public static boolean checkingSorting(int[] arr)
    {
        for (int i = 0 ; i<arr.length-1 ; i++)
        {
            for (int j = 0 ; j<arr.length-1-i ; j++)
            {
                if(arr[j]>arr[j+1])
                {
                 return false;
                }
            }
        }
        return  true;
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

        if (checkingSorting(arr)) {
            System.out.println("Array is sorted");
        } else {
            System.out.println("Array is not sorted");
        }
    }
}
