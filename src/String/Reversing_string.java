package String;

import java.util.Scanner;

public class Reversing_string {


    public static void swap(char[] arr, int start, int end) {
        while (start < end) {
            char temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
    }

    public static void main(String[] args) {
        /*
        * Reverse each word in a given sentence (but keep word order same).

Input:  I am great
Output: I ma taerg
*/
        Scanner scanner = new Scanner(System.in);
        String string = scanner.nextLine();


        char[] arr = string.toCharArray();

        int start = 0;
        for (int end = 0; end <= arr.length; end++) {
            if (end == arr.length || arr[end] == ' ') {
                swap(arr, start, end - 1);
                start = end + 1;
            }
        }

        String newString = new String(arr);
        System.out.println(newString);
    }
}
