class ProCon {
  int val;
  boolean flag=false;
  public synchronized void put(int i) {
    while(flag) {
      try {
        wait();
      } catch(Exception e) {
        System.out.println("This is Bullshit");
      }
    }
    val = i;
    flag = true;
    System.out.println("Producer produced: "+val);
    notify();
  }
  public synchronized void get() {
    while(!flag) {
      try {
        wait();
      } catch(Exception e) {

      }
    }
    System.out.println("Consumer consumed:"+val);
    flag = false;
    notify();
  }
}
class Producer implements Runnable {
  ProCon pc;
  int i=0;
  Producer(ProCon pc) {
    this.pc = pc;
    new Thread(this,"Producer Thread").start();
  }
  public void run() {
    while(true) {
      pc.put(i++);
      try {
        Thread.sleep(1000);
      } catch(Exception e) {

      }
    }
  }
}
class Consumer implements Runnable {
  ProCon pc;
  Consumer(ProCon pc) {
    this.pc = pc;
    new Thread(this, "Consumer Thread.").start();
  }
  public void run() {
    while (true) {
      pc.get();
      try {
        Thread.sleep(1000);
      } catch(Exception e) {

      }
    }
  }
}
public class ProducerConsumer {
  public static void main(String[] args) {
    ProCon pc = new ProCon();
    new Producer(pc);
    new Consumer(pc);
  }
}
