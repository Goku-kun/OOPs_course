import java.lang.Thread;
public class Program_2 {
  public static void main(String[] args) {
    Threader t1 = new Threader();
    Threader t2 = new Threader();
    Threader t3 = new Threader();
  }
}
class Threader implements Runnable {
  Threader() {
    Thread t = new Thread(this, "Thread 1");
    t.start();
  }
  public void run() {
    for (int i=0; i<10 ; i++ ) {
      System.out.println(i+" is the thread number.");
    }
  }
}
