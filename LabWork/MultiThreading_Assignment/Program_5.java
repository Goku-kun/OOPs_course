class ProCon {
  volatile int val;
  volatile boolean flag = false;
  synchronized int get() {
    while (flag == false) {
      try{
        wait();
      } catch(InterruptedException ie) { }
    }
    flag = false;
    notifyAll();
    return val;
  }
  synchronized void put(int val) {
    while (flag == true) {
      try{
        wait();
      } catch (InterruptedException e) { }
    }
    this.val = val;
    flag = true;
    notifyAll();
  }
}
class Producer implements Runnable {
  ProCon obj;
  Thread t;
  Producer(ProCon p) {
    obj = p;
    t = new Thread(this);
    t.start();
  }
  public void run() {
    for (int i = 1; i<6 ; i++ ) {
      obj.put(i);
      System.out.println("Producer produced: "+i);
      try {
        Thread.sleep(500);
      } catch(InterruptedException ie) {
        ie.printStackTrace();
      }
    }
  }
}
class Consumer implements Runnable {
  ProCon obj;
  Thread t;
  Consumer(ProCon p) {
    t = new Thread(this);
    obj = p;
    t.start();
  }
  public void run() {
    int val;
    for (int i =1 ; i<6 ; i++ ) {
      val = obj.get();
      System.out.println("Consumer consumed: "+val);
      try {
        Thread.sleep(500);
      } catch(InterruptedException ie) {
        ie.printStackTrace();
      }
    }
  }
}
public class Program_5 {
  public static void main(String[] args) {
    ProCon pc = new ProCon();
    new Producer(pc);
    new Consumer(pc);
  }
}
