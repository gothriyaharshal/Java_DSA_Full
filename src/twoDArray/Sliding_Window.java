package twoDArray;

public class Sliding_Window {

    public static void main(String[] args) {
        int[] arr = new int[]{2, 1, 5, 1, 3, 2};
        int k = 3;
        int max_sum = Integer.MIN_VALUE;

        for(int i = 0; i < arr.length - k + 1; ++i) {
            int sum = 0;

            for(int j = i; j < i + k; ++j) {
                sum += arr[j];
            }

            if (sum > max_sum) {
                max_sum = sum;
            }
        }

        System.out.println(max_sum);
    }
}
