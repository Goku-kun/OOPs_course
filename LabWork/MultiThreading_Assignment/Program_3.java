import java.lang.Thread;
import java.util.Scanner;
public class Program_3 {
  public static void main(String[] args) {
    Threader t = new Threader("Thread 1");
    Threader t1 = new Threader("Thread 2");
    Threader t2 = new Threader("Thread 3");
  }
}
class Threader implements Runnable {
  String name;
  Threader(String nm) {
    name = nm;
    Thread t = new Thread(this,nm);
    t.start();
  }
  public void run() {
    Scanner sc = new Scanner(System.in);
    int a,b;
    System.out.println("Enter the first number:" +name);
    a = sc.nextInt();
    System.out.println("Enter the Second number:"+name);
    b = sc.nextInt();
    System.out.println("The sum is "+(a+b));
  }
}
