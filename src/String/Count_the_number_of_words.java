package String;

import java.util.Scanner;

public class Count_the_number_of_words {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter your string");
        String string = scanner.nextLine();

        //converting it into array
        char[] arr = string.toCharArray();
        boolean inword = false;
        int count = 0;
        for (int i =0 ; i<arr.length ; i++)
        {
            if(arr[i]==' ')
            {
                inword=false;
            }
            while (!inword)
            {
                count++;
                inword=true;
            }
        }
        System.out.println(count);
    }
}
