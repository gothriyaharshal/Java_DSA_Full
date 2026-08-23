package String;

public class revers {
    public static void main(String[] args) {
        String s ="i am great";
        char[] charArray = s.toCharArray();

        int start = 0;
        int end = charArray.length-1;

        while (start<end)
        {
            char temp = charArray[start];
            charArray[start] = charArray[end];
            charArray[end] = temp;

            start++;
            end--;
        }

        String newString = new String(charArray);
        System.out.println(newString);
    }
}
