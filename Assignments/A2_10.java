import java.util.Scanner;
public class A2_10
{
  public static void A2()
  {
    int a=74, b=36;
    System.out.println(a+b);
  }
  public static void A3()
  {
    System.out.println(50/3);
  }
  public static void A4()
  {
    System.out.println(-5 + 8 * 6);
    System.out.println((55+9) % 9);
    System.out.println(20 + (-3)*5/8);
    System.out.println(5+15/3*2-8%3);
  }
  public static void A5()
  {
    Scanner sc = new Scanner(System.in);
    int a,b;
    System.out.println("Enter two numbers to multiply:");
    a=sc.nextInt();
    b=sc.nextInt();
    System.out.println((a*b)+" is the product.");
  }
  public static void A6()
  {
    Scanner sc = new Scanner(System.in);
    int a,b;
    System.out.println("Enter two numbers to calculate all basic algebraic operations:");
    a=sc.nextInt();
    b=sc.nextInt();
    System.out.println((a*b)+" is the product.");
    System.out.println((a+b)+" is the sum.");
    System.out.println((a-b)+" is the loss.");
    System.out.println((a/b)+" is the quotient.");
    System.out.println((a%b)+" is the remainder");
  }
  public static void A7()
  {
    Scanner sc = new Scanner(System.in);
    int a;
    System.out.println("Enter a number to print it's multiplication table:");
    a=sc.nextInt();
    for(int i=1;i<=10;i++)
    {
      System.out.println(a+"*"+i+"="+a*i);
    }
  }
  public static void A8()
  {
    System.out.println("J    a   v     v  a");
    System.out.println("J   a a   v   v  a a");
    System.out.println("J  J  aaaaa   V V  aaaaa");
    System.out.println("JJ  a     a   V  a     a");
  }
  public static void A9()
  {
    System.out.println(((25.5 * 3.5 - 3.5 * 3.5) / (40.5 - 4.5)));
  }
  public static void A10()
  {
    System.out.println(4.0 * (1 - (1.0/3) + (1.0/5) - (1.0/7) + (1.0/9) - (1.0/11)));
  }
  public static void main(String[] Goku)
  {
    A2();
    A3();
    A4();
    A5();
    A6();
    A7();
    A8();
    A9();
    A10();
  }
}
