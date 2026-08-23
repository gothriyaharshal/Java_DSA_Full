package Normal.MultiThreading_Problems;

public class Bank_Account_ {

    public static int totalAmount = 1000;


    public static void count() {

         int  temp = totalAmount;   //reading

        temp = temp-100;     //updating

        totalAmount = temp;         //writing
    }

    public static void main(String[] args) throws InterruptedException {
        //making first thread
        Thread thread = new Thread(() ->
        {

            count();
        });

        Thread thread1 = new Thread(() ->
        {
            count();
        });

        thread.start();
        thread1.start();

        thread.join();
        thread1.join();

        System.out.println(totalAmount);
    }
}
