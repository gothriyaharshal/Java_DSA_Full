package Recursion;

import java.util.Scanner;

public class D_Checking_String_Is_Palimdrome_Or_Not {

    public static void reversing(char[] arr , int start , int end)
    {

        if(start<end)
        {
            char temp = arr[start];
            arr[start]=arr[end];
            arr[end]=temp;
            reversing(arr,start+1,end-1);
        }
    }


    public static boolean checkingPalimdrome(String string) {
        String temp = string;
        char[] arr = string.toCharArray();
        int start = 0;
        int end = arr.length-1;
        reversing(arr,start,end);

        String result = new String(arr);

        if(result.equals(temp))
        {
            return  true;
        }
        else {
            return false;
        }
    }


    //checking string is palimdrom or not using recursion
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your string sir");

        String string = scanner.nextLine();

        if (checkingPalimdrome(string)) {
            System.out.println("String is palimdrome");
        } else {
            System.out.println("String is not an palimdrome");
        }
    }



    /*
    public static void helper(char[] arr, int start, int end) {
        if (start < end) {
            char temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            helper(arr, start + 1, end - 1);
        }
    }

    public static boolean palindromeCheck(String s) {
        char[] ch = s.toCharArray();
        int start = 0;
        int end = ch.length - 1;
        helper(ch, start, end);
        String newString = new String(ch);
        return newString.equals(s);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your string");
        String s = scanner.nextLine();
        boolean b = palindromeCheck(s);
        if (b) {
            System.out.print("string is palimdrome");
        } else {
            System.out.println("String is not an palimdrome");
        }

    }*/
}
