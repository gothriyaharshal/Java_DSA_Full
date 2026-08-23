package AllPattern.Alphabate_Pattern;

import java.util.Scanner;

public class NotesBasedQuestion {
    static void main() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter your Row how many you want");
        int row = scanner.nextInt();

        System.out.println("enter your charchater from where you want to start");
        char ch = scanner.next().charAt(0);


        for (int i = 1; i <= row; i++) {
//first we want space
            char temp = ch;

            for (int space = 1; space <= row - i; space++) {
                System.out.print(" ");
            }

            //now i want char in increasing order
            for (int j = i; j >= 1; j--) {
                System.out.print(temp);
                temp++;
            }
            temp--;
            temp--;

            for (int j = 2; j <= i; j++) {
                System.out.print(temp);
                temp++;
            }
            System.out.println();
        }


        for (int i = row-1; i >= 1; i--) {
//first we want space
            char temp = ch;

            for (int space = 1; space <= row - i; space++) {
                System.out.print(" ");
            }

            //now i want char in increasing order
            for (int j = i; j >= 1; j--) {
                System.out.print(temp);
                temp++;
            }
            temp--;
            temp--;

            for (int j = 2; j <= i; j++) {
                System.out.print(temp);
                temp++;
            }
            System.out.println();
        }

    }
}
