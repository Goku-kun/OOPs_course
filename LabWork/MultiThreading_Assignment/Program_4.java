import java.lang.Thread;
public class Program_4 {
  public static void main(String[] args) {
    Threader t1 = new Threader("First",Thread.MAX_PRIORITY);
    Threader t2 = new Threader("Second",Thread.MIN_PRIORITY);
    Threader t3 = new Threader("Third",Thread.NORM_PRIORITY+2);
    Threader t4 = new Threader("Fourth",Thread.MIN_PRIORITY+1);
    new Threader("Fifth",Thread.MIN_PRIORITY+2);
    new Threader("Sixth",Thread.MIN_PRIORITY+3);
    new Threader("Seventh",Thread.NORM_PRIORITY);
    new Threader("Eight",Thread.NORM_PRIORITY+1);
    new Threader("Ninth",Thread.NORM_PRIORITY+3);
    new Threader("Tenth",Thread.NORM_PRIORITY+4);
  }
}
class Threader implements Runnable {
  Thread t;
  String name;
  Threader(String name, int p) {
    this.name = name;
    t = new Thread(this, name);
    t.setPriority(p);
    t.start();
  }
  public void run() {
    System.out.println("this is the thread numbered :"+name);
    System.out.println(t);
  }
}

/*
FYI Threads:
* Thread priority is used by the system to decide which thread to run when there are more threads ready to run than there are processors. In that situation, higher priority threads get to run first.

* In such a case it's plausible that either:

* The low priority thread has already started before the high priority thread is ready to run, or,
* You have sufficient processors that both threads can run simultaneously.
* Thread priority is not a tool that can be used to ensure order of execution. You need to use thread synchronization objects for that.

* In general, it is rather rare that you set the priority of a thread. Generally it is best to let the operating system decide how to schedule threads.
*/
