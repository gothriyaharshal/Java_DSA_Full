package Normal;

//by thread class
class MyClass extends Thread
{
    @Override
    public void run() {
        System.out.println("Hello");
    }
}


//by runnable interface
class MyClass2 implements Runnable
{

    @Override
    public void run() {
        System.out.println("Runnable interface");
    }
}


public class Threading {
    public static void main(String[] args) throws InterruptedException {

/*

        MyClass myClass = new MyClass();
        myClass.start();
        myClass.join();


        MyClass2 myClass2 = new MyClass2();
        Thread thread = new Thread(myClass2);
        thread.start();
        thread.join();


*/


        Thread thread1 = new Thread(()->
        {
            for (int i = 1 ; i<=5 ; i++)
            {
                try {
                    Thread.sleep(3000);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
                System.out.print("i am in thread A ----");
            }
        });

        System.out.println();
        Thread thread2 = new Thread(()->
        {
           for (int i = 1 ; i<=5 ; i++)
           {
               System.out.print("i am in Thread B ----");
           }
        });
        thread1.start();
       thread1.join();
        thread2.start();


        System.out.println("Main thread");
    }
}
