package Normal.MultiThreading_Problems;

public class Race_Condition {
    static int count = 0;
    public static synchronized  void count()
    {
        count++;
        /*try {
            Thread.sleep(0);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }*/
        }

    public static void main(String[] args) throws InterruptedException {

        //making first thread
        Thread thread = new Thread(()->
        {
           for (int i = 1 ; i<=10000; i++)
           {
               count();
           }
        });

        Thread thread1 = new Thread(()->
        {
            for (int i = 1 ; i<=10000 ; i++)
            {
                count();
            }
        });

        thread.start();
        thread1.start();

        thread.join();
        thread1.join();

        System.out.println(count);
    }
}
