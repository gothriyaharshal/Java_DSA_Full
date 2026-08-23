package String;

public class Initcap {
    /*
    * :	pramod	reddy	pavan	chandu
enter	the	string	in	it	cap	:	Pramod	Reddy	Pavan	Chandu
* */

    public static void main(String[] args) {
     String s = "pramod reddy pavan chandu";

    char[] arr = s.toCharArray();

    for (int i = 0 ; i<arr.length ; i++) {
        if (i == 0 && arr[i]>=97 && arr[i]<=122) {
              arr[i] = (char)(arr[i]-32);
        }
        if(arr[i]==' ' && arr[i+1]>=97 && arr[i+1]<=122)
        {
            arr[i+1] = (char)(arr[i+1]-32);
        }
    }
        String newString = new String(arr);
        System.out.println(newString);
    }
    }

