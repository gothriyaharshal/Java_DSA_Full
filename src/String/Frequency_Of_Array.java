package String;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Frequency_Of_Array {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your string");
        String string = scanner.nextLine();
        char[] arr = string.toCharArray();

        HashMap<Character,Integer> hashMap = new HashMap<>();


        for (int i = 0 ; i<arr.length ; i++)
        {

            if(hashMap.containsKey(arr[i]))
            {
                int target = hashMap.get(arr[i]);
                hashMap.put(arr[i],target+1);
            }
            else {
                hashMap.put(arr[i],1);
            }
        }

       for (Map.Entry<Character,Integer> entrySent : hashMap.entrySet())
       {
           System.out.println(entrySent.getKey()+"------>"+entrySent.getValue());
       }
    }
}
