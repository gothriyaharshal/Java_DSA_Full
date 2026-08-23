package Normal.MultiThreading_Problems;

class M
{
    int count  = 0;
    public synchronized void counting()
    {
        count++;
    }
}


public class onemore
{
  public  static void main() throws InterruptedException {

        M m = new M();

        //creating Thread 1
        Thread thread = new Thread(
                ()->
                {
                  for (int i = 1 ; i<=10000 ; i++)
                  {
                    m.counting();
                  }
                }
        );


      //creating Thread 1
      Thread thread2 = new Thread(
              ()->
              {
                  for (int i = 1 ; i<=10000 ; i++)
                  {
                      m.counting();
                  }
              }
      );

      thread.start();
      thread2.start();

      thread.join();
      thread2.join();

      System.out.println("Final Count = " + m.count);


      System.out.println("---------------------------------------------");



      M m2 = new M();

      //creating Thread 1
      Thread thread3 = new Thread(
              ()->
              {
                  for (int i = 1 ; i<=10000 ; i++)
                  {
                      m2.counting();
                  }
              }
      );


      //creating Thread 1
      Thread thread4 = new Thread(
              ()->
              {
                  for (int i = 1 ; i<=10000 ; i++)
                  {
                      m2.counting();
                  }
              }
      );

      thread3.start();
      thread4.start();

      thread3.join();
      thread4.join();

      System.out.println("Final Count = " + m2.count);

  }
}