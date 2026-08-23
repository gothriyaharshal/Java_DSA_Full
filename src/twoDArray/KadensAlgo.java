package twoDArray;

public class KadensAlgo {

    public static void main(String[] args) {
        int[] arr = new int[]{-2, 1, -3, 4, -1, 2, 1};
        int max_sum = Integer.MIN_VALUE;
        int current_sum = 0;

        for(int i = 0; i < arr.length; ++i) {
            current_sum += arr[i];
            max_sum = Math.max(max_sum, current_sum);
            if (current_sum < 0) {
                current_sum = 0;
            }
        }

        System.out.println(max_sum);
    }
}
