package array;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Counting_Number_Of_Occurence_By_HashMap {

    public static int mapping(int[] arr, int target) {

        HashMap<Integer,Integer> hashMap = new HashMap<>();

        for (int i = 0 ; i<arr.length ; i++)
        {
            if(hashMap.containsKey(arr[i]))
            {
                int temp = hashMap.get(arr[i]);
                hashMap.put(arr[i],temp+1);
            }
            else {
                hashMap.put(arr[i],1);
            }
        }

        for (Map.Entry<Integer, Integer> integerIntegerEntry : hashMap.entrySet()) {
            if (integerIntegerEntry.getKey()==target)
            {
                return integerIntegerEntry.getValue();
            }
        }
     return 0;
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

        System.out.println("Now printing its key value pair of frequecy that how many times an value occure in array");
        System.out.println("Print your target element sir which frequecy you want to see");
        int target= scanner.nextInt();

        int result = mapping(arr,target);
        System.out.println(result);
    }
}
