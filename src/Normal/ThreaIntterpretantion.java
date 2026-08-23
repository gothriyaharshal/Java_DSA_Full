package Normal;


public class ThreaIntterpretantion {
    public static void main(String[] args) throws InterruptedException {

        Thread Downloadingthread = new Thread(
                ()->{
                    System.out.println("Downloading starts");

                    for (int i = 1 ; i<10  ; i++)
                    {
                        System.out.println("Downloading... " + (i * 10) + "%");

                        try {
                            Thread.sleep(1000);
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                            return;
                        }
                    }

                    System.out.println("Downloading completed");

                }
        );

        Downloadingthread.start();

        // User waits 3 seconds
        Thread.sleep(3000);

        System.out.println("\nUser clicked Cancel\n");

        Downloadingthread.interrupt();

    }
}
