package String;

import java.util.Scanner;

public class subString {
    public static void main(String[] args) {
        Scanner scanner  = new Scanner(System.in);
        System.out.println("checking index of substring");

        String s = scanner.nextLine();
        String subString = scanner.nextLine();

        char[] arr_bigString = s.toCharArray();
        char[] arr_smallString = subString.toCharArray();


        for (int i = 0 ; i<arr_bigString.length-arr_smallString.length ; i++)
        {
            int j ;
            for (j = 0 ; j<arr_smallString.length ; j++)
            {
                if(arr_bigString[i+j]!=arr_smallString[j])
                {
                    break;
                }
            }
            if(j==arr_smallString.length)
            {
                System.out.println("The index start from"+i);
            }
        }
    }
}
