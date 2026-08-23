package String;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class First_Non_Repeating_Char {
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
              if (entrySent.getValue()==2)
              {
                  System.out.println(entrySent.getValue()+"------>"+entrySent.getKey());
                  return;
              }

        }
    }

}
