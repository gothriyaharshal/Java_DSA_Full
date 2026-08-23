package array;

import java.util.Scanner;

public class Counting_Number_Of_Occurence {


    public static int findOccurence(int arr[],int target)
    {
        int count  = 0;
        for (int i = 0 ; i<arr.length ; i++)
        {
            if(arr[i]==target)
            {
                count++;
            }
        }
        return count;
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

        System.out.println("Enter your target element sir");
        int target = scanner.nextInt();
       int result = findOccurence(arr,target);
        System.out.println("Your element occurs in array for " + result  + "times");
    }
}
