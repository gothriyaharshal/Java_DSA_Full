package array;

public class ReturnSBiggesttandSmallestElementOfArray {

    public static int findingMinimum(int arr[])
    {
     int min = Integer.MAX_VALUE;
     for (int i = 0 ; i<arr.length ; i++)
     {
         if(arr[i]<min)
         {
             min = arr[i];
         }
     }
     return min;
    }


    public static int findingMaximus(int arr[])
    {
        int max = Integer.MIN_VALUE;
        for (int i = 0 ; i<arr.length ; i++)
        {
            if(arr[i]>max)
            {
                max = arr[i];
            }
        }
        return max;
    }
    public static void main(String[] args) {
        int arr[] = {1,2,3,4,5,6};

       int min =  findingMinimum(arr);
        System.out.println(min);
       int max =  findingMaximus(arr);
        System.out.println(max);

    }
}
