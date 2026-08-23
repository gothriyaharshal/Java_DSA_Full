package String;

import java.util.Scanner;

public class MerginStiring {
    public static void main(String[] args) {
        /*that character + number of times it appears continuously.

🧠 Example:
Input:  aaabbccccd
Output: a3b2c4d1
*/

        Scanner scanner = new Scanner(System.in);
        String string = scanner.nextLine();

        char[] arr = string.toCharArray();
        String ans = "";
        int count = 0;
        for (int i = 0; i < arr.length - 1; i++) {

            if (arr[i] == arr[i + 1]) {
                count++;
            } else {
                ans = ans + arr[i] + count;
                count = 0;
            }

        }

        ans = ans + arr[arr.length - 1] + count;


        System.out.println(ans);
    }
}
