import java.lang.Thread;
public class Program_1 {
  public static void main(String[] args) {
    Threader t = new Threader();
    Threader t1 = new Threader();
    Threader t2 = new Threader();
    Threader t3 = new Threader();
    t.start();
    t1.start();
    t2.start();
    t3.start();
    System.out.println("The main thread is now executed.");
  }
}
class Threader extends Thread {
  public void run() {
    try {
        for (int i = 0; i<5 ; i++ ) {
          System.out.println(i + " is the Thread Number.");
          Thread.sleep(0);
        }
    } catch (InterruptedException ie) {
      ie.printStackTrace();
    }
  }
}
