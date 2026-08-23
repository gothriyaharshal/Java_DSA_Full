package Recursion;

import java.util.Scanner;

public class F_Prinitng_fibonacci_Series_Using_Rescursion {

   public static int fibonacci(int num)
   {
       if(num==1 || num ==0) return num;
       return fibonacci(num-1)+fibonacci(num-2);
   }



    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int range = scanner.nextInt();

        for (int i = 0; i <= range; i++) {

            int output = fibonacci(i);
            System.out.print(output+"-->");
        }

    }
}
