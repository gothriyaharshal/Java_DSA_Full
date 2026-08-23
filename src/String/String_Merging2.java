package String;

public class String_Merging2 {
    public static void main(String[] args) {
        /*enter	the	string
                rama	and	laxmana
	no	of	character	in	each	word	in	a	string	is	rama	4	and	3	laxmana	7*/

        String s = "rama and laxmana";
        String ans = "";

        int count = 0;
        char[] arr = s.toCharArray();
        for (int i = 0; i <arr.length ; i++)
        {
            if(arr[i]==' ')
            {
                ans =ans + count;
                count=0;
            }
            else {
                ans = ans+arr[i];
                count++;
            }
        }
        ans=ans+count;

        System.out.println(ans);
    }
}
