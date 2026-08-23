package Normal;

public class Jkjk {
    public static void main(String[] args) throws InterruptedException {

        Thread t1 = new Thread(() -> {

            while (!Thread.currentThread().isInterrupted()) {
                System.out.println(1);
            }


            System.out.println("Thread stopped");
          //  return;
        });


        t1.start();
       t1.sleep(4000);
       t1.interrupt();

        System.out.println("Main thread");

    }
}
