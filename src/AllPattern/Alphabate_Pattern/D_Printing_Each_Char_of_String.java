package AllPattern.Alphabate_Pattern;

import java.util.Scanner;

public class D_Printing_Each_Char_of_String {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your String whcih char you want to find");

        String s = scanner.nextLine();

        char[] arr = s.toCharArray();

        for(int i = 0 ; i<arr.length ; i++)
        {
            System.out.print(arr[i]+" ");
        }

    }
}
