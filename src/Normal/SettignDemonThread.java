package Normal;

public class SettignDemonThread {
    public static void main(String[] args) throws InterruptedException {
        Thread thread = new Thread(
                ()->
                {
                 while (true)
                 {
                     System.out.println("Demon Thread");
                 }
                }
        );
        thread.setDaemon(true);
        thread.start();
        System.out.println("Main thread Finished");
    }
}
