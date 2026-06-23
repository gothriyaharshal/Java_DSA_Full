package AllPattern.Number_Pattern;

import java.util.Scanner;

public class G_Pascal_Triangle {
    //making an jagged array then inserting value in it

    public static void main(String[] args) {
        Scanner scanner =new Scanner(System.in);
        System.out.println("Enter your array length");
        int n = scanner.nextInt();

        int[][] arr = new int[n][];
        for (int i = 0 ; i<arr.length ; i++)
        {
            arr[i]=new int[i+1];

            //at first or last index we inserting 1
            arr[i][0]=1;
            arr[i][i]=1;

            for (int j = 1 ; j<i ; j++)
            {
                arr[i][j]=arr[i-1][j]+arr[i-1][j-1];
            }
        }


        for (int i=0;i<arr.length;i++)
        {
            for (int spa=1 ; spa<=arr.length-1-i ; spa++)
            {
                System.out.print(" ");
            }
            for (int j = 0 ; j<arr[i].length;j++)
            {
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
    }
}
