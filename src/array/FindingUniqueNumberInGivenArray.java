package array;

public class FindingUniqueNumberInGivenArray {
    public static void main(String[] args) {
        int arr[] = {1,1,2,3,3};
        int ans = 0;

        for (int i = 0; i<arr.length ; i++)
        {
            ans = ans^arr[i];
        }

        System.out.println("Unique element is"+ ans);
    }
}
