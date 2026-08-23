package BitManipulation;

import java.util.Scanner;

public class Removing_Duplicates {

    public static void checkingWhichElementApperstwice(int[] arr) {
        int ans = 0;

        for(int i = 0; i < arr.length; ++i) {
            ans ^= arr[i];
        }

        System.out.print(ans);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your array length");
        int n = scanner.nextInt();
        System.out.println("Enter your array elements");
        int[] arr = new int[n];

        for(int i = 0; i < arr.length; ++i) {
            arr[i] = scanner.nextInt();
        }

        System.out.println("Before");

        for(int a : arr) {
            System.out.print(a + " ");
        }

        System.out.println();
        System.out.println("After");
        removingDuplicates(arr);
    }}
